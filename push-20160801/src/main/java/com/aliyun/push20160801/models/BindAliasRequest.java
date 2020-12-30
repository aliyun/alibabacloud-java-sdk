// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindAliasRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("AliasName")
    public String aliasName;

    public static BindAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAliasRequest self = new BindAliasRequest();
        return TeaModel.build(map, self);
    }

    public BindAliasRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public BindAliasRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BindAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

}
