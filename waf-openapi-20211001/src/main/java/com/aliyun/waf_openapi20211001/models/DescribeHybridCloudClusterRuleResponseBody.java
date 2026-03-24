// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterRuleResponseBody extends TeaModel {
    /**
     * <p>The information about the rule.</p>
     */
    @NameInMap("ClusterRule")
    public DescribeHybridCloudClusterRuleResponseBodyClusterRule clusterRule;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1F29A6D2-9EB6-526D-A997-36888**99CB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHybridCloudClusterRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudClusterRuleResponseBody self = new DescribeHybridCloudClusterRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudClusterRuleResponseBody setClusterRule(DescribeHybridCloudClusterRuleResponseBodyClusterRule clusterRule) {
        this.clusterRule = clusterRule;
        return this;
    }
    public DescribeHybridCloudClusterRuleResponseBodyClusterRule getClusterRule() {
        return this.clusterRule;
    }

    public DescribeHybridCloudClusterRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHybridCloudClusterRuleResponseBodyClusterRule extends TeaModel {
        /**
         * <p>The resource ID of the cluster rule.</p>
         * 
         * <strong>example:</strong>
         * <p>hdbc-clusterrule-2m*****m0w</p>
         */
        @NameInMap("ClusterRuleResourceId")
        public String clusterRuleResourceId;

        /**
         * <p>The configuration of the traffic routing rule.</p>
         * <ul>
         * <li><p><strong>check_mode</strong>: Defines the traffic scope for the routing rule. Valid values:</p>
         * <ul>
         * <li><p><strong>all</strong>: Routes all traffic.</p>
         * </li>
         * <li><p><strong>part</strong>: Routes a portion of the traffic.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>type</strong>: The rule\&quot;s match type. Valid values:</p>
         * <ul>
         * <li><p><strong>exact</strong>: Exact match.</p>
         * </li>
         * <li><p><strong>regex</strong>: Regular expression match.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>substance</strong>: The value of the rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;check_mode\&quot;:\&quot;all\&quot;,\&quot;exclude\&quot;:{\&quot;exact\&quot;:[],\&quot;regex\&quot;:[]}}</p>
         */
        @NameInMap("RuleConfig")
        public String ruleConfig;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>off</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleStatus")
        public String ruleStatus;

        /**
         * <p>The type of the rule.</p>
         * <ul>
         * <li>pullin: The traffic routing rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pullin</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        public static DescribeHybridCloudClusterRuleResponseBodyClusterRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudClusterRuleResponseBodyClusterRule self = new DescribeHybridCloudClusterRuleResponseBodyClusterRule();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudClusterRuleResponseBodyClusterRule setClusterRuleResourceId(String clusterRuleResourceId) {
            this.clusterRuleResourceId = clusterRuleResourceId;
            return this;
        }
        public String getClusterRuleResourceId() {
            return this.clusterRuleResourceId;
        }

        public DescribeHybridCloudClusterRuleResponseBodyClusterRule setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public DescribeHybridCloudClusterRuleResponseBodyClusterRule setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public DescribeHybridCloudClusterRuleResponseBodyClusterRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

}
