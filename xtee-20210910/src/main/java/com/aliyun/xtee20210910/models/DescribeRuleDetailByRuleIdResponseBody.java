// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleDetailByRuleIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeRuleDetailByRuleIdResponseBodyResultObject resultObject;

    public static DescribeRuleDetailByRuleIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleDetailByRuleIdResponseBody self = new DescribeRuleDetailByRuleIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleDetailByRuleIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleDetailByRuleIdResponseBody setResultObject(DescribeRuleDetailByRuleIdResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeRuleDetailByRuleIdResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeRuleDetailByRuleIdResponseBodyResultObject extends TeaModel {
        @NameInMap("bizVersion")
        public String bizVersion;

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

        @NameInMap("mainEventCode")
        public String mainEventCode;

        @NameInMap("memo")
        public String memo;

        @NameInMap("ruleActionMap")
        public java.util.Map<String, ?> ruleActionMap;

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

        @NameInMap("ruleVersionId")
        public Long ruleVersionId;

        public static DescribeRuleDetailByRuleIdResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleDetailByRuleIdResponseBodyResultObject self = new DescribeRuleDetailByRuleIdResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setBizVersion(String bizVersion) {
            this.bizVersion = bizVersion;
            return this;
        }
        public String getBizVersion() {
            return this.bizVersion;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setConsoleRuleId(Long consoleRuleId) {
            this.consoleRuleId = consoleRuleId;
            return this;
        }
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setLogicExpression(String logicExpression) {
            this.logicExpression = logicExpression;
            return this;
        }
        public String getLogicExpression() {
            return this.logicExpression;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setMainEventCode(String mainEventCode) {
            this.mainEventCode = mainEventCode;
            return this;
        }
        public String getMainEventCode() {
            return this.mainEventCode;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setRuleActionMap(java.util.Map<String, ?> ruleActionMap) {
            this.ruleActionMap = ruleActionMap;
            return this;
        }
        public java.util.Map<String, ?> getRuleActionMap() {
            return this.ruleActionMap;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setRuleActions(String ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public String getRuleActions() {
            return this.ruleActions;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setRuleExpressions(String ruleExpressions) {
            this.ruleExpressions = ruleExpressions;
            return this;
        }
        public String getRuleExpressions() {
            return this.ruleExpressions;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public DescribeRuleDetailByRuleIdResponseBodyResultObject setRuleVersionId(Long ruleVersionId) {
            this.ruleVersionId = ruleVersionId;
            return this;
        }
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

    }

}
