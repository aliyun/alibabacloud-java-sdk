// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckDeviceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23419851</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ae296f3b04a58a05b30c95f****</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    public static CheckDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDeviceRequest self = new CheckDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CheckDeviceRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public CheckDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
