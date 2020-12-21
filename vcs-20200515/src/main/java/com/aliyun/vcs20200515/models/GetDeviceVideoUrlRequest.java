// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceVideoUrlRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("OutProtocol")
    public String outProtocol;

    public static GetDeviceVideoUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceVideoUrlRequest self = new GetDeviceVideoUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceVideoUrlRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetDeviceVideoUrlRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public GetDeviceVideoUrlRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetDeviceVideoUrlRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDeviceVideoUrlRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceVideoUrlRequest setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

}
