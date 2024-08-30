// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SpotStockPreview extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ml.gu8xf.8xlarge-gu108</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("SpotDiscount")
    public Float spotDiscount;

    /**
     * <strong>example:</strong>
     * <p>WithStock</p>
     */
    @NameInMap("StockStatus")
    public String stockStatus;

    public static SpotStockPreview build(java.util.Map<String, ?> map) throws Exception {
        SpotStockPreview self = new SpotStockPreview();
        return TeaModel.build(map, self);
    }

    public SpotStockPreview setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SpotStockPreview setSpotDiscount(Float spotDiscount) {
        this.spotDiscount = spotDiscount;
        return this;
    }
    public Float getSpotDiscount() {
        return this.spotDiscount;
    }

    public SpotStockPreview setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
        return this;
    }
    public String getStockStatus() {
        return this.stockStatus;
    }

}
