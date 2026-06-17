// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeScheduleTasksRequest extends TeaModel {
    /**
     * <p>The cluster description.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters in a specific region, including cluster IDs.</p>
     * </li>
     * <li><p>If this parameter is omitted, scheduled tasks for all clusters in your account are queried.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The order ID.</p>
     * <blockquote>
     * <p>The order ID can contain only digits.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20951253014****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>30</strong> (default), <strong>50</strong>, and <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The latest start time of the task. The time is in UTC. If the task does not start by this time, it expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-28T12:30Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest start time of the task. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-28T12:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the available regions.</p>
     * </li>
     * <li><p>If this parameter is omitted, scheduled tasks in all regions in your account are queried.</p>
     * </li>
     * </ul>
     * </blockquote>
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
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p><strong>pending</strong>: The task is waiting to be executed.</p>
     * </li>
     * <li><p><strong>executing</strong>: The task is being executed.</p>
     * </li>
     * <li><p><strong>failure</strong>: The task failed and is waiting for a retry.</p>
     * </li>
     * <li><p><strong>finish</strong>: The task is complete.</p>
     * </li>
     * <li><p><strong>cancel</strong>: The task is canceled.</p>
     * </li>
     * <li><p><strong>expired</strong>: The task has expired because it did not start within the scheduled time window.</p>
     * </li>
     * <li><p><strong>rollback</strong>: The task is being rolled back.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is omitted, scheduled tasks in all states are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>finish</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The action of the scheduled task. Valid values:</p>
     * <ul>
     * <li><p><strong>CreateDBNodes</strong></p>
     * </li>
     * <li><p><strong>ModifyDBNodeClass</strong></p>
     * </li>
     * <li><p><strong>UpgradeDBClusterVersion</strong></p>
     * </li>
     * <li><p><strong>ModifyDBClusterPrimaryZone</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Task details are returned only if you specify the <code>PlannedStartTime</code> parameter when you call one of the preceding API operations. Otherwise, the <code>TimerInfos</code> field in the response is empty.</p>
     * </li>
     * <li><p>If this parameter is omitted, scheduled tasks of all types are queried.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CreateDBNodes</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    public static DescribeScheduleTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleTasksRequest self = new DescribeScheduleTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleTasksRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeScheduleTasksRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeScheduleTasksRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribeScheduleTasksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScheduleTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScheduleTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScheduleTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScheduleTasksRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public DescribeScheduleTasksRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public DescribeScheduleTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScheduleTasksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeScheduleTasksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScheduleTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScheduleTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeScheduleTasksRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

}
