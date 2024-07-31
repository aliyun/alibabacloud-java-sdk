// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterRuleResponseBody extends TeaModel {
    /**
     * <p>The details of the rule.</p>
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
         * <p>The configuration of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;check_mode\&quot;:\&quot;all\&quot;,\&quot;exclude\&quot;:{\&quot;exact\&quot;:[],\&quot;regex\&quot;:[]}}</p>
         */
        @NameInMap("RuleConfig")
        public String ruleConfig;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled.</li>
         * <li><strong>off</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleStatus")
        public String ruleStatus;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>pullin</strong>: The traffic redirection rule of the hybrid cloud cluster.</li>
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
