// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAutoLiveStreamRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>069BCB66-CD80-11E8-A82B-A70F78BBDC00</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeAutoLiveStreamRuleResponseBodyRules> rules;

    public static DescribeAutoLiveStreamRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoLiveStreamRuleResponseBody self = new DescribeAutoLiveStreamRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoLiveStreamRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoLiveStreamRuleResponseBody setRules(java.util.List<DescribeAutoLiveStreamRuleResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeAutoLiveStreamRuleResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeAutoLiveStreamRuleResponseBodyRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://example.com/callBack">http://example.com/callBack</a></p>
         */
        @NameInMap("CallBack")
        public String callBack;

        @NameInMap("ChannelIdPrefixes")
        public java.util.List<String> channelIdPrefixes;

        @NameInMap("ChannelIds")
        public java.util.List<String> channelIds;

        /**
         * <strong>example:</strong>
         * <p>2021-08-19T02:53:07Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        /**
         * <strong>example:</strong>
         * <p>rtmp://${domain}/${app}/${stream}</p>
         */
        @NameInMap("PlayDomain")
        public String playDomain;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <strong>example:</strong>
         * <p>testRule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>disable</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeAutoLiveStreamRuleResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoLiveStreamRuleResponseBodyRules self = new DescribeAutoLiveStreamRuleResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setCallBack(String callBack) {
            this.callBack = callBack;
            return this;
        }
        public String getCallBack() {
            return this.callBack;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setChannelIdPrefixes(java.util.List<String> channelIdPrefixes) {
            this.channelIdPrefixes = channelIdPrefixes;
            return this;
        }
        public java.util.List<String> getChannelIdPrefixes() {
            return this.channelIdPrefixes;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setChannelIds(java.util.List<String> channelIds) {
            this.channelIds = channelIds;
            return this;
        }
        public java.util.List<String> getChannelIds() {
            return this.channelIds;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setPlayDomain(String playDomain) {
            this.playDomain = playDomain;
            return this;
        }
        public String getPlayDomain() {
            return this.playDomain;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
