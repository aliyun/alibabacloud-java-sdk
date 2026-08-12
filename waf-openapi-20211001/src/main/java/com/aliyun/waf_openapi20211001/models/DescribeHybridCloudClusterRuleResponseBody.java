// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterRuleResponseBody extends TeaModel {
    /**
     * <p>The rule information.</p>
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
         * <p>The cluster rule resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hdbc-clusterrule-2m*****m0w</p>
         */
        @NameInMap("ClusterRuleResourceId")
        public String clusterRuleResourceId;

        /**
         * <p>The traffic redirection rule configuration:</p>
         * <ul>
         * <li><strong>check_mode</strong>: the mode selection. Valid values:<ul>
         * <li><strong>all</strong>: full traffic redirection</li>
         * <li><strong>part</strong>: partial traffic redirection</li>
         * </ul>
         * </li>
         * <li><strong>type</strong>: the rule matching type. Valid values:<ul>
         * <li><strong>exact</strong>: exact match</li>
         * <li><strong>regex</strong>: regular expression</li>
         * </ul>
         * </li>
         * <li><strong>substance</strong>: the rule value</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;check_mode\&quot;:\&quot;all\&quot;,\&quot;exclude\&quot;:{\&quot;exact\&quot;:[],\&quot;regex\&quot;:[]}}</p>
         */
        @NameInMap("RuleConfig")
        public String ruleConfig;

        /**
         * <p>The rule status. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: enabled.</p>
         * </li>
         * <li><p><strong>off</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleStatus")
        public String ruleStatus;

        /**
         * <p>The rule type. Valid values:</p>
         * <ul>
         * <li>pullin: traffic redirection rule</li>
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
