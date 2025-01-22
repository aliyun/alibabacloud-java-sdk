// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SpotSpec extends TeaModel {
    @NameInMap("SpotDiscountLimit")
    public Float spotDiscountLimit;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    public static SpotSpec build(java.util.Map<String, ?> map) throws Exception {
        SpotSpec self = new SpotSpec();
        return TeaModel.build(map, self);
    }

    public SpotSpec setSpotDiscountLimit(Float spotDiscountLimit) {
        this.spotDiscountLimit = spotDiscountLimit;
        return this;
    }
    public Float getSpotDiscountLimit() {
        return this.spotDiscountLimit;
    }

    public SpotSpec setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public SpotSpec setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

}
