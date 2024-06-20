// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopUrlResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D8AF43B-08EB-51CE-B33A-93AA****9B0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The top 10 URLs that match protection rules.</p>
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
         * <p>The number of requests that match protection rules.</p>
         * 
         * <strong>example:</strong>
         * <p>21862</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The request URL.</p>
         * <blockquote>
         * <p> The value is Base64-encoded.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d3d3LmFsaXl1bmRvYy5jb20vcGF0aDM=</p>
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
