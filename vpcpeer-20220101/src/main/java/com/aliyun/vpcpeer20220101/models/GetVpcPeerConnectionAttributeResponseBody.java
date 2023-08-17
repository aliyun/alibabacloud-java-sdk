// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class GetVpcPeerConnectionAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account to which the accepter VPC belongs.</p>
     */
    @NameInMap("AcceptingOwnerUid")
    public Long acceptingOwnerUid;

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
     * <p>The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0.</p>
     * <br>
     * <p>>  If the value is set to **-1**, it indicates that no limit is imposed on the bandwidth.</p>
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
     * <p>The expiration time of the VPC peering connection.</p>
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
    public Long ownerId;

    /**
     * <p>The region ID of the requester VPC.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static GetVpcPeerConnectionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcPeerConnectionAttributeResponseBody self = new GetVpcPeerConnectionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcPeerConnectionAttributeResponseBody setAcceptingOwnerUid(Long acceptingOwnerUid) {
        this.acceptingOwnerUid = acceptingOwnerUid;
        return this;
    }
    public Long getAcceptingOwnerUid() {
        return this.acceptingOwnerUid;
    }

    public GetVpcPeerConnectionAttributeResponseBody setAcceptingRegionId(String acceptingRegionId) {
        this.acceptingRegionId = acceptingRegionId;
        return this;
    }
    public String getAcceptingRegionId() {
        return this.acceptingRegionId;
    }

    public GetVpcPeerConnectionAttributeResponseBody setAcceptingVpc(AcceptingVpc acceptingVpc) {
        this.acceptingVpc = acceptingVpc;
        return this;
    }
    public AcceptingVpc getAcceptingVpc() {
        return this.acceptingVpc;
    }

    public GetVpcPeerConnectionAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public GetVpcPeerConnectionAttributeResponseBody setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
        return this;
    }
    public String getBizStatus() {
        return this.bizStatus;
    }

    public GetVpcPeerConnectionAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetVpcPeerConnectionAttributeResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetVpcPeerConnectionAttributeResponseBody setGmtExpired(String gmtExpired) {
        this.gmtExpired = gmtExpired;
        return this;
    }
    public String getGmtExpired() {
        return this.gmtExpired;
    }

    public GetVpcPeerConnectionAttributeResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetVpcPeerConnectionAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetVpcPeerConnectionAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetVpcPeerConnectionAttributeResponseBody setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetVpcPeerConnectionAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVpcPeerConnectionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpcPeerConnectionAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetVpcPeerConnectionAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetVpcPeerConnectionAttributeResponseBody setTags(java.util.List<Tags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public GetVpcPeerConnectionAttributeResponseBody setVpc(Vpc vpc) {
        this.vpc = vpc;
        return this;
    }
    public Vpc getVpc() {
        return this.vpc;
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

}
