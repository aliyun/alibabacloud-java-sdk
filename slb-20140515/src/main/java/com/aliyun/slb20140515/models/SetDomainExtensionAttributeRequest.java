// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetDomainExtensionAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DomainExtensionId")
    public String domainExtensionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the new certificate.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>>  You cannot replace an additional certificate for a listener that is added to a shared-resource Server Load Balancer (SLB) instance.</p>
     */
    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    public static SetDomainExtensionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainExtensionAttributeRequest self = new SetDomainExtensionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainExtensionAttributeRequest setDomainExtensionId(String domainExtensionId) {
        this.domainExtensionId = domainExtensionId;
        return this;
    }
    public String getDomainExtensionId() {
        return this.domainExtensionId;
    }

    public SetDomainExtensionAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetDomainExtensionAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDomainExtensionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetDomainExtensionAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetDomainExtensionAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetDomainExtensionAttributeRequest setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

}
