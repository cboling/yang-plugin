// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangModuleHeaderStmts extends PsiElement {

  @NotNull
  List<YangNamespaceStmt> getNamespaceStmtList();

  @NotNull
  List<YangPrefixStmt> getPrefixStmtList();

  @NotNull
  List<YangYangVersionStmt> getYangVersionStmtList();

}
