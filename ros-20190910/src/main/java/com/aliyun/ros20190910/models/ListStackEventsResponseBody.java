// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackEventsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Events")
    public java.util.List<ListStackEventsResponseBodyEvents> events;

    public static ListStackEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackEventsResponseBody self = new ListStackEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackEventsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackEventsResponseBody setEvents(java.util.List<ListStackEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<ListStackEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public static class ListStackEventsResponseBodyEvents extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("StackName")
        public String stackName;

        public static ListStackEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            ListStackEventsResponseBodyEvents self = new ListStackEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public ListStackEventsResponseBodyEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackEventsResponseBodyEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public ListStackEventsResponseBodyEvents setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStackEventsResponseBodyEvents setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackEventsResponseBodyEvents setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public ListStackEventsResponseBodyEvents setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListStackEventsResponseBodyEvents setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListStackEventsResponseBodyEvents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStackEventsResponseBodyEvents setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

    }

}
