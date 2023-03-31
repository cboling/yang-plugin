// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YangArgumentStmtImpl extends ASTWrapperPsiElement implements YangArgumentStmt {

  public YangArgumentStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitArgumentStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

  @Override
  @Nullable
  public YangUnknownStatement2 getUnknownStatement2() {
    return findChildByClass(YangUnknownStatement2.class);
  }

  @Override
  @Nullable
  public YangYinElementStmt getYinElementStmt() {
    return findChildByClass(YangYinElementStmt.class);
  }

}
