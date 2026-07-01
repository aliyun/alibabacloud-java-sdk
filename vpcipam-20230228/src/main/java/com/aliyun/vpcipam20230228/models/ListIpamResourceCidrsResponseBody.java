// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceCidrsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("IpamResourceCidrs")
    public java.util.List<ListIpamResourceCidrsResponseBodyIpamResourceCidrs> ipamResourceCidrs;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("OverlapResourceCidr")
        public String overlapResourceCidr;

        @NameInMap("OverlapResourceId")
        public String overlapResourceId;

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
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("ComplianceStatus")
        public String complianceStatus;

        @NameInMap("IpCountDetail")
        public ListIpamResourceCidrsResponseBodyIpamResourceCidrsIpCountDetail ipCountDetail;

        @NameInMap("IpUsage")
        public String ipUsage;

        @NameInMap("IpamAllocationId")
        public String ipamAllocationId;

        @NameInMap("IpamId")
        public String ipamId;

        @NameInMap("IpamPoolId")
        public String ipamPoolId;

        @NameInMap("IpamScopeId")
        public String ipamScopeId;

        @NameInMap("ManagementStatus")
        public String managementStatus;

        @NameInMap("OverlapDetail")
        public java.util.List<ListIpamResourceCidrsResponseBodyIpamResourceCidrsOverlapDetail> overlapDetail;

        @NameInMap("OverlapStatus")
        public String overlapStatus;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

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

        public ListIpamResourceCidrsResponseBodyIpamResourceCidrs setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
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
