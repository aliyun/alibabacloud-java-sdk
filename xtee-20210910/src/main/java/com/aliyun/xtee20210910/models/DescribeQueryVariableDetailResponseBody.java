// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeQueryVariableDetailResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public DescribeQueryVariableDetailResponseBodyResultObject resultObject;

    public static DescribeQueryVariableDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryVariableDetailResponseBody self = new DescribeQueryVariableDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQueryVariableDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQueryVariableDetailResponseBody setResultObject(DescribeQueryVariableDetailResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeQueryVariableDetailResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeQueryVariableDetailResponseBodyResultObject extends TeaModel {
        /**
         * <p>Data source code.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_vcaoii1697</p>
         */
        @NameInMap("dataSourceCode")
        public Long dataSourceCode;

        /**
         * <p>Data source name</p>
         * 
         * <strong>example:</strong>
         * <p>名称数据源</p>
         */
        @NameInMap("dataSourceName")
        public String dataSourceName;

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>变量描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Expression.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT  AVG( $source )\nFROM ds_vcaoii1697 \nWHERE  $age &gt; 0</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>Expression title.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT  AVG( $source )\nFROM testCase\nWHERE  $age &gt; 0</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>Expression variable.</p>
         * 
         * <strong>example:</strong>
         * <p>[96426]</p>
         */
        @NameInMap("expressionVariable")
        public String expressionVariable;

        /**
         * <p>Variable ID</p>
         * 
         * <strong>example:</strong>
         * <p>355</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Outlier</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>Output results.</p>
         * 
         * <strong>example:</strong>
         * <p>DOUBLE</p>
         */
        @NameInMap("outputs")
        public String outputs;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>自定义查询变量标题</p>
         */
        @NameInMap("title")
        public String title;

        public static DescribeQueryVariableDetailResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeQueryVariableDetailResponseBodyResultObject self = new DescribeQueryVariableDetailResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setDataSourceCode(Long dataSourceCode) {
            this.dataSourceCode = dataSourceCode;
            return this;
        }
        public Long getDataSourceCode() {
            return this.dataSourceCode;
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setExpressionVariable(String expressionVariable) {
            this.expressionVariable = expressionVariable;
            return this;
        }
        public String getExpressionVariable() {
            return this.expressionVariable;
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public DescribeQueryVariableDetailResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
