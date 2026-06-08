// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateMiniAppBindingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>WECHAT</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("SettingKey")
    public String settingKey;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("SettingValue")
    public String settingValue;

    public static UpdateMiniAppBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMiniAppBindingRequest self = new UpdateMiniAppBindingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMiniAppBindingRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateMiniAppBindingRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public UpdateMiniAppBindingRequest setSettingKey(String settingKey) {
        this.settingKey = settingKey;
        return this;
    }
    public String getSettingKey() {
        return this.settingKey;
    }

    public UpdateMiniAppBindingRequest setSettingValue(String settingValue) {
        this.settingValue = settingValue;
        return this;
    }
    public String getSettingValue() {
        return this.settingValue;
    }

}
