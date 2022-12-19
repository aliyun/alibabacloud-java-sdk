// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAlarmEventsResponseBody extends TeaModel {
    // An array that consists of the alert events.
    @NameInMap("HoneypotAlarmEvents")
    public java.util.List<ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents> honeypotAlarmEvents;

    // The pagination information.
    @NameInMap("PageInfo")
    public ListHoneypotAlarmEventsResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static ListHoneypotAlarmEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotAlarmEventsResponseBody self = new ListHoneypotAlarmEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHoneypotAlarmEventsResponseBody setHoneypotAlarmEvents(java.util.List<ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents> honeypotAlarmEvents) {
        this.honeypotAlarmEvents = honeypotAlarmEvents;
        return this;
    }
    public java.util.List<ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents> getHoneypotAlarmEvents() {
        return this.honeypotAlarmEvents;
    }

    public ListHoneypotAlarmEventsResponseBody setPageInfo(ListHoneypotAlarmEventsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListHoneypotAlarmEventsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListHoneypotAlarmEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList extends TeaModel {
        // The extended value that corresponds to the field key.
        @NameInMap("FieldExtInfo")
        public String fieldExtInfo;

        // The key of the field.
        @NameInMap("FieldKey")
        public String fieldKey;

        // The type of the field.
        @NameInMap("FieldType")
        public String fieldType;

        // The value of the field key.
        @NameInMap("FieldValue")
        public String fieldValue;

        public static ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList self = new ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList();
            return TeaModel.build(map, self);
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList setFieldExtInfo(String fieldExtInfo) {
            this.fieldExtInfo = fieldExtInfo;
            return this;
        }
        public String getFieldExtInfo() {
            return this.fieldExtInfo;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

    public static class ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents extends TeaModel {
        // The ID of the alert event.
        @NameInMap("AlarmEventId")
        public Long alarmEventId;

        // The name of the alert event.
        @NameInMap("AlarmEventName")
        public String alarmEventName;

        // The type of the alert event.
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        // The unique identifier of the alert event.
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        // The total number of times that the alert event was generated.
        @NameInMap("EventCount")
        public Integer eventCount;

        // The timestamp when the alert event was first detected.
        @NameInMap("FirstTime")
        public Long firstTime;

        // The timestamp when the alert event was last detected.
        @NameInMap("LastTime")
        public Long lastTime;

        // An array that consists of risk information.
        @NameInMap("MergeFieldList")
        public java.util.List<ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList> mergeFieldList;

        // The handling status of the alert event. Valid values:
        // 
        // *   **1**: pending handling
        // *   **2**: ignored
        // *   **4**: confirmed
        @NameInMap("OperateStatus")
        public Integer operateStatus;

        // The risk level of the alert event. Valid values:
        // 
        // *   **2**: low
        // *   **3**: medium
        // *   **4**: high
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents self = new ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents();
            return TeaModel.build(map, self);
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents setAlarmEventId(Long alarmEventId) {
            this.alarmEventId = alarmEventId;
            return this;
        }
        public Long getAlarmEventId() {
            return this.alarmEventId;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents setAlarmEventName(String alarmEventName) {
            this.alarmEventName = alarmEventName;
            return this;
        }
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents setMergeFieldList(java.util.List<ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList> mergeFieldList) {
            this.mergeFieldList = mergeFieldList;
            return this;
        }
        public java.util.List<ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList> getMergeFieldList() {
            return this.mergeFieldList;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents setOperateStatus(Integer operateStatus) {
            this.operateStatus = operateStatus;
            return this;
        }
        public Integer getOperateStatus() {
            return this.operateStatus;
        }

        public ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ListHoneypotAlarmEventsResponseBodyPageInfo extends TeaModel {
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: 20.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHoneypotAlarmEventsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotAlarmEventsResponseBodyPageInfo self = new ListHoneypotAlarmEventsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListHoneypotAlarmEventsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListHoneypotAlarmEventsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListHoneypotAlarmEventsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHoneypotAlarmEventsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
