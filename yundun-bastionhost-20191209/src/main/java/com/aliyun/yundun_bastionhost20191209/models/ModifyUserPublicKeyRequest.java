// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyUserPublicKeyRequest extends TeaModel {
    /**
     * <p>The new description of the user group. The description can be up to 500 characters in length.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the bastion host that is used to modify the public key of the user.</p>
     * <br>
     * <p>> You can call the [describeinstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new public key.</p>
     * <br>
     * <p>> The public key must be encoded in Base64.</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    /**
     * <p>The ID of the public key that you want to modify.</p>
     */
    @NameInMap("PublicKeyId")
    public String publicKeyId;

    /**
     * <p>The name of the public key that you want to modify. This name can be up to 128 characters in length.</p>
     */
    @NameInMap("PublicKeyName")
    public String publicKeyName;

    /**
     * <p>The region ID of the bastion host that is used to modify the public key of the user.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyUserPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPublicKeyRequest self = new ModifyUserPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserPublicKeyRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyUserPublicKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserPublicKeyRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public ModifyUserPublicKeyRequest setPublicKeyId(String publicKeyId) {
        this.publicKeyId = publicKeyId;
        return this;
    }
    public String getPublicKeyId() {
        return this.publicKeyId;
    }

    public ModifyUserPublicKeyRequest setPublicKeyName(String publicKeyName) {
        this.publicKeyName = publicKeyName;
        return this;
    }
    public String getPublicKeyName() {
        return this.publicKeyName;
    }

    public ModifyUserPublicKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
