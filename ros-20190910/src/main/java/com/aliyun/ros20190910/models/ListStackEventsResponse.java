// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackEventsResponse extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Events")
    @Validation(required = true)
    public java.util.List<ListStackEventsResponseEvents> events;

    public static ListStackEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackEventsResponse self = new ListStackEventsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListStackEventsResponseEvents extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EventId")
        @Validation(required = true)
        public String eventId;

        @NameInMap("LogicalResourceId")
        @Validation(required = true)
        public String logicalResourceId;

        @NameInMap("PhysicalResourceId")
        @Validation(required = true)
        public String physicalResourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("StackId")
        @Validation(required = true)
        public String stackId;

        @NameInMap("StackName")
        @Validation(required = true)
        public String stackName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusReason")
        @Validation(required = true)
        public String statusReason;

        public static ListStackEventsResponseEvents build(java.util.Map<String, ?> map) throws Exception {
            ListStackEventsResponseEvents self = new ListStackEventsResponseEvents();
            return TeaModel.build(map, self);
        }

    }

}
