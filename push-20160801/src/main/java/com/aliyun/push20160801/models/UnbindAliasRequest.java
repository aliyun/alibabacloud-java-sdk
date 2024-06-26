// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindAliasRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test_alias</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

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
     * <p>e2ba19de97604f55b16557673****</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UnbindAll")
    public Boolean unbindAll;

    public static UnbindAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAliasRequest self = new UnbindAliasRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
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

    public UnbindAliasRequest setUnbindAll(Boolean unbindAll) {
        this.unbindAll = unbindAll;
        return this;
    }
    public Boolean getUnbindAll() {
        return this.unbindAll;
    }

}
