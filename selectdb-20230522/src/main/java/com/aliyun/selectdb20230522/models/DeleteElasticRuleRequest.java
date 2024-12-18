// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DeleteElasticRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-xxx302i5-be</p>
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
     * <p>selectdb</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hanghzou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100458</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteElasticRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticRuleRequest self = new DeleteElasticRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteElasticRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteElasticRuleRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public DeleteElasticRuleRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DeleteElasticRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteElasticRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteElasticRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
