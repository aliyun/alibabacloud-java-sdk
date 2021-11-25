// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BindDevicesShrinkRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("SubDeviceList")
    public String subDeviceListShrink;

    public static BindDevicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDevicesShrinkRequest self = new BindDevicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BindDevicesShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public BindDevicesShrinkRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BindDevicesShrinkRequest setSubDeviceListShrink(String subDeviceListShrink) {
        this.subDeviceListShrink = subDeviceListShrink;
        return this;
    }
    public String getSubDeviceListShrink() {
        return this.subDeviceListShrink;
    }

}
