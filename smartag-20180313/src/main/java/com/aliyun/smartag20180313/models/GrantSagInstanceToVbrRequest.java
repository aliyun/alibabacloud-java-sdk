// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantSagInstanceToVbrRequest extends TeaModel {
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

    @NameInMap("VbrInstanceId")
    public String vbrInstanceId;

    @NameInMap("VbrRegionId")
    public String vbrRegionId;

    @NameInMap("VbrUid")
    public Long vbrUid;

    public static GrantSagInstanceToVbrRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantSagInstanceToVbrRequest self = new GrantSagInstanceToVbrRequest();
        return TeaModel.build(map, self);
    }

    public GrantSagInstanceToVbrRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GrantSagInstanceToVbrRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GrantSagInstanceToVbrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantSagInstanceToVbrRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GrantSagInstanceToVbrRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GrantSagInstanceToVbrRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public GrantSagInstanceToVbrRequest setVbrInstanceId(String vbrInstanceId) {
        this.vbrInstanceId = vbrInstanceId;
        return this;
    }
    public String getVbrInstanceId() {
        return this.vbrInstanceId;
    }

    public GrantSagInstanceToVbrRequest setVbrRegionId(String vbrRegionId) {
        this.vbrRegionId = vbrRegionId;
        return this;
    }
    public String getVbrRegionId() {
        return this.vbrRegionId;
    }

    public GrantSagInstanceToVbrRequest setVbrUid(Long vbrUid) {
        this.vbrUid = vbrUid;
        return this;
    }
    public Long getVbrUid() {
        return this.vbrUid;
    }

}
