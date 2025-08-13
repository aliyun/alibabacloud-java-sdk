// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventBaseInfoByEventCodeResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public DescribeEventBaseInfoByEventCodeResponseBodyResultObject resultObject;

    public static DescribeEventBaseInfoByEventCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventBaseInfoByEventCodeResponseBody self = new DescribeEventBaseInfoByEventCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventBaseInfoByEventCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventBaseInfoByEventCodeResponseBody setResultObject(DescribeEventBaseInfoByEventCodeResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeEventBaseInfoByEventCodeResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields extends TeaModel {
        /**
         * <p>Field description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Field code</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("fieldCode")
        public String fieldCode;

        /**
         * <p>Field ranking</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("fieldRank")
        public String fieldRank;

        /**
         * <p>Field source.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("fieldSource")
        public String fieldSource;

        /**
         * <p>Field type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

        /**
         * <p>Field name.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("title")
        public String title;

        public static DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields self = new DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields();
            return TeaModel.build(map, self);
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields setFieldCode(String fieldCode) {
            this.fieldCode = fieldCode;
            return this;
        }
        public String getFieldCode() {
            return this.fieldCode;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields setFieldRank(String fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public String getFieldRank() {
            return this.fieldRank;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails extends TeaModel {
        /**
         * <p>Policy Execution Logic</p>
         * 
         * <strong>example:</strong>
         * <p>3&amp;((1&amp;2&amp;4)</p>
         */
        @NameInMap("logicExpression")
        public String logicExpression;

        /**
         * <p>Memo</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>Rule Actions</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;inputs\&quot;:[\&quot;auto_accselist\&quot;],\&quot;name\&quot;:\&quot;<strong>addDeTags</strong>\&quot;,\&quot;actionType\&quot;:\&quot;TAG\&quot;,\&quot;outputType\&quot;:\&quot;const\&quot;}]</p>
         */
        @NameInMap("ruleActions")
        public String ruleActions;

        /**
         * <p>Policy Type</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("ruleAuthType")
        public String ruleAuthType;

        /**
         * <p>Event Expressions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;expressionName\&quot;:\&quot;同一设备同一IP上的注册用户数\&quot;,\&quot;itemId\&quot;:1,\&quot;left\&quot;:{\&quot;name\&quot;:\&quot;dK7EXHr490f\&quot;},\&quot;operatorCode\&quot;:\&quot;gte\&quot;,\&quot;operatorName\&quot;:\&quot;大于等于\&quot;,\&quot;right\&quot;:{\&quot;fieldValue\&quot;:\&quot;2\&quot;}}]</p>
         */
        @NameInMap("ruleExpressions")
        public String ruleExpressions;

        /**
         * <p>Policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>101544</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>Policy Name</p>
         * 
         * <strong>example:</strong>
         * <p>手机号MD5命中人脸测试名单</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <p>Policy Status</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        public static DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails self = new DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails();
            return TeaModel.build(map, self);
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails setLogicExpression(String logicExpression) {
            this.logicExpression = logicExpression;
            return this;
        }
        public String getLogicExpression() {
            return this.logicExpression;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails setRuleActions(String ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public String getRuleActions() {
            return this.ruleActions;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails setRuleAuthType(String ruleAuthType) {
            this.ruleAuthType = ruleAuthType;
            return this;
        }
        public String getRuleAuthType() {
            return this.ruleAuthType;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails setRuleExpressions(String ruleExpressions) {
            this.ruleExpressions = ruleExpressions;
            return this;
        }
        public String getRuleExpressions() {
            return this.ruleExpressions;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

    }

    public static class DescribeEventBaseInfoByEventCodeResponseBodyResultObject extends TeaModel {
        /**
         * <p>Business version number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("bizVersion")
        public Integer bizVersion;

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Event status.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("eventStauts")
        public String eventStauts;

        /**
         * <p>Field list.</p>
         */
        @NameInMap("inputFields")
        public java.util.List<DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields> inputFields;

        /**
         * <p>Memo.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>Policy Information</p>
         */
        @NameInMap("ruleDetails")
        public java.util.List<DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails> ruleDetails;

        /**
         * <p>Operation template code</p>
         * 
         * <strong>example:</strong>
         * <p>register</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        /**
         * <p>Template name</p>
         * 
         * <strong>example:</strong>
         * <p>注册事件模板</p>
         */
        @NameInMap("templateName")
        public String templateName;

        /**
         * <p>Template type.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("templateType")
        public String templateType;

        public static DescribeEventBaseInfoByEventCodeResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventBaseInfoByEventCodeResponseBodyResultObject self = new DescribeEventBaseInfoByEventCodeResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObject setBizVersion(Integer bizVersion) {
            this.bizVersion = bizVersion;
            return this;
        }
        public Integer getBizVersion() {
            return this.bizVersion;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObject setEventStauts(String eventStauts) {
            this.eventStauts = eventStauts;
            return this;
        }
        public String getEventStauts() {
            return this.eventStauts;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObject setInputFields(java.util.List<DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields> inputFields) {
            this.inputFields = inputFields;
            return this;
        }
        public java.util.List<DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields> getInputFields() {
            return this.inputFields;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObject setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObject setRuleDetails(java.util.List<DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails> ruleDetails) {
            this.ruleDetails = ruleDetails;
            return this;
        }
        public java.util.List<DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails> getRuleDetails() {
            return this.ruleDetails;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObject setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObject setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeEventBaseInfoByEventCodeResponseBodyResultObject setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
