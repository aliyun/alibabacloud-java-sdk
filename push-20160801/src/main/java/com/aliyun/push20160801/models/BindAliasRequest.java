// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindAliasRequest extends TeaModel {
    /**
     * <p>The alias to attach.</p>
     * <p>You can attach up to 10 aliases in one request. Separate multiple aliases with commas. Each alias can be up to 128 bytes long. Chinese characters count as three bytes each. A device can have up to 128 aliases attached. An alias can be attached to up to 128 devices.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_alias</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>Your AppKey.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The unique identifier of the device in Mobile Push. It is 32 characters long and contains only numbers and lowercase letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e2ba19de97604f55b16557673****</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    public static BindAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAliasRequest self = new BindAliasRequest();
        return TeaModel.build(map, self);
    }

    public BindAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
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

}
