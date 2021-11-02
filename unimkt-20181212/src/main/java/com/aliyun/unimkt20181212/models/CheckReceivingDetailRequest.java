// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckReceivingDetailRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("DeviceCode")
    public String deviceCode;

    @NameInMap("V")
    public String v;

    public static CheckReceivingDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckReceivingDetailRequest self = new CheckReceivingDetailRequest();
        return TeaModel.build(map, self);
    }

    public CheckReceivingDetailRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CheckReceivingDetailRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public CheckReceivingDetailRequest setV(String v) {
        this.v = v;
        return this;
    }
    public String getV() {
        return this.v;
    }

}
