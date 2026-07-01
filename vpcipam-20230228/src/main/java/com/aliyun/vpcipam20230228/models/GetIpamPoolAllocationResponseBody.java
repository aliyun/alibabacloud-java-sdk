// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetIpamPoolAllocationResponseBody extends TeaModel {
    @NameInMap("Cidr")
    public String cidr;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("IpamPoolAllocationDescription")
    public String ipamPoolAllocationDescription;

    @NameInMap("IpamPoolAllocationId")
    public String ipamPoolAllocationId;

    @NameInMap("IpamPoolAllocationName")
    public String ipamPoolAllocationName;

    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("SourceCidr")
    public String sourceCidr;

    @NameInMap("Status")
    public String status;

    public static GetIpamPoolAllocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpamPoolAllocationResponseBody self = new GetIpamPoolAllocationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpamPoolAllocationResponseBody setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public GetIpamPoolAllocationResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetIpamPoolAllocationResponseBody setIpamPoolAllocationDescription(String ipamPoolAllocationDescription) {
        this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
        return this;
    }
    public String getIpamPoolAllocationDescription() {
        return this.ipamPoolAllocationDescription;
    }

    public GetIpamPoolAllocationResponseBody setIpamPoolAllocationId(String ipamPoolAllocationId) {
        this.ipamPoolAllocationId = ipamPoolAllocationId;
        return this;
    }
    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    public GetIpamPoolAllocationResponseBody setIpamPoolAllocationName(String ipamPoolAllocationName) {
        this.ipamPoolAllocationName = ipamPoolAllocationName;
        return this;
    }
    public String getIpamPoolAllocationName() {
        return this.ipamPoolAllocationName;
    }

    public GetIpamPoolAllocationResponseBody setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
        return this;
    }
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    public GetIpamPoolAllocationResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetIpamPoolAllocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIpamPoolAllocationResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetIpamPoolAllocationResponseBody setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetIpamPoolAllocationResponseBody setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public GetIpamPoolAllocationResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetIpamPoolAllocationResponseBody setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public GetIpamPoolAllocationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
