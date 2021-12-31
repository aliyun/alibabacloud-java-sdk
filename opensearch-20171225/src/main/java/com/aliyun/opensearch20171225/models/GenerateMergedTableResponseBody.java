// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GenerateMergedTableResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GenerateMergedTableResponseBodyResult result;

    public static GenerateMergedTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateMergedTableResponseBody self = new GenerateMergedTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateMergedTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateMergedTableResponseBody setResult(GenerateMergedTableResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GenerateMergedTableResponseBodyResult getResult() {
        return this.result;
    }

    public static class GenerateMergedTableResponseBodyResult extends TeaModel {
        @NameInMap("fromTable")
        public java.util.Map<String, ?> fromTable;

        @NameInMap("mergeTable")
        public java.util.Map<String, ?> mergeTable;

        @NameInMap("primaryKey")
        public String primaryKey;

        public static GenerateMergedTableResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GenerateMergedTableResponseBodyResult self = new GenerateMergedTableResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GenerateMergedTableResponseBodyResult setFromTable(java.util.Map<String, ?> fromTable) {
            this.fromTable = fromTable;
            return this;
        }
        public java.util.Map<String, ?> getFromTable() {
            return this.fromTable;
        }

        public GenerateMergedTableResponseBodyResult setMergeTable(java.util.Map<String, ?> mergeTable) {
            this.mergeTable = mergeTable;
            return this;
        }
        public java.util.Map<String, ?> getMergeTable() {
            return this.mergeTable;
        }

        public GenerateMergedTableResponseBodyResult setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

    }

}
