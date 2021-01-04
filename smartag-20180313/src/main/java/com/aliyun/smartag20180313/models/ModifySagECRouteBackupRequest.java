// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagECRouteBackupRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("HcIp")
    public String hcIp;

    @NameInMap("ExpressConnectionInterface")
    public String expressConnectionInterface;

    @NameInMap("ExpressConnectionNexthop")
    public String expressConnectionNexthop;

    @NameInMap("RouteBackup")
    public Boolean routeBackup;

    public static ModifySagECRouteBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagECRouteBackupRequest self = new ModifySagECRouteBackupRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagECRouteBackupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagECRouteBackupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagECRouteBackupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagECRouteBackupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagECRouteBackupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagECRouteBackupRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagECRouteBackupRequest setHcIp(String hcIp) {
        this.hcIp = hcIp;
        return this;
    }
    public String getHcIp() {
        return this.hcIp;
    }

    public ModifySagECRouteBackupRequest setExpressConnectionInterface(String expressConnectionInterface) {
        this.expressConnectionInterface = expressConnectionInterface;
        return this;
    }
    public String getExpressConnectionInterface() {
        return this.expressConnectionInterface;
    }

    public ModifySagECRouteBackupRequest setExpressConnectionNexthop(String expressConnectionNexthop) {
        this.expressConnectionNexthop = expressConnectionNexthop;
        return this;
    }
    public String getExpressConnectionNexthop() {
        return this.expressConnectionNexthop;
    }

    public ModifySagECRouteBackupRequest setRouteBackup(Boolean routeBackup) {
        this.routeBackup = routeBackup;
        return this;
    }
    public Boolean getRouteBackup() {
        return this.routeBackup;
    }

}
