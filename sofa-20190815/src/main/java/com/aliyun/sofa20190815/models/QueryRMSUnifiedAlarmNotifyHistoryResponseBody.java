// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmNotifyHistoryResponseBody extends TeaModel {
    @NameInMap("AlarmNotifyHistories")
    public java.util.List<QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories> alarmNotifyHistories;

    @NameInMap("AlarmNotifySubs")
    public java.util.List<QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs> alarmNotifySubs;

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

    public static QueryRMSUnifiedAlarmNotifyHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmNotifyHistoryResponseBody self = new QueryRMSUnifiedAlarmNotifyHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponseBody setAlarmNotifyHistories(java.util.List<QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories> alarmNotifyHistories) {
        this.alarmNotifyHistories = alarmNotifyHistories;
        return this;
    }
    public java.util.List<QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories> getAlarmNotifyHistories() {
        return this.alarmNotifyHistories;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponseBody setAlarmNotifySubs(java.util.List<QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs> alarmNotifySubs) {
        this.alarmNotifySubs = alarmNotifySubs;
        return this;
    }
    public java.util.List<QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs> getAlarmNotifySubs() {
        return this.alarmNotifySubs;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories extends TeaModel {
        @NameInMap("AggCount")
        public Long aggCount;

        @NameInMap("AlarmEventId")
        public String alarmEventId;

        @NameInMap("AlarmHistoryId")
        public Long alarmHistoryId;

        @NameInMap("AlarmLevel")
        public Long alarmLevel;

        @NameInMap("AlarmRuleId")
        public Long alarmRuleId;

        @NameInMap("AlarmRuleName")
        public String alarmRuleName;

        @NameInMap("AlarmRuleUuid")
        public String alarmRuleUuid;

        @NameInMap("AlarmSilenceTime")
        public Long alarmSilenceTime;

        @NameInMap("AlarmStatus")
        public Long alarmStatus;

        @NameInMap("AlarmTargetDeleted")
        public Boolean alarmTargetDeleted;

        @NameInMap("AlarmTargetIdentify")
        public String alarmTargetIdentify;

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

        @NameInMap("Channel")
        public String channel;

        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NotifyContent")
        public String notifyContent;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Subscriber")
        public String subscriber;

        @NameInMap("SubscriberName")
        public String subscriberName;

        @NameInMap("SubscriberSource")
        public String subscriberSource;

        @NameInMap("SubscriberType")
        public String subscriberType;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("WorkspaceId")
        public Long workspaceId;

        public static QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories build(java.util.Map<String, ?> map) throws Exception {
            QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories self = new QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories();
            return TeaModel.build(map, self);
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAggCount(Long aggCount) {
            this.aggCount = aggCount;
            return this;
        }
        public Long getAggCount() {
            return this.aggCount;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmEventId(String alarmEventId) {
            this.alarmEventId = alarmEventId;
            return this;
        }
        public String getAlarmEventId() {
            return this.alarmEventId;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmHistoryId(Long alarmHistoryId) {
            this.alarmHistoryId = alarmHistoryId;
            return this;
        }
        public Long getAlarmHistoryId() {
            return this.alarmHistoryId;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmLevel(Long alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public Long getAlarmLevel() {
            return this.alarmLevel;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmRuleId(Long alarmRuleId) {
            this.alarmRuleId = alarmRuleId;
            return this;
        }
        public Long getAlarmRuleId() {
            return this.alarmRuleId;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmRuleName(String alarmRuleName) {
            this.alarmRuleName = alarmRuleName;
            return this;
        }
        public String getAlarmRuleName() {
            return this.alarmRuleName;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmRuleUuid(String alarmRuleUuid) {
            this.alarmRuleUuid = alarmRuleUuid;
            return this;
        }
        public String getAlarmRuleUuid() {
            return this.alarmRuleUuid;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmSilenceTime(Long alarmSilenceTime) {
            this.alarmSilenceTime = alarmSilenceTime;
            return this;
        }
        public Long getAlarmSilenceTime() {
            return this.alarmSilenceTime;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmStatus(Long alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public Long getAlarmStatus() {
            return this.alarmStatus;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmTargetDeleted(Boolean alarmTargetDeleted) {
            this.alarmTargetDeleted = alarmTargetDeleted;
            return this;
        }
        public Boolean getAlarmTargetDeleted() {
            return this.alarmTargetDeleted;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmTargetIdentify(String alarmTargetIdentify) {
            this.alarmTargetIdentify = alarmTargetIdentify;
            return this;
        }
        public String getAlarmTargetIdentify() {
            return this.alarmTargetIdentify;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmTargetType(String alarmTargetType) {
            this.alarmTargetType = alarmTargetType;
            return this;
        }
        public String getAlarmTargetType() {
            return this.alarmTargetType;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmTime(Long alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public Long getAlarmTime() {
            return this.alarmTime;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmUrl(String alarmUrl) {
            this.alarmUrl = alarmUrl;
            return this;
        }
        public String getAlarmUrl() {
            return this.alarmUrl;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setAlarmUrlWithDomain(String alarmUrlWithDomain) {
            this.alarmUrlWithDomain = alarmUrlWithDomain;
            return this;
        }
        public String getAlarmUrlWithDomain() {
            return this.alarmUrlWithDomain;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setNotifyContent(String notifyContent) {
            this.notifyContent = notifyContent;
            return this;
        }
        public String getNotifyContent() {
            return this.notifyContent;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setSubscriber(String subscriber) {
            this.subscriber = subscriber;
            return this;
        }
        public String getSubscriber() {
            return this.subscriber;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setSubscriberName(String subscriberName) {
            this.subscriberName = subscriberName;
            return this;
        }
        public String getSubscriberName() {
            return this.subscriberName;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setSubscriberSource(String subscriberSource) {
            this.subscriberSource = subscriberSource;
            return this;
        }
        public String getSubscriberSource() {
            return this.subscriberSource;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setSubscriberType(String subscriberType) {
            this.subscriberType = subscriberType;
            return this;
        }
        public String getSubscriberType() {
            return this.subscriberType;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifyHistories setWorkspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs extends TeaModel {
        @NameInMap("Subscriber")
        public String subscriber;

        @NameInMap("SubscriberName")
        public String subscriberName;

        @NameInMap("SubscriberSource")
        public String subscriberSource;

        @NameInMap("SubscriberType")
        public String subscriberType;

        @NameInMap("SubscriberUuid")
        public String subscriberUuid;

        public static QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs build(java.util.Map<String, ?> map) throws Exception {
            QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs self = new QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs();
            return TeaModel.build(map, self);
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs setSubscriber(String subscriber) {
            this.subscriber = subscriber;
            return this;
        }
        public String getSubscriber() {
            return this.subscriber;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs setSubscriberName(String subscriberName) {
            this.subscriberName = subscriberName;
            return this;
        }
        public String getSubscriberName() {
            return this.subscriberName;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs setSubscriberSource(String subscriberSource) {
            this.subscriberSource = subscriberSource;
            return this;
        }
        public String getSubscriberSource() {
            return this.subscriberSource;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs setSubscriberType(String subscriberType) {
            this.subscriberType = subscriberType;
            return this;
        }
        public String getSubscriberType() {
            return this.subscriberType;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryResponseBodyAlarmNotifySubs setSubscriberUuid(String subscriberUuid) {
            this.subscriberUuid = subscriberUuid;
            return this;
        }
        public String getSubscriberUuid() {
            return this.subscriberUuid;
        }

    }

}
