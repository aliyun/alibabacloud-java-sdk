// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteUserPublicKeyRequest extends TeaModel {
    /**
     * <p>The ID of the Bastionhost instance to which the users to be queried belong.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the public key.</p>
     */
    @NameInMap("PublicKeyId")
    public String publicKeyId;

    /**
     * <p>The region ID of the bastion host. For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteUserPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPublicKeyRequest self = new DeleteUserPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserPublicKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteUserPublicKeyRequest setPublicKeyId(String publicKeyId) {
        this.publicKeyId = publicKeyId;
        return this;
    }
    public String getPublicKeyId() {
        return this.publicKeyId;
    }

    public DeleteUserPublicKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
