// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsRequest extends TeaModel {
    /**
     * <p>The event archive status. Valid values:</p>
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
     * <p>The system event category. Valid values:</p>
     * <ul>
     * <li><strong>Exception</strong>: Exception events.</li>
     * <li><strong>Optimize</strong>: Optimization events.</li>
     * <li><strong>Notification</strong>: Notification events.</li>
     * <li><strong>Maintenance</strong>: Scheduled O&amp;M events.</li>
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
     * <p>The event level. Valid values:</p>
     * <ul>
     * <li><strong>INFO</strong>: Notification.</li>
     * <li><strong>WARN</strong>: Warning.</li>
     * <li><strong>CRITICAL</strong>: Critical.</li>
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
     * <li><strong>Inquiring</strong>: Inquiring.</li>
     * <li><strong>Scheduled</strong>: Scheduled.</li>
     * <li><strong>Running</strong>: Running.</li>
     * <li><strong>Succeed</strong>: Succeeded.</li>
     * <li><strong>Failed</strong>: Failed.</li>
     * <li><strong>Canceled</strong>: Canceled.<blockquote>
     * <p>To query multiple statuses, separate them with commas (,).</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeed</p>
     */
    @NameInMap("EventStatus")
    public String eventStatus;

    /**
     * <p>The system event type. This parameter is valid only when InstanceEventType.N is not specified. Valid values: </p>
     * <ul>
     * <li><strong>SystemMaintenance.Reboot</strong>: The instance is restarted due to system maintenance.</li>
     * <li><strong>SystemMaintenance.Redeploy</strong>: The instance is redeployed due to system maintenance.</li>
     * <li><strong>SystemFailure.Reboot</strong>: The instance is restarted due to a system failure.</li>
     * <li><strong>SystemFailure.Redeploy</strong>: The instance is redeployed due to a system failure.</li>
     * <li><strong>SystemFailure.Delete</strong>: The instance is released due to a creation failure.</li>
     * <li><strong>InstanceFailure.Reboot</strong>: The instance is restarted due to an instance failure.</li>
     * <li><strong>InstanceExpiration.Stop</strong>: The subscription instance is stopped due to expiration.</li>
     * <li><strong>InstanceExpiration.Delete</strong>: The subscription instance is released due to expiration.</li>
     * <li><strong>AccountUnbalanced.Stop</strong>: The pay-as-you-go instance is stopped due to an overdue payment.</li>
     * <li><strong>AccountUnbalanced.Delete</strong>: The pay-as-you-go instance is released due to an overdue payment.<blockquote>
     * <p>The value of this parameter must be an instance system event, not a disk system event.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SystemFailure.Reboot</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The start time of the task start time range. This parameter specifies that only tasks whose start time is later than this value are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The earliest supported time is 30 days ago. If the specified time is more than 30 days before the current time, it is automatically changed to 30 days ago.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The resource ID. This parameter is used to query tasks of the corresponding resources. Separate multiple IDs with commas (,). You can specify up to 30 IDs. By default, this parameter is left empty, which indicates that no limit is applied.</p>
     * <blockquote>
     * <p>Only cluster IDs are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-2zed3m89cw***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. Default value: 1.</p>
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
     * <li><strong>Instance</strong>: Instance resources.</li>
     * <li><strong>Instance</strong>: Host: Host resources.</li>
     * <li><strong>Instance</strong>: User: User resources.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the scheduled task to be canceled.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/199648.html">DescribeScheduleTasks</a> operation to query the information about all scheduled tasks under the current account, including the task IDs.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Only tasks in the pending state (the return value of the <code>Status</code> parameter is <code>pending</code>) can be canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>32077515</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The end time of the task start time range. This parameter specifies that only tasks whose start time is earlier than this value are queried. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
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
