// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YangModuleHeaderStmtsImpl extends ASTWrapperPsiElement implements YangModuleHeaderStmts {

  public YangModuleHeaderStmtsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitModuleHeaderStmts(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangNamespaceStmt> getNamespaceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangNamespaceStmt.class);
  }

  @Override
  @NotNull
  public List<YangPrefixStmt> getPrefixStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangPrefixStmt.class);
  }

  @Override
  @NotNull
  public List<YangYangVersionStmt> getYangVersionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangYangVersionStmt.class);
  }

}
