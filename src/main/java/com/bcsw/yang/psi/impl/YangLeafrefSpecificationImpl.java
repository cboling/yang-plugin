// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.YangLeafrefSpecification;
import com.bcsw.yang.psi.YangPathStmt;
import com.bcsw.yang.psi.YangVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class YangLeafrefSpecificationImpl extends ASTWrapperPsiElement implements YangLeafrefSpecification {

  public YangLeafrefSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitLeafrefSpecification(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangPathStmt getPathStmt() {
    return findNotNullChildByClass(YangPathStmt.class);
  }

}
