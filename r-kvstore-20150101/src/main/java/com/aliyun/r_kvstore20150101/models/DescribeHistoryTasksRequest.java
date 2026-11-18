// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksRequest extends TeaModel {
    /**
     * <p>The minimum execution duration of the tasks. This parameter is used to filter tasks whose execution duration is greater than the specified value. Unit: seconds. Default value: 0, which means no limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FromExecTime")
    public Integer fromExecTime;

    /**
     * <p>The earliest start time of the tasks to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. You can query data from up to 30 days ago.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The ID of the instance, which is used to query tasks of the specified instance. By default, this parameter is empty, which means no limit is applied. To query multiple instances, separate the instance IDs with commas (,). You can specify up to 30 instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>r-uf62br2491p5l****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type. Set the value to Instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The page number of the query result. Valid values: positive integers. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region to which the pending events belong. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public Long resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The task status, which is used to filter tasks by status. Valid values:</p>
     * <ul>
     * <li><strong>Scheduled</strong>: Pending execution.</li>
     * <li><strong>Running</strong>: Running.</li>
     * <li><strong>Succeed</strong>: Succeeded.</li>
     * <li><strong>Failed</strong>: Failed.</li>
     * <li><strong>Cancelling</strong>: Cancelling.</li>
     * <li><strong>Canceled</strong>: Canceled.</li>
     * <li><strong>Waiting</strong>: Waiting for the scheduled time.
     * By default, this parameter is empty, which means all statuses are selected. To specify multiple statuses, separate them with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Scheduled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the task, which is used to query tasks with known IDs. By default, this parameter is empty, which means no limit is applied. To query multiple tasks, separate the task IDs with commas (,). You can specify up to 30 task IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>t-83br18hloy3faf****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type, which is used to query tasks of a specific type. By default, this parameter is empty, which means no limit is applied. Valid values:</p>
     * <ul>
     * <li><strong>ModifyInsSpec</strong>: Instance specification change or migration.</li>
     * <li><strong>DeleteInsNode</strong>: Shard deletion.</li>
     * <li><strong>AddInsNode</strong>: Shard addition.</li>
     * <li><strong>HaSwitch</strong>: Primary/secondary switchover.</li>
     * <li><strong>RestartIns</strong>: Instance restart.</li>
     * <li><strong>CreateIns</strong>: Instance creation.</li>
     * <li><strong>ModifyInsConfig</strong>: Configuration change.
     * To query multiple task types, separate them with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ModifyInsSpec</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The maximum execution duration of the tasks. This parameter is used to filter tasks whose execution duration is not less than the specified value. Unit: seconds. Default value: 0, which means no limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ToExecTime")
    public Integer toExecTime;

    /**
     * <p>The latest start time of the tasks to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The time must be later than the earliest start time of the tasks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T11:31:03Z</p>
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
