// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class YangSubmoduleStmtImpl extends ASTWrapperPsiElement implements YangSubmoduleStmt {

  public YangSubmoduleStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitSubmoduleStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangBodyStmts getBodyStmts() {
    return findNotNullChildByClass(YangBodyStmts.class);
  }

  @Override
  @NotNull
  public YangLinkageStmts getLinkageStmts() {
    return findNotNullChildByClass(YangLinkageStmts.class);
  }

  @Override
  @NotNull
  public YangMetaStmts getMetaStmts() {
    return findNotNullChildByClass(YangMetaStmts.class);
  }

  @Override
  @NotNull
  public YangRevisionStmts getRevisionStmts() {
    return findNotNullChildByClass(YangRevisionStmts.class);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

  @Override
  @NotNull
  public YangSubmoduleHeaderStmts getSubmoduleHeaderStmts() {
    return findNotNullChildByClass(YangSubmoduleHeaderStmts.class);
  }

}
