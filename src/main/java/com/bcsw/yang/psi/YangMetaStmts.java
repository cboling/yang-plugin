// This is a generated file. Not intended for manual editing.
package com.bcsw.yang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YangMetaStmts extends PsiElement {

  @NotNull
  List<YangContactStmt> getContactStmtList();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangOrganizationStmt> getOrganizationStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

}
