// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class PushDeviceStatusRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("Status")
    public Integer status;

    public static PushDeviceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceStatusRequest self = new PushDeviceStatusRequest();
        return TeaModel.build(map, self);
    }

    public PushDeviceStatusRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public PushDeviceStatusRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public PushDeviceStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
