// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether the task can be canceled. Default value: -1. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: all tasks.</li>
     * <li><strong>0</strong>: tasks that cannot be canceled.</li>
     * <li><strong>1</strong>: tasks that can be canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowCancel")
    public Integer allowCancel;

    /**
     * <p>Specifies whether the execution time can be modified. Default value: -1. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: all tasks.</li>
     * <li><strong>0</strong>: tasks whose execution time cannot be modified.</li>
     * <li><strong>1</strong>: tasks whose execution time can be modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowChange")
    public Integer allowChange;

    /**
     * <p>The task level. Default value: all. Valid values:</p>
     * <ul>
     * <li><strong>all</strong>: all tasks.</li>
     * <li><strong>S0</strong>: exception recovery tasks.</li>
     * <li><strong>S1</strong>: system O&amp;M tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("ChangeLevel")
    public String changeLevel;

    /**
     * <p>The database engine. Default value: all. Valid values: mysql, pgsql, mssql, and others.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The instance name. This parameter is optional. If you specify this parameter, you can specify only one instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp191w771kd3****</p>
     */
    @NameInMap("InsName")
    public String insName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number, which must be greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 25. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product name. Valid values: RDS, POLARDB, MongoDB, and Redis. For an ApsaraDB RDS instance, set the value to RDS.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region ID of the pending event. You can call the DescribeRegions operation to query the region ID.</p>
     * <blockquote>
     * <p>A value of <strong>all</strong> specifies all region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
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
     * <p>The task status, which is used to filter the returned tasks. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: all tasks.</li>
     * <li><strong>3</strong>: pending tasks.</li>
     * <li><strong>4</strong>: tasks in progress.</li>
     * <li><strong>5</strong>: successfully completed tasks.</li>
     * <li><strong>6</strong>: failed tasks.</li>
     * <li><strong>7</strong>: canceled tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>rds_apsaradb_ha</strong>: primary and secondary node switch.</li>
     * <li><strong>rds_apsaradb_transfer</strong>: instance migration.</li>
     * <li><strong>rds_apsaradb_upgrade</strong>: minor engine version update.</li>
     * <li><strong>rds_apsaradb_maxscale</strong>: proxy minor version upgrade.</li>
     * <li><strong>all</strong>: all task types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rds_apsaradb_upgrade</p>
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
