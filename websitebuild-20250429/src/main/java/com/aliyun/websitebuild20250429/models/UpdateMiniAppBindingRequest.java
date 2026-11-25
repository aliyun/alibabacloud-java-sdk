// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateMiniAppBindingRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>WECHAT</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The configuration key.</p>
     * 
     * <strong>example:</strong>
     * <p>SERVER_DOMAIN</p>
     */
    @NameInMap("SettingKey")
    public String settingKey;

    /**
     * <p>The configuration value.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;requestDomains&quot;:[{&quot;domain&quot;:&quot;<a href="https://api.example.com%22%7D%5D,%22wsRequestDomains%22:%5B%5D,%22uploadDomains%22:%5B%5D,%22downloadDomains%22:%5B%5D,%22udpDomains%22:%5B%5D,%22tcpDomains%22:%5B%5D%7D">https://api.example.com&quot;}],&quot;wsRequestDomains&quot;:[],&quot;uploadDomains&quot;:[],&quot;downloadDomains&quot;:[],&quot;udpDomains&quot;:[],&quot;tcpDomains&quot;:[]}</a></p>
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
