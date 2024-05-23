// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsRequest extends TeaModel {
    /**
     * <p>The resource status. Valid values: **importing**, failed, checksuccess, and deleted.</p>
     */
    @NameInMap("ArchiveStatus")
    public String archiveStatus;

    /**
     * <p>The system event category. For more information, see [View the event history of an ApsaraDB RDS instance](https://help.aliyun.com/document_detail/129759.html).</p>
     */
    @NameInMap("EventCategory")
    public String eventCategory;

    /**
     * <p>The event ID.</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The event level. Valid values: ***high***, **medium**, and **low**.</p>
     */
    @NameInMap("EventLevel")
    public String eventLevel;

    /**
     * <p>The status of the exception. Valid values:</p>
     * <br>
     * <p>*   1: pending</p>
     * <p>*   2: ignored</p>
     * <p>*   4: confirmed</p>
     * <p>*   8: marked as false positive</p>
     * <p>*   16: handling</p>
     * <p>*   32: handled</p>
     * <p>*   64: expired</p>
     */
    @NameInMap("EventStatus")
    public String eventStatus;

    /**
     * <p>The system event type. This parameter takes effect only when InstanceEventType.N is not specified. Valid values:</p>
     * <br>
     * <p>*   SystemMaintenance.Reboot: The instance is restarted due to system maintenance.</p>
     * <p>*   SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.</p>
     * <p>*   SystemFailure.Reboot: The instance is restarted due to a system error.</p>
     * <p>*   SystemFailure.Redeploy: The instance is redeployed due to a system error.</p>
     * <p>*   SystemFailure.Delete: The instance is released due to an instance creation failure.</p>
     * <p>*   InstanceFailure.Reboot: The instance is restarted due to an instance error.</p>
     * <p>*   InstanceExpiration.Stop: The subscription instance is stopped due to expiration.</p>
     * <p>*   InstanceExpiration.Delete: The subscription instance is released due to expiration.</p>
     * <p>*   AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.</p>
     * <p>*   AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.</p>
     * <br>
     * <p>>  For more information, see Overview. The values of this parameter are applicable only to instance system events, but not to disk system events.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The beginning of the time range to query. Only tasks that have a start time later than or equal to the time specified by this parameter are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The start time can be up to 30 days earlier than the current time. If you set this parameter to a time more than 30 days earlier than the current time, this time is automatically converted to a time that is exactly 30 days earlier than the current time.</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. Valid values: any non-zero positive integer. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 30.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/610399.html) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resource type. Set the value to **INSTANCE**.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The task ID. This value is used to query the data of a specific task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The end of the time range to query. Only tasks that have a start time earlier than or equal to the time specified by this parameter are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
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
