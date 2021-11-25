// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetScanSubDevicesRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static GetScanSubDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScanSubDevicesRequest self = new GetScanSubDevicesRequest();
        return TeaModel.build(map, self);
    }

    public GetScanSubDevicesRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetScanSubDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
