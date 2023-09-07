// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAlarmEventsResponseBody extends TeaModel {
    /**
     * <p>The alert events.</p>
     */
    @NameInMap("HoneypotAlarmEvents")
    public java.util.List<ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEvents> honeypotAlarmEvents;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListHoneypotAlarmEventsResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The extended value that corresponds to the field key.</p>
         */
        @NameInMap("FieldExtInfo")
        public String fieldExtInfo;

        /**
         * <p>The key of the field.</p>
         */
        @NameInMap("FieldKey")
        public String fieldKey;

        /**
         * <p>The type of the field. You can ignore this internal parameter.</p>
         */
        @NameInMap("FieldType")
        public String fieldType;

        /**
         * <p>The value that corresponds to the field key.</p>
         */
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
        /**
         * <p>The event ID.</p>
         */
        @NameInMap("AlarmEventId")
        public Long alarmEventId;

        /**
         * <p>The name of the alert event.</p>
         */
        @NameInMap("AlarmEventName")
        public String alarmEventName;

        /**
         * <p>The type of the alert event.</p>
         */
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        /**
         * <p>The unique identifier of the alert event.</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <p>The total number of times that the alert event was generated.</p>
         */
        @NameInMap("EventCount")
        public Integer eventCount;

        /**
         * <p>The timestamp that indicates the time when the alert event was first detected. Unit: milliseconds.</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <p>The timestamp that indicates the time when the alert event was last detected. Unit: milliseconds.</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>The risk information.</p>
         */
        @NameInMap("MergeFieldList")
        public java.util.List<ListHoneypotAlarmEventsResponseBodyHoneypotAlarmEventsMergeFieldList> mergeFieldList;

        /**
         * <p>The handling status of the alert event. Valid values:</p>
         * <br>
         * <p>*   **1**: pending</p>
         * <p>*   **2**: ignored</p>
         * <p>*   **4**: confirmed</p>
         */
        @NameInMap("OperateStatus")
        public Integer operateStatus;

        /**
         * <p>The risk level. Valid values:</p>
         * <br>
         * <p>*   **2**: low</p>
         * <p>*   **3**: medium</p>
         * <p>*   **4**: high</p>
         */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
