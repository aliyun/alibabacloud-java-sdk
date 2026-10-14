// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksRequest extends TeaModel {
    /**
     * <p>The minimum execution duration. Filters tasks whose execution duration is greater than this value. Unit: seconds. Default value: 0, which indicates no restriction.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FromExecTime")
    public Integer fromExecTime;

    /**
     * <p>The beginning of the time range for the task start time. Tasks whose start time is later than this time are queried. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in <code>UTC+0</code>. The earliest supported time is 30 days before the current time. A value earlier than 30 days is automatically converted to 30 days before the current time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The resource ID. Specify this parameter to query tasks for the corresponding resource. Separate multiple IDs with commas (,). A maximum of 30 IDs are supported. Default value: empty, which indicates no restriction.</p>
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
     * <p>Currently, only Instance is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the query results. Valid values: positive integers. Default value: 1.</p>
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
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region information.</p>
     * </blockquote>
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
     * <p>rg-************</p>
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
     * <li><strong>Scheduled</strong>: Waiting for execution.</li>
     * <li><strong>Running</strong>: Running.</li>
     * <li><strong>Succeed</strong>: Succeeded.</li>
     * <li><strong>Cancelling</strong>: Being canceled.</li>
     * <li><strong>Canceled</strong>: Canceled.</li>
     * <li><strong>Waiting</strong>: Waiting for the scheduled time.</li>
     * </ul>
     * <p>Separate multiple statuses with commas (,). Default value: empty, which indicates all statuses.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID. Separate multiple task IDs with commas (,). A maximum of 30 IDs are supported. Default value: empty, which indicates no restriction.</p>
     * 
     * <strong>example:</strong>
     * <p>t-0mqi38ho0cgjv***</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type. Specify this parameter to query tasks of a specific type. Separate multiple types with commas (,). A maximum of 30 types are supported. Default value: empty, which indicates no restriction.</p>
     * 
     * <strong>example:</strong>
     * <p>ChangeVariable</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The maximum execution duration. Filters tasks whose execution duration is not less than this value. Unit: seconds. Default value: 0, which indicates no restriction.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ToExecTime")
    public Integer toExecTime;

    /**
     * <p>The end of the time range for the task start time. Tasks whose start time is earlier than this time are queried. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in <code>UTC+0</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-03T11:31:03Z</p>
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
