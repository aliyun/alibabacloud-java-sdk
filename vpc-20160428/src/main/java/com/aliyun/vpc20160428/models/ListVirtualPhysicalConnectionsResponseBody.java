// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVirtualPhysicalConnectionsResponseBody extends TeaModel {
    // 本次查询数量
    @NameInMap("Count")
    public Integer count;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总数
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Vpconn
    @NameInMap("VirtualPhysicalConnections")
    public java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections> virtualPhysicalConnections;

    public static ListVirtualPhysicalConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualPhysicalConnectionsResponseBody self = new ListVirtualPhysicalConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualPhysicalConnectionsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListVirtualPhysicalConnectionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVirtualPhysicalConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirtualPhysicalConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVirtualPhysicalConnectionsResponseBody setVirtualPhysicalConnections(java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections> virtualPhysicalConnections) {
        this.virtualPhysicalConnections = virtualPhysicalConnections;
        return this;
    }
    public java.util.List<ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections> getVirtualPhysicalConnections() {
        return this.virtualPhysicalConnections;
    }

    public static class ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections extends TeaModel {
        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("AdLocation")
        public String adLocation;

        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CircuitCode")
        public String circuitCode;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnabledTime")
        public String enabledTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExpectSpec")
        public String expectSpec;

        @NameInMap("LineOperator")
        public String lineOperator;

        @NameInMap("LoaStatus")
        public String loaStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderMode")
        public String orderMode;

        @NameInMap("ParentPhysicalConnectionAliUid")
        public String parentPhysicalConnectionAliUid;

        @NameInMap("ParentPhysicalConnectionId")
        public String parentPhysicalConnectionId;

        @NameInMap("PeerLocation")
        public String peerLocation;

        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        @NameInMap("PortNumber")
        public String portNumber;

        @NameInMap("PortType")
        public String portType;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("RedundantPhysicalConnectionId")
        public String redundantPhysicalConnectionId;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("VirtualPhysicalConnectionStatus")
        public String virtualPhysicalConnectionStatus;

        @NameInMap("VlanId")
        public String vlanId;

        public static ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections self = new ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections();
            return TeaModel.build(map, self);
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setAdLocation(String adLocation) {
            this.adLocation = adLocation;
            return this;
        }
        public String getAdLocation() {
            return this.adLocation;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setExpectSpec(String expectSpec) {
            this.expectSpec = expectSpec;
            return this;
        }
        public String getExpectSpec() {
            return this.expectSpec;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setLoaStatus(String loaStatus) {
            this.loaStatus = loaStatus;
            return this;
        }
        public String getLoaStatus() {
            return this.loaStatus;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setOrderMode(String orderMode) {
            this.orderMode = orderMode;
            return this;
        }
        public String getOrderMode() {
            return this.orderMode;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setParentPhysicalConnectionAliUid(String parentPhysicalConnectionAliUid) {
            this.parentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
            return this;
        }
        public String getParentPhysicalConnectionAliUid() {
            return this.parentPhysicalConnectionAliUid;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setParentPhysicalConnectionId(String parentPhysicalConnectionId) {
            this.parentPhysicalConnectionId = parentPhysicalConnectionId;
            return this;
        }
        public String getParentPhysicalConnectionId() {
            return this.parentPhysicalConnectionId;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setPeerLocation(String peerLocation) {
            this.peerLocation = peerLocation;
            return this;
        }
        public String getPeerLocation() {
            return this.peerLocation;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setPortNumber(String portNumber) {
            this.portNumber = portNumber;
            return this;
        }
        public String getPortNumber() {
            return this.portNumber;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
            this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
            return this;
        }
        public String getRedundantPhysicalConnectionId() {
            return this.redundantPhysicalConnectionId;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setVirtualPhysicalConnectionStatus(String virtualPhysicalConnectionStatus) {
            this.virtualPhysicalConnectionStatus = virtualPhysicalConnectionStatus;
            return this;
        }
        public String getVirtualPhysicalConnectionStatus() {
            return this.virtualPhysicalConnectionStatus;
        }

        public ListVirtualPhysicalConnectionsResponseBodyVirtualPhysicalConnections setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

    }

}
