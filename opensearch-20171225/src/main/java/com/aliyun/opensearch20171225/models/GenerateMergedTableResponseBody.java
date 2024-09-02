// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GenerateMergedTableResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABCDEFGH</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The response parameters.</p>
     */
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
        /**
         * <p>The tables on which the JOIN operation is performed.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("fromTable")
        public java.util.Map<String, ?> fromTable;

        /**
         * <p>The wide table that is generated after the JOIN operation is performed on multiple tables.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("mergeTable")
        public java.util.Map<String, ?> mergeTable;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
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
