// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamDiscoveredResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("IpamDiscoveredResources")
    public java.util.List<ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources> ipamDiscoveredResources;

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
     * <strong>example:</strong>
     * <p>3748DEFF-68BE-5EED-9937-7C1D0C21BAB4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
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

    public static class ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources extends TeaModel {
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
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("DiscoveryTime")
        public String discoveryTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IpUsage")
        public String ipUsage;

        /**
         * <strong>example:</strong>
         * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
         */
        @NameInMap("IpamResourceDiscoveryId")
        public String ipamResourceDiscoveryId;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf611fp465c7dyb4z****</p>
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
         * <p>vpc-uf611fp465c7dyb4z****</p>
         */
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
