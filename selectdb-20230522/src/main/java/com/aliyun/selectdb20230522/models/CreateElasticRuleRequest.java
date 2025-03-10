// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateElasticRuleRequest extends TeaModel {
    /**
     * <p>The rule for computing resources of the required cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb.2xlarge</p>
     */
    @NameInMap("ClusterClass")
    public String clusterClass;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-xxxb9f2w-be</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The time when you want to execute the scheduled scaling rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00</p>
     */
    @NameInMap("ElasticRuleStartTime")
    public String elasticRuleStartTime;

    /**
     * <p>The execution cycle.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>Day</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("ExecutionPeriod")
    public String executionPeriod;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateElasticRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticRuleRequest self = new CreateElasticRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateElasticRuleRequest setClusterClass(String clusterClass) {
        this.clusterClass = clusterClass;
        return this;
    }
    public String getClusterClass() {
        return this.clusterClass;
    }

    public CreateElasticRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateElasticRuleRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public CreateElasticRuleRequest setElasticRuleStartTime(String elasticRuleStartTime) {
        this.elasticRuleStartTime = elasticRuleStartTime;
        return this;
    }
    public String getElasticRuleStartTime() {
        return this.elasticRuleStartTime;
    }

    public CreateElasticRuleRequest setExecutionPeriod(String executionPeriod) {
        this.executionPeriod = executionPeriod;
        return this;
    }
    public String getExecutionPeriod() {
        return this.executionPeriod;
    }

    public CreateElasticRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateElasticRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
