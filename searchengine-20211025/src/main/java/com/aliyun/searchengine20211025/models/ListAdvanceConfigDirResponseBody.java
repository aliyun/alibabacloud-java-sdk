// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigDirResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListAdvanceConfigDirResponseBodyResult> result;

    public static ListAdvanceConfigDirResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAdvanceConfigDirResponseBody self = new ListAdvanceConfigDirResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAdvanceConfigDirResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAdvanceConfigDirResponseBody setResult(java.util.List<ListAdvanceConfigDirResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAdvanceConfigDirResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAdvanceConfigDirResponseBodyResult extends TeaModel {
        @NameInMap("fullPathName")
        public String fullPathName;

        @NameInMap("isDir")
        public Boolean isDir;

        @NameInMap("isTemplate")
        public Boolean isTemplate;

        @NameInMap("name")
        public String name;

        public static ListAdvanceConfigDirResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAdvanceConfigDirResponseBodyResult self = new ListAdvanceConfigDirResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAdvanceConfigDirResponseBodyResult setFullPathName(String fullPathName) {
            this.fullPathName = fullPathName;
            return this;
        }
        public String getFullPathName() {
            return this.fullPathName;
        }

        public ListAdvanceConfigDirResponseBodyResult setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public ListAdvanceConfigDirResponseBodyResult setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListAdvanceConfigDirResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
