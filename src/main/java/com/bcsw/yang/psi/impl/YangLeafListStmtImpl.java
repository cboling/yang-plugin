// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YangLeafListStmtImpl extends ASTWrapperPsiElement implements YangLeafListStmt {

  public YangLeafListStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitLeafListStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangConfigStmt> getConfigStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangConfigStmt.class);
  }

  @Override
  @NotNull
  public List<YangDescriptionStmt> getDescriptionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDescriptionStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentifierStmt> getIdentifierStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentifierStmt.class);
  }

  @Override
  @NotNull
  public List<YangIfFeatureStmt> getIfFeatureStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIfFeatureStmt.class);
  }

  @Override
  @NotNull
  public List<YangMaxElementsStmt> getMaxElementsStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMaxElementsStmt.class);
  }

  @Override
  @NotNull
  public List<YangMinElementsStmt> getMinElementsStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMinElementsStmt.class);
  }

  @Override
  @NotNull
  public List<YangMustStmt> getMustStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMustStmt.class);
  }

  @Override
  @NotNull
  public List<YangOrderedByStmt> getOrderedByStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangOrderedByStmt.class);
  }

  @Override
  @NotNull
  public List<YangReferenceStmt> getReferenceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangReferenceStmt.class);
  }

  @Override
  @NotNull
  public List<YangStatusStmt> getStatusStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangStatusStmt.class);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

  @Override
  @NotNull
  public List<YangTypeStmt> getTypeStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangTypeStmt.class);
  }

  @Override
  @NotNull
  public List<YangUnitsStmt> getUnitsStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUnitsStmt.class);
  }

  @Override
  @NotNull
  public List<YangWhenStmt> getWhenStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangWhenStmt.class);
  }

}
