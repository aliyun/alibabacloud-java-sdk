// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostShareKeyRequest extends TeaModel {
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
