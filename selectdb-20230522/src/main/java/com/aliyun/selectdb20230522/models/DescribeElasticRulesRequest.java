// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeElasticRulesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-nwy3jv1oa02-be</p>
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
     * <p>The cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb</p>
     */
    @NameInMap("Product")
    public String product;

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

    public static DescribeElasticRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticRulesRequest self = new DescribeElasticRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticRulesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeElasticRulesRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public DescribeElasticRulesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeElasticRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeElasticRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
