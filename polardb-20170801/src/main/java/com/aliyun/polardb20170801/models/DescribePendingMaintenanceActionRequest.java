// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePendingMaintenanceActionRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the historical tasks. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: returns the current task.</li>
     * <li><strong>1</strong>: returns the historical tasks.</li>
     * </ul>
     * <p>Default value: <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsHistory")
    public Integer isHistory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value of this parameter must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, or <strong>100</strong>.</p>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the pending event. You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the regions and zones that are supported by PolarDB.</p>
     * <blockquote>
     * <ul>
     * <li>You can set this parameter to <strong>all</strong> to view all pending events within your account.</li>
     * <li>If you set <code>Region</code> to <strong>all</strong>, you must set <code>TaskType</code> to <strong>all</strong>.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Region")
    public String region;

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

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The task type of pending events. Valid values:</p>
     * <ul>
     * <li><strong>DatabaseSoftwareUpgrading</strong>: database software upgrades</li>
     * <li><strong>DatabaseHardwareMaintenance</strong>: hardware maintenance and upgrades</li>
     * <li><strong>DatabaseStorageUpgrading</strong>: database storage upgrades</li>
     * <li><strong>DatabaseProxyUpgrading</strong>: minor version upgrades of the proxy</li>
     * <li><strong>all</strong>: queries the details of the pending events of all preceding types.</li>
     * </ul>
     * <blockquote>
     * <p>If the <code>Region</code> parameter is set to <strong>all</strong>, the <code>TaskType</code> parameter must be set to <strong>all</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribePendingMaintenanceActionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePendingMaintenanceActionRequest self = new DescribePendingMaintenanceActionRequest();
        return TeaModel.build(map, self);
    }

    public DescribePendingMaintenanceActionRequest setIsHistory(Integer isHistory) {
        this.isHistory = isHistory;
        return this;
    }
    public Integer getIsHistory() {
        return this.isHistory;
    }

    public DescribePendingMaintenanceActionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePendingMaintenanceActionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePendingMaintenanceActionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePendingMaintenanceActionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePendingMaintenanceActionRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribePendingMaintenanceActionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribePendingMaintenanceActionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePendingMaintenanceActionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePendingMaintenanceActionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribePendingMaintenanceActionRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
