// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDatabaseSchemaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("fieldName")
        public String fieldName;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("fieldTypeDetail")
        public java.util.Map<String, ?> fieldTypeDetail;

        @NameInMap("indexName")
        public String indexName;

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
