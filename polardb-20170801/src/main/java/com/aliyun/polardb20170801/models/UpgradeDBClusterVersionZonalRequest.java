// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeDBClusterVersionZonalRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-a************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FromTimeService")
    public Boolean fromTimeService;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <strong>example:</strong>
     * <p>2022-04-28T14:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>20230707</p>
     */
    @NameInMap("TargetDBRevisionVersionCode")
    public String targetDBRevisionVersionCode;

    /**
     * <strong>example:</strong>
     * <p>20240702</p>
     */
    @NameInMap("TargetProxyRevisionVersionCode")
    public String targetProxyRevisionVersionCode;

    /**
     * <strong>example:</strong>
     * <p>INNOVATE</p>
     */
    @NameInMap("UpgradeLabel")
    public String upgradeLabel;

    /**
     * <strong>example:</strong>
     * <p>HOT</p>
     */
    @NameInMap("UpgradePolicy")
    public String upgradePolicy;

    /**
     * <strong>example:</strong>
     * <p>PROXY</p>
     */
    @NameInMap("UpgradeType")
    public String upgradeType;

    public static UpgradeDBClusterVersionZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBClusterVersionZonalRequest self = new UpgradeDBClusterVersionZonalRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBClusterVersionZonalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpgradeDBClusterVersionZonalRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpgradeDBClusterVersionZonalRequest setFromTimeService(Boolean fromTimeService) {
        this.fromTimeService = fromTimeService;
        return this;
    }
    public Boolean getFromTimeService() {
        return this.fromTimeService;
    }

    public UpgradeDBClusterVersionZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpgradeDBClusterVersionZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeDBClusterVersionZonalRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public UpgradeDBClusterVersionZonalRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public UpgradeDBClusterVersionZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeDBClusterVersionZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBClusterVersionZonalRequest setTargetDBRevisionVersionCode(String targetDBRevisionVersionCode) {
        this.targetDBRevisionVersionCode = targetDBRevisionVersionCode;
        return this;
    }
    public String getTargetDBRevisionVersionCode() {
        return this.targetDBRevisionVersionCode;
    }

    public UpgradeDBClusterVersionZonalRequest setTargetProxyRevisionVersionCode(String targetProxyRevisionVersionCode) {
        this.targetProxyRevisionVersionCode = targetProxyRevisionVersionCode;
        return this;
    }
    public String getTargetProxyRevisionVersionCode() {
        return this.targetProxyRevisionVersionCode;
    }

    public UpgradeDBClusterVersionZonalRequest setUpgradeLabel(String upgradeLabel) {
        this.upgradeLabel = upgradeLabel;
        return this;
    }
    public String getUpgradeLabel() {
        return this.upgradeLabel;
    }

    public UpgradeDBClusterVersionZonalRequest setUpgradePolicy(String upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }
    public String getUpgradePolicy() {
        return this.upgradePolicy;
    }

    public UpgradeDBClusterVersionZonalRequest setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public String getUpgradeType() {
        return this.upgradeType;
    }

}
