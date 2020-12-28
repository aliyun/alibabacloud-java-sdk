// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteTLSCipherPolicyRequest extends TeaModel {
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

    public static DeleteTLSCipherPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTLSCipherPolicyRequest self = new DeleteTLSCipherPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTLSCipherPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteTLSCipherPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteTLSCipherPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteTLSCipherPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTLSCipherPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteTLSCipherPolicyRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public DeleteTLSCipherPolicyRequest setTLSCipherPolicyId(String TLSCipherPolicyId) {
        this.TLSCipherPolicyId = TLSCipherPolicyId;
        return this;
    }
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

}
