/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bcsw.yang.psi

import com.bcsw.yang.YangFileType
import com.bcsw.yang.YangLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class YangFile(viewProvider: FileViewProvider) :
    PsiFileBase(viewProvider, YangLanguage.INSTANCE) {
    override fun getFileType(): FileType {
        return YangFileType.INSTANCE
    }

    override fun toString(): String {
        return "Yang File"
    }
}