// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DowngradeSmartAccessGatewaySoftwareRequest extends TeaModel {
    /**
     * <p>Specify whether the bill belongs to a subscription instance that has auto renewal enabled. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): no</li>
     * <li><strong>true</strong>: yes</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The amount of free data transfer allocated to each client account per month, which is 5 GB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DataPlan")
    public Long dataPlan;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the SAG app instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the SAG app instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-n2uym2h45lnd31****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The quota of client accounts that can be connected to an SAG app instance. Typically, you need to create an account for each user that needs to log on to the SAG app.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UserCount")
    public Integer userCount;

    public static DowngradeSmartAccessGatewaySoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        DowngradeSmartAccessGatewaySoftwareRequest self = new DowngradeSmartAccessGatewaySoftwareRequest();
        return TeaModel.build(map, self);
    }

    public DowngradeSmartAccessGatewaySoftwareRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public DowngradeSmartAccessGatewaySoftwareRequest setDataPlan(Long dataPlan) {
        this.dataPlan = dataPlan;
        return this;
    }
    public Long getDataPlan() {
        return this.dataPlan;
    }

    public DowngradeSmartAccessGatewaySoftwareRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DowngradeSmartAccessGatewaySoftwareRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DowngradeSmartAccessGatewaySoftwareRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DowngradeSmartAccessGatewaySoftwareRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DowngradeSmartAccessGatewaySoftwareRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DowngradeSmartAccessGatewaySoftwareRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DowngradeSmartAccessGatewaySoftwareRequest setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

}
