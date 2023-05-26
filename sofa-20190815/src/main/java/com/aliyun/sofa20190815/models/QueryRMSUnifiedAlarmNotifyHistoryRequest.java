// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmNotifyHistoryRequest extends TeaModel {
    @NameInMap("AlarmRuleId")
    public Long alarmRuleId;

    @NameInMap("AlarmStackInfoJsonStr")
    public String alarmStackInfoJsonStr;

    @NameInMap("AlarmStatus")
    public Long alarmStatus;

    @NameInMap("AlarmSubscribers")
    public java.util.List<QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers> alarmSubscribers;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DashboardQueryParamJsonStr")
    public String dashboardQueryParamJsonStr;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public Long status;

    @NameInMap("Subscriber")
    public String subscriber;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static QueryRMSUnifiedAlarmNotifyHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmNotifyHistoryRequest self = new QueryRMSUnifiedAlarmNotifyHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setAlarmStackInfoJsonStr(String alarmStackInfoJsonStr) {
        this.alarmStackInfoJsonStr = alarmStackInfoJsonStr;
        return this;
    }
    public String getAlarmStackInfoJsonStr() {
        return this.alarmStackInfoJsonStr;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setAlarmStatus(Long alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public Long getAlarmStatus() {
        return this.alarmStatus;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setAlarmSubscribers(java.util.List<QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers> alarmSubscribers) {
        this.alarmSubscribers = alarmSubscribers;
        return this;
    }
    public java.util.List<QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers> getAlarmSubscribers() {
        return this.alarmSubscribers;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setDashboardQueryParamJsonStr(String dashboardQueryParamJsonStr) {
        this.dashboardQueryParamJsonStr = dashboardQueryParamJsonStr;
        return this;
    }
    public String getDashboardQueryParamJsonStr() {
        return this.dashboardQueryParamJsonStr;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setSubscriber(String subscriber) {
        this.subscriber = subscriber;
        return this;
    }
    public String getSubscriber() {
        return this.subscriber;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers extends TeaModel {
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

        public static QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers build(java.util.Map<String, ?> map) throws Exception {
            QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers self = new QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers();
            return TeaModel.build(map, self);
        }

        public QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers setSubscriber(String subscriber) {
            this.subscriber = subscriber;
            return this;
        }
        public String getSubscriber() {
            return this.subscriber;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers setSubscriberName(String subscriberName) {
            this.subscriberName = subscriberName;
            return this;
        }
        public String getSubscriberName() {
            return this.subscriberName;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers setSubscriberSource(String subscriberSource) {
            this.subscriberSource = subscriberSource;
            return this;
        }
        public String getSubscriberSource() {
            return this.subscriberSource;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers setSubscriberType(String subscriberType) {
            this.subscriberType = subscriberType;
            return this;
        }
        public String getSubscriberType() {
            return this.subscriberType;
        }

        public QueryRMSUnifiedAlarmNotifyHistoryRequestAlarmSubscribers setSubscriberUuid(String subscriberUuid) {
            this.subscriberUuid = subscriberUuid;
            return this;
        }
        public String getSubscriberUuid() {
            return this.subscriberUuid;
        }

    }

}
