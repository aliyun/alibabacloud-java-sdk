// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SpotStockPreview extends TeaModel {
    /**
     * <p>The available quantity.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AvailableQuantity")
    public Integer availableQuantity;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The spot instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ml.gu8xf.8xlarge-gu108</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The current spot instance discount.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("SpotDiscount")
    public Float spotDiscount;

    /**
     * <p>The spot instance inventory status.</p>
     * 
     * <strong>example:</strong>
     * <p>WithStock</p>
     */
    @NameInMap("StockStatus")
    public String stockStatus;

    public static SpotStockPreview build(java.util.Map<String, ?> map) throws Exception {
        SpotStockPreview self = new SpotStockPreview();
        return TeaModel.build(map, self);
    }

    public SpotStockPreview setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }
    public Integer getAvailableQuantity() {
        return this.availableQuantity;
    }

    public SpotStockPreview setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
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
