// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyElasticRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>selectdb.2xlarge</p>
     */
    @NameInMap("ClusterClass")
    public String clusterClass;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-nwy3jv1oa02-be</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>selectdb</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5467</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static ModifyElasticRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticRuleRequest self = new ModifyElasticRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticRuleRequest setClusterClass(String clusterClass) {
        this.clusterClass = clusterClass;
        return this;
    }
    public String getClusterClass() {
        return this.clusterClass;
    }

    public ModifyElasticRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyElasticRuleRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public ModifyElasticRuleRequest setElasticRuleStartTime(String elasticRuleStartTime) {
        this.elasticRuleStartTime = elasticRuleStartTime;
        return this;
    }
    public String getElasticRuleStartTime() {
        return this.elasticRuleStartTime;
    }

    public ModifyElasticRuleRequest setExecutionPeriod(String executionPeriod) {
        this.executionPeriod = executionPeriod;
        return this;
    }
    public String getExecutionPeriod() {
        return this.executionPeriod;
    }

    public ModifyElasticRuleRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ModifyElasticRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyElasticRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyElasticRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
