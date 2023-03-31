// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangIdentityStmt extends PsiElement {

  @NotNull
  List<YangBaseStmt> getBaseStmtList();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  List<YangStatusStmt> getStatusStmtList();

  @NotNull
  YangString getString();

}
