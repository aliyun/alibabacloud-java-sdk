// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ElasticSpotSpec extends TeaModel {
    /**
     * <p>The spot instance type.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The maximum discount percentage for the spot instance. The system does not select an instance if its discount exceeds this limit. For example, if you set this parameter to <code>90</code>, the system considers only instances with a discount of 90% or less.</p>
     */
    @NameInMap("SpotDiscountLimit")
    public Double spotDiscountLimit;

    /**
     * <p>The maximum hourly price you are willing to pay for a spot instance. If omitted, the on-demand price is the default.</p>
     */
    @NameInMap("SpotPriceLimit")
    public Double spotPriceLimit;

    /**
     * <p>The strategy for allocating spot instances. Valid values:</p>
     * <ul>
     * <li><p><code>LowestPrice</code>: Launches instances from the spot capacity pool offering the lowest price. This is the default strategy.</p>
     * </li>
     * <li><p><code>CapacityOptimized</code>: Launches instances from the spot capacity pool offering optimal capacity.</p>
     * </li>
     * </ul>
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
