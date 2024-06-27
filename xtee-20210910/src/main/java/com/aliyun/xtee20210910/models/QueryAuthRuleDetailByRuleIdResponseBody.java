// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class QueryAuthRuleDetailByRuleIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public QueryAuthRuleDetailByRuleIdResponseBodyResultObject resultObject;

    public static QueryAuthRuleDetailByRuleIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthRuleDetailByRuleIdResponseBody self = new QueryAuthRuleDetailByRuleIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuthRuleDetailByRuleIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuthRuleDetailByRuleIdResponseBody setResultObject(QueryAuthRuleDetailByRuleIdResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public QueryAuthRuleDetailByRuleIdResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class QueryAuthRuleDetailByRuleIdResponseBodyResultObject extends TeaModel {
        @NameInMap("auditId")
        public Long auditId;

        @NameInMap("authType")
        public String authType;

        @NameInMap("authUsers")
        public String authUsers;

        @NameInMap("consoleRuleId")
        public Long consoleRuleId;

        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("logicExpression")
        public String logicExpression;

        @NameInMap("memo")
        public String memo;

        @NameInMap("priority")
        public Long priority;

        @NameInMap("ruleActionMap")
        public java.util.Map<String, String> ruleActionMap;

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

        @NameInMap("ruleVersionId")
        public Long ruleVersionId;

        @NameInMap("templateType")
        public String templateType;

        @NameInMap("version")
        public Long version;

        public static QueryAuthRuleDetailByRuleIdResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            QueryAuthRuleDetailByRuleIdResponseBodyResultObject self = new QueryAuthRuleDetailByRuleIdResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setAuditId(Long auditId) {
            this.auditId = auditId;
            return this;
        }
        public Long getAuditId() {
            return this.auditId;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setAuthUsers(String authUsers) {
            this.authUsers = authUsers;
            return this;
        }
        public String getAuthUsers() {
            return this.authUsers;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setConsoleRuleId(Long consoleRuleId) {
            this.consoleRuleId = consoleRuleId;
            return this;
        }
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setLogicExpression(String logicExpression) {
            this.logicExpression = logicExpression;
            return this;
        }
        public String getLogicExpression() {
            return this.logicExpression;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setRuleActionMap(java.util.Map<String, String> ruleActionMap) {
            this.ruleActionMap = ruleActionMap;
            return this;
        }
        public java.util.Map<String, String> getRuleActionMap() {
            return this.ruleActionMap;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setRuleActions(String ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public String getRuleActions() {
            return this.ruleActions;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setRuleAuthType(String ruleAuthType) {
            this.ruleAuthType = ruleAuthType;
            return this;
        }
        public String getRuleAuthType() {
            return this.ruleAuthType;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setRuleExpressions(String ruleExpressions) {
            this.ruleExpressions = ruleExpressions;
            return this;
        }
        public String getRuleExpressions() {
            return this.ruleExpressions;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setRuleVersionId(Long ruleVersionId) {
            this.ruleVersionId = ruleVersionId;
            return this;
        }
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
