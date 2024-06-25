// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolAllocationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>192.168.1.0/24</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    @NameInMap("IpamPoolAllocationIds")
    public java.util.List<String> ipamPoolAllocationIds;

    /**
     * <strong>example:</strong>
     * <p>ipam-pool-6rcq3tobayc20t****</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListIpamPoolAllocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpamPoolAllocationsRequest self = new ListIpamPoolAllocationsRequest();
        return TeaModel.build(map, self);
    }

    public ListIpamPoolAllocationsRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public ListIpamPoolAllocationsRequest setIpamPoolAllocationIds(java.util.List<String> ipamPoolAllocationIds) {
        this.ipamPoolAllocationIds = ipamPoolAllocationIds;
        return this;
    }
    public java.util.List<String> getIpamPoolAllocationIds() {
        return this.ipamPoolAllocationIds;
    }

    public ListIpamPoolAllocationsRequest setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
        return this;
    }
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    public ListIpamPoolAllocationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpamPoolAllocationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamPoolAllocationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
