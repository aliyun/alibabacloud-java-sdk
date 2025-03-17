// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a4d1a221d-41za1-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the result of the interface execution. Possible values:</p>
     * <ul>
     * <li>true: Execution succeeded</li>
     * <li>false: Execution failed</li>
     * </ul>
     */
    @NameInMap("Result")
    public QueryDataResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: Request succeeded</li>
     * <li>false: Request failed</li>
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
         * <p>Aggregation operator. Only present for measure fields, such as SUM, AVG, and MAX.</p>
         * <ul>
         * <li>SUM: Sum</li>
         * <li>MAX: Maximum value</li>
         * <li>MIN: Minimum value</li>
         * <li>AVG: Average</li>
         * <li>COUNT: Count</li>
         * <li>COUNTD: Distinct count</li>
         * <li>STDDEV_POP: Population standard deviation</li>
         * <li>STDDEV_SAMP: Sample standard deviation</li>
         * <li>VAR_POP: Population variance</li>
         * <li>VAR_SAMP: Sample variance</li>
         * </ul>
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
         * <p>Specific physical field name</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>字段的数据类型。一般有：</p>
         * <ul>
         * <li>number：数值</li>
         * <li>string：字符串</li>
         * <li>date：日期</li>
         * <li>time：时间</li>
         * <li>datetime：日期时间</li>
         * </ul>
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
         * <li><p>Date Granularity: yearRegion (year), monthRegion (month), weekRegion (week), dayRegion (day), hourRegion (hour), minRegion (minute), secRegion (second)</p>
         * </li>
         * <li><p>Geographic Granularity: COUNTRY (international level), PROVINCE (provincial level), CITY (city level), XIAN (district/county level), REGION (region)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGION</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>Field alias, which serves as the key in the map data rows of the <code>values</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>area</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Field type, used to distinguish between dimension and measure fields.</p>
         * <ul>
         * <li>Dimension: dimension</li>
         * <li>Measure: measure</li>
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
         * <p>Column headers.</p>
         */
        @NameInMap("Headers")
        public java.util.List<QueryDataResponseBodyResultHeaders> headers;

        /**
         * <p>The SQL query that was executed.</p>
         * <blockquote>
         * <p>The filter conditions in the returned SQL statement include not only the parameters passed through this interface but also the row and column permission configurations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT COMPANY_T_1_.<code>area</code> AS D_AREA_2_, COMPANY_T_1_.<code>city</code> AS D_CITY_3_, SUM(COMPANY_T_1_.<code>profit_amt</code>) AS D_PROFIT_4_ FROM <code>quickbi_test</code>.<code>company_sales_record_copy</code> AS COMPANY_T_1_ WHERE COMPANY_T_1_.<code>area</code> LIKE \&quot;%华东%\&quot; GROUP BY COMPANY_T_1_.<code>area</code>, COMPANY_T_1_.<code>city</code> HAVING SUM(COMPANY_T_1_.<code>order_amt</code>) &gt; 1 LIMIT 0, 10</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The results of the query.</p>
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
