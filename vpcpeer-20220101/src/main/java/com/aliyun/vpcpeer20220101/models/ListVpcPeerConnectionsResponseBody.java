// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ListVpcPeerConnectionsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next queries are sent.</p>
     * <p>*   If the value of **NextToken** is returned, the value indicates the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
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
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
         */
        @NameInMap("AcceptingOwnerUid")
        public Integer acceptingOwnerUid;

        /**
         * <p>The region ID of the accepter VPC.</p>
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
         * <br>
         * <p>>  If the value is set to -1, it indicates that no limit is imposed on the bandwidth.</p>
         * <br>
         * <p>Default value:</p>
         * <br>
         * <p>*   The default bandwidth of an inter-region VPC peering connection is **1024** Mbit/s.</p>
         * <p>*   The default bandwidth of an intra-region VPC peering connection is **-1** Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The business status of the VPC peering connection. Valid values:</p>
         * <br>
         * <p>*   **Normal**</p>
         * <p>*   **FinancialLocked**</p>
         */
        @NameInMap("BizStatus")
        public String bizStatus;

        /**
         * <p>The description of the VPC peering connection.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the VPC peering connection was created. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format in UTC.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The expiration time of the VPC peering connection. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format in UTC.</p>
         * <br>
         * <p>The expiration time is returned only when the **Status** of the VPC peering connection is **Accepting** or **Expired**. Otherwise, **null** is returned.</p>
         */
        @NameInMap("GmtExpired")
        public String gmtExpired;

        /**
         * <p>The time when the VPC peering connection was modified. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format in UTC.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the VPC peering connection.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the VPC peering connection.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the Alibaba Cloud account to which the requester VPC belongs.</p>
         */
        @NameInMap("OwnerId")
        public Integer ownerId;

        /**
         * <p>The region ID of the requester VPC.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the VPC peering connection. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Accepting**</p>
         * <p>*   **Updating**</p>
         * <p>*   **Rejected**</p>
         * <p>*   **Expired**</p>
         * <p>*   **Activated**</p>
         * <p>*   **Deleting**</p>
         * <p>*   **Deleted**</p>
         * <br>
         * <p>For more information about the status of VPC peering connections, see [Overview of VPC peering connections](~~418507~~).</p>
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

        public VpcPeerConnects setAcceptingOwnerUid(Integer acceptingOwnerUid) {
            this.acceptingOwnerUid = acceptingOwnerUid;
            return this;
        }
        public Integer getAcceptingOwnerUid() {
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

        public VpcPeerConnects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VpcPeerConnects setOwnerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Integer getOwnerId() {
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
