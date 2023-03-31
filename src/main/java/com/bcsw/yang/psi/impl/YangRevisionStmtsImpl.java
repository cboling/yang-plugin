// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.YangRevisionStmt;
import com.bcsw.yang.psi.YangRevisionStmts;
import com.bcsw.yang.psi.YangVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YangRevisionStmtsImpl extends ASTWrapperPsiElement implements YangRevisionStmts {

  public YangRevisionStmtsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitRevisionStmts(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangRevisionStmt> getRevisionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangRevisionStmt.class);
  }

}
