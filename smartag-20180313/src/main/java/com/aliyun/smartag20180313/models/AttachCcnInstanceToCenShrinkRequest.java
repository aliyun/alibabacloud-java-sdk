// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AttachCcnInstanceToCenShrinkRequest extends TeaModel {
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
    public String regionBindingListShrink;

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

    public static AttachCcnInstanceToCenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachCcnInstanceToCenShrinkRequest self = new AttachCcnInstanceToCenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachCcnInstanceToCenShrinkRequest setCcnId(String ccnId) {
        this.ccnId = ccnId;
        return this;
    }
    public String getCcnId() {
        return this.ccnId;
    }

    public AttachCcnInstanceToCenShrinkRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public AttachCcnInstanceToCenShrinkRequest setCidrAllocationMode(String cidrAllocationMode) {
        this.cidrAllocationMode = cidrAllocationMode;
        return this;
    }
    public String getCidrAllocationMode() {
        return this.cidrAllocationMode;
    }

    public AttachCcnInstanceToCenShrinkRequest setRegionBindingListShrink(String regionBindingListShrink) {
        this.regionBindingListShrink = regionBindingListShrink;
        return this;
    }
    public String getRegionBindingListShrink() {
        return this.regionBindingListShrink;
    }

    public AttachCcnInstanceToCenShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachCcnInstanceToCenShrinkRequest setSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }
    public String getSubnet() {
        return this.subnet;
    }

}
