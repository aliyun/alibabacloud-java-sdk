// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    /**
     * <p>The event items.</p>
     */
    @NameInMap("EventItems")
    public java.util.List<DescribeEventsResponseBodyEventItems> eventItems;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4748127A-6D50-432C-B635-433467074C27</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50421290</p>
         */
        @NameInMap("EventId")
        public Long eventId;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>ModifySecurityIps</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The supplementary information.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Domain\&quot;: \&quot;rds-cn-hangzhou.aliyuncs.com\&quot;}</p>
         */
        @NameInMap("EventPayload")
        public String eventPayload;

        /**
         * <p>The reason.</p>
         * 
         * <strong>example:</strong>
         * <p>FROM_USER</p>
         */
        @NameInMap("EventReason")
        public String eventReason;

        /**
         * <p>The record time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-15T06:39:49Z</p>
         */
        @NameInMap("EventRecordTime")
        public String eventRecordTime;

        /**
         * <p>The event time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-15T06:35:00Z</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>SecurityManagement</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The event user type.</p>
         * 
         * <strong>example:</strong>
         * <p>USRE</p>
         */
        @NameInMap("EventUserType")
        public String eventUserType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>px-bp1v8udesc89g156g</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
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
