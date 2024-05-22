// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAutoLiveStreamRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CallBack")
    public String callBack;

    @NameInMap("ChannelIdPrefixes")
    public java.util.List<String> channelIdPrefixes;

    @NameInMap("ChannelIds")
    public java.util.List<String> channelIds;

    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PlayDomain")
    public String playDomain;

    @NameInMap("RuleName")
    public String ruleName;

    public static CreateAutoLiveStreamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoLiveStreamRuleRequest self = new CreateAutoLiveStreamRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoLiveStreamRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAutoLiveStreamRuleRequest setCallBack(String callBack) {
        this.callBack = callBack;
        return this;
    }
    public String getCallBack() {
        return this.callBack;
    }

    public CreateAutoLiveStreamRuleRequest setChannelIdPrefixes(java.util.List<String> channelIdPrefixes) {
        this.channelIdPrefixes = channelIdPrefixes;
        return this;
    }
    public java.util.List<String> getChannelIdPrefixes() {
        return this.channelIdPrefixes;
    }

    public CreateAutoLiveStreamRuleRequest setChannelIds(java.util.List<String> channelIds) {
        this.channelIds = channelIds;
        return this;
    }
    public java.util.List<String> getChannelIds() {
        return this.channelIds;
    }

    public CreateAutoLiveStreamRuleRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public CreateAutoLiveStreamRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAutoLiveStreamRuleRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public CreateAutoLiveStreamRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
