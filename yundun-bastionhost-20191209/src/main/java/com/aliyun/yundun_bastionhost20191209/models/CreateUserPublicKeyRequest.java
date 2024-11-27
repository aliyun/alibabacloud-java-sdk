// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateUserPublicKeyRequest extends TeaModel {
    /**
     * <p>The description of the public key. The description can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the bastion host on which you want to create a public key for the user.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/204522.html">listinstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The public key. Encode the value by using the Base64 algorithm.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c3NoLWVkMjU1MTkgQUFBQUMzTnphQzFsWkRJMU5URTVBQUFBSUxGQnQxUUpyT3IxK2hTTGRkbERMZUx4WGRIZ3hBalBxWHJIbWNFNWxqSk8gbm93Y29kZXJAbm93Y29kZXJkZU1hY0Jvb2stUHJvLmxvY2Fs</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    /**
     * <p>The name of the public key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Public key of a user</p>
     */
    @NameInMap("PublicKeyName")
    public String publicKeyName;

    /**
     * <p>Specifies the region ID of the bastion host on which you want to create a public key for the user.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user for whom you want to create a public key.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/204522.html">ListUsers</a> operation to query the user ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
