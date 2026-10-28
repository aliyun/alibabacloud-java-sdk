// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ElasticSpotSpec extends TeaModel {
    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.gn6e-c12g1.3xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The maximum discount.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("SpotDiscountLimit")
    public Double spotDiscountLimit;

    /**
     * <p>The maximum bid price.</p>
     * 
     * <strong>example:</strong>
     * <p>0.4744</p>
     */
    @NameInMap("SpotPriceLimit")
    public Double spotPriceLimit;

    /**
     * <p>The spot strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>SpotWithPriceLimit</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    public static ElasticSpotSpec build(java.util.Map<String, ?> map) throws Exception {
        ElasticSpotSpec self = new ElasticSpotSpec();
        return TeaModel.build(map, self);
    }

    public ElasticSpotSpec setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ElasticSpotSpec setSpotDiscountLimit(Double spotDiscountLimit) {
        this.spotDiscountLimit = spotDiscountLimit;
        return this;
    }
    public Double getSpotDiscountLimit() {
        return this.spotDiscountLimit;
    }

    public ElasticSpotSpec setSpotPriceLimit(Double spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Double getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public ElasticSpotSpec setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

}
