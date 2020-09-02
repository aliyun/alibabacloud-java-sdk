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

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse setVirtualBorderRouterForPhysicalConnectionSet(DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet) {
        this.virtualBorderRouterForPhysicalConnectionSet = virtualBorderRouterForPhysicalConnectionSet;
        return this;
    }
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet getVirtualBorderRouterForPhysicalConnectionSet() {
        return this.virtualBorderRouterForPhysicalConnectionSet;
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

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setVbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }
        public String getVbrId() {
            return this.vbrId;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setVbrOwnerUid(Long vbrOwnerUid) {
            this.vbrOwnerUid = vbrOwnerUid;
            return this;
        }
        public Long getVbrOwnerUid() {
            return this.vbrOwnerUid;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setEccId(String eccId) {
            this.eccId = eccId;
            return this;
        }
        public String getEccId() {
            return this.eccId;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setActivationTime(String activationTime) {
            this.activationTime = activationTime;
            return this;
        }
        public String getActivationTime() {
            return this.activationTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setTerminationTime(String terminationTime) {
            this.terminationTime = terminationTime;
            return this;
        }
        public String getTerminationTime() {
            return this.terminationTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setRecoveryTime(String recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setVlanId(Integer vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public Integer getVlanId() {
            return this.vlanId;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setLocalGatewayIp(String localGatewayIp) {
            this.localGatewayIp = localGatewayIp;
            return this;
        }
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeerGatewayIp(String peerGatewayIp) {
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeeringSubnetMask(String peeringSubnetMask) {
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPConnVbrChargeType(String PConnVbrChargeType) {
            this.PConnVbrChargeType = PConnVbrChargeType;
            return this;
        }
        public String getPConnVbrChargeType() {
            return this.PConnVbrChargeType;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPConnVbrExpireTime(String PConnVbrExpireTime) {
            this.PConnVbrExpireTime = PConnVbrExpireTime;
            return this;
        }
        public String getPConnVbrExpireTime() {
            return this.PConnVbrExpireTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPConnVbrBussinessStatus(String PConnVbrBussinessStatus) {
            this.PConnVbrBussinessStatus = PConnVbrBussinessStatus;
            return this;
        }
        public String getPConnVbrBussinessStatus() {
            return this.PConnVbrBussinessStatus;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
            this.localIpv6GatewayIp = localIpv6GatewayIp;
            return this;
        }
        public String getLocalIpv6GatewayIp() {
            return this.localIpv6GatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
            this.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }
        public String getPeerIpv6GatewayIp() {
            return this.peerIpv6GatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }
        public String getPeeringIpv6SubnetMask() {
            return this.peeringIpv6SubnetMask;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setEnableIpv6(Boolean enableIpv6) {
            this.enableIpv6 = enableIpv6;
            return this;
        }
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
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

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSet setVirtualBorderRouterForPhysicalConnectionType(java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType) {
            this.virtualBorderRouterForPhysicalConnectionType = virtualBorderRouterForPhysicalConnectionType;
            return this;
        }
        public java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionResponseVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType> getVirtualBorderRouterForPhysicalConnectionType() {
            return this.virtualBorderRouterForPhysicalConnectionType;
        }

    }

}
