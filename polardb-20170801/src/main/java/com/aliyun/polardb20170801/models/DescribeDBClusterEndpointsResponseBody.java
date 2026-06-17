// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsResponseBody extends TeaModel {
    /**
     * <p>A list of cluster endpoints.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBClusterEndpointsResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2DC120BF-6EBA-4C63-BE99-B09F9E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEndpointsResponseBody self = new DescribeDBClusterEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterEndpointsResponseBody setItems(java.util.List<DescribeDBClusterEndpointsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBClusterEndpointsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBClusterEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterEndpointsResponseBodyItemsAddressItems extends TeaModel {
        /**
         * <p>The connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>********.rwlb.polardb-pg-public.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>Indicates whether the endpoint is a dashboard endpoint for a PolarDB Search node.</p>
         * <ul>
         * <li><p><strong>True</strong>: Yes</p>
         * </li>
         * <li><p><strong>False</strong>: No</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("DashboardUsed")
        public Boolean dashboardUsed;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.<em><strong>.</strong></em>.***</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><p><strong>Public</strong>: public network</p>
         * </li>
         * <li><p><strong>Private</strong>: private network</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>Inner</strong>: classic network</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Only PolarDB for MySQL clusters support the classic network type.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>1521</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The connection string for the private domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>.</strong></em>.**.com</p>
         */
        @NameInMap("PrivateZoneConnectionString")
        public String privateZoneConnectionString;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-***************</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-************</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC instance ID.</p>
         * <blockquote>
         * <p>This parameter is returned only for PolarDB for MySQL clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pe-*************</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeDBClusterEndpointsResponseBodyItemsAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterEndpointsResponseBodyItemsAddressItems self = new DescribeDBClusterEndpointsResponseBodyItemsAddressItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterEndpointsResponseBodyItemsAddressItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterEndpointsResponseBodyItemsAddressItems setDashboardUsed(Boolean dashboardUsed) {
            this.dashboardUsed = dashboardUsed;
            return this;
        }
        public Boolean getDashboardUsed() {
            return this.dashboardUsed;
        }

        public DescribeDBClusterEndpointsResponseBodyItemsAddressItems setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterEndpointsResponseBodyItemsAddressItems setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterEndpointsResponseBodyItemsAddressItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterEndpointsResponseBodyItemsAddressItems setPrivateZoneConnectionString(String privateZoneConnectionString) {
            this.privateZoneConnectionString = privateZoneConnectionString;
            return this;
        }
        public String getPrivateZoneConnectionString() {
            return this.privateZoneConnectionString;
        }

        public DescribeDBClusterEndpointsResponseBodyItemsAddressItems setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterEndpointsResponseBodyItemsAddressItems setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterEndpointsResponseBodyItemsAddressItems setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeDBClusterEndpointsResponseBodyItems extends TeaModel {
        /**
         * <p>The connection addresses for the endpoint.</p>
         */
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterEndpointsResponseBodyItemsAddressItems> addressItems;

        /**
         * <p>Indicates whether new nodes are automatically added to the default cluster endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Enable</strong></p>
         * </li>
         * <li><p><strong>Disable</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AutoAddNewNodes")
        public String autoAddNewNodes;

        /**
         * <p>The connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>********.rwlb.polardb-pg-public.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1s826a1up******</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The endpoint name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBEndpointDescription")
        public String DBEndpointDescription;

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pe-*************</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <p>The advanced settings for the cluster endpoint.</p>
         * <ul>
         * <li><p><strong>DistributedTransaction</strong>: The transaction splitting status. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: enabled</p>
         * </li>
         * <li><p><strong>off</strong>: disabled</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>ConsistLevel</strong>: The consistency level. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: eventual consistency</p>
         * </li>
         * <li><p><strong>1</strong>: session consistency</p>
         * </li>
         * <li><p><strong>2</strong>: global consistency</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>LoadBalanceStrategy</strong>: The load balancing policy. The value is fixed to <strong>load</strong>, which indicates load-based scheduling.</p>
         * </li>
         * <li><p><strong>MasterAcceptReads</strong>: Indicates whether the primary node accepts read requests. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: The primary node accepts read requests.</p>
         * </li>
         * <li><p><strong>off</strong>: The primary node does not accept read requests.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;DistributedTransaction\&quot;:\&quot;off\&quot;,\&quot;ConsistLevel\&quot;:\&quot;0\&quot;,\&quot;LoadBalanceStrategy\&quot;:\&quot;load\&quot;,\&quot;MasterAcceptReads\&quot;:\&quot;on\&quot;}</p>
         */
        @NameInMap("EndpointConfig")
        public String endpointConfig;

        /**
         * <p>The type of the cluster endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Cluster</strong>: the default cluster endpoint.</p>
         * </li>
         * <li><p><strong>Primary</strong>: the primary endpoint.</p>
         * </li>
         * <li><p><strong>Custom</strong>: a custom cluster endpoint.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><p><strong>Public</strong>: public network</p>
         * </li>
         * <li><p><strong>Private</strong>: private network</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The role of each node in the endpoint. The primary node has the <strong>Writer</strong> role. Read-only nodes have numbered roles, such as <strong>Reader1</strong>, <strong>Reader2</strong>, and so on.</p>
         * <blockquote>
         * <p>This parameter is supported only by PolarDB for PostgreSQL clusters and PolarDB for PostgreSQL (compatible with Oracle) clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Reader1</p>
         */
        @NameInMap("NodeWithRoles")
        public String nodeWithRoles;

        /**
         * <p>The list of nodes configured for the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-<em><strong><strong><strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></strong></strong></em></p>
         */
        @NameInMap("Nodes")
        public String nodes;

        /**
         * <p>The policy for handling global consistency read timeouts. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Redirects the request to the primary node.</p>
         * </li>
         * <li><p><strong>2</strong>: Downgrades the request. If a global consistency read times out, the system automatically downgrades the query to a non-consistent read, and the client does not receive an error.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PolarSccTimeoutAction")
        public String polarSccTimeoutAction;

        /**
         * <p>The timeout period for global consistency reads.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PolarSccWaitTimeout")
        public String polarSccWaitTimeout;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>1521</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The read/write mode. Valid values:</p>
         * <ul>
         * <li><p><strong>ReadWrite</strong>: read and write (automatic read/write splitting).</p>
         * </li>
         * <li><p><strong>ReadOnly</strong>: read-only.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("ReadWriteMode")
        public String readWriteMode;

        /**
         * <p>Indicates whether global consistency (high-performance mode) is enabled for the node. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: enabled</p>
         * </li>
         * <li><p><strong>off</strong>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SccMode")
        public String sccMode;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-***************</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        public static DescribeDBClusterEndpointsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterEndpointsResponseBodyItems self = new DescribeDBClusterEndpointsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterEndpointsResponseBodyItems setAddressItems(java.util.List<DescribeDBClusterEndpointsResponseBodyItemsAddressItems> addressItems) {
            this.addressItems = addressItems;
            return this;
        }
        public java.util.List<DescribeDBClusterEndpointsResponseBodyItemsAddressItems> getAddressItems() {
            return this.addressItems;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setAutoAddNewNodes(String autoAddNewNodes) {
            this.autoAddNewNodes = autoAddNewNodes;
            return this;
        }
        public String getAutoAddNewNodes() {
            return this.autoAddNewNodes;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setDBEndpointDescription(String DBEndpointDescription) {
            this.DBEndpointDescription = DBEndpointDescription;
            return this;
        }
        public String getDBEndpointDescription() {
            return this.DBEndpointDescription;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setDBEndpointId(String DBEndpointId) {
            this.DBEndpointId = DBEndpointId;
            return this;
        }
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setEndpointConfig(String endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public String getEndpointConfig() {
            return this.endpointConfig;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setNodeWithRoles(String nodeWithRoles) {
            this.nodeWithRoles = nodeWithRoles;
            return this;
        }
        public String getNodeWithRoles() {
            return this.nodeWithRoles;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setNodes(String nodes) {
            this.nodes = nodes;
            return this;
        }
        public String getNodes() {
            return this.nodes;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setPolarSccTimeoutAction(String polarSccTimeoutAction) {
            this.polarSccTimeoutAction = polarSccTimeoutAction;
            return this;
        }
        public String getPolarSccTimeoutAction() {
            return this.polarSccTimeoutAction;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setPolarSccWaitTimeout(String polarSccWaitTimeout) {
            this.polarSccWaitTimeout = polarSccWaitTimeout;
            return this;
        }
        public String getPolarSccWaitTimeout() {
            return this.polarSccWaitTimeout;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setReadWriteMode(String readWriteMode) {
            this.readWriteMode = readWriteMode;
            return this;
        }
        public String getReadWriteMode() {
            return this.readWriteMode;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setSccMode(String sccMode) {
            this.sccMode = sccMode;
            return this;
        }
        public String getSccMode() {
            return this.sccMode;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeDBClusterEndpointsResponseBodyItems setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

    }

}
