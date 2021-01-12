// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("EventItems")
    public DescribeEventsResponseBodyEventItems eventItems;

    public static DescribeEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponseBody self = new DescribeEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsResponseBody setEventItems(DescribeEventsResponseBodyEventItems eventItems) {
        this.eventItems = eventItems;
        return this;
    }
    public DescribeEventsResponseBodyEventItems getEventItems() {
        return this.eventItems;
    }

    public static class DescribeEventsResponseBodyEventItemsEventItems extends TeaModel {
        @NameInMap("EventId")
        public Integer eventId;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("EventUserType")
        public String eventUserType;

        @NameInMap("EventReason")
        public String eventReason;

        @NameInMap("EventPayload")
        public String eventPayload;

        @NameInMap("EventRecordTime")
        public String eventRecordTime;

        public static DescribeEventsResponseBodyEventItemsEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEventItemsEventItems self = new DescribeEventsResponseBodyEventItemsEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventUserType(String eventUserType) {
            this.eventUserType = eventUserType;
            return this;
        }
        public String getEventUserType() {
            return this.eventUserType;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventReason(String eventReason) {
            this.eventReason = eventReason;
            return this;
        }
        public String getEventReason() {
            return this.eventReason;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventPayload(String eventPayload) {
            this.eventPayload = eventPayload;
            return this;
        }
        public String getEventPayload() {
            return this.eventPayload;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventRecordTime(String eventRecordTime) {
            this.eventRecordTime = eventRecordTime;
            return this;
        }
        public String getEventRecordTime() {
            return this.eventRecordTime;
        }

    }

    public static class DescribeEventsResponseBodyEventItems extends TeaModel {
        @NameInMap("EventItems")
        public java.util.List<DescribeEventsResponseBodyEventItemsEventItems> eventItems;

        public static DescribeEventsResponseBodyEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEventItems self = new DescribeEventsResponseBodyEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEventItems setEventItems(java.util.List<DescribeEventsResponseBodyEventItemsEventItems> eventItems) {
            this.eventItems = eventItems;
            return this;
        }
        public java.util.List<DescribeEventsResponseBodyEventItemsEventItems> getEventItems() {
            return this.eventItems;
        }

    }

}
