// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DetachCcnInstanceFromCenRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Connect Network (CCN) that is bound to the CEN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ccn-isdjvvkexkrpk*****</p>
     */
    @NameInMap("CcnId")
    public String ccnId;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance from which you want to revoke the authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-9j8gkkj7z9vie9a8z9</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The region ID of the Smart Access Gateway instance. You can call the DescribeRegions operation to query the regions supported by Smart Access Gateway and the corresponding region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DetachCcnInstanceFromCenRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachCcnInstanceFromCenRequest self = new DetachCcnInstanceFromCenRequest();
        return TeaModel.build(map, self);
    }

    public DetachCcnInstanceFromCenRequest setCcnId(String ccnId) {
        this.ccnId = ccnId;
        return this;
    }
    public String getCcnId() {
        return this.ccnId;
    }

    public DetachCcnInstanceFromCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DetachCcnInstanceFromCenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
