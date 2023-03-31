// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface YangDecimal64Specification extends PsiElement {

  @NotNull
  YangFractionDigitsStmt getFractionDigitsStmt();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @Nullable
  YangNumericalRestrictions getNumericalRestrictions();

}
