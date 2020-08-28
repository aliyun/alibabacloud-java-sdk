// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("VirtualBorderRouterSet")
    @Validation(required = true)
    public DescribeVirtualBorderRoutersResponseVirtualBorderRouterSet virtualBorderRouterSet;

    public static DescribeVirtualBorderRoutersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersResponse self = new DescribeVirtualBorderRoutersResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection extends TeaModel {
        @NameInMap("CircuitCode")
        @Validation(required = true)
        public String circuitCode;

        @NameInMap("VlanInterfaceId")
        @Validation(required = true)
        public String vlanInterfaceId;

        @NameInMap("LocalGatewayIp")
        @Validation(required = true)
        public String localGatewayIp;

        @NameInMap("PeerGatewayIp")
        @Validation(required = true)
        public String peerGatewayIp;

        @NameInMap("PeeringSubnetMask")
        @Validation(required = true)
        public String peeringSubnetMask;

        @NameInMap("PhysicalConnectionId")
        @Validation(required = true)
        public String physicalConnectionId;

        @NameInMap("PhysicalConnectionStatus")
        @Validation(required = true)
        public String physicalConnectionStatus;

        @NameInMap("PhysicalConnectionBusinessStatus")
        @Validation(required = true)
        public String physicalConnectionBusinessStatus;

        @NameInMap("PhysicalConnectionOwnerUid")
        @Validation(required = true)
        public String physicalConnectionOwnerUid;

        @NameInMap("VlanId")
        @Validation(required = true)
        public String vlanId;

        @NameInMap("LocalIpv6GatewayIp")
        @Validation(required = true)
        public String localIpv6GatewayIp;

        @NameInMap("PeerIpv6GatewayIp")
        @Validation(required = true)
        public String peerIpv6GatewayIp;

        @NameInMap("PeeringIpv6SubnetMask")
        @Validation(required = true)
        public String peeringIpv6SubnetMask;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection self = new DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections extends TeaModel {
        @NameInMap("AssociatedPhysicalConnection")
        @Validation(required = true)
        public java.util.List<DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnectionsAssociatedPhysicalConnection> associatedPhysicalConnection;

        public static DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections self = new DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen extends TeaModel {
        @NameInMap("CenId")
        @Validation(required = true)
        public String cenId;

        @NameInMap("CenOwnerId")
        @Validation(required = true)
        public Long cenOwnerId;

        @NameInMap("CenStatus")
        @Validation(required = true)
        public String cenStatus;

        public static DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen self = new DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens extends TeaModel {
        @NameInMap("AssociatedCen")
        @Validation(required = true)
        public java.util.List<DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCensAssociatedCen> associatedCen;

        public static DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens self = new DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterType extends TeaModel {
        @NameInMap("VbrId")
        @Validation(required = true)
        public String vbrId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ActivationTime")
        @Validation(required = true)
        public String activationTime;

        @NameInMap("TerminationTime")
        @Validation(required = true)
        public String terminationTime;

        @NameInMap("RecoveryTime")
        @Validation(required = true)
        public String recoveryTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("VlanId")
        @Validation(required = true)
        public Integer vlanId;

        @NameInMap("CircuitCode")
        @Validation(required = true)
        public String circuitCode;

        @NameInMap("RouteTableId")
        @Validation(required = true)
        public String routeTableId;

        @NameInMap("VlanInterfaceId")
        @Validation(required = true)
        public String vlanInterfaceId;

        @NameInMap("LocalGatewayIp")
        @Validation(required = true)
        public String localGatewayIp;

        @NameInMap("PeerGatewayIp")
        @Validation(required = true)
        public String peerGatewayIp;

        @NameInMap("PeeringSubnetMask")
        @Validation(required = true)
        public String peeringSubnetMask;

        @NameInMap("PhysicalConnectionId")
        @Validation(required = true)
        public String physicalConnectionId;

        @NameInMap("PhysicalConnectionStatus")
        @Validation(required = true)
        public String physicalConnectionStatus;

        @NameInMap("PhysicalConnectionBusinessStatus")
        @Validation(required = true)
        public String physicalConnectionBusinessStatus;

        @NameInMap("PhysicalConnectionOwnerUid")
        @Validation(required = true)
        public String physicalConnectionOwnerUid;

        @NameInMap("AccessPointId")
        @Validation(required = true)
        public String accessPointId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("PConnVbrExpireTime")
        @Validation(required = true)
        public String PConnVbrExpireTime;

        @NameInMap("EccId")
        @Validation(required = true)
        public String eccId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("MinTxInterval")
        @Validation(required = true)
        public Long minTxInterval;

        @NameInMap("MinRxInterval")
        @Validation(required = true)
        public Long minRxInterval;

        @NameInMap("DetectMultiplier")
        @Validation(required = true)
        public Long detectMultiplier;

        @NameInMap("LocalIpv6GatewayIp")
        @Validation(required = true)
        public String localIpv6GatewayIp;

        @NameInMap("PeerIpv6GatewayIp")
        @Validation(required = true)
        public String peerIpv6GatewayIp;

        @NameInMap("PeeringIpv6SubnetMask")
        @Validation(required = true)
        public String peeringIpv6SubnetMask;

        @NameInMap("EnableIpv6")
        @Validation(required = true)
        public Boolean enableIpv6;

        @NameInMap("AssociatedPhysicalConnections")
        @Validation(required = true)
        public DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections associatedPhysicalConnections;

        @NameInMap("AssociatedCens")
        @Validation(required = true)
        public DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens associatedCens;

        public static DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterType self = new DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVirtualBorderRoutersResponseVirtualBorderRouterSet extends TeaModel {
        @NameInMap("VirtualBorderRouterType")
        @Validation(required = true)
        public java.util.List<DescribeVirtualBorderRoutersResponseVirtualBorderRouterSetVirtualBorderRouterType> virtualBorderRouterType;

        public static DescribeVirtualBorderRoutersResponseVirtualBorderRouterSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseVirtualBorderRouterSet self = new DescribeVirtualBorderRoutersResponseVirtualBorderRouterSet();
            return TeaModel.build(map, self);
        }

    }

}
