// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindAliasRequest extends TeaModel {
    /**
     * <p>The alias to detach.</p>
     * <p>An alias supports up to 128 bytes (one Chinese character counts as 3 bytes). This field is required when UnbindAll is false. You can detach up to 10 aliases at once. Separate multiple aliases with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>test_alias</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The AppKey.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The unique device identifier for push notifications. It is 32 characters long and consists of digits and lowercase letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e2ba19de97604f55b16557673****</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Whether to detach all aliases. Default is false.</p>
     * <p>If true, detaches all aliases currently bound to the device. If false, detaches only the aliases specified in AliasName.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
