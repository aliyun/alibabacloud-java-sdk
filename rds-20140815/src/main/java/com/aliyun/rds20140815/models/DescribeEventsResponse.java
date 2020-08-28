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

    }

    public static class DescribeEventsResponseEventItems extends TeaModel {
        @NameInMap("EventItems")
        @Validation(required = true)
        public java.util.List<DescribeEventsResponseEventItemsEventItems> eventItems;

        public static DescribeEventsResponseEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseEventItems self = new DescribeEventsResponseEventItems();
            return TeaModel.build(map, self);
        }

    }

}
