// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackEventsResponseBody extends TeaModel {
    /**
     * <p>The list of events.</p>
     */
    @NameInMap("Events")
    public java.util.List<ListStackEventsResponseBodyEvents> events;

    /**
     * <p>The page number of the returned page.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * <br>
     * <p>Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned events.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListStackEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackEventsResponseBody self = new ListStackEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackEventsResponseBody setEvents(java.util.List<ListStackEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<ListStackEventsResponseBodyEvents> getEvents() {
        return this.events;
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

    public static class ListStackEventsResponseBodyEvents extends TeaModel {
        /**
         * <p>The time when the resource was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the event.</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The logical ID of the resource that is defined in the template.</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The physical ID of the resource.</p>
         */
        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the stack.</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The name of the stack.</p>
         */
        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The state of the resource.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the resource is in its current state.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        public static ListStackEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            ListStackEventsResponseBodyEvents self = new ListStackEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public ListStackEventsResponseBodyEvents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public ListStackEventsResponseBodyEvents setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackEventsResponseBodyEvents setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListStackEventsResponseBodyEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackEventsResponseBodyEvents setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
