// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>The cloud service provider to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ENS</p>
     */
    @NameInMap("CloudProvider")
    public String cloudProvider;

    /**
     * <p>The IDs of the database clusters. The billing method of the clusters must be subscription. If you call this operation for a pay-as-you-go cluster, the OperationDenied.DBClusterPayType error may be returned. You can first call the TransformDBClusterPayType operation to change the billing method. Usage notes: The billing method of the cluster must be subscription. Calling this operation for a pay-as-you-go cluster returns the OperationDenied.DBClusterPayType error.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***************</p>
     */
    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    /**
     * <p>The auto-renewal duration for the instance. Valid values: </p>
     * <ul>
     * <li>If <strong>PeriodUnit</strong> is set to <strong>Month</strong>, valid values are <code>1</code>, <code>2</code>, <code>3</code>, <code>6</code>, and <code>12</code>.</li>
     * <li>If <strong>PeriodUnit</strong> is set to <strong>Year</strong>, valid values are <code>1</code>, <code>2</code>, and <code>3</code>.</li>
     * </ul>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public String duration;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The unit of the renewal duration. Valid values: </p>
     * <ul>
     * <li><strong>Year</strong>: Year.</li>
     * <li><strong>Month</strong>: Month.</li>
     * </ul>
     * <p>Default value: <strong>Month</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID. The value can be up to 50 characters in length.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2319134.html">DescribeRegions</a> operation to query available regions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The auto-renewal status. Valid values: </p>
     * <ul>
     * <li><strong>AutoRenewal</strong>: Auto-renewal.</li>
     * <li><strong>Normal</strong>: Manual renewal. </li>
     * <li><strong>NotRenewal</strong>: No renewal.</li>
     * </ul>
     * <p>Default value: <strong>AutoRenewal</strong>. </p>
     * <blockquote>
     * <p>If you set this parameter to <strong>NotRenewal</strong>, the system no longer sends expiration reminders and only sends a non-renewal reminder three days before expiration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AutoRenewal</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

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

    public static ModifyAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewAttributeRequest self = new ModifyAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewAttributeRequest setCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
        return this;
    }
    public String getCloudProvider() {
        return this.cloudProvider;
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
