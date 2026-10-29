// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ListVpcPeerConnectionsResponseBody extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent request is to be sent.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token used to start the next query.</li>
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
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The details of the queried VPC peering connections.</p>
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
         * <p>The IPv4 CIDR blocks of the acceptor.</p>
         */
        @NameInMap("Ipv4Cidrs")
        public java.util.List<String> ipv4Cidrs;

        /**
         * <p>The IPv6 CIDR blocks of the acceptor.</p>
         */
        @NameInMap("Ipv6Cidrs")
        public java.util.List<String> ipv6Cidrs;

        /**
         * <p>The instance ID of the acceptor VPC-connected instance.</p>
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
         * <p>The IPv4 CIDR blocks of the initiator.</p>
         */
        @NameInMap("Ipv4Cidrs")
        public java.util.List<String> ipv4Cidrs;

        /**
         * <p>The IPv6 CIDR blocks of the initiator.</p>
         */
        @NameInMap("Ipv6Cidrs")
        public java.util.List<String> ipv6Cidrs;

        /**
         * <p>The instance ID of the initiator VPC-connected instance.</p>
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
         * <p>The Alibaba Cloud account ID of the acceptor of the VPC peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>25346073170691****</p>
         */
        @NameInMap("AcceptingOwnerUid")
        public Long acceptingOwnerUid;

        /**
         * <p>The region ID of the acceptor of the VPC peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("AcceptingRegionId")
        public String acceptingRegionId;

        /**
         * <p>The details of the acceptor VPC-connected instance.</p>
         */
        @NameInMap("AcceptingVpc")
        public AcceptingVpc acceptingVpc;

        /**
         * <p>The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0.</p>
         * <blockquote>
         * <p>A value of -1 indicates that no bandwidth limit is applied.</p>
         * </blockquote>
         * <p>Default values:</p>
         * <ul>
         * <li>The default bandwidth of a cross-region VPC peering connection is 1024 Mbit/s.</li>
         * <li>The default bandwidth of an intra-region VPC peering connection is -1 Mbit/s, which indicates that no bandwidth limit is applied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The billing status of the VPC peering connection. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Normal.</li>
         * <li><strong>FinancialLocked</strong>: Locked due to overdue payment.</li>
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
         * <p>Indicates whether the jumbo frame feature is enabled for the VPC peering connection. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableJumboFrame")
        public Boolean enableJumboFrame;

        /**
         * <p>The time when the VPC peering connection was created. The time is displayed in UTC in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-24T09:02:36Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The expiration time of the VPC peering connection. The time is displayed in UTC in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * <p>The specific expiration time is returned only when the <strong>Status</strong> of the VPC peering connection is <strong>Accepting</strong> or <strong>Expired</strong>. If the VPC peering connection is in other states, <strong>null</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-01T09:02:36Z</p>
         */
        @NameInMap("GmtExpired")
        public String gmtExpired;

        /**
         * <p>The time when the VPC peering connection was modified. The time is displayed in UTC in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-24T19:20:45Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The instance ID of the VPC peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pcc-lnk0m24khwvtkm****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The link type of the VPC peering connection.</p>
         * <p>Default values:</p>
         * <ul>
         * <li>The default link type of a cross-region VPC peering connection is Gold.</li>
         * <li>The default link type of an intra-region VPC peering connection is empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Gold</p>
         */
        @NameInMap("LinkType")
        public String linkType;

        /**
         * <p>The associated cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>SWAS</p>
         */
        @NameInMap("ManagedService")
        public String managedService;

        /**
         * <p>The name of the VPC peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcpeer</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Alibaba Cloud account ID of the initiator of the VPC peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>25346073170691****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The region ID of the initiator of the VPC peering connection.</p>
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
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the VPC peering connection. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: Creating.</li>
         * <li><strong>Accepting</strong>: Accepting.</li>
         * <li><strong>Updating</strong>: Updating.</li>
         * <li><strong>Rejected</strong>: Rejected.</li>
         * <li><strong>Expired</strong>: Expired.</li>
         * <li><strong>Activated</strong>: Activated.</li>
         * <li><strong>Deleting</strong>: Deleting.</li>
         * <li><strong>Deleted</strong>: Deleted.</li>
         * </ul>
         * <p>For more information about the statuses of VPC peering connections, see <a href="https://help.aliyun.com/document_detail/418507.html">VPC peering connection overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Activated</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<Tags> tags;

        /**
         * <p>The details of the initiator VPC-connected instance.</p>
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

        public VpcPeerConnects setEnableJumboFrame(Boolean enableJumboFrame) {
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }
        public Boolean getEnableJumboFrame() {
            return this.enableJumboFrame;
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

        public VpcPeerConnects setManagedService(String managedService) {
            this.managedService = managedService;
            return this;
        }
        public String getManagedService() {
            return this.managedService;
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
