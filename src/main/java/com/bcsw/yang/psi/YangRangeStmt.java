// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangRangeStmt extends PsiElement {

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangErrorAppTagStmt> getErrorAppTagStmtList();

  @NotNull
  List<YangErrorMessageStmt> getErrorMessageStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

  @NotNull
  YangString getString();

}
