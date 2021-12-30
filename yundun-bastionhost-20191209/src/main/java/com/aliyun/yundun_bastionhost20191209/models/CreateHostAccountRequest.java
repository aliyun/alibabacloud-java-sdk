// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostAccountRequest extends TeaModel {
    @NameInMap("HostAccountName")
    public String hostAccountName;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PassPhrase")
    public String passPhrase;

    @NameInMap("Password")
    public String password;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("ProtocolName")
    public String protocolName;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateHostAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAccountRequest self = new CreateHostAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateHostAccountRequest setHostAccountName(String hostAccountName) {
        this.hostAccountName = hostAccountName;
        return this;
    }
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    public CreateHostAccountRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public CreateHostAccountRequest setHostShareKeyId(String hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public CreateHostAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateHostAccountRequest setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }
    public String getPassPhrase() {
        return this.passPhrase;
    }

    public CreateHostAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateHostAccountRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public CreateHostAccountRequest setProtocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }
    public String getProtocolName() {
        return this.protocolName;
    }

    public CreateHostAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
