// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopUaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleHitsTopUa")
    public java.util.List<DescribeRuleHitsTopUaResponseBodyRuleHitsTopUa> ruleHitsTopUa;

    public static DescribeRuleHitsTopUaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopUaResponseBody self = new DescribeRuleHitsTopUaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopUaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleHitsTopUaResponseBody setRuleHitsTopUa(java.util.List<DescribeRuleHitsTopUaResponseBodyRuleHitsTopUa> ruleHitsTopUa) {
        this.ruleHitsTopUa = ruleHitsTopUa;
        return this;
    }
    public java.util.List<DescribeRuleHitsTopUaResponseBodyRuleHitsTopUa> getRuleHitsTopUa() {
        return this.ruleHitsTopUa;
    }

    public static class DescribeRuleHitsTopUaResponseBodyRuleHitsTopUa extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Ua")
        public String ua;

        public static DescribeRuleHitsTopUaResponseBodyRuleHitsTopUa build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleHitsTopUaResponseBodyRuleHitsTopUa self = new DescribeRuleHitsTopUaResponseBodyRuleHitsTopUa();
            return TeaModel.build(map, self);
        }

        public DescribeRuleHitsTopUaResponseBodyRuleHitsTopUa setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeRuleHitsTopUaResponseBodyRuleHitsTopUa setUa(String ua) {
            this.ua = ua;
            return this;
        }
        public String getUa() {
            return this.ua;
        }

    }

}
