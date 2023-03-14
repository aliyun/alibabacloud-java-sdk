// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostShareKeyRequest extends TeaModel {
    /**
     * <p>The name of the shared key that you want to create. The name can be a maximum of 128 characters in length.</p>
     */
    @NameInMap("HostShareKeyName")
    public String hostShareKeyName;

    /**
     * <p>The ID of the bastion host. You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The password of the private key. The value is a Base64-encoded string.</p>
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

    public static CreateHostShareKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHostShareKeyRequest self = new CreateHostShareKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateHostShareKeyRequest setHostShareKeyName(String hostShareKeyName) {
        this.hostShareKeyName = hostShareKeyName;
        return this;
    }
    public String getHostShareKeyName() {
        return this.hostShareKeyName;
    }

    public CreateHostShareKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateHostShareKeyRequest setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }
    public String getPassPhrase() {
        return this.passPhrase;
    }

    public CreateHostShareKeyRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public CreateHostShareKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
