// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetDomainExtensionAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("access_key_id")
    public String accessKeyId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("DomainExtensionId")
    public String domainExtensionId;

    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    @NameInMap("CertificateId")
    public java.util.List<String> certificateId;

    @NameInMap("ServerCertificate")
    public java.util.List<SetDomainExtensionAttributeRequestServerCertificate> serverCertificate;

    public static SetDomainExtensionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainExtensionAttributeRequest self = new SetDomainExtensionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainExtensionAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public SetDomainExtensionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetDomainExtensionAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetDomainExtensionAttributeRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public SetDomainExtensionAttributeRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public SetDomainExtensionAttributeRequest setDomainExtensionId(String domainExtensionId) {
        this.domainExtensionId = domainExtensionId;
        return this;
    }
    public String getDomainExtensionId() {
        return this.domainExtensionId;
    }

    public SetDomainExtensionAttributeRequest setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public SetDomainExtensionAttributeRequest setCertificateId(java.util.List<String> certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public java.util.List<String> getCertificateId() {
        return this.certificateId;
    }

    public SetDomainExtensionAttributeRequest setServerCertificate(java.util.List<SetDomainExtensionAttributeRequestServerCertificate> serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }
    public java.util.List<SetDomainExtensionAttributeRequestServerCertificate> getServerCertificate() {
        return this.serverCertificate;
    }

    public static class SetDomainExtensionAttributeRequestServerCertificate extends TeaModel {
        public static SetDomainExtensionAttributeRequestServerCertificate build(java.util.Map<String, ?> map) throws Exception {
            SetDomainExtensionAttributeRequestServerCertificate self = new SetDomainExtensionAttributeRequestServerCertificate();
            return TeaModel.build(map, self);
        }

    }

}
