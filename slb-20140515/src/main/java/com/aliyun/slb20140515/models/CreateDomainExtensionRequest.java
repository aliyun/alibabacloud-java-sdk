// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateDomainExtensionRequest extends TeaModel {
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

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    @NameInMap("CertificateId")
    public java.util.List<String> certificateId;

    @NameInMap("ServerCertificate")
    public java.util.List<CreateDomainExtensionRequestServerCertificate> serverCertificate;

    public static CreateDomainExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainExtensionRequest self = new CreateDomainExtensionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainExtensionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDomainExtensionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDomainExtensionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDomainExtensionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDomainExtensionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDomainExtensionRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public CreateDomainExtensionRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateDomainExtensionRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateDomainExtensionRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateDomainExtensionRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainExtensionRequest setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public CreateDomainExtensionRequest setCertificateId(java.util.List<String> certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public java.util.List<String> getCertificateId() {
        return this.certificateId;
    }

    public CreateDomainExtensionRequest setServerCertificate(java.util.List<CreateDomainExtensionRequestServerCertificate> serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }
    public java.util.List<CreateDomainExtensionRequestServerCertificate> getServerCertificate() {
        return this.serverCertificate;
    }

    public static class CreateDomainExtensionRequestServerCertificate extends TeaModel {
        public static CreateDomainExtensionRequestServerCertificate build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainExtensionRequestServerCertificate self = new CreateDomainExtensionRequestServerCertificate();
            return TeaModel.build(map, self);
        }

    }

}
