// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangListStmt extends PsiElement {

  @NotNull
  List<YangConfigStmt> getConfigStmtList();

  @NotNull
  List<YangDataDefStmt> getDataDefStmtList();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangGroupingStmt> getGroupingStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangIfFeatureStmt> getIfFeatureStmtList();

  @NotNull
  List<YangKeyStmt> getKeyStmtList();

  @NotNull
  List<YangMaxElementsStmt> getMaxElementsStmtList();

  @NotNull
  List<YangMinElementsStmt> getMinElementsStmtList();

  @NotNull
  List<YangMustStmt> getMustStmtList();

  @NotNull
  List<YangOrderedByStmt> getOrderedByStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  List<YangStatusStmt> getStatusStmtList();

  @NotNull
  YangString getString();

  @NotNull
  List<YangTypedefStmt> getTypedefStmtList();

  @NotNull
  List<YangUniqueStmt> getUniqueStmtList();

  @NotNull
  List<YangWhenStmt> getWhenStmtList();

}
