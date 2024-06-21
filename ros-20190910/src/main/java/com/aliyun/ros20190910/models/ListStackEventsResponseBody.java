// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackEventsResponseBody extends TeaModel {
    /**
     * <p>The events.</p>
     */
    @NameInMap("Events")
    public java.util.List<ListStackEventsResponseBodyEvents> events;

    /**
     * <p>The page number of the returned page.\
     * Pages start from page 1.\
     * Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.\
     * Maximum value: 50.\
     * Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned events.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
         * <p>The time when the event was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-01T04:07:39</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0086612d-77cf-4056-b0b5-ff8e94ad****</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The logical ID of the resource. The logical ID indicates the name of the resource that is defined in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>WebServer</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The physical ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-m5e3tfdbinchnexh****</p>
         */
        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The stack ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The stack name.</p>
         * 
         * <strong>example:</strong>
         * <p>StackName</p>
         */
        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The state of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the resource is in the current state.</p>
         * 
         * <strong>example:</strong>
         * <p>state changed</p>
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
