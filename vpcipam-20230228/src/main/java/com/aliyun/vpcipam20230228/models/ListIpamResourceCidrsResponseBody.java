// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceCidrsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The list of resources in the IPAM pool.</p>
     */
    @NameInMap("IpamResourceCidrs")
    public java.util.List<ListIpamResourceCidrsResponseBodyIpamResourceCidrs> ipamResourceCidrs;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49A9DE56-B68C-5FFC-BC06-509D086F287C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamResourceCidrsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamResourceCidrsResponseBody self = new ListIpamResourceCidrsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamResourceCidrsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListIpamResourceCidrsResponseBody setIpamResourceCidrs(java.util.List<ListIpamResourceCidrsResponseBodyIpamResourceCidrs> ipamResourceCidrs) {
        this.ipamResourceCidrs = ipamResourceCidrs;
        return this;
    }
    public java.util.List<ListIpamResourceCidrsResponseBodyIpamResourceCidrs> getIpamResourceCidrs() {
        return this.ipamResourceCidrs;
    }

    public ListIpamResourceCidrsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpamResourceCidrsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamResourceCidrsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamResourceCidrsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail extends TeaModel {
        @NameInMap("FreeIpCount")
        public String freeIpCount;

        @NameInMap("TotalIpCount")
        public String totalIpCount;

        @NameInMap("UsedIpCount")
        public String usedIpCount;

        public static ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail build(java.util.Map<String, ?> map) throws Exception {
            ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail self = new ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail();
            return TeaModel.build(map, self);
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail setFreeIpCount(String freeIpCount) {
            this.freeIpCount = freeIpCount;
            return this;
        }
        public String getFreeIpCount() {
            return this.freeIpCount;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail setTotalIpCount(String totalIpCount) {
            this.totalIpCount = totalIpCount;
            return this;
        }
        public String getTotalIpCount() {
            return this.totalIpCount;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail setUsedIpCount(String usedIpCount) {
            this.usedIpCount = usedIpCount;
            return this;
        }
        public String getUsedIpCount() {
            return this.usedIpCount;
        }

    }

    public static class ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail extends TeaModel {
        /**
         * <p>The CIDR that overlaps with the current resource.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("OverlapResourceCidr")
        public String overlapResourceCidr;

        /**
         * <p>Instance ID that overlaps with the current resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-aq3fjgnig5av6jb8d****</p>
         */
        @NameInMap("OverlapResourceId")
        public String overlapResourceId;

        /**
         * <p>The region of instance that overlaps with the current resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("OverlapResourceRegion")
        public String overlapResourceRegion;

        public static ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail build(java.util.Map<String, ?> map) throws Exception {
            ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail self = new ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail();
            return TeaModel.build(map, self);
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail setOverlapResourceCidr(String overlapResourceCidr) {
            this.overlapResourceCidr = overlapResourceCidr;
            return this;
        }
        public String getOverlapResourceCidr() {
            return this.overlapResourceCidr;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail setOverlapResourceId(String overlapResourceId) {
            this.overlapResourceId = overlapResourceId;
            return this;
        }
        public String getOverlapResourceId() {
            return this.overlapResourceId;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail setOverlapResourceRegion(String overlapResourceRegion) {
            this.overlapResourceRegion = overlapResourceRegion;
            return this;
        }
        public String getOverlapResourceRegion() {
            return this.overlapResourceRegion;
        }

    }

    public static class ListIpamResourceCidrsResponseBodyIpamResourceCidrs extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>132193271328****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The CIDR block of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/32</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The compliance status of the resource.</p>
         * <ul>
         * <li><strong>Compliant</strong></li>
         * <li><strong>Noncompliant</strong></li>
         * <li><strong>Ignored</strong> Ignored resources are not monitored.</li>
         * <li><strong>Unmanaged</strong>: The resource does not have a CIDR block allocated from the IPAM pool. IPAM does not monitor whether the CIDR block of the resource meets the allocation rules of the IP address pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Compliant</p>
         */
        @NameInMap("ComplianceStatus")
        public String complianceStatus;

        @NameInMap("IpCountDetail")
        public ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail ipCountDetail;

        /**
         * <p>The IP usage that is displayed in decimal form.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IpUsage")
        public String ipUsage;

        /**
         * <p>The ID of the instance to which CIDR blocks are allocated from the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-alloc-112za33e4****</p>
         */
        @NameInMap("IpamAllocationId")
        public String ipamAllocationId;

        /**
         * <p>The ID of the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-uq5dcfc2eqhpf4****</p>
         */
        @NameInMap("IpamId")
        public String ipamId;

        /**
         * <p>The ID of the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t***</p>
         */
        @NameInMap("IpamPoolId")
        public String ipamPoolId;

        /**
         * <p>The ID of the IPAM scope.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-scope-glfmcyldpm8lsy****</p>
         */
        @NameInMap("IpamScopeId")
        public String ipamScopeId;

        /**
         * <p>The management status of the resource.</p>
         * <ul>
         * <li><strong>Managed</strong>: The resource has a CIDR block allocated from an IPAM pool. IPAM is monitoring whether the allocated CIDR block overlaps with other CIDR blocks and whether the allocated CIDR block meets the allocation rules.</li>
         * <li><strong>Unmanaged</strong>: The resource does not have a CIDR block allocated from the IPAM pool. IPAM is monitoring whether the resource has CIDR blocks that meet the allocation rules. Monitor whether CIDR blocks overlap with each other.</li>
         * <li><strong>Ignored</strong>: The resource is not monitored. Ignored resources are not monitored. If you ignore a resource, CIDR blocks allocated to the resource are returned to the IPAM pool and will not be automatically allocated to the resource (if automatic allocation rules are specified).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("ManagementStatus")
        public String managementStatus;

        /**
         * <p>List of resources that overlap with the current resource.</p>
         */
        @NameInMap("OverlapDetail")
        public java.util.List<ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail> overlapDetail;

        /**
         * <p>The overlapping status of the resource.</p>
         * <ul>
         * <li><strong>Nonoverlapping</strong></li>
         * <li><strong>Overlapping</strong></li>
         * <li><strong>Ignored</strong> Ignored resources are not monitored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Nonoverlapping</p>
         */
        @NameInMap("OverlapStatus")
        public String overlapStatus;

        /**
         * <p>The resource ID.</p>
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
         * <p>132193271328****</p>
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
         * <p>The type of resource. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>VSwitch</strong></li>
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
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("SourceCidr")
        public String sourceCidr;

        /**
         * <p>The status of the resource in the IPAM pool. Valid values:</p>
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

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1fjfnrg3av6zb9e****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListIpamResourceCidrsResponseBodyIpamResourceCidrs build(java.util.Map<String, ?> map) throws Exception {
            ListIpamResourceCidrsResponseBodyIpamResourceCidrs self = new ListIpamResourceCidrsResponseBodyIpamResourceCidrs();
            return TeaModel.build(map, self);
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setComplianceStatus(String complianceStatus) {
            this.complianceStatus = complianceStatus;
            return this;
        }
        public String getComplianceStatus() {
            return this.complianceStatus;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setIpCountDetail(ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail ipCountDetail) {
            this.ipCountDetail = ipCountDetail;
            return this;
        }
        public ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail getIpCountDetail() {
            return this.ipCountDetail;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setIpUsage(String ipUsage) {
            this.ipUsage = ipUsage;
            return this;
        }
        public String getIpUsage() {
            return this.ipUsage;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setIpamAllocationId(String ipamAllocationId) {
            this.ipamAllocationId = ipamAllocationId;
            return this;
        }
        public String getIpamAllocationId() {
            return this.ipamAllocationId;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setIpamId(String ipamId) {
            this.ipamId = ipamId;
            return this;
        }
        public String getIpamId() {
            return this.ipamId;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setIpamPoolId(String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }
        public String getIpamPoolId() {
            return this.ipamPoolId;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setIpamScopeId(String ipamScopeId) {
            this.ipamScopeId = ipamScopeId;
            return this;
        }
        public String getIpamScopeId() {
            return this.ipamScopeId;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setManagementStatus(String managementStatus) {
            this.managementStatus = managementStatus;
            return this;
        }
        public String getManagementStatus() {
            return this.managementStatus;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setOverlapDetail(java.util.List<ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail> overlapDetail) {
            this.overlapDetail = overlapDetail;
            return this;
        }
        public java.util.List<ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail> getOverlapDetail() {
            return this.overlapDetail;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setOverlapStatus(String overlapStatus) {
            this.overlapStatus = overlapStatus;
            return this;
        }
        public String getOverlapStatus() {
            return this.overlapStatus;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
