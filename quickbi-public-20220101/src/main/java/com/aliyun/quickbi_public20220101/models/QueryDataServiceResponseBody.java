// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryDataServiceResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDataServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDataServiceResponseBody self = new QueryDataServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDataServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDataServiceResponseBody setResult(QueryDataServiceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryDataServiceResponseBodyResult getResult() {
        return this.result;
    }

    public QueryDataServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDataServiceResponseBodyResultHeaders extends TeaModel {
        @NameInMap("Aggregator")
        public String aggregator;

        @NameInMap("Column")
        public String column;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Granularity")
        public String granularity;

        @NameInMap("Label")
        public String label;

        @NameInMap("Type")
        public String type;

        public static QueryDataServiceResponseBodyResultHeaders build(java.util.Map<String, ?> map) throws Exception {
            QueryDataServiceResponseBodyResultHeaders self = new QueryDataServiceResponseBodyResultHeaders();
            return TeaModel.build(map, self);
        }

        public QueryDataServiceResponseBodyResultHeaders setAggregator(String aggregator) {
            this.aggregator = aggregator;
            return this;
        }
        public String getAggregator() {
            return this.aggregator;
        }

        public QueryDataServiceResponseBodyResultHeaders setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public QueryDataServiceResponseBodyResultHeaders setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDataServiceResponseBodyResultHeaders setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public QueryDataServiceResponseBodyResultHeaders setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryDataServiceResponseBodyResultHeaders setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryDataServiceResponseBodyResult extends TeaModel {
        @NameInMap("Headers")
        public java.util.List<QueryDataServiceResponseBodyResultHeaders> headers;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("Values")
        public java.util.List<java.util.Map<String, ?>> values;

        public static QueryDataServiceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDataServiceResponseBodyResult self = new QueryDataServiceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryDataServiceResponseBodyResult setHeaders(java.util.List<QueryDataServiceResponseBodyResultHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<QueryDataServiceResponseBodyResultHeaders> getHeaders() {
            return this.headers;
        }

        public QueryDataServiceResponseBodyResult setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public QueryDataServiceResponseBodyResult setValues(java.util.List<java.util.Map<String, ?>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getValues() {
            return this.values;
        }

    }

}
