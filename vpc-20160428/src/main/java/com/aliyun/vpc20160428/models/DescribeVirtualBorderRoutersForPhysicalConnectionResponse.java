// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersForPhysicalConnectionResponse extends TeaModel {
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

    @NameInMap("VirtualBorderRouterForPhysicalConnectionSet")
    @Validation(required = true)
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet;

    public static DescribeVirtualBorderRoutersForPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersForPhysicalConnectionResponse self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType extends TeaModel {
        @NameInMap("VbrId")
        @Validation(required = true)
        public String vbrId;

        @NameInMap("VbrOwnerUid")
        @Validation(required = true)
        public Long vbrOwnerUid;

        @NameInMap("EccId")
        @Validation(required = true)
        public String eccId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

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

        @NameInMap("VlanId")
        @Validation(required = true)
        public Integer vlanId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CircuitCode")
        @Validation(required = true)
        public String circuitCode;

        @NameInMap("LocalGatewayIp")
        @Validation(required = true)
        public String localGatewayIp;

        @NameInMap("PeerGatewayIp")
        @Validation(required = true)
        public String peerGatewayIp;

        @NameInMap("PeeringSubnetMask")
        @Validation(required = true)
        public String peeringSubnetMask;

        @NameInMap("PConnVbrChargeType")
        @Validation(required = true)
        public String PConnVbrChargeType;

        @NameInMap("PConnVbrExpireTime")
        @Validation(required = true)
        public String PConnVbrExpireTime;

        @NameInMap("PConnVbrBussinessStatus")
        @Validation(required = true)
        public String PConnVbrBussinessStatus;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public String bandwidth;

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

        public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet extends TeaModel {
        @NameInMap("VirtualBorderRouterForPhysicalConnectionType")
        @Validation(required = true)
        public java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType;

        public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet();
            return TeaModel.build(map, self);
        }

    }

}
