// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterArchRequest extends TeaModel {
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable the hot standby storage cluster feature. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables hot standby storage cluster.</li>
     * <li><strong>equal</strong>: Enable a peer-to-peer cluster.</li>
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
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query information about regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The zone of the hot standby storage cluster. Valid values:</p>
     * <ul>
     * <li><strong>auto</strong> (default): The zone is automatically selected.</li>
     * </ul>
     * <blockquote>
     * <p> You can use the default value when HotStandbyCluster is set to on. If HotStandbyCluster is set to equal, specify the zone of the hot standby storage cluster. You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeZones</a> operation to query information about zones.</p>
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
