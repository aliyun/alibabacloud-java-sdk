// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariableVersionDetailResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public DescribeExpressionVariableVersionDetailResponseBodyResultObject resultObject;

    public static DescribeExpressionVariableVersionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressionVariableVersionDetailResponseBody self = new DescribeExpressionVariableVersionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressionVariableVersionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressionVariableVersionDetailResponseBody setResultObject(DescribeExpressionVariableVersionDetailResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeExpressionVariableVersionDetailResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeExpressionVariableVersionDetailResponseBodyResultObject extends TeaModel {
        /**
         * <p>Creation type.</p>
         * 
         * <strong>example:</strong>
         * <p>MORMAL</p>
         */
        @NameInMap("createType")
        public String createType;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>变量描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Expression.</p>
         * 
         * <strong>example:</strong>
         * <p>@ex_GX9rrlTq4b67 + 1001</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>Expression title.</p>
         * 
         * <strong>example:</strong>
         * <p>@selfvariable_02 + 1001</p>
         */
        @NameInMap("expressionTitle")
        public String expressionTitle;

        /**
         * <p>Expression variable.</p>
         * 
         * <strong>example:</strong>
         * <p>ex_GX9rrlTq4b67</p>
         */
        @NameInMap("expressionVariable")
        public String expressionVariable;

        /**
         * <p>Field ranking.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("fieldRank")
        public Integer fieldRank;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1762409015000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1762409026000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Custom variable primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>397625</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Invoke key.</p>
         * 
         * <strong>example:</strong>
         * <p>deInvokeSelfVariable_v1</p>
         */
        @NameInMap("invokeKey")
        public String invokeKey;

        /**
         * <p>Variable name, a uniquely generated identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>ex_0kWIfZ27c525</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Outlier.</p>
         * 
         * <strong>example:</strong>
         * <p>SYS_ERROR</p>
         */
        @NameInMap("outlier")
        public String outlier;

        /**
         * <p>Variable return type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        @NameInMap("outputs")
        public String outputs;

        /**
         * <p>Variable associated event.</p>
         * 
         * <strong>example:</strong>
         * <p>de_awkhwh0314</p>
         */
        @NameInMap("refObjId")
        public String refObjId;

        /**
         * <p>Variable association type.</p>
         * 
         * <strong>example:</strong>
         * <p>EVENT_BY_EXPRESSION</p>
         */
        @NameInMap("refObjType")
        public String refObjType;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>Source type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Variable title.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>User UID.</p>
         * 
         * <strong>example:</strong>
         * <p>151222xxxxxxxxxx</p>
         */
        @NameInMap("userId")
        public Long userId;

        /**
         * <p>Variable version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("version")
        public Long version;

        public static DescribeExpressionVariableVersionDetailResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressionVariableVersionDetailResponseBodyResultObject self = new DescribeExpressionVariableVersionDetailResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setExpressionTitle(String expressionTitle) {
            this.expressionTitle = expressionTitle;
            return this;
        }
        public String getExpressionTitle() {
            return this.expressionTitle;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setExpressionVariable(String expressionVariable) {
            this.expressionVariable = expressionVariable;
            return this;
        }
        public String getExpressionVariable() {
            return this.expressionVariable;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setInvokeKey(String invokeKey) {
            this.invokeKey = invokeKey;
            return this;
        }
        public String getInvokeKey() {
            return this.invokeKey;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setOutlier(String outlier) {
            this.outlier = outlier;
            return this;
        }
        public String getOutlier() {
            return this.outlier;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setRefObjId(String refObjId) {
            this.refObjId = refObjId;
            return this;
        }
        public String getRefObjId() {
            return this.refObjId;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setRefObjType(String refObjType) {
            this.refObjType = refObjType;
            return this;
        }
        public String getRefObjType() {
            return this.refObjType;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeExpressionVariableVersionDetailResponseBodyResultObject setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
