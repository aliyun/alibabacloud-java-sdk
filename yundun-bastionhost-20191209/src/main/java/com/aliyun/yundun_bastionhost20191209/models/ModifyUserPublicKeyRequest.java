// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyUserPublicKeyRequest extends TeaModel {
    /**
     * <p>The new description of the user group. The description can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the bastion host on which you want to modify the public key of a user.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-nif236pmc1u</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new public key.</p>
     * <blockquote>
     * <p> Specify a Base64-encoded string.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c3NoLWVkMjU1MTkgQUFBQUMzTnphQzFsWkRJMU5URTVBQUFBSUhVcjY4UENFYWFzZjFYRVpNYTVsMlNBQytHV3FpeXVsRVpndkV4dmlPM28gcm9vdEA5NjBkMmNhOTcwYjU=</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    /**
     * <p>The ID of the public key that you want to modify.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/477555.html">ListUserPublicKeys</a> operation to query the public key ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PublicKeyId")
    public String publicKeyId;

    /**
     * <p>The name of the public key that you want to modify. This name can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("PublicKeyName")
    public String publicKeyName;

    /**
     * <p>The region ID of the bastion host that is used to modify the public key of the user.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
