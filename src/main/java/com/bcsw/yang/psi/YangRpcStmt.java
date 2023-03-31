// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangRpcStmt extends PsiElement {

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangGroupingStmt> getGroupingStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangIfFeatureStmt> getIfFeatureStmtList();

  @NotNull
  List<YangInputStmt> getInputStmtList();

  @NotNull
  List<YangOutputStmt> getOutputStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  List<YangStatusStmt> getStatusStmtList();

  @NotNull
  YangString getString();

  @NotNull
  List<YangTypedefStmt> getTypedefStmtList();

}
