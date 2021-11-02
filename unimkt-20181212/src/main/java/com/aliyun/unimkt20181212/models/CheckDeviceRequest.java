// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckDeviceRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("DeviceSn")
    public String deviceSn;

    public static CheckDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDeviceRequest self = new CheckDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CheckDeviceRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CheckDeviceRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

}
