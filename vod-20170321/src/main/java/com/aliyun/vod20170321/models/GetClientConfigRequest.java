// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetClientConfigRequest extends TeaModel {
    @NameInMap("Brand")
    public String brand;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("OsName")
    public String osName;

    public static GetClientConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientConfigRequest self = new GetClientConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetClientConfigRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public GetClientConfigRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public GetClientConfigRequest setOsName(String osName) {
        this.osName = osName;
        return this;
    }
    public String getOsName() {
        return this.osName;
    }

}
