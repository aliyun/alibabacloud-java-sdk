// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostShareKeyRequest extends TeaModel {
    /**
     * <p>The ID of the shared key whose information you want to modify.</p>
     */
    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    /**
     * <p>The name of the shared key.</p>
     */
    @NameInMap("HostShareKeyName")
    public String hostShareKeyName;

    /**
     * <p>The ID of the bastion host. You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The passphrase of the private key. The value is a Base64-encoded string.</p>
     */
    @NameInMap("PassPhrase")
    public String passPhrase;

    /**
     * <p>The private key. The value is a Base64-encoded string.</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The region ID of the bastion host. For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHostShareKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostShareKeyRequest self = new ModifyHostShareKeyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostShareKeyRequest setHostShareKeyId(String hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public ModifyHostShareKeyRequest setHostShareKeyName(String hostShareKeyName) {
        this.hostShareKeyName = hostShareKeyName;
        return this;
    }
    public String getHostShareKeyName() {
        return this.hostShareKeyName;
    }

    public ModifyHostShareKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostShareKeyRequest setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }
    public String getPassPhrase() {
        return this.passPhrase;
    }

    public ModifyHostShareKeyRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public ModifyHostShareKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
