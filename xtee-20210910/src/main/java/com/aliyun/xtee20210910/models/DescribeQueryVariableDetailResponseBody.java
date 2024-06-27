// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeQueryVariableDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("dataSourceCode")
        public Long dataSourceCode;

        @NameInMap("dataSourceName")
        public String dataSourceName;

        @NameInMap("description")
        public String description;

        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("expression")
        public String expression;

        @NameInMap("expressionTitle")
        public String expressionTitle;

        @NameInMap("expressionVariable")
        public String expressionVariable;

        @NameInMap("id")
        public Long id;

        @NameInMap("outlier")
        public String outlier;

        @NameInMap("outputs")
        public String outputs;

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
