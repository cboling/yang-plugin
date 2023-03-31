// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.YangBelongsToStmt;
import com.bcsw.yang.psi.YangSubmoduleHeaderStmts;
import com.bcsw.yang.psi.YangVisitor;
import com.bcsw.yang.psi.YangYangVersionStmt;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YangSubmoduleHeaderStmtsImpl extends ASTWrapperPsiElement implements YangSubmoduleHeaderStmts {

  public YangSubmoduleHeaderStmtsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitSubmoduleHeaderStmts(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangBelongsToStmt> getBelongsToStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangBelongsToStmt.class);
  }

  @Override
  @NotNull
  public List<YangYangVersionStmt> getYangVersionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangYangVersionStmt.class);
  }

}
