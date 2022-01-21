// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindVbrRequest extends TeaModel {
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

    @NameInMap("SmartAGUid")
    public Long smartAGUid;

    @NameInMap("VbrId")
    public String vbrId;

    @NameInMap("VbrRegionId")
    public String vbrRegionId;

    public static UnbindVbrRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindVbrRequest self = new UnbindVbrRequest();
        return TeaModel.build(map, self);
    }

    public UnbindVbrRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnbindVbrRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindVbrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnbindVbrRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnbindVbrRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnbindVbrRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public UnbindVbrRequest setSmartAGUid(Long smartAGUid) {
        this.smartAGUid = smartAGUid;
        return this;
    }
    public Long getSmartAGUid() {
        return this.smartAGUid;
    }

    public UnbindVbrRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public UnbindVbrRequest setVbrRegionId(String vbrRegionId) {
        this.vbrRegionId = vbrRegionId;
        return this;
    }
    public String getVbrRegionId() {
        return this.vbrRegionId;
    }

}
