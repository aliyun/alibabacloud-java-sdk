// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantSagInstanceToCcnRequest extends TeaModel {
    @NameInMap("CcnInstanceId")
    public String ccnInstanceId;

    @NameInMap("CcnUid")
    public Long ccnUid;

    @NameInMap("GrantTrafficService")
    public Boolean grantTrafficService;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    public static GrantSagInstanceToCcnRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantSagInstanceToCcnRequest self = new GrantSagInstanceToCcnRequest();
        return TeaModel.build(map, self);
    }

    public GrantSagInstanceToCcnRequest setCcnInstanceId(String ccnInstanceId) {
        this.ccnInstanceId = ccnInstanceId;
        return this;
    }
    public String getCcnInstanceId() {
        return this.ccnInstanceId;
    }

    public GrantSagInstanceToCcnRequest setCcnUid(Long ccnUid) {
        this.ccnUid = ccnUid;
        return this;
    }
    public Long getCcnUid() {
        return this.ccnUid;
    }

    public GrantSagInstanceToCcnRequest setGrantTrafficService(Boolean grantTrafficService) {
        this.grantTrafficService = grantTrafficService;
        return this;
    }
    public Boolean getGrantTrafficService() {
        return this.grantTrafficService;
    }

    public GrantSagInstanceToCcnRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GrantSagInstanceToCcnRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GrantSagInstanceToCcnRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantSagInstanceToCcnRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GrantSagInstanceToCcnRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GrantSagInstanceToCcnRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
