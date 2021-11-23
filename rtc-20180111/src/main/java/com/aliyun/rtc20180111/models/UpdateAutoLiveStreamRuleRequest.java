// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateAutoLiveStreamRuleRequest extends TeaModel {
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

    @NameInMap("PlayDomain")
    public String playDomain;

    @NameInMap("RuleId")
    public Integer ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    public static UpdateAutoLiveStreamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoLiveStreamRuleRequest self = new UpdateAutoLiveStreamRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoLiveStreamRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAutoLiveStreamRuleRequest setCallBack(String callBack) {
        this.callBack = callBack;
        return this;
    }
    public String getCallBack() {
        return this.callBack;
    }

    public UpdateAutoLiveStreamRuleRequest setChannelIdPrefixes(java.util.List<String> channelIdPrefixes) {
        this.channelIdPrefixes = channelIdPrefixes;
        return this;
    }
    public java.util.List<String> getChannelIdPrefixes() {
        return this.channelIdPrefixes;
    }

    public UpdateAutoLiveStreamRuleRequest setChannelIds(java.util.List<String> channelIds) {
        this.channelIds = channelIds;
        return this;
    }
    public java.util.List<String> getChannelIds() {
        return this.channelIds;
    }

    public UpdateAutoLiveStreamRuleRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public UpdateAutoLiveStreamRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAutoLiveStreamRuleRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public UpdateAutoLiveStreamRuleRequest setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

    public UpdateAutoLiveStreamRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
