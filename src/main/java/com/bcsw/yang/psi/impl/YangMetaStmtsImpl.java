// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YangMetaStmtsImpl extends ASTWrapperPsiElement implements YangMetaStmts {

  public YangMetaStmtsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitMetaStmts(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangContactStmt> getContactStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangContactStmt.class);
  }

  @Override
  @NotNull
  public List<YangDescriptionStmt> getDescriptionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDescriptionStmt.class);
  }

  @Override
  @NotNull
  public List<YangOrganizationStmt> getOrganizationStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangOrganizationStmt.class);
  }

  @Override
  @NotNull
  public List<YangReferenceStmt> getReferenceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangReferenceStmt.class);
  }

}
