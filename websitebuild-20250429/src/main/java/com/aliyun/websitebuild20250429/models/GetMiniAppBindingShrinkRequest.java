// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetMiniAppBindingShrinkRequest extends TeaModel {
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
    public String settingKeysShrink;

    public static GetMiniAppBindingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiniAppBindingShrinkRequest self = new GetMiniAppBindingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMiniAppBindingShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetMiniAppBindingShrinkRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetMiniAppBindingShrinkRequest setSettingKeysShrink(String settingKeysShrink) {
        this.settingKeysShrink = settingKeysShrink;
        return this;
    }
    public String getSettingKeysShrink() {
        return this.settingKeysShrink;
    }

}
