// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class GetVpcPeerConnectionAttributeResponseBody extends TeaModel {
    @NameInMap("AcceptingOwnerUid")
    public Long acceptingOwnerUid;

    @NameInMap("AcceptingRegionId")
    public String acceptingRegionId;

    @NameInMap("AcceptingVpc")
    public AcceptingVpc acceptingVpc;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("BizStatus")
    public String bizStatus;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtExpired")
    public String gmtExpired;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<Tags> tags;

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
        @NameInMap("Ipv4Cidrs")
        public java.util.List<String> ipv4Cidrs;

        @NameInMap("Ipv6Cidrs")
        public java.util.List<String> ipv6Cidrs;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Ipv4Cidrs")
        public java.util.List<String> ipv4Cidrs;

        @NameInMap("Ipv6Cidrs")
        public java.util.List<String> ipv6Cidrs;

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
