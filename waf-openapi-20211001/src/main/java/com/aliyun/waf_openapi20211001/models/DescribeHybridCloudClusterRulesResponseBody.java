// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeHybridCloudClusterRulesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>1099</p>
         */
        @NameInMap("ClusterId")
        public Long clusterId;

        /**
         * <strong>example:</strong>
         * <p>hdbc-clusterrule-*****khzre0ym0w</p>
         */
        @NameInMap("ClusterRuleResourceId")
        public String clusterRuleResourceId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;check_mode\&quot;: \&quot;all\&quot;, \&quot;type\&quot;: \&quot;exact\&quot;, \&quot;substance\&quot;: \&quot;122\&quot;}</p>
         */
        @NameInMap("RuleConfig")
        public String ruleConfig;

        /**
         * <strong>example:</strong>
         * <p>pullin</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
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
