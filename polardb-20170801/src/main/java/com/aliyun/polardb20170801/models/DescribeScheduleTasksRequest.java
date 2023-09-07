// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeScheduleTasksRequest extends TeaModel {
    /**
     * <p>The description of the cluster.</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can call the [DescribeDBClusters](~~98094~~) operation to query the information of all PolarDB clusters that are deployed in a specific region, such as the cluster IDs.</p>
     * <br>
     * <p>*   If you do not specify this parameter, all scheduled tasks on your clusters are queried.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the order.</p>
     * <br>
     * <p>>  The order ID can contain only digits.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the page to return. Set this parameter to an integer that is greater than 0. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: **30**, **50**, and **100**. Default value: 30.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The latest start time of the task that you specified when you created the scheduled task. The time is displayed in UTC.</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest start time of the task that you specified when you created the scheduled task. The time is displayed in UTC.</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can call the [DescribeRegions](~~98041~~) operation to query the region information of all clusters in a specific account.</p>
     * <br>
     * <p>*   If you do not specify this parameter, scheduled tasks on your clusters that are deployed in all regions are queried.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The state of the tasks that you want to query. Valid values:</p>
     * <br>
     * <p>*   **pending**: The tasks are pending execution.</p>
     * <p>*   **executing**: The tasks are being executed.</p>
     * <p>*   **failure**: The tasks failed and need to be run again.</p>
     * <p>*   **finish**: The tasks are complete.</p>
     * <p>*   **cancel**: The tasks are canceled.</p>
     * <p>*   **expired**: The tasks are expired. The tasks are not started within the time periods that are specified to start the tasks.</p>
     * <p>*   **rollback**: The tasks are being rolled back.</p>
     * <br>
     * <p>>  If you do not specify this parameter, all scheduled tasks in all states are queried.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of scheduled tasks that you want to query. Valid values:</p>
     * <br>
     * <p>*   **CreateDBNodes**</p>
     * <p>*   **ModifyDBNodeClass**</p>
     * <p>*   **UpgradeDBClusterVersion**</p>
     * <p>*   **ModifyDBClusterPrimaryZone**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you specify the `PlannedStartTime` parameter when you call the four preceding operations, the details of each task are returned. Otherwise, an empty string is returned for the `TimerInfos` parameter.</p>
     * <br>
     * <p>*   If you do not specify this parameter, all types of scheduled tasks on you clusters are queried.</p>
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
