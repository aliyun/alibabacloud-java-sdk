// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class QueryAuthRuleDetailByRuleIdResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
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
        /**
         * <p>Audit ID</p>
         * 
         * <strong>example:</strong>
         * <p>225</p>
         */
        @NameInMap("auditId")
        public Long auditId;

        /**
         * <p>Authorization type</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>Authorized user UID</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("authUsers")
        public String authUsers;

        /**
         * <p>Primary key ID of the strategy</p>
         * 
         * <strong>example:</strong>
         * <p>6843</p>
         */
        @NameInMap("consoleRuleId")
        public Long consoleRuleId;

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
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Execution logic</p>
         * 
         * <strong>example:</strong>
         * <p>1&amp;2</p>
         */
        @NameInMap("logicExpression")
        public String logicExpression;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>Rule priority, the higher the number, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <p>Returned rule action structure.</p>
         */
        @NameInMap("ruleActionMap")
        public java.util.Map<String, String> ruleActionMap;

        /**
         * <p>Output actions</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;inputs\&quot;:[\&quot;unusualBrand\&quot;],\&quot;name\&quot;:\&quot;<strong>addDeTags</strong>\&quot;,\&quot;actionType\&quot;:\&quot;TAG\&quot;,\&quot;outputType\&quot;:\&quot;const\&quot;}]</p>
         */
        @NameInMap("ruleActions")
        public String ruleActions;

        /**
         * <p>Rule authorization type</p>
         * 
         * <strong>example:</strong>
         * <p>WHITE_BOX</p>
         */
        @NameInMap("ruleAuthType")
        public String ruleAuthType;

        /**
         * <p>Rule expressions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;expressionName\&quot;:\&quot;同一设备同一IP上的注册用户数\&quot;,\&quot;itemId\&quot;:1,\&quot;left\&quot;:{\&quot;name\&quot;:\&quot;dK7EXHr490f\&quot;},\&quot;operatorCode\&quot;:\&quot;gte\&quot;,\&quot;operatorName\&quot;:\&quot;大于等于\&quot;,\&quot;right\&quot;:{\&quot;fieldValue\&quot;:\&quot;2\&quot;}}]</p>
         */
        @NameInMap("ruleExpressions")
        public String ruleExpressions;

        /**
         * <p>Strategy ID</p>
         * 
         * <strong>example:</strong>
         * <p>102224</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>Strategy name</p>
         * 
         * <strong>example:</strong>
         * <p>营销风险识别</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <p>Strategy status</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <p>Rule type</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("ruleType")
        public String ruleType;

        /**
         * <p>Primary key ID of the strategy version</p>
         * 
         * <strong>example:</strong>
         * <p>11519</p>
         */
        @NameInMap("ruleVersionId")
        public Long ruleVersionId;

        /**
         * <p>Template type</p>
         * 
         * <strong>example:</strong>
         * <p>PUB_SERVICE</p>
         */
        @NameInMap("templateType")
        public String templateType;

        /**
         * <p>Version number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public QueryAuthRuleDetailByRuleIdResponseBodyResultObject setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
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
