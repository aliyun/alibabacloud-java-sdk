// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindAliasRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("UnbindAll")
    public Boolean unbindAll;

    public static UnbindAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAliasRequest self = new UnbindAliasRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAliasRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public UnbindAliasRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UnbindAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UnbindAliasRequest setUnbindAll(Boolean unbindAll) {
        this.unbindAll = unbindAll;
        return this;
    }
    public Boolean getUnbindAll() {
        return this.unbindAll;
    }

}
