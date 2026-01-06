// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ArchiveStatus")
    public String archiveStatus;

    /**
     * <strong>example:</strong>
     * <p>Exception</p>
     */
    @NameInMap("EventCategory")
    public String eventCategory;

    /**
     * <strong>example:</strong>
     * <p>5345398</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("EventLevel")
    public String eventLevel;

    /**
     * <strong>example:</strong>
     * <p>Succeed</p>
     */
    @NameInMap("EventStatus")
    public String eventStatus;

    /**
     * <strong>example:</strong>
     * <p>SystemFailure.Reboot</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <strong>example:</strong>
     * <p>2025-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <strong>example:</strong>
     * <p>pc-2zed3m89cw***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-**********</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>32077515</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>2025-01-03T12:31:03Z</p>
     */
    @NameInMap("ToStartTime")
    public String toStartTime;

    public static DescribeHistoryEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryEventsRequest self = new DescribeHistoryEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryEventsRequest setArchiveStatus(String archiveStatus) {
        this.archiveStatus = archiveStatus;
        return this;
    }
    public String getArchiveStatus() {
        return this.archiveStatus;
    }

    public DescribeHistoryEventsRequest setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
        return this;
    }
    public String getEventCategory() {
        return this.eventCategory;
    }

    public DescribeHistoryEventsRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeHistoryEventsRequest setEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }
    public String getEventLevel() {
        return this.eventLevel;
    }

    public DescribeHistoryEventsRequest setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }
    public String getEventStatus() {
        return this.eventStatus;
    }

    public DescribeHistoryEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeHistoryEventsRequest setFromStartTime(String fromStartTime) {
        this.fromStartTime = fromStartTime;
        return this;
    }
    public String getFromStartTime() {
        return this.fromStartTime;
    }

    public DescribeHistoryEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHistoryEventsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHistoryEventsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHistoryEventsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeHistoryEventsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeHistoryEventsRequest setToStartTime(String toStartTime) {
        this.toStartTime = toStartTime;
        return this;
    }
    public String getToStartTime() {
        return this.toStartTime;
    }

}
