// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterStoragePerformanceRequest extends TeaModel {
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>Specifies if the I/O performance burst feature is enabled for an ESSD AutoPL disk. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled (Default)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter applies only when StorageType is set to ESSDAUTOPL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public String burstingEnabled;

    /**
     * <p>A client-generated token that ensures request idempotence. The token must be unique for each request. It is case-sensitive and can be up to 64 ASCII characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f******************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The modification type. Valid values:</p>
     * <ul>
     * <li><p><strong>Upgrade</strong>: Upgrades the storage performance.</p>
     * </li>
     * <li><p><strong>Downgrade</strong>: Downgrades the storage performance.</p>
     * </li>
     * </ul>
     * 
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
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Valid values: 0 to min{50,000, 1000 \* capacity - baseline performance}.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Baseline performance = min{1,800 + 50 \* capacity, 50,000}.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter applies only when StorageType is set to ESSDAUTOPL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2500</p>
     */
    @NameInMap("ProvisionedIops")
    public Integer provisionedIops;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The target storage type. Valid values for Enterprise Edition:</p>
     * <ul>
     * <li><p><strong>PSL5</strong></p>
     * </li>
     * <li><p><strong>PSL4</strong></p>
     * </li>
     * </ul>
     * <p>Valid values for Standard Edition:</p>
     * <ul>
     * <li><p><strong>ESSDPL0</strong></p>
     * </li>
     * <li><p><strong>ESSDPL1</strong></p>
     * </li>
     * <li><p><strong>ESSDPL2</strong></p>
     * </li>
     * <li><p><strong>ESSDPL3</strong></p>
     * </li>
     * <li><p><strong>ESSDAUTOPL</strong></p>
     * </li>
     * </ul>
     * 
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
