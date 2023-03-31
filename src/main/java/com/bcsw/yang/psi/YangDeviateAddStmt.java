// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangDeviateAddStmt extends PsiElement {

  @NotNull
  List<YangConfigStmt> getConfigStmtList();

  @NotNull
  List<YangDefaultStmt> getDefaultStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangMandatoryStmt> getMandatoryStmtList();

  @NotNull
  List<YangMaxElementsStmt> getMaxElementsStmtList();

  @NotNull
  List<YangMinElementsStmt> getMinElementsStmtList();

  @NotNull
  List<YangMustStmt> getMustStmtList();

  @NotNull
  YangString getString();

  @NotNull
  List<YangUniqueStmt> getUniqueStmtList();

  @NotNull
  List<YangUnitsStmt> getUnitsStmtList();

}
