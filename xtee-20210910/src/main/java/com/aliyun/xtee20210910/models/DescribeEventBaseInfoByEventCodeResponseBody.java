// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventBaseInfoByEventCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("description")
        public String description;

        @NameInMap("fieldCode")
        public String fieldCode;

        @NameInMap("fieldRank")
        public String fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

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
        @NameInMap("logicExpression")
        public String logicExpression;

        @NameInMap("memo")
        public String memo;

        @NameInMap("ruleActions")
        public String ruleActions;

        @NameInMap("ruleAuthType")
        public String ruleAuthType;

        @NameInMap("ruleExpressions")
        public String ruleExpressions;

        @NameInMap("ruleId")
        public String ruleId;

        @NameInMap("ruleName")
        public String ruleName;

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
        @NameInMap("bizVersion")
        public Integer bizVersion;

        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("eventStauts")
        public String eventStauts;

        @NameInMap("inputFields")
        public java.util.List<DescribeEventBaseInfoByEventCodeResponseBodyResultObjectInputFields> inputFields;

        @NameInMap("memo")
        public String memo;

        @NameInMap("ruleDetails")
        public java.util.List<DescribeEventBaseInfoByEventCodeResponseBodyResultObjectRuleDetails> ruleDetails;

        @NameInMap("templateCode")
        public String templateCode;

        @NameInMap("templateName")
        public String templateName;

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
