// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsRequest extends TeaModel {
    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li><p>Archived: The event is archived.</p>
     * </li>
     * <li><p>UnArchived: The event is not archived.</p>
     * </li>
     * <li><p>All: All events.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ArchiveStatus")
    public String archiveStatus;

    /**
     * <p>The category of the system event. Valid values:</p>
     * <ul>
     * <li><p><strong>Exception</strong>: anomalous activity</p>
     * </li>
     * <li><p><strong>Optimize</strong>: optimization events</p>
     * </li>
     * <li><p><strong>Notification</strong>: notification events</p>
     * </li>
     * <li><p><strong>Maintenance</strong>: scheduled O\&amp;M events</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Exception</p>
     */
    @NameInMap("EventCategory")
    public String eventCategory;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5345398</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The event level. Valid values are:</p>
     * <ul>
     * <li><p><strong>INFO</strong>: Notification</p>
     * </li>
     * <li><p><strong>WARN</strong>: Warning</p>
     * </li>
     * <li><p><strong>CRITICAL</strong>: Critical</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("EventLevel")
    public String eventLevel;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li><p><strong>Inquiring</strong>: The event is being inquired.</p>
     * </li>
     * <li><p><strong>Scheduled</strong>: The event is scheduled.</p>
     * </li>
     * <li><p><strong>Running</strong>: The event is in progress.</p>
     * </li>
     * <li><p><strong>Succeed</strong>: The event is successful.</p>
     * </li>
     * <li><p><strong>Failed</strong>: The event failed.</p>
     * </li>
     * <li><p><strong>Canceled</strong>: The event is canceled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To query multiple statuses, separate them with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Succeed</p>
     */
    @NameInMap("EventStatus")
    public String eventStatus;

    /**
     * <p>The type of the system event. This parameter is valid only when InstanceEventType.N is not specified. Valid values:</p>
     * <ul>
     * <li><p><strong>SystemMaintenance.Reboot</strong>: The instance is restarted due to system maintenance.</p>
     * </li>
     * <li><p><strong>SystemMaintenance.Redeploy</strong>: The instance is redeployed due to system maintenance.</p>
     * </li>
     * <li><p><strong>SystemFailure.Reboot</strong>: The instance is restarted due to a system fault.</p>
     * </li>
     * <li><p><strong>SystemFailure.Redeploy</strong>: The instance is redeployed due to a system fault.</p>
     * </li>
     * <li><p><strong>SystemFailure.Delete</strong>: The instance is released because it failed to be created.</p>
     * </li>
     * <li><p><strong>InstanceFailure.Reboot</strong>: The instance is restarted due to an instance fault.</p>
     * </li>
     * <li><p><strong>InstanceExpiration.Stop</strong>: The subscription instance is stopped because its subscription expires.</p>
     * </li>
     * <li><p><strong>InstanceExpiration.Delete</strong>: The subscription instance is released because its subscription expires.</p>
     * </li>
     * <li><p><strong>AccountUnbalanced.Stop</strong>: The pay-as-you-go instance is stopped due to an overdue payment.</p>
     * </li>
     * <li><p><strong>AccountUnbalanced.Delete</strong>: The pay-as-you-go instance is released due to an overdue payment.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The value of this parameter can only be an instance system event, not a disk system event.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SystemFailure.Reboot</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The beginning of the time range to query tasks based on their start time. The tasks that started after this time are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. You can query data from the last 30 days. If the specified time is more than 30 days ago, the system automatically sets it to 30 days ago.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The resource ID. Use this parameter to query tasks for a specific resource. To query tasks for multiple resources, separate the resource IDs with commas (,). You can specify up to 30 resource IDs. If you leave this parameter empty, all resources are queried.</p>
     * <blockquote>
     * <p>Currently, only cluster IDs are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-2zed3m89cw***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number to query. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-**********</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p><strong>Instance</strong>: instance resource</p>
     * </li>
     * <li><p><strong>Host</strong>: host resource</p>
     * </li>
     * <li><p><strong>User</strong>: user resource</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the scheduled task that you want to cancel.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/199648.html">DescribeScheduleTasks</a> operation to view information about all scheduled tasks under the current account, including task IDs.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Only tasks that are pending execution (the <code>Status</code> parameter returns <code>pending</code>) can be canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>32077515</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The end of the time range to query tasks based on their start time. The tasks that started before this time are queried. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in <code>UTC</code>.</p>
     * 
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
