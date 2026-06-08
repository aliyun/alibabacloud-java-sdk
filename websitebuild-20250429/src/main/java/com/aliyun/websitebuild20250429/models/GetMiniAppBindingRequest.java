// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetMiniAppBindingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>WECHAT</p>
     */
    @NameInMap("Channel")
    public String channel;

    @NameInMap("SettingKeys")
    public java.util.List<String> settingKeys;

    public static GetMiniAppBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiniAppBindingRequest self = new GetMiniAppBindingRequest();
        return TeaModel.build(map, self);
    }

    public GetMiniAppBindingRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetMiniAppBindingRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetMiniAppBindingRequest setSettingKeys(java.util.List<String> settingKeys) {
        this.settingKeys = settingKeys;
        return this;
    }
    public java.util.List<String> getSettingKeys() {
        return this.settingKeys;
    }

}
