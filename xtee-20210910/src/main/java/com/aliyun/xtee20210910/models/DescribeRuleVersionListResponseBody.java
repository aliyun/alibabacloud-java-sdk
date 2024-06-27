// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleVersionListResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeRuleVersionListResponseBodyResultObject> resultObject;

    public static DescribeRuleVersionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleVersionListResponseBody self = new DescribeRuleVersionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleVersionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleVersionListResponseBody setResultObject(java.util.List<DescribeRuleVersionListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeRuleVersionListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeRuleVersionListResponseBodyResultObjectConsoleAudit extends TeaModel {
        @NameInMap("applyUserId")
        public String applyUserId;

        @NameInMap("applyUserName")
        public String applyUserName;

        @NameInMap("auditMsg")
        public String auditMsg;

        @NameInMap("auditRealUserId")
        public String auditRealUserId;

        @NameInMap("auditRealUserName")
        public String auditRealUserName;

        @NameInMap("auditRemark")
        public String auditRemark;

        @NameInMap("auditStatus")
        public String auditStatus;

        @NameInMap("auditTime")
        public Long auditTime;

        @NameInMap("auditUserId")
        public String auditUserId;

        @NameInMap("auditUserName")
        public String auditUserName;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("id")
        public Long id;

        @NameInMap("relationExt")
        public String relationExt;

        @NameInMap("relationId")
        public Long relationId;

        @NameInMap("relationName")
        public String relationName;

        @NameInMap("relationType")
        public String relationType;

        public static DescribeRuleVersionListResponseBodyResultObjectConsoleAudit build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleVersionListResponseBodyResultObjectConsoleAudit self = new DescribeRuleVersionListResponseBodyResultObjectConsoleAudit();
            return TeaModel.build(map, self);
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setApplyUserId(String applyUserId) {
            this.applyUserId = applyUserId;
            return this;
        }
        public String getApplyUserId() {
            return this.applyUserId;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setApplyUserName(String applyUserName) {
            this.applyUserName = applyUserName;
            return this;
        }
        public String getApplyUserName() {
            return this.applyUserName;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setAuditMsg(String auditMsg) {
            this.auditMsg = auditMsg;
            return this;
        }
        public String getAuditMsg() {
            return this.auditMsg;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setAuditRealUserId(String auditRealUserId) {
            this.auditRealUserId = auditRealUserId;
            return this;
        }
        public String getAuditRealUserId() {
            return this.auditRealUserId;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setAuditRealUserName(String auditRealUserName) {
            this.auditRealUserName = auditRealUserName;
            return this;
        }
        public String getAuditRealUserName() {
            return this.auditRealUserName;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setAuditRemark(String auditRemark) {
            this.auditRemark = auditRemark;
            return this;
        }
        public String getAuditRemark() {
            return this.auditRemark;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setAuditTime(Long auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public Long getAuditTime() {
            return this.auditTime;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setAuditUserId(String auditUserId) {
            this.auditUserId = auditUserId;
            return this;
        }
        public String getAuditUserId() {
            return this.auditUserId;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setAuditUserName(String auditUserName) {
            this.auditUserName = auditUserName;
            return this;
        }
        public String getAuditUserName() {
            return this.auditUserName;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setRelationExt(String relationExt) {
            this.relationExt = relationExt;
            return this;
        }
        public String getRelationExt() {
            return this.relationExt;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setRelationId(Long relationId) {
            this.relationId = relationId;
            return this;
        }
        public Long getRelationId() {
            return this.relationId;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setRelationName(String relationName) {
            this.relationName = relationName;
            return this;
        }
        public String getRelationName() {
            return this.relationName;
        }

        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

    }

    public static class DescribeRuleVersionListResponseBodyResultObject extends TeaModel {
        @NameInMap("consoleAudit")
        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit consoleAudit;

        @NameInMap("consoleRuleId")
        public Long consoleRuleId;

        @NameInMap("consoleRuleMemo")
        public String consoleRuleMemo;

        @NameInMap("consoleRuleName")
        public String consoleRuleName;

        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventType")
        public String eventType;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastOperator")
        public String lastOperator;

        @NameInMap("priority")
        public Long priority;

        @NameInMap("ruleId")
        public String ruleId;

        @NameInMap("ruleStatus")
        public String ruleStatus;

        @NameInMap("version")
        public Long version;

        public static DescribeRuleVersionListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleVersionListResponseBodyResultObject self = new DescribeRuleVersionListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRuleVersionListResponseBodyResultObject setConsoleAudit(DescribeRuleVersionListResponseBodyResultObjectConsoleAudit consoleAudit) {
            this.consoleAudit = consoleAudit;
            return this;
        }
        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit getConsoleAudit() {
            return this.consoleAudit;
        }

        public DescribeRuleVersionListResponseBodyResultObject setConsoleRuleId(Long consoleRuleId) {
            this.consoleRuleId = consoleRuleId;
            return this;
        }
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        public DescribeRuleVersionListResponseBodyResultObject setConsoleRuleMemo(String consoleRuleMemo) {
            this.consoleRuleMemo = consoleRuleMemo;
            return this;
        }
        public String getConsoleRuleMemo() {
            return this.consoleRuleMemo;
        }

        public DescribeRuleVersionListResponseBodyResultObject setConsoleRuleName(String consoleRuleName) {
            this.consoleRuleName = consoleRuleName;
            return this;
        }
        public String getConsoleRuleName() {
            return this.consoleRuleName;
        }

        public DescribeRuleVersionListResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeRuleVersionListResponseBodyResultObject setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeRuleVersionListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRuleVersionListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRuleVersionListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRuleVersionListResponseBodyResultObject setLastOperator(String lastOperator) {
            this.lastOperator = lastOperator;
            return this;
        }
        public String getLastOperator() {
            return this.lastOperator;
        }

        public DescribeRuleVersionListResponseBodyResultObject setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public DescribeRuleVersionListResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRuleVersionListResponseBodyResultObject setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public DescribeRuleVersionListResponseBodyResultObject setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
