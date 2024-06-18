// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksStatRequest extends TeaModel {
    /**
     * <p>The minimum execution duration of a task. This parameter is used to filter tasks whose execution duration is longer than the minimum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FromExecTime")
    public Integer fromExecTime;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>t<em>HH:mm:ss</em>z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-08T07:04:17Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze704f*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
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
     * <p>rg-acfmy*****</p>
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
     * <li>Scheduled</li>
     * <li>Running</li>
     * <li>Succeed</li>
     * <li>Failed</li>
     * <li>Cancelling</li>
     * <li>Canceled</li>
     * <li>Waiting</li>
     * </ul>
     * <p>Separate multiple states with commas (,). This parameter is empty by default, which indicates that tasks in all states are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12221</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
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
     * <p>2023-02-24T10:01:37Z</p>
     */
    @NameInMap("ToStartTime")
    public String toStartTime;

    public static DescribeHistoryTasksStatRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksStatRequest self = new DescribeHistoryTasksStatRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksStatRequest setFromExecTime(Integer fromExecTime) {
        this.fromExecTime = fromExecTime;
        return this;
    }
    public Integer getFromExecTime() {
        return this.fromExecTime;
    }

    public DescribeHistoryTasksStatRequest setFromStartTime(String fromStartTime) {
        this.fromStartTime = fromStartTime;
        return this;
    }
    public String getFromStartTime() {
        return this.fromStartTime;
    }

    public DescribeHistoryTasksStatRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHistoryTasksStatRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeHistoryTasksStatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHistoryTasksStatRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHistoryTasksStatRequest setResourceOwnerAccount(Long resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public Long getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHistoryTasksStatRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeHistoryTasksStatRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeHistoryTasksStatRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeHistoryTasksStatRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeHistoryTasksStatRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeHistoryTasksStatRequest setToExecTime(Integer toExecTime) {
        this.toExecTime = toExecTime;
        return this;
    }
    public Integer getToExecTime() {
        return this.toExecTime;
    }

    public DescribeHistoryTasksStatRequest setToStartTime(String toStartTime) {
        this.toStartTime = toStartTime;
        return this;
    }
    public String getToStartTime() {
        return this.toStartTime;
    }

}
