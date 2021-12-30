// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostAccountRequest extends TeaModel {
    @NameInMap("HostAccountId")
    public String hostAccountId;

    @NameInMap("HostAccountName")
    public String hostAccountName;

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

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHostAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostAccountRequest self = new ModifyHostAccountRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostAccountRequest setHostAccountId(String hostAccountId) {
        this.hostAccountId = hostAccountId;
        return this;
    }
    public String getHostAccountId() {
        return this.hostAccountId;
    }

    public ModifyHostAccountRequest setHostAccountName(String hostAccountName) {
        this.hostAccountName = hostAccountName;
        return this;
    }
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    public ModifyHostAccountRequest setHostShareKeyId(String hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public ModifyHostAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostAccountRequest setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }
    public String getPassPhrase() {
        return this.passPhrase;
    }

    public ModifyHostAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyHostAccountRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public ModifyHostAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
