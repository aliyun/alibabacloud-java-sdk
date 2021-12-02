// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVirtualPhysicalConnectionsRequest extends TeaModel {
    // Vpconn是否被确认
    @NameInMap("IsConfirmed")
    public Boolean isConfirmed;

    // 单次查询最大量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 单次查询最大量
    @NameInMap("NextToken")
    public String nextToken;

    // Vpconn的主Pconn
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    @NameInMap("RegionId")
    public String regionId;

    // Vpconn的OwnerUid
    @NameInMap("VirtualPhysicalConnectionAliUids")
    public java.util.List<String> virtualPhysicalConnectionAliUids;

    // Vpconn的商业状态
    @NameInMap("VirtualPhysicalConnectionBusinessStatus")
    public String virtualPhysicalConnectionBusinessStatus;

    // 根据Vpconn的ID列表过滤
    @NameInMap("VirtualPhysicalConnectionIds")
    public java.util.List<String> virtualPhysicalConnectionIds;

    // Vpconn的状态
    @NameInMap("VirtualPhysicalConnectionStatuses")
    public java.util.List<String> virtualPhysicalConnectionStatuses;

    // Vpconn的vlanId
    @NameInMap("VlanIds")
    public java.util.List<String> vlanIds;

    public static ListVirtualPhysicalConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualPhysicalConnectionsRequest self = new ListVirtualPhysicalConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListVirtualPhysicalConnectionsRequest setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
        return this;
    }
    public Boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    public ListVirtualPhysicalConnectionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVirtualPhysicalConnectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVirtualPhysicalConnectionsRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public ListVirtualPhysicalConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionAliUids(java.util.List<String> virtualPhysicalConnectionAliUids) {
        this.virtualPhysicalConnectionAliUids = virtualPhysicalConnectionAliUids;
        return this;
    }
    public java.util.List<String> getVirtualPhysicalConnectionAliUids() {
        return this.virtualPhysicalConnectionAliUids;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionBusinessStatus(String virtualPhysicalConnectionBusinessStatus) {
        this.virtualPhysicalConnectionBusinessStatus = virtualPhysicalConnectionBusinessStatus;
        return this;
    }
    public String getVirtualPhysicalConnectionBusinessStatus() {
        return this.virtualPhysicalConnectionBusinessStatus;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionIds(java.util.List<String> virtualPhysicalConnectionIds) {
        this.virtualPhysicalConnectionIds = virtualPhysicalConnectionIds;
        return this;
    }
    public java.util.List<String> getVirtualPhysicalConnectionIds() {
        return this.virtualPhysicalConnectionIds;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionStatuses(java.util.List<String> virtualPhysicalConnectionStatuses) {
        this.virtualPhysicalConnectionStatuses = virtualPhysicalConnectionStatuses;
        return this;
    }
    public java.util.List<String> getVirtualPhysicalConnectionStatuses() {
        return this.virtualPhysicalConnectionStatuses;
    }

    public ListVirtualPhysicalConnectionsRequest setVlanIds(java.util.List<String> vlanIds) {
        this.vlanIds = vlanIds;
        return this;
    }
    public java.util.List<String> getVlanIds() {
        return this.vlanIds;
    }

}
