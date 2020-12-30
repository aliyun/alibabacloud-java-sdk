// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDeviceInfoRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("DeviceId")
    public String deviceId;

    public static QueryDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceInfoRequest self = new QueryDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceInfoRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryDeviceInfoRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
