// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamDiscoveredResourceResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("IpamDiscoveredResources")
    public java.util.List<ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources> ipamDiscoveredResources;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamDiscoveredResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamDiscoveredResourceResponseBody self = new ListIpamDiscoveredResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamDiscoveredResourceResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListIpamDiscoveredResourceResponseBody setIpamDiscoveredResources(java.util.List<ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources> ipamDiscoveredResources) {
        this.ipamDiscoveredResources = ipamDiscoveredResources;
        return this;
    }
    public java.util.List<ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources> getIpamDiscoveredResources() {
        return this.ipamDiscoveredResources;
    }

    public ListIpamDiscoveredResourceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpamDiscoveredResourceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamDiscoveredResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamDiscoveredResourceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail extends TeaModel {
        @NameInMap("FreeIpCount")
        public String freeIpCount;

        @NameInMap("TotalIpCount")
        public String totalIpCount;

        @NameInMap("UsedIpCount")
        public String usedIpCount;

        public static ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail build(java.util.Map<String, ?> map) throws Exception {
            ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail self = new ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail();
            return TeaModel.build(map, self);
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail setFreeIpCount(String freeIpCount) {
            this.freeIpCount = freeIpCount;
            return this;
        }
        public String getFreeIpCount() {
            return this.freeIpCount;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail setTotalIpCount(String totalIpCount) {
            this.totalIpCount = totalIpCount;
            return this;
        }
        public String getTotalIpCount() {
            return this.totalIpCount;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail setUsedIpCount(String usedIpCount) {
            this.usedIpCount = usedIpCount;
            return this;
        }
        public String getUsedIpCount() {
            return this.usedIpCount;
        }

    }

    public static class ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("DiscoveryTime")
        public String discoveryTime;

        @NameInMap("IpCountDetail")
        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail ipCountDetail;

        @NameInMap("IpUsage")
        public String ipUsage;

        @NameInMap("IpamResourceDiscoveryId")
        public String ipamResourceDiscoveryId;

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

        @NameInMap("VpcId")
        public String vpcId;

        public static ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources build(java.util.Map<String, ?> map) throws Exception {
            ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources self = new ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources();
            return TeaModel.build(map, self);
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setDiscoveryTime(String discoveryTime) {
            this.discoveryTime = discoveryTime;
            return this;
        }
        public String getDiscoveryTime() {
            return this.discoveryTime;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setIpCountDetail(ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail ipCountDetail) {
            this.ipCountDetail = ipCountDetail;
            return this;
        }
        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail getIpCountDetail() {
            return this.ipCountDetail;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setIpUsage(String ipUsage) {
            this.ipUsage = ipUsage;
            return this;
        }
        public String getIpUsage() {
            return this.ipUsage;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
            this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
            return this;
        }
        public String getIpamResourceDiscoveryId() {
            return this.ipamResourceDiscoveryId;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
