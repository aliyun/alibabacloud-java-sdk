// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>The filter condition that is used to return tasks based on the settings of task cancellation. Default value: -1. Valid values:</p>
     * <br>
     * <p>*   **-1**: returns all tasks.</p>
     * <p>*   **0**: returns only tasks that cannot be canceled.</p>
     * <p>*   **1**: returns only tasks that can be canceled.</p>
     */
    @NameInMap("AllowCancel")
    public Integer allowCancel;

    /**
     * <p>The filter condition that is used to return tasks based on the settings of the switching time. Default value: -1. Valid values:</p>
     * <br>
     * <p>*   **-1**: returns all tasks.</p>
     * <p>*   **0**: returns only tasks for which the switching time cannot be changed.</p>
     * <p>*   **1**: returns only tasks for which the switching time can be changed.</p>
     */
    @NameInMap("AllowChange")
    public Integer allowChange;

    /**
     * <p>The filter condition that is used to return tasks based on the task level. Default value: all. Valid values:</p>
     * <br>
     * <p>*   **all**: all types</p>
     * <p>*   **S0**: returns the tasks of the exception fixing level.</p>
     * <p>*   **S1**: returns the tasks of the system O\&M level.</p>
     */
    @NameInMap("ChangeLevel")
    public String changeLevel;

    /**
     * <p>The type of the database. Default value: all. Valid values: mysql, pgsql, and mssql.</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The name of the instance. You can leave this parameter empty. If you configure this parameter, you can specify the name only of one instance.</p>
     */
    @NameInMap("InsName")
    public String insName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 25.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the service. Valid values: RDS, POLARDB, MongoDB, and Redis. For RDS instances, set the value to RDS.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region ID of the pending event. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <br>
     * <p>>  The value **all** indicates all regions.</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The status of the task, which is used as a filter condition to return tasks.</p>
     * <br>
     * <p>*   **-1**: all tasks</p>
     * <p>*   **3**: pending</p>
     * <p>*   **4**: being processed</p>
     * <p>*   **5**: completed</p>
     * <p>*   **6**: failed</p>
     * <p>*   **7**: canceled</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **rds_apsaradb_ha**: primary/secondary switchover</p>
     * <p>*   **rds_apsaradb_transfer**: instance migration</p>
     * <p>*   **rds_apsaradb_upgrade**: update of the minor engine version</p>
     * <p>*   **rds_apsaradb_maxscale**: update of the minor version of the proxy</p>
     * <p>*   **all**: all types</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeActiveOperationTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTasksRequest self = new DescribeActiveOperationTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTasksRequest setAllowCancel(Integer allowCancel) {
        this.allowCancel = allowCancel;
        return this;
    }
    public Integer getAllowCancel() {
        return this.allowCancel;
    }

    public DescribeActiveOperationTasksRequest setAllowChange(Integer allowChange) {
        this.allowChange = allowChange;
        return this;
    }
    public Integer getAllowChange() {
        return this.allowChange;
    }

    public DescribeActiveOperationTasksRequest setChangeLevel(String changeLevel) {
        this.changeLevel = changeLevel;
        return this;
    }
    public String getChangeLevel() {
        return this.changeLevel;
    }

    public DescribeActiveOperationTasksRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeActiveOperationTasksRequest setInsName(String insName) {
        this.insName = insName;
        return this;
    }
    public String getInsName() {
        return this.insName;
    }

    public DescribeActiveOperationTasksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeActiveOperationTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeActiveOperationTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActiveOperationTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeActiveOperationTasksRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DescribeActiveOperationTasksRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeActiveOperationTasksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeActiveOperationTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeActiveOperationTasksRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeActiveOperationTasksRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeActiveOperationTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
