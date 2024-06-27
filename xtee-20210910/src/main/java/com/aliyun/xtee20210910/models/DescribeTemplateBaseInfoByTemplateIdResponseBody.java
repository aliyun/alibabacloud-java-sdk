// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplateBaseInfoByTemplateIdResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject resultObject;

    public static DescribeTemplateBaseInfoByTemplateIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateBaseInfoByTemplateIdResponseBody self = new DescribeTemplateBaseInfoByTemplateIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateBaseInfoByTemplateIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplateBaseInfoByTemplateIdResponseBody setResultObject(DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields extends TeaModel {
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

        public static DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields self = new DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields setFieldCode(String fieldCode) {
            this.fieldCode = fieldCode;
            return this;
        }
        public String getFieldCode() {
            return this.fieldCode;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields setFieldRank(String fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public String getFieldRank() {
            return this.fieldRank;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails extends TeaModel {
        @NameInMap("logicExpression")
        public String logicExpression;

        @NameInMap("memo")
        public String memo;

        @NameInMap("ruleActions")
        public String ruleActions;

        @NameInMap("ruleExpressions")
        public String ruleExpressions;

        @NameInMap("ruleId")
        public String ruleId;

        @NameInMap("ruleName")
        public String ruleName;

        @NameInMap("ruleStatus")
        public String ruleStatus;

        public static DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails self = new DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails setLogicExpression(String logicExpression) {
            this.logicExpression = logicExpression;
            return this;
        }
        public String getLogicExpression() {
            return this.logicExpression;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails setRuleActions(String ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public String getRuleActions() {
            return this.ruleActions;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails setRuleExpressions(String ruleExpressions) {
            this.ruleExpressions = ruleExpressions;
            return this;
        }
        public String getRuleExpressions() {
            return this.ruleExpressions;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

    }

    public static class DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("eventStauts")
        public String eventStauts;

        @NameInMap("inputFields")
        public java.util.List<DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields> inputFields;

        @NameInMap("ruleDetails")
        public java.util.List<DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails> ruleDetails;

        @NameInMap("templateCode")
        public String templateCode;

        @NameInMap("templateName")
        public String templateName;

        @NameInMap("templateType")
        public String templateType;

        @NameInMap("version")
        public Integer version;

        public static DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject self = new DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject setEventStauts(String eventStauts) {
            this.eventStauts = eventStauts;
            return this;
        }
        public String getEventStauts() {
            return this.eventStauts;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject setInputFields(java.util.List<DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields> inputFields) {
            this.inputFields = inputFields;
            return this;
        }
        public java.util.List<DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectInputFields> getInputFields() {
            return this.inputFields;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject setRuleDetails(java.util.List<DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails> ruleDetails) {
            this.ruleDetails = ruleDetails;
            return this;
        }
        public java.util.List<DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObjectRuleDetails> getRuleDetails() {
            return this.ruleDetails;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public DescribeTemplateBaseInfoByTemplateIdResponseBodyResultObject setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
