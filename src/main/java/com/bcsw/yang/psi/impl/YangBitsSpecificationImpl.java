// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.YangBitStmt;
import com.bcsw.yang.psi.YangBitsSpecification;
import com.bcsw.yang.psi.YangIdentifierStmt;
import com.bcsw.yang.psi.YangVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YangBitsSpecificationImpl extends ASTWrapperPsiElement implements YangBitsSpecification {

  public YangBitsSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitBitsSpecification(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangBitStmt> getBitStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangBitStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentifierStmt> getIdentifierStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentifierStmt.class);
  }

}
