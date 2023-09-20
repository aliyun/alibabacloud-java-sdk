// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopTuleTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The top 10 protection modules that are matched.</p>
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
        /**
         * <p>The number of requests that match protection rules.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The type of rule that is matched. By default, this parameter is not returned. This indicates that all types of rules that are matched are returned.</p>
         * <br>
         * <p>*   **waf:** basic protection rules.</p>
         * <p>*   **blacklist:** IP address blacklist rules.</p>
         * <p>*   **custom:** custom rules.</p>
         * <p>*   **antiscan:** scan protection rules.</p>
         * <p>*   **cc_system:** HTTP flood protection rules.</p>
         * <p>*   **region_block:** region blacklist rules.</p>
         * <p>*   **scene:** bot management rules.</p>
         * <p>*   **dlp:** data leakage prevention rules.</p>
         */
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
