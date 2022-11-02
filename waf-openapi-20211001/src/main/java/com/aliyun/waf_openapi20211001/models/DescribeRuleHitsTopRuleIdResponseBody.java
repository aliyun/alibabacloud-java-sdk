// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopRuleIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleHitsTopRuleId")
    public java.util.List<DescribeRuleHitsTopRuleIdResponseBodyRuleHitsTopRuleId> ruleHitsTopRuleId;

    public static DescribeRuleHitsTopRuleIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopRuleIdResponseBody self = new DescribeRuleHitsTopRuleIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopRuleIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleHitsTopRuleIdResponseBody setRuleHitsTopRuleId(java.util.List<DescribeRuleHitsTopRuleIdResponseBodyRuleHitsTopRuleId> ruleHitsTopRuleId) {
        this.ruleHitsTopRuleId = ruleHitsTopRuleId;
        return this;
    }
    public java.util.List<DescribeRuleHitsTopRuleIdResponseBodyRuleHitsTopRuleId> getRuleHitsTopRuleId() {
        return this.ruleHitsTopRuleId;
    }

    public static class DescribeRuleHitsTopRuleIdResponseBodyRuleHitsTopRuleId extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeRuleHitsTopRuleIdResponseBodyRuleHitsTopRuleId build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleHitsTopRuleIdResponseBodyRuleHitsTopRuleId self = new DescribeRuleHitsTopRuleIdResponseBodyRuleHitsTopRuleId();
            return TeaModel.build(map, self);
        }

        public DescribeRuleHitsTopRuleIdResponseBodyRuleHitsTopRuleId setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeRuleHitsTopRuleIdResponseBodyRuleHitsTopRuleId setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeRuleHitsTopRuleIdResponseBodyRuleHitsTopRuleId setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
