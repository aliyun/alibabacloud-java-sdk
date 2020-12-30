// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckDevicesRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("DeviceIds")
    public String deviceIds;

    public static CheckDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDevicesRequest self = new CheckDevicesRequest();
        return TeaModel.build(map, self);
    }

    public CheckDevicesRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public CheckDevicesRequest setDeviceIds(String deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public String getDeviceIds() {
        return this.deviceIds;
    }

}
