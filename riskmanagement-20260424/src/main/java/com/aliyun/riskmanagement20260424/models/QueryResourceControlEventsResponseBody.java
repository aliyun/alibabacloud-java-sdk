// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryResourceControlEventsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The metadata returned.</p>
     */
    @NameInMap("Data")
    public QueryResourceControlEventsResponseBodyData data;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>739705BB-B0EF-554B-B3A8-383F4F93E067</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryResourceControlEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceControlEventsResponseBody self = new QueryResourceControlEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryResourceControlEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryResourceControlEventsResponseBody setData(QueryResourceControlEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryResourceControlEventsResponseBodyData getData() {
        return this.data;
    }

    public QueryResourceControlEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryResourceControlEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryResourceControlEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryResourceControlEventsResponseBodyDataList extends TeaModel {
        /**
         * <p>The action code.</p>
         * 
         * <strong>example:</strong>
         * <p>DEPLOY_STAGE_REBOOT_TASK</p>
         */
        @NameInMap("ActionCode")
        public String actionCode;

        /**
         * <p>The action name.</p>
         * 
         * <strong>example:</strong>
         * <p>Cryptomining alert.</p>
         */
        @NameInMap("ActionName")
        public String actionName;

        /**
         * <p>The time when the alert ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("AlertEndTime")
        public String alertEndTime;

        /**
         * <p>The time when the first alert was triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("AlertStartTime")
        public String alertStartTime;

        /**
         * <p>The time when the control action was released.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("AntiPunishTime")
        public String antiPunishTime;

        /**
         * <p>The number of unblock application records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApplyRecordCount")
        public Integer applyRecordCount;

        /**
         * <p>The application status.</p>
         * 
         * <strong>example:</strong>
         * <p>AUDIT</p>
         */
        @NameInMap("ApplyStatus")
        public String applyStatus;

        /**
         * <p>Indicates whether the unblock application is processed through the review platform.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ApplyTrial")
        public Boolean applyTrial;

        /**
         * <p>The product type name.</p>
         * 
         * <strong>example:</strong>
         * <p>e\&quot;c\&quot;s</p>
         */
        @NameInMap("BusinessName")
        public String businessName;

        /**
         * <p>The event name code.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST_IMS_ACCOUNT_PUNISH_WHITE_TEST</p>
         */
        @NameInMap("CaseCode")
        public String caseCode;

        /**
         * <p>The controlled domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>ubs-mm-nwwss-ddos.purchern.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e791c08281b41e8240f897a424c188ae</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>Mining control event.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The extended information about the penalty.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;createAt\&quot;:\&quot;2025-08-03 11:18:59\&quot;,\&quot;updatedAt\&quot;:\&quot;2025-08-03 11:18:59\&quot;}</p>
         */
        @NameInMap("Extras")
        public String extras;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FormType")
        public String formType;

        /**
         * <p>The latest time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("GmtLatest")
        public String gmtLatest;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-3nsvwmt67pn72py1z</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The controlled IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.158.58</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The latest detection time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("LastCheckTime")
        public String lastCheckTime;

        /**
         * <p>The estimated shutdown time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("PreCloseTime")
        public String preCloseTime;

        /**
         * <p>The source of the penalty.</p>
         * 
         * <strong>example:</strong>
         * <p>MRM</p>
         */
        @NameInMap("PunishFrom")
        public String punishFrom;

        /**
         * <p>The time when the control action was applied.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("PunishTime")
        public String punishTime;

        /**
         * <p>The event reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Cryptomining alert.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The region information.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security hardening suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>Suggestion</p>
         */
        @NameInMap("Reinforcement")
        public String reinforcement;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether batch unblock applications are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportBatchApply")
        public Boolean supportBatchApply;

        /**
         * <p>Indicates whether a single unblock application is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportSingleApply")
        public Boolean supportSingleApply;

        /**
         * <p>The trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>miner</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The controlled URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://pm.alicdn.com/quali/bc98e42b619ad4127bf6437b87045597.jpg?auth_key=1758682451-0-0-897be72852503566bd6775cd9914f5aa">https://pm.alicdn.com/quali/bc98e42b619ad4127bf6437b87045597.jpg?auth_key=1758682451-0-0-897be72852503566bd6775cd9914f5aa</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static QueryResourceControlEventsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryResourceControlEventsResponseBodyDataList self = new QueryResourceControlEventsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryResourceControlEventsResponseBodyDataList setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryResourceControlEventsResponseBodyDataList setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public QueryResourceControlEventsResponseBodyDataList setAlertEndTime(String alertEndTime) {
            this.alertEndTime = alertEndTime;
            return this;
        }
        public String getAlertEndTime() {
            return this.alertEndTime;
        }

        public QueryResourceControlEventsResponseBodyDataList setAlertStartTime(String alertStartTime) {
            this.alertStartTime = alertStartTime;
            return this;
        }
        public String getAlertStartTime() {
            return this.alertStartTime;
        }

        public QueryResourceControlEventsResponseBodyDataList setAntiPunishTime(String antiPunishTime) {
            this.antiPunishTime = antiPunishTime;
            return this;
        }
        public String getAntiPunishTime() {
            return this.antiPunishTime;
        }

        public QueryResourceControlEventsResponseBodyDataList setApplyRecordCount(Integer applyRecordCount) {
            this.applyRecordCount = applyRecordCount;
            return this;
        }
        public Integer getApplyRecordCount() {
            return this.applyRecordCount;
        }

        public QueryResourceControlEventsResponseBodyDataList setApplyStatus(String applyStatus) {
            this.applyStatus = applyStatus;
            return this;
        }
        public String getApplyStatus() {
            return this.applyStatus;
        }

        public QueryResourceControlEventsResponseBodyDataList setApplyTrial(Boolean applyTrial) {
            this.applyTrial = applyTrial;
            return this;
        }
        public Boolean getApplyTrial() {
            return this.applyTrial;
        }

        public QueryResourceControlEventsResponseBodyDataList setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public QueryResourceControlEventsResponseBodyDataList setCaseCode(String caseCode) {
            this.caseCode = caseCode;
            return this;
        }
        public String getCaseCode() {
            return this.caseCode;
        }

        public QueryResourceControlEventsResponseBodyDataList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryResourceControlEventsResponseBodyDataList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryResourceControlEventsResponseBodyDataList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public QueryResourceControlEventsResponseBodyDataList setExtras(String extras) {
            this.extras = extras;
            return this;
        }
        public String getExtras() {
            return this.extras;
        }

        public QueryResourceControlEventsResponseBodyDataList setFormType(String formType) {
            this.formType = formType;
            return this;
        }
        public String getFormType() {
            return this.formType;
        }

        public QueryResourceControlEventsResponseBodyDataList setGmtLatest(String gmtLatest) {
            this.gmtLatest = gmtLatest;
            return this;
        }
        public String getGmtLatest() {
            return this.gmtLatest;
        }

        public QueryResourceControlEventsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryResourceControlEventsResponseBodyDataList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryResourceControlEventsResponseBodyDataList setLastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        public QueryResourceControlEventsResponseBodyDataList setPreCloseTime(String preCloseTime) {
            this.preCloseTime = preCloseTime;
            return this;
        }
        public String getPreCloseTime() {
            return this.preCloseTime;
        }

        public QueryResourceControlEventsResponseBodyDataList setPunishFrom(String punishFrom) {
            this.punishFrom = punishFrom;
            return this;
        }
        public String getPunishFrom() {
            return this.punishFrom;
        }

        public QueryResourceControlEventsResponseBodyDataList setPunishTime(String punishTime) {
            this.punishTime = punishTime;
            return this;
        }
        public String getPunishTime() {
            return this.punishTime;
        }

        public QueryResourceControlEventsResponseBodyDataList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryResourceControlEventsResponseBodyDataList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryResourceControlEventsResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryResourceControlEventsResponseBodyDataList setReinforcement(String reinforcement) {
            this.reinforcement = reinforcement;
            return this;
        }
        public String getReinforcement() {
            return this.reinforcement;
        }

        public QueryResourceControlEventsResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryResourceControlEventsResponseBodyDataList setSupportBatchApply(Boolean supportBatchApply) {
            this.supportBatchApply = supportBatchApply;
            return this;
        }
        public Boolean getSupportBatchApply() {
            return this.supportBatchApply;
        }

        public QueryResourceControlEventsResponseBodyDataList setSupportSingleApply(Boolean supportSingleApply) {
            this.supportSingleApply = supportSingleApply;
            return this;
        }
        public Boolean getSupportSingleApply() {
            return this.supportSingleApply;
        }

        public QueryResourceControlEventsResponseBodyDataList setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public QueryResourceControlEventsResponseBodyDataList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryResourceControlEventsResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Current")
        public Integer current;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryResourceControlEventsResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryResourceControlEventsResponseBodyDataPageInfo self = new QueryResourceControlEventsResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public QueryResourceControlEventsResponseBodyDataPageInfo setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public QueryResourceControlEventsResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryResourceControlEventsResponseBodyDataPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class QueryResourceControlEventsResponseBodyData extends TeaModel {
        /**
         * <p>The event list data.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryResourceControlEventsResponseBodyDataList> list;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public QueryResourceControlEventsResponseBodyDataPageInfo pageInfo;

        public static QueryResourceControlEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryResourceControlEventsResponseBodyData self = new QueryResourceControlEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryResourceControlEventsResponseBodyData setList(java.util.List<QueryResourceControlEventsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryResourceControlEventsResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryResourceControlEventsResponseBodyData setPageInfo(QueryResourceControlEventsResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public QueryResourceControlEventsResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
