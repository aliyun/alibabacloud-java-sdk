// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantInstanceToCbnRequest extends TeaModel {
    @NameInMap("CcnInstanceId")
    public String ccnInstanceId;

    @NameInMap("CenInstanceId")
    public String cenInstanceId;

    @NameInMap("CenUid")
    public Long cenUid;

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

    public static GrantInstanceToCbnRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToCbnRequest self = new GrantInstanceToCbnRequest();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToCbnRequest setCcnInstanceId(String ccnInstanceId) {
        this.ccnInstanceId = ccnInstanceId;
        return this;
    }
    public String getCcnInstanceId() {
        return this.ccnInstanceId;
    }

    public GrantInstanceToCbnRequest setCenInstanceId(String cenInstanceId) {
        this.cenInstanceId = cenInstanceId;
        return this;
    }
    public String getCenInstanceId() {
        return this.cenInstanceId;
    }

    public GrantInstanceToCbnRequest setCenUid(Long cenUid) {
        this.cenUid = cenUid;
        return this;
    }
    public Long getCenUid() {
        return this.cenUid;
    }

    public GrantInstanceToCbnRequest setGrantTrafficService(Boolean grantTrafficService) {
        this.grantTrafficService = grantTrafficService;
        return this;
    }
    public Boolean getGrantTrafficService() {
        return this.grantTrafficService;
    }

    public GrantInstanceToCbnRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GrantInstanceToCbnRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GrantInstanceToCbnRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantInstanceToCbnRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GrantInstanceToCbnRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
