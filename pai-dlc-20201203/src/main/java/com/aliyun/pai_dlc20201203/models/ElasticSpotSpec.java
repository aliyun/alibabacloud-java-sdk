// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ElasticSpotSpec extends TeaModel {
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SpotDiscountLimit")
    public Double spotDiscountLimit;

    @NameInMap("SpotPriceLimit")
    public Double spotPriceLimit;

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
