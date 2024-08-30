// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SpotPriceItem extends TeaModel {
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
     * <p>2024-01-17T06:00:00Z</p>
     */
    @NameInMap("Timestamp")
    public String timestamp;

    /**
     * <strong>example:</strong>
     * <p>cn-wulanchabu-a</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static SpotPriceItem build(java.util.Map<String, ?> map) throws Exception {
        SpotPriceItem self = new SpotPriceItem();
        return TeaModel.build(map, self);
    }

    public SpotPriceItem setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SpotPriceItem setSpotDiscount(Float spotDiscount) {
        this.spotDiscount = spotDiscount;
        return this;
    }
    public Float getSpotDiscount() {
        return this.spotDiscount;
    }

    public SpotPriceItem setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public SpotPriceItem setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
