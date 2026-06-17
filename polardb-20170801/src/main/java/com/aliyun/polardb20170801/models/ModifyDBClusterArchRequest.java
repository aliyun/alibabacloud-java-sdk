// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterArchRequest extends TeaModel {
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable a hot standby cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enables a hot standby cluster.</p>
     * </li>
     * <li><p><strong>equal</strong>: Enables a peer cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HotStandbyCluster")
    public String hotStandbyCluster;

    /**
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The zone for the hot standby storage cluster. Valid values:</p>
     * <ul>
     * <li><strong>auto</strong> (default): The system automatically selects a zone.</li>
     * </ul>
     * <blockquote>
     * <p>The default value is valid only when \<code>HotStandbyCluster\\</code> is set to \<code>on\\</code>. A specific zone is required when \<code>HotStandbyCluster\\</code> is set to \<code>equal\\</code>. For more information about zones, see <a href="https://help.aliyun.com/document_detail/98041.html">DescribeZones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-i</p>
     */
    @NameInMap("StandbyAZ")
    public String standbyAZ;

    public static ModifyDBClusterArchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterArchRequest self = new ModifyDBClusterArchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterArchRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public ModifyDBClusterArchRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterArchRequest setHotStandbyCluster(String hotStandbyCluster) {
        this.hotStandbyCluster = hotStandbyCluster;
        return this;
    }
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    public ModifyDBClusterArchRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public ModifyDBClusterArchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBClusterArchRequest setStandbyAZ(String standbyAZ) {
        this.standbyAZ = standbyAZ;
        return this;
    }
    public String getStandbyAZ() {
        return this.standbyAZ;
    }

}
