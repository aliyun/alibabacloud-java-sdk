// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopTuleTypeResponseBody extends TeaModel {
    /**
     * <p>The number of requests that match the rules of the protection module.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of rules. For details, see the description of **RuleType** in [DescribeRuleHitsTopRuleId](~~DescribeRuleHitsTopRuleId~~).</p>
     */
    @NameInMap("RuleHitsTopTuleType")
    public java.util.List<DescribeRuleHitsTopTuleTypeResponseBodyRuleHitsTopTuleType> ruleHitsTopTuleType;

    public static DescribeRuleHitsTopTuleTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopTuleTypeResponseBody self = new DescribeRuleHitsTopTuleTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopTuleTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleHitsTopTuleTypeResponseBody setRuleHitsTopTuleType(java.util.List<DescribeRuleHitsTopTuleTypeResponseBodyRuleHitsTopTuleType> ruleHitsTopTuleType) {
        this.ruleHitsTopTuleType = ruleHitsTopTuleType;
        return this;
    }
    public java.util.List<DescribeRuleHitsTopTuleTypeResponseBodyRuleHitsTopTuleType> getRuleHitsTopTuleType() {
        return this.ruleHitsTopTuleType;
    }

    public static class DescribeRuleHitsTopTuleTypeResponseBodyRuleHitsTopTuleType extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("RuleType")
        public String ruleType;

        public static DescribeRuleHitsTopTuleTypeResponseBodyRuleHitsTopTuleType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleHitsTopTuleTypeResponseBodyRuleHitsTopTuleType self = new DescribeRuleHitsTopTuleTypeResponseBodyRuleHitsTopTuleType();
            return TeaModel.build(map, self);
        }

        public DescribeRuleHitsTopTuleTypeResponseBodyRuleHitsTopTuleType setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeRuleHitsTopTuleTypeResponseBodyRuleHitsTopTuleType setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

}
