// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YangDataDefStmtImpl extends ASTWrapperPsiElement implements YangDataDefStmt {

  public YangDataDefStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitDataDefStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangAnyxmlStmt getAnyxmlStmt() {
    return findChildByClass(YangAnyxmlStmt.class);
  }

  @Override
  @Nullable
  public YangChoiceStmt getChoiceStmt() {
    return findChildByClass(YangChoiceStmt.class);
  }

  @Override
  @Nullable
  public YangContainerStmt getContainerStmt() {
    return findChildByClass(YangContainerStmt.class);
  }

  @Override
  @Nullable
  public YangDescriptionStmt getDescriptionStmt() {
    return findChildByClass(YangDescriptionStmt.class);
  }

  @Override
  @Nullable
  public YangImportStmt getImportStmt() {
    return findChildByClass(YangImportStmt.class);
  }

  @Override
  @Nullable
  public YangLeafListStmt getLeafListStmt() {
    return findChildByClass(YangLeafListStmt.class);
  }

  @Override
  @Nullable
  public YangLeafStmt getLeafStmt() {
    return findChildByClass(YangLeafStmt.class);
  }

  @Override
  @Nullable
  public YangListStmt getListStmt() {
    return findChildByClass(YangListStmt.class);
  }

  @Override
  @Nullable
  public YangOrganizationStmt getOrganizationStmt() {
    return findChildByClass(YangOrganizationStmt.class);
  }

  @Override
  @Nullable
  public YangRevisionStmt getRevisionStmt() {
    return findChildByClass(YangRevisionStmt.class);
  }

  @Override
  @Nullable
  public YangUsesStmt getUsesStmt() {
    return findChildByClass(YangUsesStmt.class);
  }

}
