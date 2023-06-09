// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangDeviationStmt extends PsiElement {

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangDeviateAddStmt> getDeviateAddStmtList();

  @NotNull
  List<YangDeviateDeleteStmt> getDeviateDeleteStmtList();

  @NotNull
  List<YangDeviateNotSupportedStmt> getDeviateNotSupportedStmtList();

  @NotNull
  List<YangDeviateReplaceStmt> getDeviateReplaceStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  YangString getString();

}
