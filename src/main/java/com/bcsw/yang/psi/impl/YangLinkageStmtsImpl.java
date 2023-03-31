// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.YangImportStmt;
import com.bcsw.yang.psi.YangIncludeStmt;
import com.bcsw.yang.psi.YangLinkageStmts;
import com.bcsw.yang.psi.YangVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YangLinkageStmtsImpl extends ASTWrapperPsiElement implements YangLinkageStmts {

  public YangLinkageStmtsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitLinkageStmts(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangImportStmt> getImportStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangImportStmt.class);
  }

  @Override
  @NotNull
  public List<YangIncludeStmt> getIncludeStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIncludeStmt.class);
  }

}
