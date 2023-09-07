// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePendingMaintenanceActionRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the historical tasks. Valid values:</p>
     * <br>
     * <p>*   **0**: returns the current task.</p>
     * <p>*   **1**: returns the historical tasks.</p>
     * <br>
     * <p>Default value: **0**.</p>
     */
    @NameInMap("IsHistory")
    public Integer isHistory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value of this parameter must be an integer that is greater than 0. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: **30**, **50**, or **100**.</p>
     * <br>
     * <p>Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the pending event. You can call the [DescribeRegions](~~98041~~) operation to query the regions and zones that are supported by PolarDB.</p>
     * <p>>- You can set this parameter to **all** to view all pending events within your account.</p>
     * <p>>- If you set `Region` to **all**, you must set `TaskType` to **all**.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource group.</p>
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
     * <br>
     * <p>*   **DatabaseSoftwareUpgrading**: database software upgrades</p>
     * <p>*   **DatabaseHardwareMaintenance**: hardware maintenance and upgrades</p>
     * <p>*   **DatabaseStorageUpgrading**: database storage upgrades</p>
     * <p>*   **DatabaseProxyUpgrading**: minor version upgrades of the proxy</p>
     * <p>*   **all**: queries the details of the pending events of all preceding types.</p>
     * <br>
     * <p>> If the `Region` parameter is set to **all**, the `TaskType` parameter must be set to **all**.</p>
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
