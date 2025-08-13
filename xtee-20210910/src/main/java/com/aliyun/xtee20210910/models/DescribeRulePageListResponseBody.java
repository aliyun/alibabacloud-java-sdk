// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRulePageListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Page size, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeRulePageListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeRulePageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulePageListResponseBody self = new DescribeRulePageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRulePageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRulePageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRulePageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRulePageListResponseBody setResultObject(java.util.List<DescribeRulePageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeRulePageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeRulePageListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeRulePageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeRulePageListResponseBodyResultObjectConsoleAudit extends TeaModel {
        /**
         * <p>UID of the user who passed the audit</p>
         * 
         * <strong>example:</strong>
         * <p>用户uid</p>
         */
        @NameInMap("applyUserId")
        public String applyUserId;

        /**
         * <p>Name of the user who passed the audit</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("applyUserName")
        public String applyUserName;

        /**
         * <p>Approval comments</p>
         * 
         * <strong>example:</strong>
         * <p>同意</p>
         */
        @NameInMap("auditMsg")
        public String auditMsg;

        /**
         * <p>UID of the final auditor</p>
         * 
         * <strong>example:</strong>
         * <p>1728</p>
         */
        @NameInMap("auditRealUserId")
        public String auditRealUserId;

        /**
         * <p>Name of the final auditor</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("auditRealUserName")
        public String auditRealUserName;

        /**
         * <p>Remarks by the approver.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("auditRemark")
        public String auditRemark;

        /**
         * <p>Application audit status</p>
         * 
         * <strong>example:</strong>
         * <p>AGREE</p>
         */
        @NameInMap("auditStatus")
        public String auditStatus;

        /**
         * <p>Approval time</p>
         * 
         * <strong>example:</strong>
         * <p>1545726028000</p>
         */
        @NameInMap("auditTime")
        public Long auditTime;

        /**
         * <p>UID of the auditor</p>
         * 
         * <strong>example:</strong>
         * <p>1234xxxx</p>
         */
        @NameInMap("auditUserId")
        public String auditUserId;

        /**
         * <p>Name of the auditor</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("auditUserName")
        public String auditUserName;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1545726028000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>1728</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Information of other related parties (in JSON format)</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("relationExt")
        public String relationExt;

        /**
         * <p>ID of the related transaction for the approval</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("relationId")
        public Long relationId;

        /**
         * <p>Name of the related transaction for the approval (can be null)</p>
         * 
         * <strong>example:</strong>
         * <p>策略1</p>
         */
        @NameInMap("relationName")
        public String relationName;

        /**
         * <p>Type of the approval (e.g., <code>rule</code> represents the approval of a rule)</p>
         * 
         * <strong>example:</strong>
         * <p>RULE</p>
         */
        @NameInMap("relationType")
        public String relationType;

        public static DescribeRulePageListResponseBodyResultObjectConsoleAudit build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulePageListResponseBodyResultObjectConsoleAudit self = new DescribeRulePageListResponseBodyResultObjectConsoleAudit();
            return TeaModel.build(map, self);
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setApplyUserId(String applyUserId) {
            this.applyUserId = applyUserId;
            return this;
        }
        public String getApplyUserId() {
            return this.applyUserId;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setApplyUserName(String applyUserName) {
            this.applyUserName = applyUserName;
            return this;
        }
        public String getApplyUserName() {
            return this.applyUserName;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setAuditMsg(String auditMsg) {
            this.auditMsg = auditMsg;
            return this;
        }
        public String getAuditMsg() {
            return this.auditMsg;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setAuditRealUserId(String auditRealUserId) {
            this.auditRealUserId = auditRealUserId;
            return this;
        }
        public String getAuditRealUserId() {
            return this.auditRealUserId;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setAuditRealUserName(String auditRealUserName) {
            this.auditRealUserName = auditRealUserName;
            return this;
        }
        public String getAuditRealUserName() {
            return this.auditRealUserName;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setAuditRemark(String auditRemark) {
            this.auditRemark = auditRemark;
            return this;
        }
        public String getAuditRemark() {
            return this.auditRemark;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setAuditTime(Long auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public Long getAuditTime() {
            return this.auditTime;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setAuditUserId(String auditUserId) {
            this.auditUserId = auditUserId;
            return this;
        }
        public String getAuditUserId() {
            return this.auditUserId;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setAuditUserName(String auditUserName) {
            this.auditUserName = auditUserName;
            return this;
        }
        public String getAuditUserName() {
            return this.auditUserName;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setRelationExt(String relationExt) {
            this.relationExt = relationExt;
            return this;
        }
        public String getRelationExt() {
            return this.relationExt;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setRelationId(Long relationId) {
            this.relationId = relationId;
            return this;
        }
        public Long getRelationId() {
            return this.relationId;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setRelationName(String relationName) {
            this.relationName = relationName;
            return this;
        }
        public String getRelationName() {
            return this.relationName;
        }

        public DescribeRulePageListResponseBodyResultObjectConsoleAudit setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

    }

    public static class DescribeRulePageListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Service authorization type</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>Audit object</p>
         */
        @NameInMap("consoleAudit")
        public DescribeRulePageListResponseBodyResultObjectConsoleAudit consoleAudit;

        /**
         * <p>Event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_arcehq4370</p>
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
         * <p>Event type</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        @NameInMap("eventType")
        public String eventType;

        /**
         * <p>External name of the rule</p>
         * 
         * <strong>example:</strong>
         * <p>策略1</p>
         */
        @NameInMap("externalRuleName")
        public String externalRuleName;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Whether there is a new version</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hasNewVersion")
        public Boolean hasNewVersion;

        /**
         * <p>Primary key ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>2793</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Main rule ID</p>
         * 
         * <strong>example:</strong>
         * <p>4399</p>
         */
        @NameInMap("mainRuleId")
        public String mainRuleId;

        /**
         * <p>Policy priority, the higher the number, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <p>Rule type</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("ruleAuthType")
        public String ruleAuthType;

        /**
         * <p>Policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102059</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>Policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述信息</p>
         */
        @NameInMap("ruleMemo")
        public String ruleMemo;

        /**
         * <p>Policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>营销风险识别</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <p>Policy status.</p>
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
         * <p>NORMAL</p>
         */
        @NameInMap("ruleType")
        public String ruleType;

        /**
         * <p>Primary key ID of the rule version.</p>
         * 
         * <strong>example:</strong>
         * <p>11300</p>
         */
        @NameInMap("ruleVersionId")
        public Long ruleVersionId;

        /**
         * <p>Template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>register</p>
         */
        @NameInMap("templateId")
        public Long templateId;

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

        public static DescribeRulePageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulePageListResponseBodyResultObject self = new DescribeRulePageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRulePageListResponseBodyResultObject setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DescribeRulePageListResponseBodyResultObject setConsoleAudit(DescribeRulePageListResponseBodyResultObjectConsoleAudit consoleAudit) {
            this.consoleAudit = consoleAudit;
            return this;
        }
        public DescribeRulePageListResponseBodyResultObjectConsoleAudit getConsoleAudit() {
            return this.consoleAudit;
        }

        public DescribeRulePageListResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeRulePageListResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeRulePageListResponseBodyResultObject setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeRulePageListResponseBodyResultObject setExternalRuleName(String externalRuleName) {
            this.externalRuleName = externalRuleName;
            return this;
        }
        public String getExternalRuleName() {
            return this.externalRuleName;
        }

        public DescribeRulePageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRulePageListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRulePageListResponseBodyResultObject setHasNewVersion(Boolean hasNewVersion) {
            this.hasNewVersion = hasNewVersion;
            return this;
        }
        public Boolean getHasNewVersion() {
            return this.hasNewVersion;
        }

        public DescribeRulePageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRulePageListResponseBodyResultObject setMainRuleId(String mainRuleId) {
            this.mainRuleId = mainRuleId;
            return this;
        }
        public String getMainRuleId() {
            return this.mainRuleId;
        }

        public DescribeRulePageListResponseBodyResultObject setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public DescribeRulePageListResponseBodyResultObject setRuleAuthType(String ruleAuthType) {
            this.ruleAuthType = ruleAuthType;
            return this;
        }
        public String getRuleAuthType() {
            return this.ruleAuthType;
        }

        public DescribeRulePageListResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRulePageListResponseBodyResultObject setRuleMemo(String ruleMemo) {
            this.ruleMemo = ruleMemo;
            return this;
        }
        public String getRuleMemo() {
            return this.ruleMemo;
        }

        public DescribeRulePageListResponseBodyResultObject setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRulePageListResponseBodyResultObject setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public DescribeRulePageListResponseBodyResultObject setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public DescribeRulePageListResponseBodyResultObject setRuleVersionId(Long ruleVersionId) {
            this.ruleVersionId = ruleVersionId;
            return this;
        }
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        public DescribeRulePageListResponseBodyResultObject setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public DescribeRulePageListResponseBodyResultObject setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
