// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface YangModuleStmt extends PsiElement {

  @NotNull
  YangBodyStmts getBodyStmts();

  @NotNull
  YangLinkageStmts getLinkageStmts();

  @NotNull
  YangMetaStmts getMetaStmts();

  @NotNull
  YangModuleHeaderStmts getModuleHeaderStmts();

  @NotNull
  YangRevisionStmts getRevisionStmts();

  @NotNull
  YangString getString();

}
