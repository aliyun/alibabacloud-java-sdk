// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRouteProtocolOspfRequest extends TeaModel {
    @NameInMap("AreaId")
    public Integer areaId;

    @NameInMap("AuthenticationType")
    public String authenticationType;

    @NameInMap("DeadTime")
    public Integer deadTime;

    @NameInMap("HelloTime")
    public Integer helloTime;

    @NameInMap("Md5Key")
    public String md5Key;

    @NameInMap("Md5KeyId")
    public Integer md5KeyId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RouterId")
    public String routerId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SmartAGSn")
    public String smartAGSn;

    public static ModifySagRouteProtocolOspfRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRouteProtocolOspfRequest self = new ModifySagRouteProtocolOspfRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagRouteProtocolOspfRequest setAreaId(Integer areaId) {
        this.areaId = areaId;
        return this;
    }
    public Integer getAreaId() {
        return this.areaId;
    }

    public ModifySagRouteProtocolOspfRequest setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public ModifySagRouteProtocolOspfRequest setDeadTime(Integer deadTime) {
        this.deadTime = deadTime;
        return this;
    }
    public Integer getDeadTime() {
        return this.deadTime;
    }

    public ModifySagRouteProtocolOspfRequest setHelloTime(Integer helloTime) {
        this.helloTime = helloTime;
        return this;
    }
    public Integer getHelloTime() {
        return this.helloTime;
    }

    public ModifySagRouteProtocolOspfRequest setMd5Key(String md5Key) {
        this.md5Key = md5Key;
        return this;
    }
    public String getMd5Key() {
        return this.md5Key;
    }

    public ModifySagRouteProtocolOspfRequest setMd5KeyId(Integer md5KeyId) {
        this.md5KeyId = md5KeyId;
        return this;
    }
    public Integer getMd5KeyId() {
        return this.md5KeyId;
    }

    public ModifySagRouteProtocolOspfRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagRouteProtocolOspfRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagRouteProtocolOspfRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifySagRouteProtocolOspfRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagRouteProtocolOspfRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagRouteProtocolOspfRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagRouteProtocolOspfRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public ModifySagRouteProtocolOspfRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagRouteProtocolOspfRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

}
