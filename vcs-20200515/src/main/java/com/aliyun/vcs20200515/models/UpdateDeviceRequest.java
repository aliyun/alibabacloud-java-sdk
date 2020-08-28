// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDeviceRequest extends TeaModel {
    @NameInMap("GbId")
    public String gbId;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("DeviceAddress")
    public String deviceAddress;

    @NameInMap("DeviceSite")
    public String deviceSite;

    @NameInMap("DeviceDirection")
    public String deviceDirection;

    @NameInMap("DeviceResolution")
    public String deviceResolution;

    @NameInMap("BitRate")
    public String bitRate;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Vendor")
    public String vendor;

    public static UpdateDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceRequest self = new UpdateDeviceRequest();
        return TeaModel.build(map, self);
    }

}
