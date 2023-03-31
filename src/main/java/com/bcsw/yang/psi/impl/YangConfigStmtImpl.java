// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.YangConfigArg;
import com.bcsw.yang.psi.YangConfigStmt;
import com.bcsw.yang.psi.YangEndStatement;
import com.bcsw.yang.psi.YangVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class YangConfigStmtImpl extends ASTWrapperPsiElement implements YangConfigStmt {

  public YangConfigStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitConfigStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangConfigArg getConfigArg() {
    return findNotNullChildByClass(YangConfigArg.class);
  }

  @Override
  @NotNull
  public YangEndStatement getEndStatement() {
    return findNotNullChildByClass(YangEndStatement.class);
  }

}
