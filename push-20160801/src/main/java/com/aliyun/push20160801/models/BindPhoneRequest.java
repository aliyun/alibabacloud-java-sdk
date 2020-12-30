// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindPhoneRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static BindPhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        BindPhoneRequest self = new BindPhoneRequest();
        return TeaModel.build(map, self);
    }

    public BindPhoneRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public BindPhoneRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BindPhoneRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
