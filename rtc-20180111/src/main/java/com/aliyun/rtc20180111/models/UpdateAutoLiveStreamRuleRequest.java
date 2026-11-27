// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateAutoLiveStreamRuleRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query application IDs in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The callback URL for starting and stopping the bypass. You can query the bypass callback URL in the console or by calling the <a href="https://help.aliyun.com/document_detail/353198.html">DescribeAutoLiveStreamRule</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("CallBack")
    public String callBack;

    /**
     * <p>The prefix list of channel IDs for fuzzy matching.</p>
     */
    @NameInMap("ChannelIdPrefixes")
    public java.util.List<String> channelIdPrefixes;

    /**
     * <p>The list of channel IDs for exact matching.</p>
     */
    @NameInMap("ChannelIds")
    public java.util.List<String> channelIds;

    /**
     * <p>The encoding options. For more information, see the valid values of MediaEncode in <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The streaming domain name for automatic bypass. The streaming URL for an automatic bypass task is rtmp://${domain}/${app}/${stream}.</p>
     * <ul>
     * <li>domain: Your live streaming domain name.</li>
     * <li>app: live.</li>
     * <li>stream: urlencode(${AppId}<em>${ChannelId}</em>${UserId}_${SourceType}), where SourceType is the input source type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://${domain}/${app}/${stream}</p>
     */
    @NameInMap("PlayDomain")
    public String playDomain;

    /**
     * <p>The ID of the bypass rule. You can query the bypass rule ID in the console or by calling the <a href="https://help.aliyun.com/document_detail/353198.html">DescribeAutoLiveStreamRule</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("RuleId")
    public Integer ruleId;

    /**
     * <p>The name of the bypass rule.</p>
     * 
     * <strong>example:</strong>
     * <p>testRule</p>
     */
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
