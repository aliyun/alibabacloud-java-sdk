// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7C5AE8B3-A2D8-428D-A2FF-93A225C0821E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about VBRs.</p>
     */
    @NameInMap("VirtualBorderRouterForPhysicalConnectionSet")
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet;

    public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody setVirtualBorderRouterForPhysicalConnectionSet(DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet) {
        this.virtualBorderRouterForPhysicalConnectionSet = virtualBorderRouterForPhysicalConnectionSet;
        return this;
    }
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSet getVirtualBorderRouterForPhysicalConnectionSet() {
        return this.virtualBorderRouterForPhysicalConnectionSet;
    }

    public static class DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType extends TeaModel {
        /**
         * <p>The time when the VBR was first activated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        @NameInMap("ActivationTime")
        public String activationTime;

        /**
         * <p>The bandwidth of the VBR that is associated with the Express Connect circuit. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The status of the bandwidth. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong></li>
         * <li><strong>Inactive</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("BandwidthStatus")
        public String bandwidthStatus;

        /**
         * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>longtel0**</p>
         */
        @NameInMap("CircuitCode")
        public String circuitCode;

        /**
         * <p>The time when the VBR was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the ECC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecc-sjghe****</p>
         */
        @NameInMap("EccId")
        public String eccId;

        /**
         * <p>Indicates whether IPv6 is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIpv6")
        public Boolean enableIpv6;

        /**
         * <p>The IPv4 address of the gateway device on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.X</p>
         */
        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        /**
         * <p>The IPv6 address of the gateway device on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6bw-uf6hcyzu65v98v3du****</p>
         */
        @NameInMap("LocalIpv6GatewayIp")
        public String localIpv6GatewayIp;

        /**
         * <p>The status of the VBR associated with the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>FinancialLocked</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("PConnVbrBussinessStatus")
        public String PConnVbrBussinessStatus;

        /**
         * <p>The billing method of the VBR. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription. If you choose this billing method, make sure that your Apsara Stack account supports balance payments or credit payments.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PConnVbrChargeType")
        public String PConnVbrChargeType;

        /**
         * <p>The time when the VBR associated with the Express Connect circuit expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-10T12:20:55</p>
         */
        @NameInMap("PConnVbrExpireTime")
        public String PConnVbrExpireTime;

        /**
         * <p>The IPv4 address of the gateway device on the user side.</p>
         * 
         * <strong>example:</strong>
         * <p>162.62.XX.XX</p>
         */
        @NameInMap("PeerGatewayIp")
        public String peerGatewayIp;

        /**
         * <p>The IPv6 address of the gateway device on the user side.</p>
         * <p>This parameter is required when you create a VBR for the owner of the Express Connect circuit. You can ignore this parameter when you create a VBR for another Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
         */
        @NameInMap("PeerIpv6GatewayIp")
        public String peerIpv6GatewayIp;

        /**
         * <p>The subnet mask for the IPv6 addresses of the gateway devices on the Alibaba Cloud side and on the user side.</p>
         * <p>The two IPv6 addresses must fall within the same subnet.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:4004:cc:400::/56</p>
         */
        @NameInMap("PeeringIpv6SubnetMask")
        public String peeringIpv6SubnetMask;

        /**
         * <p>The subnet mask of the IPv4 addresses configured on the user side and Alibaba Cloud side.</p>
         * <p>The two IPv4 addresses must fall within the same subnet.</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.0</p>
         */
        @NameInMap("PeeringSubnetMask")
        public String peeringSubnetMask;

        /**
         * <p>The last time when the status of the VBR changed from Terminated to Active.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        @NameInMap("RecoveryTime")
        public String recoveryTime;

        /**
         * <p>The status of the VBR. Valid values:</p>
         * <ul>
         * <li><strong>unconfirmed</strong></li>
         * <li><strong>active</strong></li>
         * <li><strong>terminating</strong></li>
         * <li><strong>terminated</strong></li>
         * <li><strong>recovering</strong></li>
         * <li><strong>deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The last time when the VBR was disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-07T12:20:55</p>
         */
        @NameInMap("TerminationTime")
        public String terminationTime;

        /**
         * <p>The VBR type.</p>
         * 
         * <strong>example:</strong>
         * <p>pconnVBR</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The VBR ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp16ksp61j7e0tk****</p>
         */
        @NameInMap("VbrId")
        public String vbrId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the VBR belongs.</p>
         * <p>If the owner of the VBR is the same as that of the Express Connect circuit, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>253460731706911258</p>
         */
        @NameInMap("VbrOwnerUid")
        public Long vbrOwnerUid;

        /**
         * <p>The VLAN ID of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>1678</p>
         */
        @NameInMap("VlanId")
        public Integer vlanId;

        public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setActivationTime(String activationTime) {
            this.activationTime = activationTime;
            return this;
        }
        public String getActivationTime() {
            return this.activationTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setBandwidthStatus(String bandwidthStatus) {
            this.bandwidthStatus = bandwidthStatus;
            return this;
        }
        public String getBandwidthStatus() {
            return this.bandwidthStatus;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setEccId(String eccId) {
            this.eccId = eccId;
            return this;
        }
        public String getEccId() {
            return this.eccId;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setEnableIpv6(Boolean enableIpv6) {
            this.enableIpv6 = enableIpv6;
            return this;
        }
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setLocalGatewayIp(String localGatewayIp) {
            this.localGatewayIp = localGatewayIp;
            return this;
        }
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
            this.localIpv6GatewayIp = localIpv6GatewayIp;
            return this;
        }
        public String getLocalIpv6GatewayIp() {
            return this.localIpv6GatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPConnVbrBussinessStatus(String PConnVbrBussinessStatus) {
            this.PConnVbrBussinessStatus = PConnVbrBussinessStatus;
            return this;
        }
        public String getPConnVbrBussinessStatus() {
            return this.PConnVbrBussinessStatus;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPConnVbrChargeType(String PConnVbrChargeType) {
            this.PConnVbrChargeType = PConnVbrChargeType;
            return this;
        }
        public String getPConnVbrChargeType() {
            return this.PConnVbrChargeType;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPConnVbrExpireTime(String PConnVbrExpireTime) {
            this.PConnVbrExpireTime = PConnVbrExpireTime;
            return this;
        }
        public String getPConnVbrExpireTime() {
            return this.PConnVbrExpireTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeerGatewayIp(String peerGatewayIp) {
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
            this.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }
        public String getPeerIpv6GatewayIp() {
            return this.peerIpv6GatewayIp;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }
        public String getPeeringIpv6SubnetMask() {
            return this.peeringIpv6SubnetMask;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setPeeringSubnetMask(String peeringSubnetMask) {
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setRecoveryTime(String recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setTerminationTime(String terminationTime) {
            this.terminationTime = terminationTime;
            return this;
        }
        public String getTerminationTime() {
            return this.terminationTime;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setVbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }
        public String getVbrId() {
            return this.vbrId;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBodyVirtualBorderRouterForPhysicalConnectionSetVirtualBorderRouterForPhysicalConnectionType setVbrOwnerUid(Long vbrOwnerUid) {
            this.vbrOwnerUid = vbrOwnerUid;
            return this;
        }
        public Long getVbrOwnerUid() {
            return this.vbrOwnerUid;
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
