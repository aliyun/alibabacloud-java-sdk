// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigDirResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
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
         * <p>The full path.</p>
         * 
         * <strong>example:</strong>
         * <p>/path/wpd/nae</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Indicates whether the entry is a directory. Valid values: - true: The entry is a directory. - false: The entry is not a directory.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>Indicates whether the entry is a template. Valid values: - <strong>true</strong>: The entry is a template. - <strong>false</strong>: The entry is not a template.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isTemplate")
        public Boolean isTemplate;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>hz_pre_vpc_domain_1</p>
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
