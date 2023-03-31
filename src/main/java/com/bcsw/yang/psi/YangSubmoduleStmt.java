// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface YangSubmoduleStmt extends PsiElement {

  @NotNull
  YangBodyStmts getBodyStmts();

  @NotNull
  YangLinkageStmts getLinkageStmts();

  @NotNull
  YangMetaStmts getMetaStmts();

  @NotNull
  YangRevisionStmts getRevisionStmts();

  @NotNull
  YangString getString();

  @NotNull
  YangSubmoduleHeaderStmts getSubmoduleHeaderStmts();

}
