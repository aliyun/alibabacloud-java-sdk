// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterArchRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically use coupons. Valid values:</p>
     * <ul>
     * <li>true (default): Uses coupons.</li>
     * <li>false: Does not use coupons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
     * <p>Specifies whether to enable the hot standby cluster. Valid values:</p>
     * <ul>
     * <li>on: Enables the hot standby cluster.
     * The equal (peer cluster) feature has been retired and is unavailable. Clusters with HotStandbyCluster set to StandbyClusterON do not support switching the high-availability mode by using this operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HotStandbyCluster")
    public String hotStandbyCluster;

    /**
     * <p>The coupon code. If you do not specify this parameter, the default coupon is used.</p>
     * 
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to view region details.</p>
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
     * <li><strong>auto</strong> (default): Automatically selects the zone.<blockquote>
     * <p>You can use the default value when the HotStandbyCluster parameter is set to on. When the HotStandbyCluster parameter is set to equal, you must specify a zone. You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeZones</a> operation to view zone details.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When you specify a zone, you must not allocate a zone that is already in use by the cluster. You can query the currently active zones through the ZoneIds parameter of DescribeDBClusterAttribute.</p>
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
