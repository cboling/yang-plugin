// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface YangRevisionStmt extends PsiElement {

  @Nullable
  YangDescriptionStmt getDescriptionStmt();

  @Nullable
  YangReferenceStmt getReferenceStmt();

  @NotNull
  YangString getString();

}
