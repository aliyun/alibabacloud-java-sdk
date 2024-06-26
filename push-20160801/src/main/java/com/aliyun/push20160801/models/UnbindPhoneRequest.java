// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindPhoneRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eb5f741d83d04d34807d229999eefa52</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    public static UnbindPhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindPhoneRequest self = new UnbindPhoneRequest();
        return TeaModel.build(map, self);
    }

    public UnbindPhoneRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public UnbindPhoneRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
