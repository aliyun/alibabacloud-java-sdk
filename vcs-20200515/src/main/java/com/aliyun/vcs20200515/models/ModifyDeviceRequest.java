// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ModifyDeviceRequest extends TeaModel {
    // 设备国标编码
    @NameInMap("GbId")
    public String gbId;

    // 设备名称
    @NameInMap("Name")
    public String name;

    // 设备安装地址
    @NameInMap("InstallAddress")
    public String installAddress;

    // 设备IP
    @NameInMap("Ip")
    public String ip;

    // 设备密码
    @NameInMap("Password")
    public String password;

    public static ModifyDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceRequest self = new ModifyDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public ModifyDeviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyDeviceRequest setInstallAddress(String installAddress) {
        this.installAddress = installAddress;
        return this;
    }
    public String getInstallAddress() {
        return this.installAddress;
    }

    public ModifyDeviceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ModifyDeviceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
