// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.YangEndStatement;
import com.bcsw.yang.psi.YangVisitor;
import com.bcsw.yang.psi.YangYinElementArg;
import com.bcsw.yang.psi.YangYinElementStmt;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class YangYinElementStmtImpl extends ASTWrapperPsiElement implements YangYinElementStmt {

  public YangYinElementStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitYinElementStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangEndStatement getEndStatement() {
    return findNotNullChildByClass(YangEndStatement.class);
  }

  @Override
  @NotNull
  public YangYinElementArg getYinElementArg() {
    return findNotNullChildByClass(YangYinElementArg.class);
  }

}
