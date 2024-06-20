// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopTuleTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>45E377CE-0B04-578E-B653-EEA63CFE****</p>
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
         * 
         * <strong>example:</strong>
         * <p>698455</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The type of rule that is matched. By default, this parameter is not returned. This indicates that all types of rules that are matched are returned.</p>
         * <ul>
         * <li><strong>waf:</strong> basic protection rules.</li>
         * <li><strong>blacklist:</strong> IP address blacklist rules.</li>
         * <li><strong>custom:</strong> custom rules.</li>
         * <li><strong>antiscan:</strong> scan protection rules.</li>
         * <li><strong>cc_system:</strong> HTTP flood protection rules.</li>
         * <li><strong>region_block:</strong> region blacklist rules.</li>
         * <li><strong>scene:</strong> bot management rules.</li>
         * <li><strong>dlp:</strong> data leakage prevention rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cc_system</p>
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
