// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangLinkageStmts extends PsiElement {

  @NotNull
  List<YangImportStmt> getImportStmtList();

  @NotNull
  List<YangIncludeStmt> getIncludeStmtList();

}
