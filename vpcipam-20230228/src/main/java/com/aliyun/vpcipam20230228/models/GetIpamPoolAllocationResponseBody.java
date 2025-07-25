// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetIpamPoolAllocationResponseBody extends TeaModel {
    /**
     * <p>The allocated CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The time when the instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-15T10:24:19+08:00</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the CIDR allocation of the IPAM pool.</p>
     * <p>The description must be 1 to 256 characters in length and start with a letter, but cannot start with a <code>http://</code> or <code>https://</code>. This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam pool allocation description</p>
     */
    @NameInMap("IpamPoolAllocationDescription")
    public String ipamPoolAllocationDescription;

    /**
     * <p>The ID of the instance to which CIDR blocks are allocated from the IPAM pool.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-alloc-112za33e4****</p>
     */
    @NameInMap("IpamPoolAllocationId")
    public String ipamPoolAllocationId;

    /**
     * <p>The name of the CIDR allocation of the IPAM pool.</p>
     * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam pool allocation name</p>
     */
    @NameInMap("IpamPoolAllocationName")
    public String ipamPoolAllocationName;

    /**
     * <p>The ID of the IPAM pool.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-6rcq3tobayc20t****</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <p>The region of the IPAM pool.</p>
     * <blockquote>
     * <p> If the IPAM pool to which the CIDR block allocation belongs has the region attribute, this parameter is the region of the IPAM pool. If not, this parameter is the IPAM hosted region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3748DEFF-68BE-5EED-9937-7C1D0C21BAB4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource to which the CIDR block is allocated.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp16qjewdsunr41m1****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1616080591216318</p>
     */
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The effective region ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The type of the resource to which the CIDR block is allocated. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong></li>
     * <li><strong>IpamPool</strong></li>
     * <li><strong>Custom</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The source CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("SourceCidr")
    public String sourceCidr;

    /**
     * <p>The instance state. Valid values:</p>
     * <ul>
     * <li><strong>Created</strong></li>
     * <li><strong>Deleted</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Created</p>
     */
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
