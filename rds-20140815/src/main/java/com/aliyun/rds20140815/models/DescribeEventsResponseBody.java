// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    /**
     * <p>The events.</p>
     */
    @NameInMap("EventItems")
    public DescribeEventsResponseBodyEventItems eventItems;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A103039D-B1B2-4C57-B989-7D7C0DA95426</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponseBody self = new DescribeEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponseBody setEventItems(DescribeEventsResponseBodyEventItems eventItems) {
        this.eventItems = eventItems;
        return this;
    }
    public DescribeEventsResponseBodyEventItems getEventItems() {
        return this.eventItems;
    }

    public DescribeEventsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public static class DescribeEventsResponseBodyEventItemsEventItems extends TeaModel {
        /**
         * <p>The ID of the user who executed the event.</p>
         * 
         * <strong>example:</strong>
         * <p>22973492**********</p>
         */
        @NameInMap("CallerUid")
        public Long callerUid;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11000053</p>
         */
        @NameInMap("EventId")
        public Integer eventId;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>ModifySecurityIPList</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The request or context parameters of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Domain\&quot;: \&quot;rds-inc-share.aliyuncs.com\&quot;, \&quot;Api\&quot;: \&quot;ReleaseInstancePublicConnection\&quot;}</p>
         */
        @NameInMap("EventPayload")
        public String eventPayload;

        /**
         * <p>The source of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>FROM_USER</p>
         */
        @NameInMap("EventReason")
        public String eventReason;

        /**
         * <p>The time when the event was recorded. The time is slightly later than the time the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-20T01:12:49Z</p>
         */
        @NameInMap("EventRecordTime")
        public String eventRecordTime;

        /**
         * <p>The time when the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-20T01:08:22Z</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>NetworkManagement</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The type of the user who executed the event.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
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
         * <p>The name of the resource associated with the event. Only instance IDs are supported for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1z3065m9976ix8a</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The type of the resource associated with the event. Only instances are supported for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeEventsResponseBodyEventItemsEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEventItemsEventItems self = new DescribeEventsResponseBodyEventItemsEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEventItemsEventItems setCallerUid(Long callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public Long getCallerUid() {
            return this.callerUid;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventPayload(String eventPayload) {
            this.eventPayload = eventPayload;
            return this;
        }
        public String getEventPayload() {
            return this.eventPayload;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventReason(String eventReason) {
            this.eventReason = eventReason;
            return this;
        }
        public String getEventReason() {
            return this.eventReason;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventRecordTime(String eventRecordTime) {
            this.eventRecordTime = eventRecordTime;
            return this;
        }
        public String getEventRecordTime() {
            return this.eventRecordTime;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setEventUserType(String eventUserType) {
            this.eventUserType = eventUserType;
            return this;
        }
        public String getEventUserType() {
            return this.eventUserType;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeEventsResponseBodyEventItemsEventItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
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
