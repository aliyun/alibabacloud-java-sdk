// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAutoLiveStreamRuleRequest extends TeaModel {
    /**
     * <p>The application ID, which can be created and queried in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The callback URL used to notify the start and end of the relay. For details about the callback content, see the CallBack callback example below.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("CallBack")
    public String callBack;

    /**
     * <p>The list of channel ID prefixes that are fuzzy matched.</p>
     */
    @NameInMap("ChannelIdPrefixes")
    public java.util.List<String> channelIdPrefixes;

    /**
     * <p>The list of channel IDs that are exactly matched.</p>
     */
    @NameInMap("ChannelIds")
    public java.util.List<String> channelIds;

    /**
     * <p>The encoding option. For more information, see the MediaEncode enumeration values below.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The streaming domain name for automatic relay. The streaming URL of an automatic relay task is in the format rtmp://${domain}/${app}/${stream}.</p>
     * <ul>
     * <li>domain: your live streaming domain name.</li>
     * <li>app: live.</li>
     * <li>stream: urlencode(${AppId}<em>${ChannelId}</em>${UserId}_${SourceType}), where SourceType indicates the type of the input source.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://${domain}/${app}/${stream}</p>
     */
    @NameInMap("PlayDomain")
    public String playDomain;

    /**
     * <p>The name of the relay rule.</p>
     * 
     * <strong>example:</strong>
     * <p>testRule</p>
     */
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
