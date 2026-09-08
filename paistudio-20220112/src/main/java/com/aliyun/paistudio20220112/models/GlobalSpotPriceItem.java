// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GlobalSpotPriceItem extends TeaModel {
    /**
     * <p>The effective period.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-20T06:45:00Z</p>
     */
    @NameInMap("effectiveAt")
    public String effectiveAt;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ml.gp7vf.16.40xlarge</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The current market price.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("spotDiscount")
    public String spotDiscount;

    public static GlobalSpotPriceItem build(java.util.Map<String, ?> map) throws Exception {
        GlobalSpotPriceItem self = new GlobalSpotPriceItem();
        return TeaModel.build(map, self);
    }

    public GlobalSpotPriceItem setEffectiveAt(String effectiveAt) {
        this.effectiveAt = effectiveAt;
        return this;
    }
    public String getEffectiveAt() {
        return this.effectiveAt;
    }

    public GlobalSpotPriceItem setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public GlobalSpotPriceItem setSpotDiscount(String spotDiscount) {
        this.spotDiscount = spotDiscount;
        return this;
    }
    public String getSpotDiscount() {
        return this.spotDiscount;
    }

}
