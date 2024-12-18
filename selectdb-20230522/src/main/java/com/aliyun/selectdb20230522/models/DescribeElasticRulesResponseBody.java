// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeElasticRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeElasticRulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeElasticRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticRulesResponseBody self = new DescribeElasticRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticRulesResponseBody setData(DescribeElasticRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeElasticRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeElasticRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeElasticRulesResponseBodyDataRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectdb.2xlarge</p>
         */
        @NameInMap("ClusterClass")
        public String clusterClass;

        /**
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("ElasticRuleStartTime")
        public String elasticRuleStartTime;

        /**
         * <strong>example:</strong>
         * <p>Day</p>
         */
        @NameInMap("ExecutionPeriod")
        public String executionPeriod;

        /**
         * <strong>example:</strong>
         * <p>5467</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeElasticRulesResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticRulesResponseBodyDataRules self = new DescribeElasticRulesResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public DescribeElasticRulesResponseBodyDataRules setClusterClass(String clusterClass) {
            this.clusterClass = clusterClass;
            return this;
        }
        public String getClusterClass() {
            return this.clusterClass;
        }

        public DescribeElasticRulesResponseBodyDataRules setElasticRuleStartTime(String elasticRuleStartTime) {
            this.elasticRuleStartTime = elasticRuleStartTime;
            return this;
        }
        public String getElasticRuleStartTime() {
            return this.elasticRuleStartTime;
        }

        public DescribeElasticRulesResponseBodyDataRules setExecutionPeriod(String executionPeriod) {
            this.executionPeriod = executionPeriod;
            return this;
        }
        public String getExecutionPeriod() {
            return this.executionPeriod;
        }

        public DescribeElasticRulesResponseBodyDataRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeElasticRulesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-nwy3jv1oa02-be</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("Rules")
        public java.util.List<DescribeElasticRulesResponseBodyDataRules> rules;

        public static DescribeElasticRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticRulesResponseBodyData self = new DescribeElasticRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeElasticRulesResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeElasticRulesResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeElasticRulesResponseBodyData setRules(java.util.List<DescribeElasticRulesResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeElasticRulesResponseBodyDataRules> getRules() {
            return this.rules;
        }

    }

}
