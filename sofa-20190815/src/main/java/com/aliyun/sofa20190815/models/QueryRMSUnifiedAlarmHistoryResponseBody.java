// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmHistoryResponseBody extends TeaModel {
    @NameInMap("AlarmHistories")
    public java.util.List<QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories> alarmHistories;

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

    public static QueryRMSUnifiedAlarmHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmHistoryResponseBody self = new QueryRMSUnifiedAlarmHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmHistoryResponseBody setAlarmHistories(java.util.List<QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories> alarmHistories) {
        this.alarmHistories = alarmHistories;
        return this;
    }
    public java.util.List<QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories> getAlarmHistories() {
        return this.alarmHistories;
    }

    public QueryRMSUnifiedAlarmHistoryResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryRMSUnifiedAlarmHistoryResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRMSUnifiedAlarmHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRMSUnifiedAlarmHistoryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRMSUnifiedAlarmHistoryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRMSUnifiedAlarmHistoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories extends TeaModel {
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

        public static QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories build(java.util.Map<String, ?> map) throws Exception {
            QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories self = new QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories();
            return TeaModel.build(map, self);
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmContent(String alarmContent) {
            this.alarmContent = alarmContent;
            return this;
        }
        public String getAlarmContent() {
            return this.alarmContent;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmDetail(String alarmDetail) {
            this.alarmDetail = alarmDetail;
            return this;
        }
        public String getAlarmDetail() {
            return this.alarmDetail;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmLevel(Long alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public Long getAlarmLevel() {
            return this.alarmLevel;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmRuleId(Long alarmRuleId) {
            this.alarmRuleId = alarmRuleId;
            return this;
        }
        public Long getAlarmRuleId() {
            return this.alarmRuleId;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmRuleName(String alarmRuleName) {
            this.alarmRuleName = alarmRuleName;
            return this;
        }
        public String getAlarmRuleName() {
            return this.alarmRuleName;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmTarget(String alarmTarget) {
            this.alarmTarget = alarmTarget;
            return this;
        }
        public String getAlarmTarget() {
            return this.alarmTarget;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmTargetDeleted(Boolean alarmTargetDeleted) {
            this.alarmTargetDeleted = alarmTargetDeleted;
            return this;
        }
        public Boolean getAlarmTargetDeleted() {
            return this.alarmTargetDeleted;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmTargetType(String alarmTargetType) {
            this.alarmTargetType = alarmTargetType;
            return this;
        }
        public String getAlarmTargetType() {
            return this.alarmTargetType;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmTime(Long alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public Long getAlarmTime() {
            return this.alarmTime;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmUrl(String alarmUrl) {
            this.alarmUrl = alarmUrl;
            return this;
        }
        public String getAlarmUrl() {
            return this.alarmUrl;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setAlarmUrlWithDomain(String alarmUrlWithDomain) {
            this.alarmUrlWithDomain = alarmUrlWithDomain;
            return this;
        }
        public String getAlarmUrlWithDomain() {
            return this.alarmUrlWithDomain;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setUniqueIdentity(String uniqueIdentity) {
            this.uniqueIdentity = uniqueIdentity;
            return this;
        }
        public String getUniqueIdentity() {
            return this.uniqueIdentity;
        }

        public QueryRMSUnifiedAlarmHistoryResponseBodyAlarmHistories setWorkspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
