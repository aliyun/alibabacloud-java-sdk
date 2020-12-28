// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetTLSCipherPolicyAttributeRequest extends TeaModel {
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

    @NameInMap("TLSCipherPolicyId")
    public String TLSCipherPolicyId;

    @NameInMap("Name")
    public String name;

    @NameInMap("TLSVersions")
    public java.util.List<String> TLSVersions;

    @NameInMap("Ciphers")
    public java.util.List<String> ciphers;

    public static SetTLSCipherPolicyAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTLSCipherPolicyAttributeRequest self = new SetTLSCipherPolicyAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetTLSCipherPolicyAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetTLSCipherPolicyAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetTLSCipherPolicyAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetTLSCipherPolicyAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetTLSCipherPolicyAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetTLSCipherPolicyAttributeRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public SetTLSCipherPolicyAttributeRequest setTLSCipherPolicyId(String TLSCipherPolicyId) {
        this.TLSCipherPolicyId = TLSCipherPolicyId;
        return this;
    }
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

    public SetTLSCipherPolicyAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SetTLSCipherPolicyAttributeRequest setTLSVersions(java.util.List<String> TLSVersions) {
        this.TLSVersions = TLSVersions;
        return this;
    }
    public java.util.List<String> getTLSVersions() {
        return this.TLSVersions;
    }

    public SetTLSCipherPolicyAttributeRequest setCiphers(java.util.List<String> ciphers) {
        this.ciphers = ciphers;
        return this;
    }
    public java.util.List<String> getCiphers() {
        return this.ciphers;
    }

}
