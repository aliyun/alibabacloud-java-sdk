// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterRulesResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeHybridCloudClusterRulesResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of cloud native mode entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeHybridCloudClusterRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudClusterRulesResponseBody self = new DescribeHybridCloudClusterRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudClusterRulesResponseBody setData(java.util.List<DescribeHybridCloudClusterRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeHybridCloudClusterRulesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeHybridCloudClusterRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridCloudClusterRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHybridCloudClusterRulesResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1099</p>
         */
        @NameInMap("ClusterId")
        public Long clusterId;

        /**
         * <p>The resource ID of the cluster rule.</p>
         * 
         * <strong>example:</strong>
         * <p>hdbc-clusterrule-*****khzre0ym0w</p>
         */
        @NameInMap("ClusterRuleResourceId")
        public String clusterRuleResourceId;

        /**
         * <p>The configuration of the traffic redirection rule:</p>
         * <ul>
         * <li><p><strong>check_mode</strong></p>
         * <p>: the mode. Valid values:</p>
         * <ul>
         * <li><p><strong>all</strong>: redirects all traffic.</p>
         * </li>
         * <li><p><strong>part</strong>: redirects a portion of traffic.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>type</strong></p>
         * <p>: the match type of the rule. Valid values:</p>
         * <ul>
         * <li><p><strong>exact</strong>: exact match.</p>
         * </li>
         * <li><p><strong>regex</strong>: regular expression match.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>substance</strong>: the value of the rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;check_mode\&quot;: \&quot;all\&quot;, \&quot;type\&quot;: \&quot;exact\&quot;, \&quot;substance\&quot;: \&quot;122\&quot;}</p>
         */
        @NameInMap("RuleConfig")
        public String ruleConfig;

        /**
         * <p>The type of the rule. Valid value:</p>
         * <ul>
         * <li><strong>pullin</strong>: traffic redirection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pullin</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        public static DescribeHybridCloudClusterRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudClusterRulesResponseBodyData self = new DescribeHybridCloudClusterRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudClusterRulesResponseBodyData setClusterId(Long clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Long getClusterId() {
            return this.clusterId;
        }

        public DescribeHybridCloudClusterRulesResponseBodyData setClusterRuleResourceId(String clusterRuleResourceId) {
            this.clusterRuleResourceId = clusterRuleResourceId;
            return this;
        }
        public String getClusterRuleResourceId() {
            return this.clusterRuleResourceId;
        }

        public DescribeHybridCloudClusterRulesResponseBodyData setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public DescribeHybridCloudClusterRulesResponseBodyData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public DescribeHybridCloudClusterRulesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHybridCloudClusterRulesResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
