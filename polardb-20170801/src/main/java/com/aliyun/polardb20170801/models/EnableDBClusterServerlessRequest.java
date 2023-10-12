// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableDBClusterServerlessRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScaleApRoNumMax")
    public String scaleApRoNumMax;

    @NameInMap("ScaleApRoNumMin")
    public String scaleApRoNumMin;

    @NameInMap("ScaleMax")
    public String scaleMax;

    @NameInMap("ScaleMin")
    public String scaleMin;

    @NameInMap("ScaleRoNumMax")
    public String scaleRoNumMax;

    @NameInMap("ScaleRoNumMin")
    public String scaleRoNumMin;

    public static EnableDBClusterServerlessRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDBClusterServerlessRequest self = new EnableDBClusterServerlessRequest();
        return TeaModel.build(map, self);
    }

    public EnableDBClusterServerlessRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public EnableDBClusterServerlessRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableDBClusterServerlessRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableDBClusterServerlessRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnableDBClusterServerlessRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EnableDBClusterServerlessRequest setScaleApRoNumMax(String scaleApRoNumMax) {
        this.scaleApRoNumMax = scaleApRoNumMax;
        return this;
    }
    public String getScaleApRoNumMax() {
        return this.scaleApRoNumMax;
    }

    public EnableDBClusterServerlessRequest setScaleApRoNumMin(String scaleApRoNumMin) {
        this.scaleApRoNumMin = scaleApRoNumMin;
        return this;
    }
    public String getScaleApRoNumMin() {
        return this.scaleApRoNumMin;
    }

    public EnableDBClusterServerlessRequest setScaleMax(String scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public String getScaleMax() {
        return this.scaleMax;
    }

    public EnableDBClusterServerlessRequest setScaleMin(String scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public String getScaleMin() {
        return this.scaleMin;
    }

    public EnableDBClusterServerlessRequest setScaleRoNumMax(String scaleRoNumMax) {
        this.scaleRoNumMax = scaleRoNumMax;
        return this;
    }
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    public EnableDBClusterServerlessRequest setScaleRoNumMin(String scaleRoNumMin) {
        this.scaleRoNumMin = scaleRoNumMin;
        return this;
    }
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

}
