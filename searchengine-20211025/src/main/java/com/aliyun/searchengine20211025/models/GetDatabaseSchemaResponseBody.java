// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDatabaseSchemaResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>List</p>
     */
    @NameInMap("result")
    public java.util.List<GetDatabaseSchemaResponseBodyResult> result;

    public static GetDatabaseSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseSchemaResponseBody self = new GetDatabaseSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseSchemaResponseBody setResult(java.util.List<GetDatabaseSchemaResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetDatabaseSchemaResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetDatabaseSchemaResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("fieldName")
        public String fieldName;

        /**
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <strong>example:</strong>
         * <p>FT_UINT64</p>
         */
        @NameInMap("fieldTypeDetail")
        public java.util.Map<String, ?> fieldTypeDetail;

        /**
         * <strong>example:</strong>
         * <p>test_tusou_v2</p>
         */
        @NameInMap("indexName")
        public String indexName;

        /**
         * <strong>example:</strong>
         * <p>NUMBER</p>
         */
        @NameInMap("indexType")
        public String indexType;

        public static GetDatabaseSchemaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseSchemaResponseBodyResult self = new GetDatabaseSchemaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDatabaseSchemaResponseBodyResult setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetDatabaseSchemaResponseBodyResult setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public GetDatabaseSchemaResponseBodyResult setFieldTypeDetail(java.util.Map<String, ?> fieldTypeDetail) {
            this.fieldTypeDetail = fieldTypeDetail;
            return this;
        }
        public java.util.Map<String, ?> getFieldTypeDetail() {
            return this.fieldTypeDetail;
        }

        public GetDatabaseSchemaResponseBodyResult setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public GetDatabaseSchemaResponseBodyResult setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

    }

}
