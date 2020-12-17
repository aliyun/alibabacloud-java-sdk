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

    public ListStackEventsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackEventsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackEventsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackEventsResponse setEvents(java.util.List<ListStackEventsResponseEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<ListStackEventsResponseEvents> getEvents() {
        return this.events;
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

        public ListStackEventsResponseEvents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStackEventsResponseEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public ListStackEventsResponseEvents setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStackEventsResponseEvents setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public ListStackEventsResponseEvents setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListStackEventsResponseEvents setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackEventsResponseEvents setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListStackEventsResponseEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackEventsResponseEvents setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
