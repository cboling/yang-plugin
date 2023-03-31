// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangTypeStmt extends PsiElement {

  @NotNull
  YangString getString();

  @NotNull
  List<YangTypeBodyStmts> getTypeBodyStmtsList();

  @NotNull
  List<YangTypeStmt> getTypeStmtList();

}
