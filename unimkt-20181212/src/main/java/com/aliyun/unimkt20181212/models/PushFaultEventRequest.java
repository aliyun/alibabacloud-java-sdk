// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class PushFaultEventRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("FaultComment")
    public String faultComment;

    @NameInMap("FaultType")
    public String faultType;

    @NameInMap("Time")
    public Long time;

    @NameInMap("Type")
    public Integer type;

    public static PushFaultEventRequest build(java.util.Map<String, ?> map) throws Exception {
        PushFaultEventRequest self = new PushFaultEventRequest();
        return TeaModel.build(map, self);
    }

    public PushFaultEventRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public PushFaultEventRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public PushFaultEventRequest setFaultComment(String faultComment) {
        this.faultComment = faultComment;
        return this;
    }
    public String getFaultComment() {
        return this.faultComment;
    }

    public PushFaultEventRequest setFaultType(String faultType) {
        this.faultType = faultType;
        return this;
    }
    public String getFaultType() {
        return this.faultType;
    }

    public PushFaultEventRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public PushFaultEventRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
