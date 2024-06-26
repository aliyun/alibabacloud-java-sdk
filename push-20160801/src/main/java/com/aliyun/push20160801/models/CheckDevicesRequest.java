// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckDevicesRequest extends TeaModel {
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
     * <p>ae296f3b04a58a05b30c95f****,ae296f3b04a58a05b30c95f****,ae296f3b04a58a05b30c95f****</p>
     */
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
