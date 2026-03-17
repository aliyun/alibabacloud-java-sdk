// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpgradeSmartAccessGatewaySoftwareRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-payment for the instance.</p>
     * <ul>
     * <li><strong>false</strong>: no</li>
     * <li><strong>true</strong>: yes</li>
     * </ul>
     * <blockquote>
     * <p> If the parameter is set to false, you must complete the payment in the SAG console after you call this operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The data transfer plan for each client account. Unit: GB.</p>
     * <blockquote>
     * <p> Each client account has a data transfer plan of 5 GB that is free of charge each month.</p>
     * </blockquote>
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
     * <p>The ID of the region where the SAG app instance is created.</p>
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
     * <p>sag-8biez7habqwmx6****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The maximum number of client accounts supported by the SAG app instance.</p>
     * <p>After you complete the payment, you can create a client account for each employee who needs to use the SAG app.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UserCount")
    public Integer userCount;

    public static UpgradeSmartAccessGatewaySoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSmartAccessGatewaySoftwareRequest self = new UpgradeSmartAccessGatewaySoftwareRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setDataPlan(Long dataPlan) {
        this.dataPlan = dataPlan;
        return this;
    }
    public Long getDataPlan() {
        return this.dataPlan;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

}
