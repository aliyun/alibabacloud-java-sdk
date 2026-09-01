// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterStoragePerformanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically use coupons. Valid values:</p>
     * <ul>
     * <li>true (default): uses coupons.</li>
     * <li>false: does not use coupons.</li>
     * </ul>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>Specifies whether to enable I/O performance burst for the ESSD AutoPL cloud disk. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled (default).</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only when StorageType is set to ESSDAUTOPL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public String burstingEnabled;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token is case-sensitive and can contain only ASCII characters. The token can be up to 64 characters in length.</p>
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
     * <p>The type of the specification change. Valid values: </p>
     * <ul>
     * <li><strong>Upgrade</strong>: upgrades the specifications.</li>
     * <li><strong>Downgrade</strong>: downgrades the specifications.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The coupon code. If this parameter is not specified, the default coupon is used.</p>
     * 
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p id="p_wyg_t4a_glm" props="china" icmsditafragmentmagic=1>The provisioned read/write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.</p>
     * <p id="p_6de_jxy_k2g" props="china" icmsditafragmentmagic=1>Baseline performance = min{1,800 + 50 × Capacity, 50000}.</p>
     * <note id="note_7kj_j0o_rgs" props="china" icmsditafragmentmagic=1>This parameter is supported only when StorageType is set to ESSDAUTOPL.</note>
     * 
     * <strong>example:</strong>
     * <p>2500</p>
     */
    @NameInMap("ProvisionedIops")
    public Integer provisionedIops;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The target storage type. Valid values for PolarDB Enterprise Edition:</p>
     * <ul>
     * <li><strong>PSL5</strong></li>
     * <li><strong>PSL4</strong></li>
     * </ul>
     * <p>Valid values for PolarDB for MySQL Standard Edition:</p>
     * <ul>
     * <li><strong>ESSDPL0</strong></li>
     * <li><strong>ESSDPL1</strong></li>
     * <li><strong>ESSDPL2</strong></li>
     * <li><strong>ESSDPL3</strong></li>
     * <li><strong>ESSDAUTOPL</strong></li>
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
