// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteDomainExtensionRequest extends TeaModel {
    /**
     * <p>The ID of the additional domain name that you want to delete.</p>
     */
    @NameInMap("DomainExtensionId")
    public String domainExtensionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Server Load Balancer (SLB) instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteDomainExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainExtensionRequest self = new DeleteDomainExtensionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainExtensionRequest setDomainExtensionId(String domainExtensionId) {
        this.domainExtensionId = domainExtensionId;
        return this;
    }
    public String getDomainExtensionId() {
        return this.domainExtensionId;
    }

    public DeleteDomainExtensionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteDomainExtensionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDomainExtensionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDomainExtensionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteDomainExtensionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
