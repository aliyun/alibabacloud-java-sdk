// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceResponseBody extends TeaModel {
    /**
     * <p>The list of parameter names of the returned parameters. The value is a string of the List type.</p>
     * 
     * <strong>example:</strong>
     * <p>78C1AA2D-9201-599E-A0BA-6FC462E57A95</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     */
    @NameInMap("Result")
    public QueryDataServiceResponseBodyResult result;

    /**
     * <p>{ &quot;area&quot;: [&quot;East China&quot;, &quot;North China&quot;], &quot;shopping_date&quot;: &quot;2019Q1&quot;, }</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The field name, which corresponds to the physical table field name.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM</p>
         */
        @NameInMap("Aggregator")
        public String aggregator;

        /**
         * <p>The granularity of the dimension field. This field is returned only when the requested field is a date dimension or a geographical dimension. Valid values:</p>
         * <ul>
         * <li>Date granularity: yearRegion (year), monthRegion (month), weekRegion (week), dayRegion (day), hourRegion (hour), minRegion (minute), secRegion (second)</li>
         * <li>Geographic information granularity: COUNTRY (international level), PROVINCE (provincial level), CITY (municipal level), XIAN (district /county), and REGION (regional level)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The alias of the field. The key of the map data row in the result parameter values.</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The column header.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The field type, which is used to distinguish whether the field type is a dimension or a measure.</p>
         * 
         * <strong>example:</strong>
         * <p>yearRegion</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>The data type of the field. generally have number, string, date, datetime, time, and geographic.</p>
         * 
         * <strong>example:</strong>
         * <p>area</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>SELECT COMPANY_T_1_.\&quot;area\&quot; AS D_AREA_2_, COMPANY_T_1_.\&quot;city\&quot; AS D_CITY_3_, SUM(COMPANY_T_1_.\&quot;profit_amt\&quot;) AS D_PROFIT_4_ FROM \&quot;quickbi_test\&quot;.\&quot;company_sales_record_copy\&quot; AS COMPANY_T_1_ WHERE COMPANY_T_1_.\&quot;area\&quot; LIKE \&quot;% China East %\&quot; GROUP BY COMPANY_T_1_.\&quot;area\&quot;, COMPANY_T_1_.\&quot;city\&quot; HAVING SUM(COMPANY_T_1_.\&quot;order_amt\&quot;) &gt; 1 LIMIT 0,10</p>
         * 
         * <strong>example:</strong>
         * <p>StandardDimension</p>
         */
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
        /**
         * <p>The SQL of the request query.</p>
         */
        @NameInMap("Headers")
        public java.util.List<QueryDataServiceResponseBodyResultHeaders> headers;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>The query result of the API operation is returned.</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>Physical Field Name</p>
         */
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
