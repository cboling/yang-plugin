// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangUsesStmt extends PsiElement {

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangIfFeatureStmt> getIfFeatureStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  List<YangRefineStmt> getRefineStmtList();

  @NotNull
  List<YangStatusStmt> getStatusStmtList();

  @NotNull
  YangString getString();

  @NotNull
  List<YangUsesAugmentStmt> getUsesAugmentStmtList();

  @NotNull
  List<YangWhenStmt> getWhenStmtList();

}
