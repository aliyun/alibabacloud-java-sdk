// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterStoragePerformanceRequest extends TeaModel {
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>Specifies whether to enable the I/O Burst feature for the ESSD AutoPL disk. Valid value:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is available only when the StorageType parameter is set to ESSDAUTOPL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public String burstingEnabled;

    /**
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f******************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <strong>example:</strong>
     * <p>2500</p>
     */
    @NameInMap("ProvisionedIops")
    public Integer provisionedIops;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>ESSDAUTOPL</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static ModifyDBClusterStoragePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterStoragePerformanceRequest self = new ModifyDBClusterStoragePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterStoragePerformanceRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public ModifyDBClusterStoragePerformanceRequest setBurstingEnabled(String burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public String getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public ModifyDBClusterStoragePerformanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBClusterStoragePerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterStoragePerformanceRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyDBClusterStoragePerformanceRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public ModifyDBClusterStoragePerformanceRequest setProvisionedIops(Integer provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public Integer getProvisionedIops() {
        return this.provisionedIops;
    }

    public ModifyDBClusterStoragePerformanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterStoragePerformanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
