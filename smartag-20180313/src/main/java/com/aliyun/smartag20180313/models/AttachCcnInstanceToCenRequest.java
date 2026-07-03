// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AttachCcnInstanceToCenRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Connect Network (CCN) instance to attach.</p>
     * 
     * <strong>example:</strong>
     * <p>ccn-isdjvvkexkrpk*****</p>
     */
    @NameInMap("CcnId")
    public String ccnId;

    /**
     * <p>The ID of the CEN instance to authorize.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-joimmi1s2ob3rdxw79</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The region ID of the Cloud Connect Network (CCN) instance. You can invoke the DescribeRegions operation to query the regions supported by Smart Access Gateway and the corresponding region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Internet CIDR block used when the Cloud Connect Network (CCN) instance is attached to the CEN instance.</p>
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

}
