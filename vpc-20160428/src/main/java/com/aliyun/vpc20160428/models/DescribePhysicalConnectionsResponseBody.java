// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PhysicalConnectionSet")
    public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet physicalConnectionSet;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePhysicalConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsResponseBody self = new DescribePhysicalConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePhysicalConnectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePhysicalConnectionsResponseBody setPhysicalConnectionSet(DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet physicalConnectionSet) {
        this.physicalConnectionSet = physicalConnectionSet;
        return this;
    }
    public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet getPhysicalConnectionSet() {
        return this.physicalConnectionSet;
    }

    public DescribePhysicalConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePhysicalConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType extends TeaModel {
        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("AccessPointType")
        public String accessPointType;

        @NameInMap("AdLocation")
        public String adLocation;

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

        @NameInMap("HasReservationData")
        public String hasReservationData;

        @NameInMap("LineOperator")
        public String lineOperator;

        @NameInMap("LoaStatus")
        public String loaStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderMode")
        public String orderMode;

        @NameInMap("ParentPhysicalConnectionAliUid")
        public Long parentPhysicalConnectionAliUid;

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

        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("VirtualPhysicalConnectionCount")
        public Integer virtualPhysicalConnectionCount;

        @NameInMap("VlanId")
        public String vlanId;

        @NameInMap("VpconnStatus")
        public String vpconnStatus;

        public static DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType self = new DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setAccessPointType(String accessPointType) {
            this.accessPointType = accessPointType;
            return this;
        }
        public String getAccessPointType() {
            return this.accessPointType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setAdLocation(String adLocation) {
            this.adLocation = adLocation;
            return this;
        }
        public String getAdLocation() {
            return this.adLocation;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setExpectSpec(String expectSpec) {
            this.expectSpec = expectSpec;
            return this;
        }
        public String getExpectSpec() {
            return this.expectSpec;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setLoaStatus(String loaStatus) {
            this.loaStatus = loaStatus;
            return this;
        }
        public String getLoaStatus() {
            return this.loaStatus;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setOrderMode(String orderMode) {
            this.orderMode = orderMode;
            return this;
        }
        public String getOrderMode() {
            return this.orderMode;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setParentPhysicalConnectionAliUid(Long parentPhysicalConnectionAliUid) {
            this.parentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
            return this;
        }
        public Long getParentPhysicalConnectionAliUid() {
            return this.parentPhysicalConnectionAliUid;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setParentPhysicalConnectionId(String parentPhysicalConnectionId) {
            this.parentPhysicalConnectionId = parentPhysicalConnectionId;
            return this;
        }
        public String getParentPhysicalConnectionId() {
            return this.parentPhysicalConnectionId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPeerLocation(String peerLocation) {
            this.peerLocation = peerLocation;
            return this;
        }
        public String getPeerLocation() {
            return this.peerLocation;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPortNumber(String portNumber) {
            this.portNumber = portNumber;
            return this;
        }
        public String getPortNumber() {
            return this.portNumber;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
            this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
            return this;
        }
        public String getRedundantPhysicalConnectionId() {
            return this.redundantPhysicalConnectionId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setVirtualPhysicalConnectionCount(Integer virtualPhysicalConnectionCount) {
            this.virtualPhysicalConnectionCount = virtualPhysicalConnectionCount;
            return this;
        }
        public Integer getVirtualPhysicalConnectionCount() {
            return this.virtualPhysicalConnectionCount;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setVpconnStatus(String vpconnStatus) {
            this.vpconnStatus = vpconnStatus;
            return this;
        }
        public String getVpconnStatus() {
            return this.vpconnStatus;
        }

    }

    public static class DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet extends TeaModel {
        @NameInMap("PhysicalConnectionType")
        public java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType> physicalConnectionType;

        public static DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet self = new DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setPhysicalConnectionType(java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType> physicalConnectionType) {
            this.physicalConnectionType = physicalConnectionType;
            return this;
        }
        public java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType> getPhysicalConnectionType() {
            return this.physicalConnectionType;
        }

    }

}
