// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopUrlResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of the top 10 URLs that trigger protection rules.</p>
     */
    @NameInMap("RuleHitsTopUrl")
    public java.util.List<DescribeRuleHitsTopUrlResponseBodyRuleHitsTopUrl> ruleHitsTopUrl;

    public static DescribeRuleHitsTopUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopUrlResponseBody self = new DescribeRuleHitsTopUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleHitsTopUrlResponseBody setRuleHitsTopUrl(java.util.List<DescribeRuleHitsTopUrlResponseBodyRuleHitsTopUrl> ruleHitsTopUrl) {
        this.ruleHitsTopUrl = ruleHitsTopUrl;
        return this;
    }
    public java.util.List<DescribeRuleHitsTopUrlResponseBodyRuleHitsTopUrl> getRuleHitsTopUrl() {
        return this.ruleHitsTopUrl;
    }

    public static class DescribeRuleHitsTopUrlResponseBodyRuleHitsTopUrl extends TeaModel {
        /**
         * <p>The number of requests from the URL that match protection rules.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The request URL.</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeRuleHitsTopUrlResponseBodyRuleHitsTopUrl build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleHitsTopUrlResponseBodyRuleHitsTopUrl self = new DescribeRuleHitsTopUrlResponseBodyRuleHitsTopUrl();
            return TeaModel.build(map, self);
        }

        public DescribeRuleHitsTopUrlResponseBodyRuleHitsTopUrl setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeRuleHitsTopUrlResponseBodyRuleHitsTopUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
