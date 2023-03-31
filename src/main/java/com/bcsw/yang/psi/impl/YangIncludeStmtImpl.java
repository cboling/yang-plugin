// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.YangIncludeStmt;
import com.bcsw.yang.psi.YangRevisionDateStmt;
import com.bcsw.yang.psi.YangString;
import com.bcsw.yang.psi.YangVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YangIncludeStmtImpl extends ASTWrapperPsiElement implements YangIncludeStmt {

  public YangIncludeStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitIncludeStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangRevisionDateStmt getRevisionDateStmt() {
    return findChildByClass(YangRevisionDateStmt.class);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

}
