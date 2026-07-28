// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class GetModifyBEClusterInquiryRequest extends TeaModel {
    /**
     * <p>The elastic cache space.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CacheSize")
    public Long cacheSize;

    /**
     * <p>The billing method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-xxx-be</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The commodity code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb_go_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The elastic computing resources.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ComputeSize")
    public Long computeSize;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-xxx</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>Specifies whether this is an inquiry for changing the billing method of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ModifyClusterChargeType")
    public Boolean modifyClusterChargeType;

    /**
     * <p>The reserved cache space.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PreCacheSize")
    public Long preCacheSize;

    /**
     * <p>The reserved computing resources.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("PreComputeSize")
    public Long preComputeSize;

    /**
     * <p>The billing cycle.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <strong>example:</strong>
     * <p>123412345</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The quantity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Long quantity;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
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

    public GetModifyBEClusterInquiryRequest setModifyClusterChargeType(Boolean modifyClusterChargeType) {
        this.modifyClusterChargeType = modifyClusterChargeType;
        return this;
    }
    public Boolean getModifyClusterChargeType() {
        return this.modifyClusterChargeType;
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

    public GetModifyBEClusterInquiryRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
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
