// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DetachCcnInstanceFromCenShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the attached Cloud Connect Network (CCN).</p>
     * 
     * <strong>example:</strong>
     * <p>ccn-isdjvvkexkrpk*****</p>
     */
    @NameInMap("CcnId")
    public String ccnId;

    /**
     * <p>The ID of the CEN instance from which you want to revoke authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-9j8gkkj7z9vie9a8z9</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The list of transit routers to be disassociated from the CCN.</p>
     */
    @NameInMap("RegionBindingList")
    public String regionBindingListShrink;

    /**
     * <p>The region ID of the Smart Access Gateway instance. You can call the DescribeRegions operation to query the regions supported by Smart Access Gateway and the corresponding region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DetachCcnInstanceFromCenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachCcnInstanceFromCenShrinkRequest self = new DetachCcnInstanceFromCenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetachCcnInstanceFromCenShrinkRequest setCcnId(String ccnId) {
        this.ccnId = ccnId;
        return this;
    }
    public String getCcnId() {
        return this.ccnId;
    }

    public DetachCcnInstanceFromCenShrinkRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DetachCcnInstanceFromCenShrinkRequest setRegionBindingListShrink(String regionBindingListShrink) {
        this.regionBindingListShrink = regionBindingListShrink;
        return this;
    }
    public String getRegionBindingListShrink() {
        return this.regionBindingListShrink;
    }

    public DetachCcnInstanceFromCenShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
