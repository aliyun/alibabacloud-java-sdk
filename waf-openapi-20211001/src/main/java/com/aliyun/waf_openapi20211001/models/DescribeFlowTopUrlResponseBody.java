// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFlowTopUrlResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of the top 10 URLs that are used to initiate requests.</p>
     */
    @NameInMap("RuleHitsTopUrl")
    public java.util.List<DescribeFlowTopUrlResponseBodyRuleHitsTopUrl> ruleHitsTopUrl;

    public static DescribeFlowTopUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowTopUrlResponseBody self = new DescribeFlowTopUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowTopUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowTopUrlResponseBody setRuleHitsTopUrl(java.util.List<DescribeFlowTopUrlResponseBodyRuleHitsTopUrl> ruleHitsTopUrl) {
        this.ruleHitsTopUrl = ruleHitsTopUrl;
        return this;
    }
    public java.util.List<DescribeFlowTopUrlResponseBodyRuleHitsTopUrl> getRuleHitsTopUrl() {
        return this.ruleHitsTopUrl;
    }

    public static class DescribeFlowTopUrlResponseBodyRuleHitsTopUrl extends TeaModel {
        /**
         * <p>The total number of requests that are initiated by using the URL.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The URL that is used to initiate requests.</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeFlowTopUrlResponseBodyRuleHitsTopUrl build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowTopUrlResponseBodyRuleHitsTopUrl self = new DescribeFlowTopUrlResponseBodyRuleHitsTopUrl();
            return TeaModel.build(map, self);
        }

        public DescribeFlowTopUrlResponseBodyRuleHitsTopUrl setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeFlowTopUrlResponseBodyRuleHitsTopUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
