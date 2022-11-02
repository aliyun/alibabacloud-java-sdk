// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFlowTopResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleHitsTopResource")
    public java.util.List<DescribeFlowTopResourceResponseBodyRuleHitsTopResource> ruleHitsTopResource;

    public static DescribeFlowTopResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowTopResourceResponseBody self = new DescribeFlowTopResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowTopResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowTopResourceResponseBody setRuleHitsTopResource(java.util.List<DescribeFlowTopResourceResponseBodyRuleHitsTopResource> ruleHitsTopResource) {
        this.ruleHitsTopResource = ruleHitsTopResource;
        return this;
    }
    public java.util.List<DescribeFlowTopResourceResponseBodyRuleHitsTopResource> getRuleHitsTopResource() {
        return this.ruleHitsTopResource;
    }

    public static class DescribeFlowTopResourceResponseBodyRuleHitsTopResource extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Resource")
        public String resource;

        public static DescribeFlowTopResourceResponseBodyRuleHitsTopResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowTopResourceResponseBodyRuleHitsTopResource self = new DescribeFlowTopResourceResponseBodyRuleHitsTopResource();
            return TeaModel.build(map, self);
        }

        public DescribeFlowTopResourceResponseBodyRuleHitsTopResource setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeFlowTopResourceResponseBodyRuleHitsTopResource setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

}
