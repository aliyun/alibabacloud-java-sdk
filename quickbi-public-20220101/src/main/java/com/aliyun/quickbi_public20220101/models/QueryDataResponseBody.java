// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a4d1a221d-41za1-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryDataResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDataResponseBody self = new QueryDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDataResponseBody setResult(QueryDataResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryDataResponseBodyResult getResult() {
        return this.result;
    }

    public QueryDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDataResponseBodyResultHeaders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SUM</p>
         */
        @NameInMap("Aggregator")
        public String aggregator;

        @NameInMap("Column")
        public String column;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>REGION</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <strong>example:</strong>
         * <p>area</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>Dimension</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryDataResponseBodyResultHeaders build(java.util.Map<String, ?> map) throws Exception {
            QueryDataResponseBodyResultHeaders self = new QueryDataResponseBodyResultHeaders();
            return TeaModel.build(map, self);
        }

        public QueryDataResponseBodyResultHeaders setAggregator(String aggregator) {
            this.aggregator = aggregator;
            return this;
        }
        public String getAggregator() {
            return this.aggregator;
        }

        public QueryDataResponseBodyResultHeaders setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public QueryDataResponseBodyResultHeaders setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDataResponseBodyResultHeaders setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public QueryDataResponseBodyResultHeaders setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryDataResponseBodyResultHeaders setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryDataResponseBodyResult extends TeaModel {
        @NameInMap("Headers")
        public java.util.List<QueryDataResponseBodyResultHeaders> headers;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("Values")
        public java.util.List<java.util.Map<String, ?>> values;

        public static QueryDataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDataResponseBodyResult self = new QueryDataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryDataResponseBodyResult setHeaders(java.util.List<QueryDataResponseBodyResultHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<QueryDataResponseBodyResultHeaders> getHeaders() {
            return this.headers;
        }

        public QueryDataResponseBodyResult setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public QueryDataResponseBodyResult setValues(java.util.List<java.util.Map<String, ?>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getValues() {
            return this.values;
        }

    }

}
