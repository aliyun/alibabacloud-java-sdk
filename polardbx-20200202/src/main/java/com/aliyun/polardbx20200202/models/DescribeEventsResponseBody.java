// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    // 事件体
    @NameInMap("EventItems")
    public java.util.List<DescribeEventsResponseBodyEventItems> eventItems;

    // 页面下标
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 页面大小
    @NameInMap("PageSize")
    public Long pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总页数
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponseBody self = new DescribeEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponseBody setEventItems(java.util.List<DescribeEventsResponseBodyEventItems> eventItems) {
        this.eventItems = eventItems;
        return this;
    }
    public java.util.List<DescribeEventsResponseBodyEventItems> getEventItems() {
        return this.eventItems;
    }

    public DescribeEventsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeEventsResponseBodyEventItems extends TeaModel {
        // 事件ID
        @NameInMap("EventId")
        public Long eventId;

        // 事件名称
        @NameInMap("EventName")
        public String eventName;

        // 补充信息
        @NameInMap("EventPayload")
        public String eventPayload;

        // 原因
        @NameInMap("EventReason")
        public String eventReason;

        // 记录时间
        @NameInMap("EventRecordTime")
        public String eventRecordTime;

        // 事件时间
        @NameInMap("EventTime")
        public String eventTime;

        // 事件类型
        @NameInMap("EventType")
        public String eventType;

        // 事件用户类型
        @NameInMap("EventUserType")
        public String eventUserType;

        // 区域ID
        @NameInMap("RegionId")
        public String regionId;

        // 资源名
        @NameInMap("ResourceName")
        public String resourceName;

        // 资源类型
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeEventsResponseBodyEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEventItems self = new DescribeEventsResponseBodyEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEventItems setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public DescribeEventsResponseBodyEventItems setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeEventsResponseBodyEventItems setEventPayload(String eventPayload) {
            this.eventPayload = eventPayload;
            return this;
        }
        public String getEventPayload() {
            return this.eventPayload;
        }

        public DescribeEventsResponseBodyEventItems setEventReason(String eventReason) {
            this.eventReason = eventReason;
            return this;
        }
        public String getEventReason() {
            return this.eventReason;
        }

        public DescribeEventsResponseBodyEventItems setEventRecordTime(String eventRecordTime) {
            this.eventRecordTime = eventRecordTime;
            return this;
        }
        public String getEventRecordTime() {
            return this.eventRecordTime;
        }

        public DescribeEventsResponseBodyEventItems setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeEventsResponseBodyEventItems setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventsResponseBodyEventItems setEventUserType(String eventUserType) {
            this.eventUserType = eventUserType;
            return this;
        }
        public String getEventUserType() {
            return this.eventUserType;
        }

        public DescribeEventsResponseBodyEventItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEventsResponseBodyEventItems setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeEventsResponseBodyEventItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
