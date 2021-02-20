// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAutoLiveStreamRuleResponseBody extends TeaModel {
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
        @NameInMap("CallBack")
        public String callBack;

        @NameInMap("PlayDomain")
        public String playDomain;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public Long ruleId;

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

        public DescribeAutoLiveStreamRuleResponseBodyRules setPlayDomain(String playDomain) {
            this.playDomain = playDomain;
            return this;
        }
        public String getPlayDomain() {
            return this.playDomain;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeAutoLiveStreamRuleResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
