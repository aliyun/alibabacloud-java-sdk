// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceCidrsResponseBody extends TeaModel {
    @NameInMap("IpamResourceCidrs")
    public java.util.List<ListIpamResourceCidrsResponseBodyIpamResourceCidrs> ipamResourceCidrs;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>49A9DE56-B68C-5FFC-BC06-509D086F287C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamResourceCidrsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamResourceCidrsResponseBody self = new ListIpamResourceCidrsResponseBody();
        return TeaModel.build(map, self);
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

    public static class ListIpamResourceCidrsResponseBodyIpamResourceCidrs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>132193271328****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.0/32</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>Compliant</p>
         */
        @NameInMap("ComplianceStatus")
        public String complianceStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IpUsage")
        public String ipUsage;

        /**
         * <strong>example:</strong>
         * <p>ipam-pool-alloc-112za33e4****</p>
         */
        @NameInMap("IpamAllocationId")
        public String ipamAllocationId;

        /**
         * <strong>example:</strong>
         * <p>ipam-uq5dcfc2eqhpf4****</p>
         */
        @NameInMap("IpamId")
        public String ipamId;

        /**
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t***</p>
         */
        @NameInMap("IpamPoolId")
        public String ipamPoolId;

        /**
         * <strong>example:</strong>
         * <p>ipam-scope-glfmcyldpm8lsy****</p>
         */
        @NameInMap("IpamScopeId")
        public String ipamScopeId;

        /**
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("ManagementStatus")
        public String managementStatus;

        /**
         * <strong>example:</strong>
         * <p>Nonoverlapping</p>
         */
        @NameInMap("OverlapStatus")
        public String overlapStatus;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp16qjewdsunr41m1****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>132193271328****</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("SourceCidr")
        public String sourceCidr;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

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

    }

}
