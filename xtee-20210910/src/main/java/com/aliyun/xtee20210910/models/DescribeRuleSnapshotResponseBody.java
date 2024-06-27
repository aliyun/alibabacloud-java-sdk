// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleSnapshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeRuleSnapshotResponseBodyResultObject resultObject;

    public static DescribeRuleSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleSnapshotResponseBody self = new DescribeRuleSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleSnapshotResponseBody setResultObject(DescribeRuleSnapshotResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeRuleSnapshotResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeRuleSnapshotResponseBodyResultObject extends TeaModel {
        @NameInMap("bizVersion")
        public String bizVersion;

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

        public static DescribeRuleSnapshotResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleSnapshotResponseBodyResultObject self = new DescribeRuleSnapshotResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRuleSnapshotResponseBodyResultObject setBizVersion(String bizVersion) {
            this.bizVersion = bizVersion;
            return this;
        }
        public String getBizVersion() {
            return this.bizVersion;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setLogicExpression(String logicExpression) {
            this.logicExpression = logicExpression;
            return this;
        }
        public String getLogicExpression() {
            return this.logicExpression;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setRuleActions(String ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public String getRuleActions() {
            return this.ruleActions;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setRuleExpressions(String ruleExpressions) {
            this.ruleExpressions = ruleExpressions;
            return this;
        }
        public String getRuleExpressions() {
            return this.ruleExpressions;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

    }

}
