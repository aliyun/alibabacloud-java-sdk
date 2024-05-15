// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class GetModifyBEClusterInquiryRequest extends TeaModel {
    @NameInMap("CacheSize")
    public Long cacheSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("ComputeSize")
    public Long computeSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("PreCacheSize")
    public Long preCacheSize;

    @NameInMap("PreComputeSize")
    public Long preComputeSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Quantity")
    public Long quantity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetModifyBEClusterInquiryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModifyBEClusterInquiryRequest self = new GetModifyBEClusterInquiryRequest();
        return TeaModel.build(map, self);
    }

    public GetModifyBEClusterInquiryRequest setCacheSize(Long cacheSize) {
        this.cacheSize = cacheSize;
        return this;
    }
    public Long getCacheSize() {
        return this.cacheSize;
    }

    public GetModifyBEClusterInquiryRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public GetModifyBEClusterInquiryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetModifyBEClusterInquiryRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public GetModifyBEClusterInquiryRequest setComputeSize(Long computeSize) {
        this.computeSize = computeSize;
        return this;
    }
    public Long getComputeSize() {
        return this.computeSize;
    }

    public GetModifyBEClusterInquiryRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public GetModifyBEClusterInquiryRequest setPreCacheSize(Long preCacheSize) {
        this.preCacheSize = preCacheSize;
        return this;
    }
    public Long getPreCacheSize() {
        return this.preCacheSize;
    }

    public GetModifyBEClusterInquiryRequest setPreComputeSize(Long preComputeSize) {
        this.preComputeSize = preComputeSize;
        return this;
    }
    public Long getPreComputeSize() {
        return this.preComputeSize;
    }

    public GetModifyBEClusterInquiryRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public GetModifyBEClusterInquiryRequest setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public GetModifyBEClusterInquiryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetModifyBEClusterInquiryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
