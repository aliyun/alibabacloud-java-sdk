// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>The cluster ID. If you need to specify multiple cluster IDs, separate the cluster IDs with commas (,).</p>
     */
    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    /**
     * <p>The automatic renewal period.</p>
     * <br>
     * <p> </p>
     * <p>*   Valid values when **PeriodUnit** is set to **Month**: `1, 2, 3, 6, and 12`.</p>
     * <p>*   Valid values when **PeriodUnit** is set to **Year**: `1, 2, and 3`.</p>
     * <p> </p>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("Duration")
    public String duration;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The unit of the renewal period. Valid values:</p>
     * <p> </p>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     * <p> </p>
     * <p>Default value: **Month**.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the region. The region ID can be up to 50 characters in length.</p>
     * <p>cn-hangzhou</p>
     * <p> </p>
     * <p>>  You can call the [DescribeRegions](~~98041~~) operation to query the available regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The auto-renewal state of the cluster. Valid values:</p>
     * <p> </p>
     * <p>*   **AutoRenewal:** The cluster are automatically renewed.</p>
     * <p>*   **Normal**: The cluster is manually renewed.</p>
     * <p>*   **NotRenewal:** The cluster is not renewed after expiration.</p>
     * <p> </p>
     * <p>Default value: **AutoRenewal**.</p>
     * <p> </p>
     * <p>>  If this parameter is set to **NotRenewal**, the system does not send a text message for the cluster expiration, but only sends a message three days before the cluster expires to remind you that the cluster is not renewed.</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewAttributeRequest self = new ModifyAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewAttributeRequest setDBClusterIds(String DBClusterIds) {
        this.DBClusterIds = DBClusterIds;
        return this;
    }
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    public ModifyAutoRenewAttributeRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public ModifyAutoRenewAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAutoRenewAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAutoRenewAttributeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAutoRenewAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public ModifyAutoRenewAttributeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyAutoRenewAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAutoRenewAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
