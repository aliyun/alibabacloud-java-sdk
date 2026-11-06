// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to return historical tasks. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Returns current tasks.</li>
     * <li><strong>1</strong>: Returns historical tasks.</li>
     * </ul>
     * <p>Default value: <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsHistory")
    public Integer isHistory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be greater than 0 and cannot exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The commodity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the regions and zones supported by PolarDB.</p>
     * <blockquote>
     * <ul>
     * <li>You can enter <strong>all</strong> to view all pending tasks under your account.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>When <code>Region</code> is set to <strong>all</strong>, <code>TaskType</code> must also be set to <strong>all</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
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
     * <p>The task type. You can call the [DescribeActiveOperationTaskType](ID not yet generated) operation to query the task types of pending tasks.</p>
     * <blockquote>
     * <ul>
     * <li>You can also enter <strong>all</strong> to view all pending tasks under your account.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>When <code>TaskType</code> is set to <strong>all</strong>, <code>Region</code> must also be set to <strong>all</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeActiveOperationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskRequest self = new DescribeActiveOperationTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskRequest setIsHistory(Integer isHistory) {
        this.isHistory = isHistory;
        return this;
    }
    public Integer getIsHistory() {
        return this.isHistory;
    }

    public DescribeActiveOperationTaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeActiveOperationTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeActiveOperationTaskRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActiveOperationTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeActiveOperationTaskRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DescribeActiveOperationTaskRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeActiveOperationTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeActiveOperationTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeActiveOperationTaskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeActiveOperationTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
