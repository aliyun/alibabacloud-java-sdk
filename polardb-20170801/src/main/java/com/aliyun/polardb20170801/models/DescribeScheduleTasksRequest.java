// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeScheduleTasksRequest extends TeaModel {
    /**
     * <p>The description of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the information of all PolarDB clusters that are deployed in a specific region, such as the cluster IDs.</p>
     * </li>
     * <li><p>If you do not specify this parameter, all scheduled tasks on your clusters are queried.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the order.</p>
     * <blockquote>
     * <p> The order ID can contain only digits.</p>
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
     * <p>The page number of the page to return. Set this parameter to an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The latest start time of the task that you specified when you created the scheduled task. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-28T12:30Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest start time of the task that you specified when you created the scheduled task. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-28T12:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The ID of the region.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the region information of all clusters in a specific account.</p>
     * </li>
     * <li><p>If you do not specify this parameter, scheduled tasks on your clusters that are deployed in all regions are queried.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
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
     * <p>The state of the tasks that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>pending</strong>: The tasks are pending execution.</li>
     * <li><strong>executing</strong>: The tasks are being executed.</li>
     * <li><strong>failure</strong>: The tasks failed and need to be run again.</li>
     * <li><strong>finish</strong>: The tasks are complete.</li>
     * <li><strong>cancel</strong>: The tasks are canceled.</li>
     * <li><strong>expired</strong>: The tasks are expired. The tasks are not started within the time periods that are specified to start the tasks.</li>
     * <li><strong>rollback</strong>: The tasks are being rolled back.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, all scheduled tasks in all states are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>finish</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of scheduled tasks that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>CreateDBNodes</strong></li>
     * <li><strong>ModifyDBNodeClass</strong></li>
     * <li><strong>UpgradeDBClusterVersion</strong></li>
     * <li><strong>ModifyDBClusterPrimaryZone</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you specify the <code>PlannedStartTime</code> parameter when you call the four preceding operations, the details of each task are returned. Otherwise, an empty string is returned for the <code>TimerInfos</code> parameter.</p>
     * </li>
     * <li><p>If you do not specify this parameter, all types of scheduled tasks on you clusters are queried.</p>
     * </li>
     * </ul>
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
