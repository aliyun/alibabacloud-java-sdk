// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopTuleTypeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>45E377CE-0B04-578E-B653-EEA63CFE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The top 10 protection types with the most rule hits.</p>
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
         * <p>The number of requests that hit the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>698455</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The type of the rule hit by the protected object. By default, this parameter is not returned, which indicates that all rules are displayed. Valid values:</p>
         * <ul>
         * <li><p><strong>waf</strong>: basic protection rule.</p>
         * </li>
         * <li><p><strong>blacklist</strong>: IP blacklist.</p>
         * </li>
         * <li><p><strong>custom</strong>: custom rule.</p>
         * </li>
         * <li><p><strong>antiscan</strong>: scan protection rule.</p>
         * </li>
         * <li><p><strong>cc_system</strong>: HTTP flood protection rule.</p>
         * </li>
         * <li><p><strong>region_block</strong>: area blocking.</p>
         * </li>
         * <li><p><strong>scene</strong>: bot management.</p>
         * </li>
         * <li><p><strong>dlp</strong>: data leak prevention.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>blacklist</p>
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
