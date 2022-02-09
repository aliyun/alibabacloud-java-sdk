// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class QueryAlarmSummaryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryAlarmSummaryResponseBodyData> data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static QueryAlarmSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmSummaryResponseBody self = new QueryAlarmSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAlarmSummaryResponseBody setData(java.util.List<QueryAlarmSummaryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAlarmSummaryResponseBodyData> getData() {
        return this.data;
    }

    public QueryAlarmSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAlarmSummaryResponseBodyData extends TeaModel {
        @NameInMap("AlarmEvent")
        public String alarmEvent;

        @NameInMap("AlarmMethods")
        public String alarmMethods;

        @NameInMap("ContactGroups")
        public String contactGroups;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("FireCount")
        public Long fireCount;

        @NameInMap("Handler")
        public String handler;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("Level")
        public String level;

        @NameInMap("StartTime")
        public String startTime;

        public static QueryAlarmSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmSummaryResponseBodyData self = new QueryAlarmSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAlarmSummaryResponseBodyData setAlarmEvent(String alarmEvent) {
            this.alarmEvent = alarmEvent;
            return this;
        }
        public String getAlarmEvent() {
            return this.alarmEvent;
        }

        public QueryAlarmSummaryResponseBodyData setAlarmMethods(String alarmMethods) {
            this.alarmMethods = alarmMethods;
            return this;
        }
        public String getAlarmMethods() {
            return this.alarmMethods;
        }

        public QueryAlarmSummaryResponseBodyData setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public QueryAlarmSummaryResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryAlarmSummaryResponseBodyData setFireCount(Long fireCount) {
            this.fireCount = fireCount;
            return this;
        }
        public Long getFireCount() {
            return this.fireCount;
        }

        public QueryAlarmSummaryResponseBodyData setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public QueryAlarmSummaryResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryAlarmSummaryResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryAlarmSummaryResponseBodyData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryAlarmSummaryResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryAlarmSummaryResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
