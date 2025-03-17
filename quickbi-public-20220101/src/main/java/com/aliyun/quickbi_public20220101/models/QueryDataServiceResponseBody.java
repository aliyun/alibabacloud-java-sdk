// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78C1AA2D-9201-599E-A0BA-6FC462E57A95</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the result of the interface query.</p>
     */
    @NameInMap("Result")
    public QueryDataServiceResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li><p>true: The request was successful</p>
     * </li>
     * <li><p>false: The request failed</p>
     * </li>
     * </ul>
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
         * <p>Aggregation operator. Only present for measure fields, such as SUM, AVG, and MAX.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM</p>
         */
        @NameInMap("Aggregator")
        public String aggregator;

        /**
         * <p>Field name, corresponding to the physical table field name.</p>
         * 
         * <strong>example:</strong>
         * <p>The alias of the field. The key of the map data row in the result parameter values.</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The data type of the field. Common types include number, string, date, datetime, time, and geographic.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The granularity of the dimension field.
         * This field is returned only when the requested field is a date or geographic dimension, with the following possible values:</p>
         * <ul>
         * <li><p>Date granularity: yearRegion (year), monthRegion (month), weekRegion (week), dayRegion (day), hourRegion (hour), minRegion (minute), secRegion (second)</p>
         * </li>
         * <li><p>Geographic granularity: COUNTRY (country level), PROVINCE (province level), CITY (city level), XIAN (district/county level), REGION (region)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yearRegion</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>字段别名，结果参数values中map数据行的key。</p>
         * 
         * <strong>example:</strong>
         * <p>area</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Field type, used to distinguish between dimension and measure fields.</p>
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
         * <p>Column headers.</p>
         */
        @NameInMap("Headers")
        public java.util.List<QueryDataServiceResponseBodyResultHeaders> headers;

        /**
         * <p>The SQL of the query request.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT COMPANY_T_1_.<code>area</code> AS D_AREA_2_, COMPANY_T_1_.<code>city</code> AS D_CITY_3_, SUM(COMPANY_T_1_.<code>profit_amt</code>) AS D_PROFIT_4_ FROM <code>quickbi_test</code>.<code>company_sales_record_copy</code> AS COMPANY_T_1_ WHERE COMPANY_T_1_.<code>area</code> LIKE \&quot;%华东%\&quot; GROUP BY COMPANY_T_1_.<code>area</code>, COMPANY_T_1_.<code>city</code> HAVING SUM(COMPANY_T_1_.<code>order_amt</code>) &gt; 1 LIMIT 0, 10</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The queried results returned.</p>
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
