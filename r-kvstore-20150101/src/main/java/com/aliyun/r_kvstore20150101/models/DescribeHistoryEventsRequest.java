// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsRequest extends TeaModel {
    /**
     * <p>The archive status of the event. Valid values:</p>
     * <ul>
     * <li><strong>Archived</strong>: The event is archived.</li>
     * <li><strong>UnArchived</strong>: The event is not archived.</li>
     * <li><strong>All</strong>: All events.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Archived</p>
     */
    @NameInMap("ArchiveStatus")
    public String archiveStatus;

    /**
     * <p>The category of the system event. Valid values:</p>
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
     * <p>The ID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>5345398</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The event level. Valid values:</p>
     * <ul>
     * <li><strong>INFO</strong>: Information.</li>
     * <li><strong>WARN</strong>: Warning.</li>
     * <li><strong>CRITICAL</strong>: Critical.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("EventLevel")
    public String eventLevel;

    /**
     * <p>The status of the event. Valid values:</p>
     * <ul>
     * <li><strong>Inquiring</strong>: Inquiring.</li>
     * <li><strong>Scheduled</strong>: Scheduled.</li>
     * <li><strong>Running</strong>: Running.</li>
     * <li><strong>Succeed</strong>: Succeeded.</li>
     * <li><strong>Failed</strong>: Failed.</li>
     * <li><strong>Canceled</strong>: Canceled.<blockquote>
     * <p>To query events in multiple statuses, separate the statuses with commas (,).</p>
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
     * <p>The type of the system event. The EventType parameter is valid only when the InstanceEventType.N parameter is not specified. Valid values: </p>
     * <ul>
     * <li>SystemMaintenance.Reboot: The instance is restarted due to system maintenance.</li>
     * <li>SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.</li>
     * <li>SystemFailure.Reboot: The instance is restarted due to a system failure.</li>
     * <li>SystemFailure.Redeploy: The instance is redeployed due to a system failure.</li>
     * <li>SystemFailure.Delete: The instance is released due to a creation failure.</li>
     * <li>InstanceFailure.Reboot: The instance is restarted due to an instance failure.</li>
     * <li>InstanceExpiration.Stop: The subscription instance is stopped due to expiration.</li>
     * <li>InstanceExpiration.Delete: The subscription instance is released due to expiration.</li>
     * <li>AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.</li>
     * <li>AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about event types, see <a href="https://help.aliyun.com/document_detail/66574.html">Overview of system events</a>. The value of this parameter can only be an instance system event, not a cloud disk system event.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SystemFailure.Reboot</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The earliest start time of the query task. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be greater than 0 and less than or equal to the maximum integer value. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfnuslkubs****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li><strong>Instance</strong>: Instance resources.</li>
     * <li><strong>Host</strong>: Host resources.</li>
     * <li><strong>User</strong>: User resources.<blockquote>
     * <p>If you do not specify this parameter, all resource types are queried.</p>
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
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>578678678</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The latest start time of the query task. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC and later than the earliest start time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T11:31:03Z</p>
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

    public DescribeHistoryEventsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeHistoryEventsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public DescribeHistoryEventsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHistoryEventsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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
