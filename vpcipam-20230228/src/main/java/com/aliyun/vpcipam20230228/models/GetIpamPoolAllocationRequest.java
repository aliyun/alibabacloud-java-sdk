// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetIpamPoolAllocationRequest extends TeaModel {
    /**
     * <p>The ID of the instance to which CIDR blocks are allocated from the IPAM pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-alloc-112za33e4****</p>
     */
    @NameInMap("IpamPoolAllocationId")
    public String ipamPoolAllocationId;

    /**
     * <p>The region of the IPAM pool.</p>
     * <blockquote>
     * <p> If the IPAM pool to which CIDR allocation belongs has the region attribute, this parameter is the region of the IPAM pool. If not, this parameter is the IPAM managed region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetIpamPoolAllocationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpamPoolAllocationRequest self = new GetIpamPoolAllocationRequest();
        return TeaModel.build(map, self);
    }

    public GetIpamPoolAllocationRequest setIpamPoolAllocationId(String ipamPoolAllocationId) {
        this.ipamPoolAllocationId = ipamPoolAllocationId;
        return this;
    }
    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    public GetIpamPoolAllocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
