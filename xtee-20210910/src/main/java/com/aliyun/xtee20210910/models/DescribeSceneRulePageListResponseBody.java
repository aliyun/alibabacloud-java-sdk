// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneRulePageListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Number of items per page in the returned results. Default value: 20, minimum value: 1, maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Request ID, which is unique for each request, facilitating subsequent troubleshooting</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeSceneRulePageListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeSceneRulePageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneRulePageListResponseBody self = new DescribeSceneRulePageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneRulePageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSceneRulePageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSceneRulePageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSceneRulePageListResponseBody setResultObject(java.util.List<DescribeSceneRulePageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSceneRulePageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSceneRulePageListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSceneRulePageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit extends TeaModel {
        /**
         * <p>Initiator account ID</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890999</p>
         */
        @NameInMap("applyUserId")
        public String applyUserId;

        /**
         * <p>Initiator account name</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
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
         * <p>Final approver ID</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("auditRealUserId")
        public String auditRealUserId;

        /**
         * <p>Approver account name</p>
         * 
         * <strong>example:</strong>
         * <p>王五</p>
         */
        @NameInMap("auditRealUserName")
        public String auditRealUserName;

        /**
         * <p>Approval application remarks</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("auditRemark")
        public String auditRemark;

        /**
         * <p>Status</p>
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
         * <p>Designated auditor account IDs (comma-separated for multiple)</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("auditUserId")
        public String auditUserId;

        /**
         * <p>Designated auditor account names (comma-separated for multiple)</p>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("auditUserName")
        public String auditUserName;

        /**
         * <p>Creation time in UTC</p>
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
         * <p>Information about other related parties (in JSON format)</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("relationExt")
        public String relationExt;

        /**
         * <p>审批关联的事务ID</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("relationId")
        public Long relationId;

        /**
         * <p>The name of the associated transaction (can be null)</p>
         * 
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("relationName")
        public String relationName;

        /**
         * <p>审批的类型（如rule代表策略的审批）</p>
         * 
         * <strong>example:</strong>
         * <p>RULE</p>
         */
        @NameInMap("relationType")
        public String relationType;

        public static DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit self = new DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit();
            return TeaModel.build(map, self);
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setApplyUserId(String applyUserId) {
            this.applyUserId = applyUserId;
            return this;
        }
        public String getApplyUserId() {
            return this.applyUserId;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setApplyUserName(String applyUserName) {
            this.applyUserName = applyUserName;
            return this;
        }
        public String getApplyUserName() {
            return this.applyUserName;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setAuditMsg(String auditMsg) {
            this.auditMsg = auditMsg;
            return this;
        }
        public String getAuditMsg() {
            return this.auditMsg;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setAuditRealUserId(String auditRealUserId) {
            this.auditRealUserId = auditRealUserId;
            return this;
        }
        public String getAuditRealUserId() {
            return this.auditRealUserId;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setAuditRealUserName(String auditRealUserName) {
            this.auditRealUserName = auditRealUserName;
            return this;
        }
        public String getAuditRealUserName() {
            return this.auditRealUserName;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setAuditRemark(String auditRemark) {
            this.auditRemark = auditRemark;
            return this;
        }
        public String getAuditRemark() {
            return this.auditRemark;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setAuditTime(Long auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public Long getAuditTime() {
            return this.auditTime;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setAuditUserId(String auditUserId) {
            this.auditUserId = auditUserId;
            return this;
        }
        public String getAuditUserId() {
            return this.auditUserId;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setAuditUserName(String auditUserName) {
            this.auditUserName = auditUserName;
            return this;
        }
        public String getAuditUserName() {
            return this.auditUserName;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setRelationExt(String relationExt) {
            this.relationExt = relationExt;
            return this;
        }
        public String getRelationExt() {
            return this.relationExt;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setRelationId(Long relationId) {
            this.relationId = relationId;
            return this;
        }
        public Long getRelationId() {
            return this.relationId;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setRelationName(String relationName) {
            this.relationName = relationName;
            return this;
        }
        public String getRelationName() {
            return this.relationName;
        }

        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

    }

    public static class DescribeSceneRulePageListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Service authorization type</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>Audit object</p>
         */
        @NameInMap("consoleAudit")
        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit consoleAudit;

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
         * <p>Event type</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        @NameInMap("eventType")
        public String eventType;

        /**
         * <p>External rule name</p>
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
         * <p>Modification time</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Primary key ID of the rule</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
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
         * <p>Strategy priority, where a higher number indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <p>Rule Auth type</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTMER</p>
         */
        @NameInMap("ruleAuthType")
        public String ruleAuthType;

        /**
         * <p>Strategy ID</p>
         * 
         * <strong>example:</strong>
         * <p>4730</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>Strategy description</p>
         * 
         * <strong>example:</strong>
         * <p>描述信息</p>
         */
        @NameInMap("ruleMemo")
        public String ruleMemo;

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
         * <p>Primary key ID of the rule version</p>
         * 
         * <strong>example:</strong>
         * <p>3823</p>
         */
        @NameInMap("ruleVersionId")
        public Long ruleVersionId;

        /**
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("templateId")
        public Long templateId;

        /**
         * <p>Version number</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("version")
        public Integer version;

        public static DescribeSceneRulePageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneRulePageListResponseBodyResultObject self = new DescribeSceneRulePageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSceneRulePageListResponseBodyResultObject setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setConsoleAudit(DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit consoleAudit) {
            this.consoleAudit = consoleAudit;
            return this;
        }
        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit getConsoleAudit() {
            return this.consoleAudit;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setExternalRuleName(String externalRuleName) {
            this.externalRuleName = externalRuleName;
            return this;
        }
        public String getExternalRuleName() {
            return this.externalRuleName;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setMainRuleId(String mainRuleId) {
            this.mainRuleId = mainRuleId;
            return this;
        }
        public String getMainRuleId() {
            return this.mainRuleId;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setRuleAuthType(String ruleAuthType) {
            this.ruleAuthType = ruleAuthType;
            return this;
        }
        public String getRuleAuthType() {
            return this.ruleAuthType;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setRuleMemo(String ruleMemo) {
            this.ruleMemo = ruleMemo;
            return this;
        }
        public String getRuleMemo() {
            return this.ruleMemo;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setRuleVersionId(Long ruleVersionId) {
            this.ruleVersionId = ruleVersionId;
            return this;
        }
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public DescribeSceneRulePageListResponseBodyResultObject setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
