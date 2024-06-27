// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneRulePageListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeSceneRulePageListResponseBodyResultObject> resultObject;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
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
         * <strong>example:</strong>
         * <p>1234567890999</p>
         */
        @NameInMap("applyUserId")
        public String applyUserId;

        @NameInMap("applyUserName")
        public String applyUserName;

        @NameInMap("auditMsg")
        public String auditMsg;

        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("auditRealUserId")
        public String auditRealUserId;

        @NameInMap("auditRealUserName")
        public String auditRealUserName;

        @NameInMap("auditRemark")
        public String auditRemark;

        /**
         * <strong>example:</strong>
         * <p>AGREE</p>
         */
        @NameInMap("auditStatus")
        public String auditStatus;

        /**
         * <strong>example:</strong>
         * <p>1545726028000</p>
         */
        @NameInMap("auditTime")
        public Long auditTime;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("auditUserId")
        public String auditUserId;

        @NameInMap("auditUserName")
        public String auditUserName;

        /**
         * <strong>example:</strong>
         * <p>1545726028000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1728</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("relationExt")
        public String relationExt;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("relationId")
        public Long relationId;

        /**
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("relationName")
        public String relationName;

        /**
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
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("authType")
        public String authType;

        @NameInMap("consoleAudit")
        public DescribeSceneRulePageListResponseBodyResultObjectConsoleAudit consoleAudit;

        /**
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        @NameInMap("eventType")
        public String eventType;

        @NameInMap("externalRuleName")
        public String externalRuleName;

        /**
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>4399</p>
         */
        @NameInMap("mainRuleId")
        public String mainRuleId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <strong>example:</strong>
         * <p>CUSTMER</p>
         */
        @NameInMap("ruleAuthType")
        public String ruleAuthType;

        /**
         * <strong>example:</strong>
         * <p>4730</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        @NameInMap("ruleMemo")
        public String ruleMemo;

        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <strong>example:</strong>
         * <p>3823</p>
         */
        @NameInMap("ruleVersionId")
        public Long ruleVersionId;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("templateId")
        public Long templateId;

        /**
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
