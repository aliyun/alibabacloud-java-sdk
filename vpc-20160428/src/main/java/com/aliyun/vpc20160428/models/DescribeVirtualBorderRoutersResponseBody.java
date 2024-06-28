// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 50</strong>. Default value: <strong>10</strong>.</p>
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
     * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
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
     * <p>The information about the queried VBR.</p>
     */
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
        /**
         * <p>The ID of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-kojok19xxx****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1688000000000****</p>
         */
        @NameInMap("CenOwnerId")
        public Long cenOwnerId;

        /**
         * <p>The status of the CEN instance. Valid values:</p>
         * <ul>
         * <li><strong>Attached</strong>: The VBR is attached to the CEN instance.</li>
         * <li><strong>Attaching</strong>: The VBR is being attached to the CEN instance.</li>
         * <li><strong>Detached</strong>: The VBR is detached from the CEN instance.</li>
         * <li><strong>Detaching</strong>: The VBR is being detached from the CEN instance.</li>
         * <li>If no value is returned, the VBR is not attached to a CEN instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Attached</p>
         */
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
        /**
         * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the ISP.</p>
         * 
         * <strong>example:</strong>
         * <p>longtel0**</p>
         */
        @NameInMap("CircuitCode")
        public String circuitCode;

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
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        /**
         * <p>The IPv6 address of the gateway device on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
         */
        @NameInMap("LocalIpv6GatewayIp")
        public String localIpv6GatewayIp;

        /**
         * <p>The IPv4 address of the gateway device on the user side.</p>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        @NameInMap("PeerGatewayIp")
        public String peerGatewayIp;

        /**
         * <p>The IPv6 address of the gateway device on the user side.</p>
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
         * <p>The subnet mask for the IPv4 addresses of the gateway devices on the Alibaba Cloud side and on the user side.</p>
         * <p>The two IPv4 addresses must fall within the same subnet.</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.252</p>
         */
        @NameInMap("PeeringSubnetMask")
        public String peeringSubnetMask;

        /**
         * <p>The business status of the Express Connect circuit.</p>
         * <ul>
         * <li><strong>Normal:</strong> The Express Connect circuit is running as normal.</li>
         * <li><strong>FinancialLocked:</strong> The Express Connect circuit is locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("PhysicalConnectionBusinessStatus")
        public String physicalConnectionBusinessStatus;

        /**
         * <p>The ID of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-119mfjzm7****</p>
         */
        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the Express Connect circuit belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678****</p>
         */
        @NameInMap("PhysicalConnectionOwnerUid")
        public String physicalConnectionOwnerUid;

        /**
         * <p>The status of the Express Connect circuit.</p>
         * <ul>
         * <li><strong>Initial:</strong> The application is under review.</li>
         * <li><strong>Approved</strong>: The application is approved.</li>
         * <li><strong>Allocating</strong>: The system is allocating resources.</li>
         * <li><strong>Allocated</strong>: The Express Connect circuit is under construction.</li>
         * <li><strong>Confirmed</strong>: The Express Connect circuit is to be confirmed.</li>
         * <li><strong>Enabled</strong>: The Express Connect circuit is enabled.</li>
         * <li><strong>Rejected</strong>: The application is rejected.</li>
         * <li><strong>Canceled</strong>: The application is canceled.</li>
         * <li><strong>Allocation Failed:</strong> The system failed to allocate resources.</li>
         * <li><strong>Terminated:</strong> The Express Connect circuit is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("PhysicalConnectionStatus")
        public String physicalConnectionStatus;

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
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The VLAN ID of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VlanId")
        public String vlanId;

        /**
         * <p>The ID of the VBR interface, which can be used as the next hop of a VBR route.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-kojok19x3j0q6k****</p>
         */
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

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTagsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTagsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTagsTags self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTagsTags();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTagsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTagsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTags extends TeaModel {
        @NameInMap("Tags")
        public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTagsTags> tags;

        public static DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTags self = new DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTags();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTags setTags(java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTagsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTagsTags> getTags() {
            return this.tags;
        }

    }

    public static class DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType extends TeaModel {
        /**
         * <p>The ID of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-kojok1x****</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The time when the VBR was first activated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        @NameInMap("ActivationTime")
        public String activationTime;

        /**
         * <p>The information about the Cloud Enterprise Network (CEN) instance to which the VBR is attached.</p>
         */
        @NameInMap("AssociatedCens")
        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedCens associatedCens;

        /**
         * <p>The information about the Express Connect circuit that is associated with the VBR.</p>
         */
        @NameInMap("AssociatedPhysicalConnections")
        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeAssociatedPhysicalConnections associatedPhysicalConnections;

        /**
         * <p>The bandwidth of the VBR. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the Internet service provider (ISP).</p>
         * 
         * <strong>example:</strong>
         * <p>longtel0****</p>
         */
        @NameInMap("CircuitCode")
        public String circuitCode;

        /**
         * <p>The ID of the cloud box.</p>
         * 
         * <strong>example:</strong>
         * <p>cb-****</p>
         */
        @NameInMap("CloudBoxInstanceId")
        public String cloudBoxInstanceId;

        /**
         * <p>The time when the VBR was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-08T12:20:55</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The multiple of the detection time.</p>
         * <p>This value indicates the maximum number of dropped packets that is allowed by the receiver when the initiator transmits packets. This value can be used to check whether the connection works as expected.</p>
         * <p>Valid values: <strong>3 to 10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DetectMultiplier")
        public Long detectMultiplier;

        /**
         * <p>The ID of the ECC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecc-h****</p>
         */
        @NameInMap("EccId")
        public String eccId;

        @NameInMap("EcrAttatchStatus")
        public String ecrAttatchStatus;

        @NameInMap("EcrId")
        public String ecrId;

        @NameInMap("EcrOwnerId")
        public String ecrOwnerId;

        /**
         * <p>Indicates whether IPv6 is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIpv6")
        public Boolean enableIpv6;

        /**
         * <p>The IPv4 address of the gateway device on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        /**
         * <p>The IPv6 address of the gateway device on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
         */
        @NameInMap("LocalIpv6GatewayIp")
        public String localIpv6GatewayIp;

        /**
         * <p>The time interval to receive BFD packets. Valid values: <strong>200 to 1000</strong>. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MinRxInterval")
        public Long minRxInterval;

        /**
         * <p>The time interval to send Bidirectional Forwarding Detection (BFD) packets. Valid values: <strong>200 to 1000</strong>. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MinTxInterval")
        public Long minTxInterval;

        /**
         * <p>The name of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The billing method of the VBR. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription. If you choose this billing method, make sure that your Alibaba Cloud account supports balance payments or credit payments.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PConnVbrChargeType")
        public String PConnVbrChargeType;

        /**
         * <p>The time when the VBR expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        @NameInMap("PConnVbrExpireTime")
        public String PConnVbrExpireTime;

        /**
         * <p>The IPv4 address of the gateway device on the user side.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("PeerGatewayIp")
        public String peerGatewayIp;

        /**
         * <p>The IPv6 address of the gateway device on the user side.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
         */
        @NameInMap("PeerIpv6GatewayIp")
        public String peerIpv6GatewayIp;

        /**
         * <p>The subnet mask of the IPv6 addresses configured on the user side and Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>2000:1234:0:a000::/55</p>
         */
        @NameInMap("PeeringIpv6SubnetMask")
        public String peeringIpv6SubnetMask;

        /**
         * <p>The subnet mask of the IPv4 addresses configured on the user side and Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.252</p>
         */
        @NameInMap("PeeringSubnetMask")
        public String peeringSubnetMask;

        /**
         * <p>The business status of the Express Connect circuit.</p>
         * <ul>
         * <li><strong>Normal:</strong> The Express Connect circuit is running asnormal.</li>
         * <li><strong>FinancialLocked:</strong> The Express Connect circuit is locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("PhysicalConnectionBusinessStatus")
        public String physicalConnectionBusinessStatus;

        /**
         * <p>The ID of the Express Connect circuit to which the VBR belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-119mfjzm7x****</p>
         */
        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the Express Connect circuit belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1688000000000****</p>
         */
        @NameInMap("PhysicalConnectionOwnerUid")
        public String physicalConnectionOwnerUid;

        /**
         * <p>The status of the Express Connect circuit.</p>
         * <ul>
         * <li><strong>Initial:</strong> The application is under review.</li>
         * <li><strong>Approved</strong>: The application is approved.</li>
         * <li><strong>Allocating</strong>: The system is allocating resources.</li>
         * <li><strong>Allocated</strong>: The Express Connect circuit is under construction.</li>
         * <li><strong>Confirmed</strong>: The Express Connect circuit is to be confirmed.</li>
         * <li><strong>Enabled</strong>: The Express Connect circuit is enabled.</li>
         * <li><strong>Rejected</strong>: The application is rejected.</li>
         * <li><strong>Canceled</strong>: The application is canceled.</li>
         * <li><strong>Allocation Failed:</strong> The system failed to allocate resources.</li>
         * <li><strong>Terminated:</strong> The Express Connect circuit is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("PhysicalConnectionStatus")
        public String physicalConnectionStatus;

        /**
         * <p>The time when the status of the VBR last changed from <strong>terminated</strong> to <strong>active</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-08T12:20:55</p>
         */
        @NameInMap("RecoveryTime")
        public String recoveryTime;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the VBR route table.</p>
         * 
         * <strong>example:</strong>
         * <p>rtb-bp1****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("SitelinkEnable")
        public Boolean sitelinkEnable;

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
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTags tags;

        /**
         * <p>The time when the VBR was last disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        @NameInMap("TerminationTime")
        public String terminationTime;

        /**
         * <p>The type of the VBR.</p>
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
         * <p>vbr-bp1jcg5cmxjbl9xgc****</p>
         */
        @NameInMap("VbrId")
        public String vbrId;

        /**
         * <p>The VLAN ID of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("VlanId")
        public Integer vlanId;

        /**
         * <p>The ID of the VBR interface.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-2zeo3xzyf38r4xx****</p>
         */
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

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
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

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setEcrAttatchStatus(String ecrAttatchStatus) {
            this.ecrAttatchStatus = ecrAttatchStatus;
            return this;
        }
        public String getEcrAttatchStatus() {
            return this.ecrAttatchStatus;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setEcrId(String ecrId) {
            this.ecrId = ecrId;
            return this;
        }
        public String getEcrId() {
            return this.ecrId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setEcrOwnerId(String ecrOwnerId) {
            this.ecrOwnerId = ecrOwnerId;
            return this;
        }
        public String getEcrOwnerId() {
            return this.ecrOwnerId;
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

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setSitelinkEnable(Boolean sitelinkEnable) {
            this.sitelinkEnable = sitelinkEnable;
            return this;
        }
        public Boolean getSitelinkEnable() {
            return this.sitelinkEnable;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterType setTags(DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVirtualBorderRoutersResponseBodyVirtualBorderRouterSetVirtualBorderRouterTypeTags getTags() {
            return this.tags;
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
