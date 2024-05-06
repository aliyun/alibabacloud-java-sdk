// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigDirResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The file list in the advanced configuration directory.</p>
     */
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
        /**
         * <p>The name of the absolute path.</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Indicates whether it is a directory. Valid values: true and false. true indicates that it is a directory, and false indicates that it is not a directory.</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>Indicates whether it is a template. Valid values: **true** and **false**. true indicates that it is a template, and false indicates that it is not a template.</p>
         */
        @NameInMap("isTemplate")
        public Boolean isTemplate;

        /**
         * <p>The name of the cluster.</p>
         */
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
