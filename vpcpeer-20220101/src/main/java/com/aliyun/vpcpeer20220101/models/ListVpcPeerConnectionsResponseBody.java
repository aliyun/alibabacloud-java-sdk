// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ListVpcPeerConnectionsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
     * <li>If the value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
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
     * <p>0ED8D006-F706-4D23-88ED-E11ED39DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The details of the VPC peering connections.</p>
     */
    @NameInMap("VpcPeerConnects")
    public java.util.List<VpcPeerConnects> vpcPeerConnects;

    public static ListVpcPeerConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcPeerConnectionsResponseBody self = new ListVpcPeerConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcPeerConnectionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcPeerConnectionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcPeerConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcPeerConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVpcPeerConnectionsResponseBody setVpcPeerConnects(java.util.List<VpcPeerConnects> vpcPeerConnects) {
        this.vpcPeerConnects = vpcPeerConnects;
        return this;
    }
    public java.util.List<VpcPeerConnects> getVpcPeerConnects() {
        return this.vpcPeerConnects;
    }

    public static class AcceptingVpc extends TeaModel {
        /**
         * <p>The CIDR block of the accepter VPC.</p>
         */
        @NameInMap("Ipv4Cidrs")
        public java.util.List<String> ipv4Cidrs;

        /**
         * <p>The IPv6 CIDR block of the accepter VPC.</p>
         */
        @NameInMap("Ipv6Cidrs")
        public java.util.List<String> ipv6Cidrs;

        /**
         * <p>The ID of the accepter VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vzjkp2q1xgnind****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static AcceptingVpc build(java.util.Map<String, ?> map) throws Exception {
            AcceptingVpc self = new AcceptingVpc();
            return TeaModel.build(map, self);
        }

        public AcceptingVpc setIpv4Cidrs(java.util.List<String> ipv4Cidrs) {
            this.ipv4Cidrs = ipv4Cidrs;
            return this;
        }
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        public AcceptingVpc setIpv6Cidrs(java.util.List<String> ipv6Cidrs) {
            this.ipv6Cidrs = ipv6Cidrs;
            return this;
        }
        public java.util.List<String> getIpv6Cidrs() {
            return this.ipv6Cidrs;
        }

        public AcceptingVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class Tags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class Vpc extends TeaModel {
        /**
         * <p>The CIDR block of the requester VPC.</p>
         */
        @NameInMap("Ipv4Cidrs")
        public java.util.List<String> ipv4Cidrs;

        /**
         * <p>The IPv6 CIDR block of the requester VPC.</p>
         */
        @NameInMap("Ipv6Cidrs")
        public java.util.List<String> ipv6Cidrs;

        /**
         * <p>The ID of the requester VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1gsk7h12ew7oegk****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static Vpc build(java.util.Map<String, ?> map) throws Exception {
            Vpc self = new Vpc();
            return TeaModel.build(map, self);
        }

        public Vpc setIpv4Cidrs(java.util.List<String> ipv4Cidrs) {
            this.ipv4Cidrs = ipv4Cidrs;
            return this;
        }
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        public Vpc setIpv6Cidrs(java.util.List<String> ipv6Cidrs) {
            this.ipv6Cidrs = ipv6Cidrs;
            return this;
        }
        public java.util.List<String> getIpv6Cidrs() {
            return this.ipv6Cidrs;
        }

        public Vpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class VpcPeerConnects extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the accepter VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>253460731706911258</p>
         */
        @NameInMap("AcceptingOwnerUid")
        public Long acceptingOwnerUid;

        /**
         * <p>The region ID of the accepter VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("AcceptingRegionId")
        public String acceptingRegionId;

        /**
         * <p>The details of the accepter VPC.</p>
         */
        @NameInMap("AcceptingVpc")
        public AcceptingVpc acceptingVpc;

        /**
         * <p>The bandwidth of the VPC peering connection. Unit: Mbit/s. The value is an integer greater than 0.</p>
         * <blockquote>
         * <p> If the value is set to -1, it indicates that no limit is imposed on the bandwidth.</p>
         * </blockquote>
         * <p>Default value:</p>
         * <ul>
         * <li>The default bandwidth of an inter-region VPC peering connection is <strong>1024</strong> Mbit/s.</li>
         * <li>The default bandwidth of an intra-region VPC peering connection is <strong>-1</strong> Mbit/s.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The business status of the VPC peering connection. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>FinancialLocked</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BizStatus")
        public String bizStatus;

        /**
         * <p>The description of the VPC peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the VPC peering connection was created. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-24T09:02:36Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The expiration time of the VPC peering connection. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format in UTC.</p>
         * <p>The expiration time is returned only when the <strong>Status</strong> of the VPC peering connection is <strong>Accepting</strong> or <strong>Expired</strong>. Otherwise, <strong>null</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-01T09:02:36Z</p>
         */
        @NameInMap("GmtExpired")
        public String gmtExpired;

        /**
         * <p>The time when the VPC peering connection was modified. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-24T19:20:45Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the VPC peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pcc-lnk0m24khwvtkm****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LinkType")
        public String linkType;

        /**
         * <p>The name of the VPC peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcpeer</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the Alibaba Cloud account to which the requester VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>253460731706911258</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The region ID of the requester VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2gvbs746gt4q</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the VPC peering connection. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Accepting</strong></li>
         * <li><strong>Updating</strong></li>
         * <li><strong>Rejected</strong></li>
         * <li><strong>Expired</strong></li>
         * <li><strong>Activated</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * <p>For more information about the status of VPC peering connections, see <a href="https://help.aliyun.com/document_detail/418507.html">Overview of VPC peering connections</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Activated</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<Tags> tags;

        /**
         * <p>The details of the requester VPC.</p>
         */
        @NameInMap("Vpc")
        public Vpc vpc;

        public static VpcPeerConnects build(java.util.Map<String, ?> map) throws Exception {
            VpcPeerConnects self = new VpcPeerConnects();
            return TeaModel.build(map, self);
        }

        public VpcPeerConnects setAcceptingOwnerUid(Long acceptingOwnerUid) {
            this.acceptingOwnerUid = acceptingOwnerUid;
            return this;
        }
        public Long getAcceptingOwnerUid() {
            return this.acceptingOwnerUid;
        }

        public VpcPeerConnects setAcceptingRegionId(String acceptingRegionId) {
            this.acceptingRegionId = acceptingRegionId;
            return this;
        }
        public String getAcceptingRegionId() {
            return this.acceptingRegionId;
        }

        public VpcPeerConnects setAcceptingVpc(AcceptingVpc acceptingVpc) {
            this.acceptingVpc = acceptingVpc;
            return this;
        }
        public AcceptingVpc getAcceptingVpc() {
            return this.acceptingVpc;
        }

        public VpcPeerConnects setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public VpcPeerConnects setBizStatus(String bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public String getBizStatus() {
            return this.bizStatus;
        }

        public VpcPeerConnects setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public VpcPeerConnects setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public VpcPeerConnects setGmtExpired(String gmtExpired) {
            this.gmtExpired = gmtExpired;
            return this;
        }
        public String getGmtExpired() {
            return this.gmtExpired;
        }

        public VpcPeerConnects setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public VpcPeerConnects setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public VpcPeerConnects setLinkType(String linkType) {
            this.linkType = linkType;
            return this;
        }
        public String getLinkType() {
            return this.linkType;
        }

        public VpcPeerConnects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VpcPeerConnects setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public VpcPeerConnects setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public VpcPeerConnects setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public VpcPeerConnects setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public VpcPeerConnects setTags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public VpcPeerConnects setVpc(Vpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public Vpc getVpc() {
            return this.vpc;
        }

    }

}
