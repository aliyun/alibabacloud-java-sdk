// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceLiveUrlRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("StreamType")
    public String streamType;

    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("GbId")
    public String gbId;

    public static GetDeviceLiveUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceLiveUrlRequest self = new GetDeviceLiveUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceLiveUrlRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetDeviceLiveUrlRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceLiveUrlRequest setStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }
    public String getStreamType() {
        return this.streamType;
    }

    public GetDeviceLiveUrlRequest setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public GetDeviceLiveUrlRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

}
