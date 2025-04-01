// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>The filter condition that is used to return events based on the settings of event cancellation. Default value: -1. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: returns all events.</li>
     * <li><strong>0</strong>: returns only O\&amp;M events that cannot be canceled.</li>
     * <li><strong>1</strong>: returns only O\&amp;M events that can be canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowCancel")
    public Integer allowCancel;

    /**
     * <p>The filter condition that is used to return events based on the settings of the switching time. Default value: -1. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: returns all events.</li>
     * <li><strong>0</strong>: returns only O\&amp;M events for which the switching time cannot be changed.</li>
     * <li><strong>-1</strong>: returns only O\&amp;M events for which the switching time can be changed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowChange")
    public Integer allowChange;

    /**
     * <p>The type of task configuration change. Valid values:</p>
     * <ul>
     * <li><strong>all</strong> (default): The configurations of all O\&amp;M tasks are changed.</li>
     * <li><strong>S0</strong>: The configurations of tasks initiated to fix exceptions are changed.</li>
     * <li><strong>S1</strong>: The configurations of system O\&amp;M tasks are changed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("ChangeLevel")
    public String changeLevel;

    /**
     * <p>The database type. Valid values: <strong>redis</strong></p>
     * 
     * <strong>example:</strong>
     * <p>redis</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The name of the instance. You can leave this parameter empty. If you configure this parameter, you can specify the name only of one instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-wz96fzmpvpr2qnqnlb</p>
     */
    @NameInMap("InsName")
    public String insName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
     * <p>The name of the service. Valid values: RDS, POLARDB, MongoDB, and Redis. For Redis instances, set the value to Redis.</p>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region ID of the O&amp;M task. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <blockquote>
     * <p>A value of <strong>all</strong> indicates all region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
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
     * <p>The status of an O\&amp;M event. This parameter is used to filter returned tasks. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: filters all events.</li>
     * <li><strong>3</strong>: filters pending events.</li>
     * <li><strong>4</strong>: filters in-progress events.</li>
     * <li><strong>5</strong>: filters successful events.</li>
     * <li><strong>6</strong>: filters failed events.</li>
     * <li><strong>7</strong>: filters canceled events.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The type of the O\&amp;M event. If this parameter is not specified, all types of O\&amp;M events are queried.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>rds_apsradb_upgrade: minor version update</li>
     * <li>rds_apsaradb_ha: primary/secondary switchover</li>
     * <li>rds_apsaradb_ssl_update: SSL certificate update</li>
     * <li>rds_apsaradb_major_upgrade: major version upgrade</li>
     * <li>rds_apsradb_transfer: instance migration</li>
     * <li>rds_apsaradb_modify_config: network upgrade</li>
     * <li>rds_apsaradb_modify_config: instance parameter adjustment</li>
     * <li>rds_apsaradb_maxscale: proxy minor version update</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
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
