// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateElasticRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateElasticRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateElasticRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticRuleResponseBody self = new CreateElasticRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateElasticRuleResponseBody setData(CreateElasticRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateElasticRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateElasticRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateElasticRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectdb.2xlarge</p>
         */
        @NameInMap("ClusterClass")
        public String clusterClass;

        /**
         * <strong>example:</strong>
         * <p>selectdb-xxxb9f2w-be</p>
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
         * <p>5465</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static CreateElasticRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateElasticRuleResponseBodyData self = new CreateElasticRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateElasticRuleResponseBodyData setClusterClass(String clusterClass) {
            this.clusterClass = clusterClass;
            return this;
        }
        public String getClusterClass() {
            return this.clusterClass;
        }

        public CreateElasticRuleResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateElasticRuleResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public CreateElasticRuleResponseBodyData setElasticRuleStartTime(String elasticRuleStartTime) {
            this.elasticRuleStartTime = elasticRuleStartTime;
            return this;
        }
        public String getElasticRuleStartTime() {
            return this.elasticRuleStartTime;
        }

        public CreateElasticRuleResponseBodyData setExecutionPeriod(String executionPeriod) {
            this.executionPeriod = executionPeriod;
            return this;
        }
        public String getExecutionPeriod() {
            return this.executionPeriod;
        }

        public CreateElasticRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
