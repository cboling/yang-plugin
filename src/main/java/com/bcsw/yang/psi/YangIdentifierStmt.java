// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface YangIdentifierStmt extends PsiElement {

  @Nullable
  YangEndStatement getEndStatement();

  @Nullable
  YangString getString();

  @NotNull
  List<YangUnknownStatement> getUnknownStatementList();

}
