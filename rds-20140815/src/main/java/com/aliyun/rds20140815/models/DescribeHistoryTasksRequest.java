// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksRequest extends TeaModel {
    /**
     * <p>The minimum execution duration of the task. This parameter is used to filter tasks whose execution duration is longer than the minimum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FromExecTime")
    public Integer fromExecTime;

    /**
     * <p>The beginning of the time range to query. Only tasks that have a start time later than or equal to the time specified by this parameter are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The start time can be up to 30 days earlier than the current time. If you set this parameter to a time more than 30 days earlier than the current time, the specified time is automatically converted to a time that is exactly 30 days earlier than the current time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The instance ID. Separate multiple instance IDs with commas (,). You can specify up to 30 instance IDs. This parameter is empty by default, which indicates that you can specify an unlimited number of instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf62br2491p5l****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Only Instance is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>10 to 100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the pending event. You can call the DescribeRegions operation to query the most recent region list.</p>
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
     * <p>rg-aekzbvctytru7ua</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public Long resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><strong>Scheduled</strong></li>
     * <li><strong>Running</strong></li>
     * <li><strong>Succeed</strong></li>
     * <li><strong>Failed</strong></li>
     * <li><strong>Cancelling</strong></li>
     * <li><strong>Canceled</strong></li>
     * <li><strong>Waiting</strong></li>
     * </ul>
     * <p>Separate multiple values with commas (,). By default, this parameter is left empty, which indicates that tasks in all statuses are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID. You can call the DescribeTasks operation to query the task ID. If multiple task IDs exist, separate them with commas (,). You can specify up to 30 task IDs. By default, this parameter is left empty, which indicates that all tasks are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>t-83br18hloy3faf****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type. Separate multiple task types with commas (,). You can specify up to 30 task types. This parameter is empty by default, which indicates that you can specify an unlimited number of task types.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest_dispatch_cases</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The maximum execution duration of a task. This parameter is used to filter tasks whose execution duration is shorter than or equal to the maximum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ToExecTime")
    public Integer toExecTime;

    /**
     * <p>The end of the time range to query. Only tasks that have a start time earlier than or equal to the time specified by this parameter are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-02T11:31:03Z</p>
     */
    @NameInMap("ToStartTime")
    public String toStartTime;

    public static DescribeHistoryTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksRequest self = new DescribeHistoryTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksRequest setFromExecTime(Integer fromExecTime) {
        this.fromExecTime = fromExecTime;
        return this;
    }
    public Integer getFromExecTime() {
        return this.fromExecTime;
    }

    public DescribeHistoryTasksRequest setFromStartTime(String fromStartTime) {
        this.fromStartTime = fromStartTime;
        return this;
    }
    public String getFromStartTime() {
        return this.fromStartTime;
    }

    public DescribeHistoryTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHistoryTasksRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeHistoryTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeHistoryTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHistoryTasksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHistoryTasksRequest setResourceOwnerAccount(Long resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public Long getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHistoryTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeHistoryTasksRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeHistoryTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeHistoryTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeHistoryTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeHistoryTasksRequest setToExecTime(Integer toExecTime) {
        this.toExecTime = toExecTime;
        return this;
    }
    public Integer getToExecTime() {
        return this.toExecTime;
    }

    public DescribeHistoryTasksRequest setToStartTime(String toStartTime) {
        this.toStartTime = toStartTime;
        return this;
    }
    public String getToStartTime() {
        return this.toStartTime;
    }

}
