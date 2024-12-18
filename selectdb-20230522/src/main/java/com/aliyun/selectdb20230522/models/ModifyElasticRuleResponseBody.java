// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyElasticRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyElasticRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>5ED62C81-9948-5612-81E1-EA3853752306</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyElasticRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticRuleResponseBody self = new ModifyElasticRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyElasticRuleResponseBody setData(ModifyElasticRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyElasticRuleResponseBodyData getData() {
        return this.data;
    }

    public ModifyElasticRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyElasticRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectdb.2xlarge</p>
         */
        @NameInMap("ClusterClass")
        public String clusterClass;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-zpr3if5wq03-be</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

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
         * <p>29252</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static ModifyElasticRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyElasticRuleResponseBodyData self = new ModifyElasticRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyElasticRuleResponseBodyData setClusterClass(String clusterClass) {
            this.clusterClass = clusterClass;
            return this;
        }
        public String getClusterClass() {
            return this.clusterClass;
        }

        public ModifyElasticRuleResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ModifyElasticRuleResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public ModifyElasticRuleResponseBodyData setElasticRuleStartTime(String elasticRuleStartTime) {
            this.elasticRuleStartTime = elasticRuleStartTime;
            return this;
        }
        public String getElasticRuleStartTime() {
            return this.elasticRuleStartTime;
        }

        public ModifyElasticRuleResponseBodyData setExecutionPeriod(String executionPeriod) {
            this.executionPeriod = executionPeriod;
            return this;
        }
        public String getExecutionPeriod() {
            return this.executionPeriod;
        }

        public ModifyElasticRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
