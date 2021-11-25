// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnbindDevicesRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("SubDeviceIdList")
    public String subDeviceIdList;

    public static UnbindDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDevicesRequest self = new UnbindDevicesRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDevicesRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UnbindDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UnbindDevicesRequest setSubDeviceIdList(String subDeviceIdList) {
        this.subDeviceIdList = subDeviceIdList;
        return this;
    }
    public String getSubDeviceIdList() {
        return this.subDeviceIdList;
    }

}
