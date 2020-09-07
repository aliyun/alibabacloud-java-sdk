// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeEventsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("EventItems")
    @Validation(required = true)
    public DescribeEventsResponseEventItems eventItems;

    public static DescribeEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponse self = new DescribeEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventsResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeEventsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsResponse setEventItems(DescribeEventsResponseEventItems eventItems) {
        this.eventItems = eventItems;
        return this;
    }
    public DescribeEventsResponseEventItems getEventItems() {
        return this.eventItems;
    }

    public static class DescribeEventsResponseEventItemsEventItems extends TeaModel {
        @NameInMap("EventId")
        @Validation(required = true)
        public Integer eventId;

        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        @NameInMap("EventName")
        @Validation(required = true)
        public String eventName;

        @NameInMap("EventTime")
        @Validation(required = true)
        public String eventTime;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ResourceName")
        @Validation(required = true)
        public String resourceName;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("EventUserType")
        @Validation(required = true)
        public String eventUserType;

        @NameInMap("EventReason")
        @Validation(required = true)
        public String eventReason;

        @NameInMap("EventPayload")
        @Validation(required = true)
        public String eventPayload;

        @NameInMap("EventRecordTime")
        @Validation(required = true)
        public String eventRecordTime;

        public static DescribeEventsResponseEventItemsEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseEventItemsEventItems self = new DescribeEventsResponseEventItemsEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseEventItemsEventItems setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public DescribeEventsResponseEventItemsEventItems setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventsResponseEventItemsEventItems setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeEventsResponseEventItemsEventItems setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeEventsResponseEventItemsEventItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeEventsResponseEventItemsEventItems setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeEventsResponseEventItemsEventItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEventsResponseEventItemsEventItems setEventUserType(String eventUserType) {
            this.eventUserType = eventUserType;
            return this;
        }
        public String getEventUserType() {
            return this.eventUserType;
        }

        public DescribeEventsResponseEventItemsEventItems setEventReason(String eventReason) {
            this.eventReason = eventReason;
            return this;
        }
        public String getEventReason() {
            return this.eventReason;
        }

        public DescribeEventsResponseEventItemsEventItems setEventPayload(String eventPayload) {
            this.eventPayload = eventPayload;
            return this;
        }
        public String getEventPayload() {
            return this.eventPayload;
        }

        public DescribeEventsResponseEventItemsEventItems setEventRecordTime(String eventRecordTime) {
            this.eventRecordTime = eventRecordTime;
            return this;
        }
        public String getEventRecordTime() {
            return this.eventRecordTime;
        }

    }

    public static class DescribeEventsResponseEventItems extends TeaModel {
        @NameInMap("EventItems")
        @Validation(required = true)
        public java.util.List<DescribeEventsResponseEventItemsEventItems> eventItems;

        public static DescribeEventsResponseEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseEventItems self = new DescribeEventsResponseEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseEventItems setEventItems(java.util.List<DescribeEventsResponseEventItemsEventItems> eventItems) {
            this.eventItems = eventItems;
            return this;
        }
        public java.util.List<DescribeEventsResponseEventItemsEventItems> getEventItems() {
            return this.eventItems;
        }

    }

}
