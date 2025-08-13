// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleVersionListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Page size, default value is 10</p>
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
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeRuleVersionListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeRuleVersionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleVersionListResponseBody self = new DescribeRuleVersionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleVersionListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRuleVersionListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public DescribeRuleVersionListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeRuleVersionListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeRuleVersionListResponseBodyResultObjectConsoleAudit extends TeaModel {
        /**
         * <p>Initiator UID</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("applyUserId")
        public String applyUserId;

        /**
         * <p>Initiator name</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("applyUserName")
        public String applyUserName;

        /**
         * <p>Approval comment</p>
         * 
         * <strong>example:</strong>
         * <p>同意</p>
         */
        @NameInMap("auditMsg")
        public String auditMsg;

        /**
         * <p>Final approver UID</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("auditRealUserId")
        public String auditRealUserId;

        /**
         * <p>Final approver name</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("auditRealUserName")
        public String auditRealUserName;

        /**
         * <p>Approver\&quot;s remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("auditRemark")
        public String auditRemark;

        /**
         * <p>Approval status</p>
         * 
         * <strong>example:</strong>
         * <p>AGREE</p>
         */
        @NameInMap("auditStatus")
        public String auditStatus;

        /**
         * <p>Approval time.</p>
         * 
         * <strong>example:</strong>
         * <p>1545726028000</p>
         */
        @NameInMap("auditTime")
        public Long auditTime;

        /**
         * <p>Designated approver UID</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("auditUserId")
        public String auditUserId;

        /**
         * <p>Designated auditor\&quot;s name</p>
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
         * <p>Information of related others (in JSON format)</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("relationExt")
        public String relationExt;

        /**
         * <p>ID of the associated transaction</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("relationId")
        public Long relationId;

        /**
         * <p>Name of the associated item</p>
         * 
         * <strong>example:</strong>
         * <p>营销风险识别</p>
         */
        @NameInMap("relationName")
        public String relationName;

        /**
         * <p>Type of approval (e.g., <code>rule</code> for policy approval)</p>
         * 
         * <strong>example:</strong>
         * <p>RULE</p>
         */
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
        /**
         * <p>Audit object</p>
         */
        @NameInMap("consoleAudit")
        public DescribeRuleVersionListResponseBodyResultObjectConsoleAudit consoleAudit;

        /**
         * <p>Console rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6715</p>
         */
        @NameInMap("consoleRuleId")
        public Long consoleRuleId;

        /**
         * <p>Associated policy remarks</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("consoleRuleMemo")
        public String consoleRuleMemo;

        /**
         * <p>Associated policy name</p>
         * 
         * <strong>example:</strong>
         * <p>营销风险识别</p>
         */
        @NameInMap("consoleRuleName")
        public String consoleRuleName;

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event type</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        @NameInMap("eventType")
        public String eventType;

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
         * <p>Primary key ID of the policy</p>
         * 
         * <strong>example:</strong>
         * <p>376773</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The user who last operated.</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("lastOperator")
        public String lastOperator;

        /**
         * <p>Policy priority, the higher the number, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <p>Policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>102224</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>Policy status</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <p>Rule Type</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("ruleType")
        public String ruleType;

        /**
         * <p>Version number</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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

        public DescribeRuleVersionListResponseBodyResultObject setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
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
