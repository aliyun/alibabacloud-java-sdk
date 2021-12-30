// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostShareKeyRequest extends TeaModel {
    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    @NameInMap("HostShareKeyName")
    public String hostShareKeyName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PassPhrase")
    public String passPhrase;

    @NameInMap("PrivateKey")
    public String privateKey;

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
