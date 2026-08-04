// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SpotStockInternalInfo extends TeaModel {
    /**
     * <p>The number of available Spot Instances.</p>
     */
    @NameInMap("availableQuantity")
    public Integer availableQuantity;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The ID of the high-performance network (HPN) zone.</p>
     */
    @NameInMap("hpnZone")
    public String hpnZone;

    /**
     * <p>The total number of Spot Instances.</p>
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
