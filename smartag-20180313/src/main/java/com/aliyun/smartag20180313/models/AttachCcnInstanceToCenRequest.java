// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AttachCcnInstanceToCenRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Connect Network (CCN) to attach.</p>
     * 
     * <strong>example:</strong>
     * <p>ccn-isdjvvkexkrpk*****</p>
     */
    @NameInMap("CcnId")
    public String ccnId;

    /**
     * <p>The ID of the CEN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-joimmi1s2ob3rdxw79</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The CIDR block allocation mode. Valid values: PER_REGION and UNIFIED. PER_REGION indicates that a custom CIDR block is specified for each region. UNIFIED indicates that CIDR blocks are allocated in a unified manner.</p>
     * 
     * <strong>example:</strong>
     * <p>UNIFIED</p>
     */
    @NameInMap("CidrAllocationMode")
    public String cidrAllocationMode;

    /**
     * <p>The list of transit routers (TRs) to be attached to the CCN.</p>
     */
    @NameInMap("RegionBindingList")
    public java.util.List<AttachCcnInstanceToCenRequestRegionBindingList> regionBindingList;

    /**
     * <p>The region ID of the Cloud Connect Network (CCN) instance. You can call the DescribeRegions operation to query the regions supported by Smart Access Gateway and the corresponding region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Internet CIDR block used when the Cloud Connect Network (CCN) is attached to the Cloud Enterprise Network (CEN).</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.55.0/24</p>
     */
    @NameInMap("Subnet")
    public String subnet;

    public static AttachCcnInstanceToCenRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachCcnInstanceToCenRequest self = new AttachCcnInstanceToCenRequest();
        return TeaModel.build(map, self);
    }

    public AttachCcnInstanceToCenRequest setCcnId(String ccnId) {
        this.ccnId = ccnId;
        return this;
    }
    public String getCcnId() {
        return this.ccnId;
    }

    public AttachCcnInstanceToCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public AttachCcnInstanceToCenRequest setCidrAllocationMode(String cidrAllocationMode) {
        this.cidrAllocationMode = cidrAllocationMode;
        return this;
    }
    public String getCidrAllocationMode() {
        return this.cidrAllocationMode;
    }

    public AttachCcnInstanceToCenRequest setRegionBindingList(java.util.List<AttachCcnInstanceToCenRequestRegionBindingList> regionBindingList) {
        this.regionBindingList = regionBindingList;
        return this;
    }
    public java.util.List<AttachCcnInstanceToCenRequestRegionBindingList> getRegionBindingList() {
        return this.regionBindingList;
    }

    public AttachCcnInstanceToCenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachCcnInstanceToCenRequest setSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }
    public String getSubnet() {
        return this.subnet;
    }

    public static class AttachCcnInstanceToCenRequestRegionBindingList extends TeaModel {
        /**
         * <p>The custom CIDR block for each region when the CidrAllocationMode parameter is set to PER_REGION.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.60.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The region ID of the transit router to be attached.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-finance-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The transit router instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-wz9h1y152p7bajkehs5a3</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        public static AttachCcnInstanceToCenRequestRegionBindingList build(java.util.Map<String, ?> map) throws Exception {
            AttachCcnInstanceToCenRequestRegionBindingList self = new AttachCcnInstanceToCenRequestRegionBindingList();
            return TeaModel.build(map, self);
        }

        public AttachCcnInstanceToCenRequestRegionBindingList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public AttachCcnInstanceToCenRequestRegionBindingList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public AttachCcnInstanceToCenRequestRegionBindingList setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

    }

}
