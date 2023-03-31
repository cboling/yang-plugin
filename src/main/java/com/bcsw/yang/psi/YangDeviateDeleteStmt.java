// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangDeviateDeleteStmt extends PsiElement {

  @NotNull
  List<YangDefaultStmt> getDefaultStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangMustStmt> getMustStmtList();

  @NotNull
  YangString getString();

  @NotNull
  List<YangUniqueStmt> getUniqueStmtList();

  @NotNull
  List<YangUnitsStmt> getUnitsStmtList();

}
