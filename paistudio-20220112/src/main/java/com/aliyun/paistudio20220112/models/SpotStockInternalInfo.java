// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SpotStockInternalInfo extends TeaModel {
    /**
     * <p>The available quantity.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("availableQuantity")
    public Integer availableQuantity;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster1</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The high-performance network zone.</p>
     * 
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("hpnZone")
    public String hpnZone;

    /**
     * <p>The total quantity.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("totalQuantity")
    public Integer totalQuantity;

    public static SpotStockInternalInfo build(java.util.Map<String, ?> map) throws Exception {
        SpotStockInternalInfo self = new SpotStockInternalInfo();
        return TeaModel.build(map, self);
    }

    public SpotStockInternalInfo setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }
    public Integer getAvailableQuantity() {
        return this.availableQuantity;
    }

    public SpotStockInternalInfo setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SpotStockInternalInfo setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public SpotStockInternalInfo setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
        return this;
    }
    public Integer getTotalQuantity() {
        return this.totalQuantity;
    }

}
