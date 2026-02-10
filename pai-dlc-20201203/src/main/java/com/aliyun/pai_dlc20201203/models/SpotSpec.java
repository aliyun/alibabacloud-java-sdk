// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SpotSpec extends TeaModel {
    /**
     * <p>The maximum discount. Specify only one of SpotDiscountLimit and SpotPriceLimit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("SpotDiscountLimit")
    public Float spotDiscountLimit;

    /**
     * <p>The maximum price. Unit: CNY/minute. Specify only one of SpotDiscountLimit and SpotPriceLimit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.4744</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The spot policy. Valid values:</p>
     * <ul>
     * <li>SpotWithPriceLimit</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SpotWithPriceLimit</p>
     */
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
