// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ListVpcPeerConnectionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public static class VpcPeerConnects extends TeaModel {
        @NameInMap("AcceptingOwnerUid")
        public Integer acceptingOwnerUid;

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
        public Integer ownerId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<Tags> tags;

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
