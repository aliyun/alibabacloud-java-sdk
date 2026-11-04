// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DetachCcnInstanceFromCenRequest extends TeaModel {
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
    public java.util.List<DetachCcnInstanceFromCenRequestRegionBindingList> regionBindingList;

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

    public DetachCcnInstanceFromCenRequest setRegionBindingList(java.util.List<DetachCcnInstanceFromCenRequestRegionBindingList> regionBindingList) {
        this.regionBindingList = regionBindingList;
        return this;
    }
    public java.util.List<DetachCcnInstanceFromCenRequestRegionBindingList> getRegionBindingList() {
        return this.regionBindingList;
    }

    public DetachCcnInstanceFromCenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DetachCcnInstanceFromCenRequestRegionBindingList extends TeaModel {
        /**
         * <p>The region ID of the transit router to be disassociated.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance ID of the forward routing transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-uf6mja2ssto2twh8u03xw</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        public static DetachCcnInstanceFromCenRequestRegionBindingList build(java.util.Map<String, ?> map) throws Exception {
            DetachCcnInstanceFromCenRequestRegionBindingList self = new DetachCcnInstanceFromCenRequestRegionBindingList();
            return TeaModel.build(map, self);
        }

        public DetachCcnInstanceFromCenRequestRegionBindingList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DetachCcnInstanceFromCenRequestRegionBindingList setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

    }

}
