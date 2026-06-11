// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a4d1a221d-41za1-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the API call. Valid values:</p>
     * <ul>
     * <li><p>true: The call was successful.</p>
     * </li>
     * <li><p>false: The call failed.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Result")
    public QueryDataResponseBodyResult result;

    /**
     * <p>Whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The aggregate operator. Returned only for measure fields.</p>
         * <ul>
         * <li><p>SUM: The sum.</p>
         * </li>
         * <li><p>MAX: The maximum value.</p>
         * </li>
         * <li><p>MIN: The minimum value.</p>
         * </li>
         * <li><p>AVG: The average value.</p>
         * </li>
         * <li><p>COUNT: The count.</p>
         * </li>
         * <li><p>COUNTD: The count of unique values.</p>
         * </li>
         * <li><p>STDDEV_POP: The population standard deviation.</p>
         * </li>
         * <li><p>STDDEV_SAMP: The sample standard deviation.</p>
         * </li>
         * <li><p>VAR_POP: The population variance.</p>
         * </li>
         * <li><p>VAR_SAMP: The sample variance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUM</p>
         */
        @NameInMap("Aggregator")
        public String aggregator;

        /**
         * <p>The physical table field name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The field data type. Common types:</p>
         * <ul>
         * <li><p>number</p>
         * </li>
         * <li><p>string</p>
         * </li>
         * <li><p>date</p>
         * </li>
         * <li><p>time</p>
         * </li>
         * <li><p>datetime</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The dimension granularity. Returned only for date or geographic dimensions. Valid values:</p>
         * <ul>
         * <li><p>Date granularity: yearRegion (year), monthRegion (month), weekRegion (week), dayRegion (day), hourRegion (hour), minRegion (minute), secRegion (second)</p>
         * </li>
         * <li><p>Geographic granularity: COUNTRY (country), PROVINCE (province), CITY (city), XIAN (county/district), REGION (region)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGION</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>The field alias. Used as the key in each Values map entry.</p>
         * 
         * <strong>example:</strong>
         * <p>area</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The original field name in the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>area</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("OriginalColumn")
        public String originalColumn;

        /**
         * <p>Whether the field is a dimension or measure.</p>
         * <ul>
         * <li><p>Dimension</p>
         * </li>
         * <li><p>Measure</p>
         * </li>
         * </ul>
         * 
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

        public QueryDataResponseBodyResultHeaders setOriginalColumn(String originalColumn) {
            this.originalColumn = originalColumn;
            return this;
        }
        public String getOriginalColumn() {
            return this.originalColumn;
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
        /**
         * <p>The column headers.</p>
         */
        @NameInMap("Headers")
        public java.util.List<QueryDataResponseBodyResultHeaders> headers;

        /**
         * <p>The SQL statement for the query.</p>
         * <blockquote>
         * <p>The returned SQL includes both the filter conditions from this call and any row-level or column-level permission rules.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT COMPANY_T_1_.<code>area</code> AS D_AREA_2_, COMPANY_T_1_.<code>city</code> AS D_CITY_3_, SUM(COMPANY_T_1_.<code>profit_amt</code>) AS D_PROFIT_4_ FROM <code>quickbi_test</code>.<code>company_sales_record_copy</code> AS COMPANY_T_1_ WHERE COMPANY_T_1_.<code>area</code> LIKE \&quot;%test%\&quot; GROUP BY COMPANY_T_1_.<code>area</code>, COMPANY_T_1_.<code>city</code> HAVING SUM(COMPANY_T_1_.<code>order_amt</code>) &gt; 1 LIMIT 0, 10</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The query results.</p>
         */
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
