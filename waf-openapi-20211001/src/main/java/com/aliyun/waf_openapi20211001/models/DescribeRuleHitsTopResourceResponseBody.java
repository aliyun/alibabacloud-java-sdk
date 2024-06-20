// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ADA11BC7-AA95-5C31-9095-5802C02ED1DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of the top 10 protected objects that trigger protection rules.</p>
     */
    @NameInMap("RuleHitsTopResource")
    public java.util.List<DescribeRuleHitsTopResourceResponseBodyRuleHitsTopResource> ruleHitsTopResource;

    public static DescribeRuleHitsTopResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopResourceResponseBody self = new DescribeRuleHitsTopResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleHitsTopResourceResponseBody setRuleHitsTopResource(java.util.List<DescribeRuleHitsTopResourceResponseBodyRuleHitsTopResource> ruleHitsTopResource) {
        this.ruleHitsTopResource = ruleHitsTopResource;
        return this;
    }
    public java.util.List<DescribeRuleHitsTopResourceResponseBodyRuleHitsTopResource> getRuleHitsTopResource() {
        return this.ruleHitsTopResource;
    }

    public static class DescribeRuleHitsTopResourceResponseBodyRuleHitsTopResource extends TeaModel {
        /**
         * <p>The number of requests that match protection rules.</p>
         * 
         * <strong>example:</strong>
         * <p>14219</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The protected object.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("Resource")
        public String resource;

        public static DescribeRuleHitsTopResourceResponseBodyRuleHitsTopResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleHitsTopResourceResponseBodyRuleHitsTopResource self = new DescribeRuleHitsTopResourceResponseBodyRuleHitsTopResource();
            return TeaModel.build(map, self);
        }

        public DescribeRuleHitsTopResourceResponseBodyRuleHitsTopResource setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeRuleHitsTopResourceResponseBodyRuleHitsTopResource setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

}
