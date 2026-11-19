// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>a4d1a221d-41za1-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution result of the API. Valid values:</p>
     * <ul>
     * <li>true: The execution is successful.</li>
     * <li>false: The execution fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public QueryDataResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
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
         * <p>The aggregation operator. This field is available only for measure fields, such as SUM, AVG, and MAX. Valid values:</p>
         * <ul>
         * <li>SUM: Sum.</li>
         * <li>MAX: Maximum value.</li>
         * <li>MIN: Minimum value.</li>
         * <li>AVG: Average value.</li>
         * <li>COUNT: Count.</li>
         * <li>COUNTD: Deduplicate count.</li>
         * <li>STDDEV_POP: Population standard deviation.</li>
         * <li>STDDEV_SAMP: Sample standard deviation.</li>
         * <li>VAR_POP: Population variance.</li>
         * <li>VAR_SAMP: Sample variance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUM</p>
         */
        @NameInMap("Aggregator")
        public String aggregator;

        /**
         * <p>The name of the field, which corresponds to the field name in the physical table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The data type of the field. Valid values:</p>
         * <ul>
         * <li>number: Numeric.</li>
         * <li>string: String.</li>
         * <li>date: Date.</li>
         * <li>time: Time.</li>
         * <li>datetime: Date and time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The granularity of the dimension field. This field is returned only when the requested field is a date dimension or a geographic dimension. Valid values:</p>
         * <ul>
         * <li><p>Date granularity: yearRegion (year), monthRegion (month), weekRegion (week), dayRegion (day), hourRegion (hour), minRegion (minute), and secRegion (second).</p>
         * </li>
         * <li><p>Geographic granularity: COUNTRY (country), PROVINCE (province), CITY (city), XIAN (district/county), and REGION (region).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGION</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>The alias of the field, which is the key of the map data row in the values result parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>area</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The original name of the corresponding field in the dataset.</p>
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
         * <p>The type of the field, which is used to distinguish whether the field is a dimension or a measure. Valid values:</p>
         * <ul>
         * <li>Dimension: Dimension.</li>
         * <li>Measure: Measure.</li>
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

    public static class QueryDataResponseBodyResultValuesV2RowValue extends TeaModel {
        /**
         * <p>The field alias set in Data Service.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("L")
        public String l;

        /**
         * <p>The original value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("R")
        public String r;

        /**
         * <p>The display value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V")
        public String v;

        public static QueryDataResponseBodyResultValuesV2RowValue build(java.util.Map<String, ?> map) throws Exception {
            QueryDataResponseBodyResultValuesV2RowValue self = new QueryDataResponseBodyResultValuesV2RowValue();
            return TeaModel.build(map, self);
        }

        public QueryDataResponseBodyResultValuesV2RowValue setL(String l) {
            this.l = l;
            return this;
        }
        public String getL() {
            return this.l;
        }

        public QueryDataResponseBodyResultValuesV2RowValue setR(String r) {
            this.r = r;
            return this;
        }
        public String getR() {
            return this.r;
        }

        public QueryDataResponseBodyResultValuesV2RowValue setV(String v) {
            this.v = v;
            return this;
        }
        public String getV() {
            return this.v;
        }

    }

    public static class QueryDataResponseBodyResultValuesV2 extends TeaModel {
        /**
         * <p>The row values.</p>
         */
        @NameInMap("RowValue")
        public java.util.List<QueryDataResponseBodyResultValuesV2RowValue> rowValue;

        public static QueryDataResponseBodyResultValuesV2 build(java.util.Map<String, ?> map) throws Exception {
            QueryDataResponseBodyResultValuesV2 self = new QueryDataResponseBodyResultValuesV2();
            return TeaModel.build(map, self);
        }

        public QueryDataResponseBodyResultValuesV2 setRowValue(java.util.List<QueryDataResponseBodyResultValuesV2RowValue> rowValue) {
            this.rowValue = rowValue;
            return this;
        }
        public java.util.List<QueryDataResponseBodyResultValuesV2RowValue> getRowValue() {
            return this.rowValue;
        }

    }

    public static class QueryDataResponseBodyResult extends TeaModel {
        /**
         * <p>The column headers.</p>
         */
        @NameInMap("Headers")
        public java.util.List<QueryDataResponseBodyResultHeaders> headers;

        /**
         * <p>The SQL statement of the query.</p>
         * <blockquote>
         * <p>In addition to the parameter conditions of the current API, the filter conditions in the returned SQL statement also include the row-level and column-level permission configurations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT COMPANY_T_1_.<code>area</code> AS D_AREA_2_, COMPANY_T_1_.<code>city</code> AS D_CITY_3_, SUM(COMPANY_T_1_.<code>profit_amt</code>) AS D_PROFIT_4_ FROM <code>quickbi_test</code>.<code>company_sales_record_copy</code> AS COMPANY_T_1_ WHERE COMPANY_T_1_.<code>area</code> LIKE \&quot;%test%\&quot; GROUP BY COMPANY_T_1_.<code>area</code>, COMPANY_T_1_.<code>city</code> HAVING SUM(COMPANY_T_1_.<code>order_amt</code>) &gt; 1 LIMIT 0, 10</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The returned query results.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;area&quot;:&quot;test&quot;,&quot;city&quot;:&quot;test&quot;},{&quot;area&quot;:&quot;test&quot;,&quot;city&quot;:&quot;test&quot;}]</p>
         */
        @NameInMap("Values")
        public java.util.List<java.util.Map<String, ?>> values;

        /**
         * <p>The returned query results, including the original value fields.</p>
         */
        @NameInMap("ValuesV2")
        public java.util.List<QueryDataResponseBodyResultValuesV2> valuesV2;

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

        public QueryDataResponseBodyResult setValuesV2(java.util.List<QueryDataResponseBodyResultValuesV2> valuesV2) {
            this.valuesV2 = valuesV2;
            return this;
        }
        public java.util.List<QueryDataResponseBodyResultValuesV2> getValuesV2() {
            return this.valuesV2;
        }

    }

}
