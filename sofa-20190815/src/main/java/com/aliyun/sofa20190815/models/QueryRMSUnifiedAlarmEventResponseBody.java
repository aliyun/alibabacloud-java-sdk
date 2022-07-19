// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmEventResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("UnifiedAlarmEventList")
    public java.util.List<QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList> unifiedAlarmEventList;

    public static QueryRMSUnifiedAlarmEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmEventResponseBody self = new QueryRMSUnifiedAlarmEventResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmEventResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryRMSUnifiedAlarmEventResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRMSUnifiedAlarmEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRMSUnifiedAlarmEventResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRMSUnifiedAlarmEventResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRMSUnifiedAlarmEventResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryRMSUnifiedAlarmEventResponseBody setUnifiedAlarmEventList(java.util.List<QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList> unifiedAlarmEventList) {
        this.unifiedAlarmEventList = unifiedAlarmEventList;
        return this;
    }
    public java.util.List<QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList> getUnifiedAlarmEventList() {
        return this.unifiedAlarmEventList;
    }

    public static class QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList extends TeaModel {
        @NameInMap("AlarmContent")
        public String alarmContent;

        @NameInMap("AlarmDetail")
        public String alarmDetail;

        @NameInMap("AlarmLevel")
        public Long alarmLevel;

        @NameInMap("AlarmRuleId")
        public Long alarmRuleId;

        @NameInMap("AlarmRuleName")
        public String alarmRuleName;

        @NameInMap("AlarmTarget")
        public String alarmTarget;

        @NameInMap("AlarmTargetDeleted")
        public Boolean alarmTargetDeleted;

        @NameInMap("AlarmTargetType")
        public String alarmTargetType;

        @NameInMap("AlarmTime")
        public Long alarmTime;

        @NameInMap("AlarmType")
        public String alarmType;

        @NameInMap("AlarmUrl")
        public String alarmUrl;

        @NameInMap("AlarmUrlWithDomain")
        public String alarmUrlWithDomain;

        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("UniqueIdentity")
        public String uniqueIdentity;

        @NameInMap("WorkspaceId")
        public Long workspaceId;

        public static QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList build(java.util.Map<String, ?> map) throws Exception {
            QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList self = new QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList();
            return TeaModel.build(map, self);
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmContent(String alarmContent) {
            this.alarmContent = alarmContent;
            return this;
        }
        public String getAlarmContent() {
            return this.alarmContent;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmDetail(String alarmDetail) {
            this.alarmDetail = alarmDetail;
            return this;
        }
        public String getAlarmDetail() {
            return this.alarmDetail;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmLevel(Long alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public Long getAlarmLevel() {
            return this.alarmLevel;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmRuleId(Long alarmRuleId) {
            this.alarmRuleId = alarmRuleId;
            return this;
        }
        public Long getAlarmRuleId() {
            return this.alarmRuleId;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmRuleName(String alarmRuleName) {
            this.alarmRuleName = alarmRuleName;
            return this;
        }
        public String getAlarmRuleName() {
            return this.alarmRuleName;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmTarget(String alarmTarget) {
            this.alarmTarget = alarmTarget;
            return this;
        }
        public String getAlarmTarget() {
            return this.alarmTarget;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmTargetDeleted(Boolean alarmTargetDeleted) {
            this.alarmTargetDeleted = alarmTargetDeleted;
            return this;
        }
        public Boolean getAlarmTargetDeleted() {
            return this.alarmTargetDeleted;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmTargetType(String alarmTargetType) {
            this.alarmTargetType = alarmTargetType;
            return this;
        }
        public String getAlarmTargetType() {
            return this.alarmTargetType;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmTime(Long alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public Long getAlarmTime() {
            return this.alarmTime;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmUrl(String alarmUrl) {
            this.alarmUrl = alarmUrl;
            return this;
        }
        public String getAlarmUrl() {
            return this.alarmUrl;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setAlarmUrlWithDomain(String alarmUrlWithDomain) {
            this.alarmUrlWithDomain = alarmUrlWithDomain;
            return this;
        }
        public String getAlarmUrlWithDomain() {
            return this.alarmUrlWithDomain;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setUniqueIdentity(String uniqueIdentity) {
            this.uniqueIdentity = uniqueIdentity;
            return this;
        }
        public String getUniqueIdentity() {
            return this.uniqueIdentity;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList setWorkspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList extends TeaModel {
        @NameInMap("AlarmContent")
        public String alarmContent;

        @NameInMap("AlarmEventId")
        public String alarmEventId;

        @NameInMap("AlarmHistoryId")
        public Long alarmHistoryId;

        @NameInMap("AlarmHistoryList")
        public java.util.List<QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList> alarmHistoryList;

        @NameInMap("AlarmLevel")
        public Long alarmLevel;

        @NameInMap("AlarmRecoverTime")
        public String alarmRecoverTime;

        @NameInMap("AlarmRuleId")
        public Long alarmRuleId;

        @NameInMap("AlarmStartTime")
        public String alarmStartTime;

        @NameInMap("AlarmTarget")
        public String alarmTarget;

        @NameInMap("AlarmTargetDeleted")
        public Boolean alarmTargetDeleted;

        @NameInMap("AlarmTargetType")
        public String alarmTargetType;

        @NameInMap("AlarmType")
        public String alarmType;

        @NameInMap("AlarmUrl")
        public String alarmUrl;

        @NameInMap("AlarmUrlWithDomain")
        public String alarmUrlWithDomain;

        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("SilenceRemainTime")
        public Long silenceRemainTime;

        @NameInMap("Status")
        public Long status;

        public static QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList build(java.util.Map<String, ?> map) throws Exception {
            QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList self = new QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList();
            return TeaModel.build(map, self);
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmContent(String alarmContent) {
            this.alarmContent = alarmContent;
            return this;
        }
        public String getAlarmContent() {
            return this.alarmContent;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmEventId(String alarmEventId) {
            this.alarmEventId = alarmEventId;
            return this;
        }
        public String getAlarmEventId() {
            return this.alarmEventId;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmHistoryId(Long alarmHistoryId) {
            this.alarmHistoryId = alarmHistoryId;
            return this;
        }
        public Long getAlarmHistoryId() {
            return this.alarmHistoryId;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmHistoryList(java.util.List<QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList> alarmHistoryList) {
            this.alarmHistoryList = alarmHistoryList;
            return this;
        }
        public java.util.List<QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventListAlarmHistoryList> getAlarmHistoryList() {
            return this.alarmHistoryList;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmLevel(Long alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public Long getAlarmLevel() {
            return this.alarmLevel;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmRecoverTime(String alarmRecoverTime) {
            this.alarmRecoverTime = alarmRecoverTime;
            return this;
        }
        public String getAlarmRecoverTime() {
            return this.alarmRecoverTime;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmRuleId(Long alarmRuleId) {
            this.alarmRuleId = alarmRuleId;
            return this;
        }
        public Long getAlarmRuleId() {
            return this.alarmRuleId;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmStartTime(String alarmStartTime) {
            this.alarmStartTime = alarmStartTime;
            return this;
        }
        public String getAlarmStartTime() {
            return this.alarmStartTime;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmTarget(String alarmTarget) {
            this.alarmTarget = alarmTarget;
            return this;
        }
        public String getAlarmTarget() {
            return this.alarmTarget;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmTargetDeleted(Boolean alarmTargetDeleted) {
            this.alarmTargetDeleted = alarmTargetDeleted;
            return this;
        }
        public Boolean getAlarmTargetDeleted() {
            return this.alarmTargetDeleted;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmTargetType(String alarmTargetType) {
            this.alarmTargetType = alarmTargetType;
            return this;
        }
        public String getAlarmTargetType() {
            return this.alarmTargetType;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmUrl(String alarmUrl) {
            this.alarmUrl = alarmUrl;
            return this;
        }
        public String getAlarmUrl() {
            return this.alarmUrl;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setAlarmUrlWithDomain(String alarmUrlWithDomain) {
            this.alarmUrlWithDomain = alarmUrlWithDomain;
            return this;
        }
        public String getAlarmUrlWithDomain() {
            return this.alarmUrlWithDomain;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setSilenceRemainTime(Long silenceRemainTime) {
            this.silenceRemainTime = silenceRemainTime;
            return this;
        }
        public Long getSilenceRemainTime() {
            return this.silenceRemainTime;
        }

        public QueryRMSUnifiedAlarmEventResponseBodyUnifiedAlarmEventList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
