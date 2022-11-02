// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopClientIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleHitsTopClientIp")
    public java.util.List<DescribeRuleHitsTopClientIpResponseBodyRuleHitsTopClientIp> ruleHitsTopClientIp;

    public static DescribeRuleHitsTopClientIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopClientIpResponseBody self = new DescribeRuleHitsTopClientIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopClientIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleHitsTopClientIpResponseBody setRuleHitsTopClientIp(java.util.List<DescribeRuleHitsTopClientIpResponseBodyRuleHitsTopClientIp> ruleHitsTopClientIp) {
        this.ruleHitsTopClientIp = ruleHitsTopClientIp;
        return this;
    }
    public java.util.List<DescribeRuleHitsTopClientIpResponseBodyRuleHitsTopClientIp> getRuleHitsTopClientIp() {
        return this.ruleHitsTopClientIp;
    }

    public static class DescribeRuleHitsTopClientIpResponseBodyRuleHitsTopClientIp extends TeaModel {
        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("Count")
        public Long count;

        public static DescribeRuleHitsTopClientIpResponseBodyRuleHitsTopClientIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleHitsTopClientIpResponseBodyRuleHitsTopClientIp self = new DescribeRuleHitsTopClientIpResponseBodyRuleHitsTopClientIp();
            return TeaModel.build(map, self);
        }

        public DescribeRuleHitsTopClientIpResponseBodyRuleHitsTopClientIp setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeRuleHitsTopClientIpResponseBodyRuleHitsTopClientIp setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
