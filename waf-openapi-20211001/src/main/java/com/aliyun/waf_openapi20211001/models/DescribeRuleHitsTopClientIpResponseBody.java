// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopClientIpResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9F0F9AD6-62E2-50BB-A3E5-30FFB9410262</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of the top 10 IP addresses from which attacks are initiated.</p>
     */
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
        /**
         * <p>The IP address of the service client.</p>
         * 
         * <strong>example:</strong>
         * <p>3.3.XX.XX</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The number of attacks that are initiated from the IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>531</p>
         */
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
