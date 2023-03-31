// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi.impl;

import com.bcsw.yang.psi.YangString;
import com.bcsw.yang.psi.YangUnknownStatement2;
import com.bcsw.yang.psi.YangUnknownStatement3;
import com.bcsw.yang.psi.YangVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class YangUnknownStatement2Impl extends ASTWrapperPsiElement implements YangUnknownStatement2 {

  public YangUnknownStatement2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitUnknownStatement2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangString getString() {
    return findChildByClass(YangString.class);
  }

  @Override
  @NotNull
  public List<YangUnknownStatement3> getUnknownStatement3List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUnknownStatement3.class);
  }

}
