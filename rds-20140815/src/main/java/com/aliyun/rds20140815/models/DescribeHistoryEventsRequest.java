// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsRequest extends TeaModel {
    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li><strong>Archived</strong>: archived.</li>
     * <li><strong>UnArchived</strong>: not archived.</li>
     * <li><strong>All</strong>: all.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ArchiveStatus")
    public String archiveStatus;

    /**
     * <p>The system event categorization. Valid values:</p>
     * <ul>
     * <li><strong>Exception</strong>: abnormal event.</li>
     * <li><strong>Optimize</strong>: optimization events.</li>
     * <li><strong>Notification</strong>: notification event.</li>
     * <li><strong>Maintenance</strong>: scheduled maintenance event.</li>
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
     * <li><strong>INFO</strong>: notification.</li>
     * <li><strong>WARN</strong>: warning.</li>
     * <li><strong>CRITICAL</strong>: critical.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("EventLevel")
    public String eventLevel;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li><strong>Inquiring</strong>: inquiring.</li>
     * <li><strong>Scheduled</strong>: scheduled.</li>
     * <li><strong>Running</strong>: running.</li>
     * <li><strong>Succeed</strong>: completed.</li>
     * <li><strong>Failed</strong>: failed.</li>
     * <li><strong>Canceled</strong>: canceled.<blockquote>
     * <p>To query multiple statuses, separate them with commas (,).</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Scheduled</p>
     */
    @NameInMap("EventStatus")
    public String eventStatus;

    /**
     * <p>The system event type. This parameter takes effect only when InstanceEventType.N is not specified. Valid values: </p>
     * <ul>
     * <li><strong>SystemMaintenance.Reboot</strong>: The instance is restarted due to system maintenance.</li>
     * <li><strong>SystemMaintenance.Redeploy</strong>: The instance is redeployed due to system maintenance.</li>
     * <li><strong>SystemFailure.Reboot</strong>: The instance is restarted due to a system error.</li>
     * <li><strong>SystemFailure.Redeploy</strong>: The instance is redeployed due to a system error.</li>
     * <li><strong>SystemFailure.Delete</strong>: The instance is released due to an instance creation failure.</li>
     * <li><strong>InstanceFailure.Reboot</strong>: The instance is restarted due to an instance error.</li>
     * <li><strong>InstanceExpiration.Stop</strong>: The instance is stopped due to subscription expiration.</li>
     * <li><strong>InstanceExpiration.Delete</strong>: The instance is released due to subscription expiration.</li>
     * <li><strong>AccountUnbalanced.Stop</strong>: The pay-as-you-go instance is stopped due to an overdue payment.</li>
     * <li><strong>AccountUnbalanced.Delete</strong>: The pay-as-you-go instance is released due to an overdue payment.<blockquote>
     * <p>The value of this parameter can only be an instance system event, not a cloud disk system event.</p>
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
     * <p>The beginning of the time range for the task start time. Tasks whose start time is later than this time are queried. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in <code>UTC +0</code>. The earliest supported time is 30 days before the current time. If the specified time is more than 30 days before the current time, it is automatically converted to 30 days before the current time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The ApsaraDB RDS instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf62br2491p5l****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The value must be greater than 0 and cannot exceed the maximum value of the integer type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/610399.html">DescribeRegions</a> to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><strong>Instance</strong>: instance resource.</li>
     * <li><strong>Host</strong>: host resource.</li>
     * <li><strong>User</strong>: user resource.<blockquote>
     * <p>If this parameter is not specified, all resource types are queried.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The task ID. Specify this parameter to retrieve data for a specific task.</p>
     * 
     * <strong>example:</strong>
     * <p>241535739</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The end of the time range for the task start time. Tasks whose start time is earlier than this time are queried. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in <code>UTC +0</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-12T07:06:19Z</p>
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

    public DescribeHistoryEventsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
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
