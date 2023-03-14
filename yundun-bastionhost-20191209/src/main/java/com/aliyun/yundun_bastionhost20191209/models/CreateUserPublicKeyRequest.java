// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateUserPublicKeyRequest extends TeaModel {
    /**
     * <p>The description of the public key. The description can be up to 500 characters in length.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the bastion host on which you want to create a public key for the user.</p>
     * <br>
     * <p>> You can call the [listinstances](~~204522~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The public key. Encode the value by using the Base64 algorithm.</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    /**
     * <p>The name of the public key.</p>
     */
    @NameInMap("PublicKeyName")
    public String publicKeyName;

    /**
     * <p>Specifies the region ID of the bastion host on which you want to create a public key for the user.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies the ID of the user for whom you want to create a public key.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CreateUserPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserPublicKeyRequest self = new CreateUserPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserPublicKeyRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateUserPublicKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserPublicKeyRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public CreateUserPublicKeyRequest setPublicKeyName(String publicKeyName) {
        this.publicKeyName = publicKeyName;
        return this;
    }
    public String getPublicKeyName() {
        return this.publicKeyName;
    }

    public CreateUserPublicKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateUserPublicKeyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
