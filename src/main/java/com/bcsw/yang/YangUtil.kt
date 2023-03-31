package com.bcsw.yang

import com.bcsw.yang.psi.YangContainerStmt
import com.bcsw.yang.psi.YangFile
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import java.util.*

class YangUtil {
  companion object {

    // * Searches the entire project for Yang files with instances of the Yang tag with the given key.
    // *
    // * @param project current project
    // * @param key     to check
    // * @return matching properties

    fun findProperties(project: Project?, key: String): List<YangContainerStmt> {
      val result: MutableList<YangContainerStmt> = ArrayList()
      val virtualFiles = FileTypeIndex.getFiles(YangFileType.INSTANCE, GlobalSearchScope.allScope(project!!))
      for (virtualFile in virtualFiles) {
        val simpleFile = PsiManager.getInstance(project).findFile(virtualFile!!) as YangFile?
        if (simpleFile != null) {
          val properties = PsiTreeUtil.getChildrenOfType(simpleFile, YangContainerStmt::class.java)
          if (properties != null) {
            for (property in properties) {
              if (key == property.text) {
                result.add(property)
              }
            }
          }
        }
      }
      return result
    }

    fun findProperties(project: Project?): List<YangContainerStmt> {
      val result: MutableList<YangContainerStmt> = ArrayList()
      val virtualFiles = FileTypeIndex.getFiles(YangFileType.INSTANCE, GlobalSearchScope.allScope(project!!))
      for (virtualFile in virtualFiles) {
        val simpleFile = PsiManager.getInstance(project).findFile(virtualFile!!) as YangFile?
        if (simpleFile != null) {
          val properties = PsiTreeUtil.getChildrenOfType(simpleFile, YangContainerStmt::class.java)
          if (properties != null) {
            Collections.addAll(result, *properties)
          }
        }
      }
      return result
    }
  }
}
