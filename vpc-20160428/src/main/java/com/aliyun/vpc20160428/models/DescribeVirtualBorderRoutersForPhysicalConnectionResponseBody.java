// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("VirtualBorderRouterForPhysicalConnectionSet")
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet;

    public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody setVirtualBorderRouterForPhysicalConnectionSet(DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet) {
        this.virtualBorderRouterForPhysicalConnectionSet = virtualBorderRouterForPhysicalConnectionSet;
        return this;
    }
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet getVirtualBorderRouterForPhysicalConnectionSet() {
        return this.virtualBorderRouterForPhysicalConnectionSet;
    }

    public static class DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("CircuitCode")
        public String circuitCode;

        @NameInMap("PeerIpv6GatewayIp")
        public String peerIpv6GatewayIp;

        @NameInMap("PConnVbrExpireTime")
        public String PConnVbrExpireTime;

        @NameInMap("LocalIpv6GatewayIp")
        public String localIpv6GatewayIp;

        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        @NameInMap("ActivationTime")
        public String activationTime;

        @NameInMap("BandwidthStatus")
        public String bandwidthStatus;

        @NameInMap("VbrOwnerUid")
        public Long vbrOwnerUid;

        @NameInMap("PeeringSubnetMask")
        public String peeringSubnetMask;

        @NameInMap("EnableIpv6")
        public Boolean enableIpv6;

        @NameInMap("EccId")
        public String eccId;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("RecoveryTime")
        public String recoveryTime;

        @NameInMap("TerminationTime")
        public String terminationTime;

        @NameInMap("PConnVbrBussinessStatus")
        public String PConnVbrBussinessStatus;

        @NameInMap("PeerGatewayIp")
        public String peerGatewayIp;

        @NameInMap("PeeringIpv6SubnetMask")
        public String peeringIpv6SubnetMask;

        @NameInMap("VbrId")
        public String vbrId;

        @NameInMap("PConnVbrChargeType")
        public String PConnVbrChargeType;

        @NameInMap("VlanId")
        public Integer vlanId;

        public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
            this.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }
        public String getPeerIpv6GatewayIp() {
            return this.peerIpv6GatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPConnVbrExpireTime(String PConnVbrExpireTime) {
            this.PConnVbrExpireTime = PConnVbrExpireTime;
            return this;
        }
        public String getPConnVbrExpireTime() {
            return this.PConnVbrExpireTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
            this.localIpv6GatewayIp = localIpv6GatewayIp;
            return this;
        }
        public String getLocalIpv6GatewayIp() {
            return this.localIpv6GatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setLocalGatewayIp(String localGatewayIp) {
            this.localGatewayIp = localGatewayIp;
            return this;
        }
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setActivationTime(String activationTime) {
            this.activationTime = activationTime;
            return this;
        }
        public String getActivationTime() {
            return this.activationTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setBandwidthStatus(String bandwidthStatus) {
            this.bandwidthStatus = bandwidthStatus;
            return this;
        }
        public String getBandwidthStatus() {
            return this.bandwidthStatus;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setVbrOwnerUid(Long vbrOwnerUid) {
            this.vbrOwnerUid = vbrOwnerUid;
            return this;
        }
        public Long getVbrOwnerUid() {
            return this.vbrOwnerUid;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeeringSubnetMask(String peeringSubnetMask) {
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setEnableIpv6(Boolean enableIpv6) {
            this.enableIpv6 = enableIpv6;
            return this;
        }
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setEccId(String eccId) {
            this.eccId = eccId;
            return this;
        }
        public String getEccId() {
            return this.eccId;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setRecoveryTime(String recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setTerminationTime(String terminationTime) {
            this.terminationTime = terminationTime;
            return this;
        }
        public String getTerminationTime() {
            return this.terminationTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPConnVbrBussinessStatus(String PConnVbrBussinessStatus) {
            this.PConnVbrBussinessStatus = PConnVbrBussinessStatus;
            return this;
        }
        public String getPConnVbrBussinessStatus() {
            return this.PConnVbrBussinessStatus;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeerGatewayIp(String peerGatewayIp) {
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }
        public String getPeeringIpv6SubnetMask() {
            return this.peeringIpv6SubnetMask;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setVbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }
        public String getVbrId() {
            return this.vbrId;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPConnVbrChargeType(String PConnVbrChargeType) {
            this.PConnVbrChargeType = PConnVbrChargeType;
            return this;
        }
        public String getPConnVbrChargeType() {
            return this.PConnVbrChargeType;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setVlanId(Integer vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public Integer getVlanId() {
            return this.vlanId;
        }

    }

    public static class DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet extends TeaModel {
        @NameInMap("VirtualBorderRouterForPhysicalConnectionType")
        public java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType;

        public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet setVirtualBorderRouterForPhysicalConnectionType(java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType) {
            this.virtualBorderRouterForPhysicalConnectionType = virtualBorderRouterForPhysicalConnectionType;
            return this;
        }
        public java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType> getVirtualBorderRouterForPhysicalConnectionType() {
            return this.virtualBorderRouterForPhysicalConnectionType;
        }

    }

}
