// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VirtualBorderRouterSet")
    public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet virtualBorderRouterSet;

    public static DescribeVirtualBorderRoutersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersResponseBody self = new DescribeVirtualBorderRoutersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVirtualBorderRoutersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVirtualBorderRoutersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVirtualBorderRoutersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVirtualBorderRoutersResponseBody setVirtualBorderRouterSet(DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet virtualBorderRouterSet) {
        this.virtualBorderRouterSet = virtualBorderRouterSet;
        return this;
    }
    public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet getVirtualBorderRouterSet() {
        return this.virtualBorderRouterSet;
    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen extends TeaModel {
        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CenOwnerId")
        public Long cenOwnerId;

        @NameInMap("CenStatus")
        public String cenStatus;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen setCenOwnerId(Long cenOwnerId) {
            this.cenOwnerId = cenOwnerId;
            return this;
        }
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen setCenStatus(String cenStatus) {
            this.cenStatus = cenStatus;
            return this;
        }
        public String getCenStatus() {
            return this.cenStatus;
        }

    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens extends TeaModel {
        @NameInMap("AssociatedCen")
        public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen> associatedCen;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens setAssociatedCen(java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen> associatedCen) {
            this.associatedCen = associatedCen;
            return this;
        }
        public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen> getAssociatedCen() {
            return this.associatedCen;
        }

    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection extends TeaModel {
        @NameInMap("CircuitCode")
        public String circuitCode;

        @NameInMap("EnableIpv6")
        public Boolean enableIpv6;

        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        @NameInMap("LocalIpv6GatewayIp")
        public String localIpv6GatewayIp;

        @NameInMap("PeerGatewayIp")
        public String peerGatewayIp;

        @NameInMap("PeerIpv6GatewayIp")
        public String peerIpv6GatewayIp;

        @NameInMap("PeeringIpv6SubnetMask")
        public String peeringIpv6SubnetMask;

        @NameInMap("PeeringSubnetMask")
        public String peeringSubnetMask;

        @NameInMap("PhysicalConnectionBusinessStatus")
        public String physicalConnectionBusinessStatus;

        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        @NameInMap("PhysicalConnectionOwnerUid")
        public String physicalConnectionOwnerUid;

        @NameInMap("PhysicalConnectionStatus")
        public String physicalConnectionStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("VlanId")
        public String vlanId;

        @NameInMap("VlanInterfaceId")
        public String vlanInterfaceId;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setEnableIpv6(Boolean enableIpv6) {
            this.enableIpv6 = enableIpv6;
            return this;
        }
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setLocalGatewayIp(String localGatewayIp) {
            this.localGatewayIp = localGatewayIp;
            return this;
        }
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
            this.localIpv6GatewayIp = localIpv6GatewayIp;
            return this;
        }
        public String getLocalIpv6GatewayIp() {
            return this.localIpv6GatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setPeerGatewayIp(String peerGatewayIp) {
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
            this.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }
        public String getPeerIpv6GatewayIp() {
            return this.peerIpv6GatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }
        public String getPeeringIpv6SubnetMask() {
            return this.peeringIpv6SubnetMask;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setPeeringSubnetMask(String peeringSubnetMask) {
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setPhysicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
            this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
            return this;
        }
        public String getPhysicalConnectionBusinessStatus() {
            return this.physicalConnectionBusinessStatus;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setPhysicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
            this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
            return this;
        }
        public String getPhysicalConnectionOwnerUid() {
            return this.physicalConnectionOwnerUid;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setPhysicalConnectionStatus(String physicalConnectionStatus) {
            this.physicalConnectionStatus = physicalConnectionStatus;
            return this;
        }
        public String getPhysicalConnectionStatus() {
            return this.physicalConnectionStatus;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection setVlanInterfaceId(String vlanInterfaceId) {
            this.vlanInterfaceId = vlanInterfaceId;
            return this;
        }
        public String getVlanInterfaceId() {
            return this.vlanInterfaceId;
        }

    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections extends TeaModel {
        @NameInMap("AssociatedPhysicalConnection")
        public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection> associatedPhysicalConnection;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections setAssociatedPhysicalConnection(java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection> associatedPhysicalConnection) {
            this.associatedPhysicalConnection = associatedPhysicalConnection;
            return this;
        }
        public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection> getAssociatedPhysicalConnection() {
            return this.associatedPhysicalConnection;
        }

    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType extends TeaModel {
        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("ActivationTime")
        public String activationTime;

        @NameInMap("AssociatedCens")
        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens associatedCens;

        @NameInMap("AssociatedPhysicalConnections")
        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections associatedPhysicalConnections;

        @NameInMap("CircuitCode")
        public String circuitCode;

        @NameInMap("CloudBoxInstanceId")
        public String cloudBoxInstanceId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DetectMultiplier")
        public Long detectMultiplier;

        @NameInMap("EccId")
        public String eccId;

        @NameInMap("EnableIpv6")
        public Boolean enableIpv6;

        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        @NameInMap("LocalIpv6GatewayIp")
        public String localIpv6GatewayIp;

        @NameInMap("MinRxInterval")
        public Long minRxInterval;

        @NameInMap("MinTxInterval")
        public Long minTxInterval;

        @NameInMap("Name")
        public String name;

        @NameInMap("PConnVbrChargeType")
        public String PConnVbrChargeType;

        @NameInMap("PConnVbrExpireTime")
        public String PConnVbrExpireTime;

        @NameInMap("PeerGatewayIp")
        public String peerGatewayIp;

        @NameInMap("PeerIpv6GatewayIp")
        public String peerIpv6GatewayIp;

        @NameInMap("PeeringIpv6SubnetMask")
        public String peeringIpv6SubnetMask;

        @NameInMap("PeeringSubnetMask")
        public String peeringSubnetMask;

        @NameInMap("PhysicalConnectionBusinessStatus")
        public String physicalConnectionBusinessStatus;

        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        @NameInMap("PhysicalConnectionOwnerUid")
        public String physicalConnectionOwnerUid;

        @NameInMap("PhysicalConnectionStatus")
        public String physicalConnectionStatus;

        @NameInMap("RecoveryTime")
        public String recoveryTime;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TerminationTime")
        public String terminationTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("VbrId")
        public String vbrId;

        @NameInMap("VlanId")
        public Integer vlanId;

        @NameInMap("VlanInterfaceId")
        public String vlanInterfaceId;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setActivationTime(String activationTime) {
            this.activationTime = activationTime;
            return this;
        }
        public String getActivationTime() {
            return this.activationTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setAssociatedCens(DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens associatedCens) {
            this.associatedCens = associatedCens;
            return this;
        }
        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens getAssociatedCens() {
            return this.associatedCens;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setAssociatedPhysicalConnections(DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections associatedPhysicalConnections) {
            this.associatedPhysicalConnections = associatedPhysicalConnections;
            return this;
        }
        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections getAssociatedPhysicalConnections() {
            return this.associatedPhysicalConnections;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setCloudBoxInstanceId(String cloudBoxInstanceId) {
            this.cloudBoxInstanceId = cloudBoxInstanceId;
            return this;
        }
        public String getCloudBoxInstanceId() {
            return this.cloudBoxInstanceId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setDetectMultiplier(Long detectMultiplier) {
            this.detectMultiplier = detectMultiplier;
            return this;
        }
        public Long getDetectMultiplier() {
            return this.detectMultiplier;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setEccId(String eccId) {
            this.eccId = eccId;
            return this;
        }
        public String getEccId() {
            return this.eccId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setEnableIpv6(Boolean enableIpv6) {
            this.enableIpv6 = enableIpv6;
            return this;
        }
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setLocalGatewayIp(String localGatewayIp) {
            this.localGatewayIp = localGatewayIp;
            return this;
        }
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
            this.localIpv6GatewayIp = localIpv6GatewayIp;
            return this;
        }
        public String getLocalIpv6GatewayIp() {
            return this.localIpv6GatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setMinRxInterval(Long minRxInterval) {
            this.minRxInterval = minRxInterval;
            return this;
        }
        public Long getMinRxInterval() {
            return this.minRxInterval;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setMinTxInterval(Long minTxInterval) {
            this.minTxInterval = minTxInterval;
            return this;
        }
        public Long getMinTxInterval() {
            return this.minTxInterval;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPConnVbrChargeType(String PConnVbrChargeType) {
            this.PConnVbrChargeType = PConnVbrChargeType;
            return this;
        }
        public String getPConnVbrChargeType() {
            return this.PConnVbrChargeType;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPConnVbrExpireTime(String PConnVbrExpireTime) {
            this.PConnVbrExpireTime = PConnVbrExpireTime;
            return this;
        }
        public String getPConnVbrExpireTime() {
            return this.PConnVbrExpireTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPeerGatewayIp(String peerGatewayIp) {
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
            this.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }
        public String getPeerIpv6GatewayIp() {
            return this.peerIpv6GatewayIp;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }
        public String getPeeringIpv6SubnetMask() {
            return this.peeringIpv6SubnetMask;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPeeringSubnetMask(String peeringSubnetMask) {
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPhysicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
            this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
            return this;
        }
        public String getPhysicalConnectionBusinessStatus() {
            return this.physicalConnectionBusinessStatus;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPhysicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
            this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
            return this;
        }
        public String getPhysicalConnectionOwnerUid() {
            return this.physicalConnectionOwnerUid;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setPhysicalConnectionStatus(String physicalConnectionStatus) {
            this.physicalConnectionStatus = physicalConnectionStatus;
            return this;
        }
        public String getPhysicalConnectionStatus() {
            return this.physicalConnectionStatus;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setRecoveryTime(String recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setTerminationTime(String terminationTime) {
            this.terminationTime = terminationTime;
            return this;
        }
        public String getTerminationTime() {
            return this.terminationTime;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setVbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }
        public String getVbrId() {
            return this.vbrId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setVlanId(Integer vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public Integer getVlanId() {
            return this.vlanId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setVlanInterfaceId(String vlanInterfaceId) {
            this.vlanInterfaceId = vlanInterfaceId;
            return this;
        }
        public String getVlanInterfaceId() {
            return this.vlanInterfaceId;
        }

    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet extends TeaModel {
        @NameInMap("VirtualBorderRouterType")
        public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType> virtualBorderRouterType;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSet setVirtualBorderRouterType(java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType> virtualBorderRouterType) {
            this.virtualBorderRouterType = virtualBorderRouterType;
            return this;
        }
        public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType> getVirtualBorderRouterType() {
            return this.virtualBorderRouterType;
        }

    }

}
