// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsZonalResponseBody extends TeaModel {
    /**
     * <p>The details of the cluster endpoints.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2DC120BF-6EBA-4C63-BE99-B09F9E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterEndpointsZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEndpointsZonalResponseBody self = new DescribeDBClusterEndpointsZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterEndpointsZonalResponseBody setItems(java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBClusterEndpointsZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems extends TeaModel {
        /**
         * <p>The connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>********.rwlb.polardb-pg-public.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>Specifies whether the endpoint is the dashboard endpoint of a PolarDB search node. Valid values:</p>
         * <ul>
         * <li><p>True: Yes.</p>
         * </li>
         * <li><p>False: No.</p>
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
         * <li><p>Public: Internet.</p>
         * </li>
         * <li><p>Private: internal network.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>1521</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The private domain name that is bound to the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>.</strong></em>.**.com</p>
         */
        @NameInMap("PrivateZoneConnectionString")
        public String privateZoneConnectionString;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-***************</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The virtual switch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-************</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pe-*************</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems self = new DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setDashboardUsed(Boolean dashboardUsed) {
            this.dashboardUsed = dashboardUsed;
            return this;
        }
        public Boolean getDashboardUsed() {
            return this.dashboardUsed;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setPrivateZoneConnectionString(String privateZoneConnectionString) {
            this.privateZoneConnectionString = privateZoneConnectionString;
            return this;
        }
        public String getPrivateZoneConnectionString() {
            return this.privateZoneConnectionString;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeDBClusterEndpointsZonalResponseBodyItems extends TeaModel {
        /**
         * <p>The connection string information.</p>
         */
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems> addressItems;

        /**
         * <p>Specifies whether new nodes are automatically added to the default cluster endpoint. Valid values:</p>
         * <ul>
         * <li><p>Enable.</p>
         * </li>
         * <li><p>Disable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AutoAddNewNodes")
        public String autoAddNewNodes;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1s826a1up******</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The name of the endpoint.</p>
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
         * <p>The advanced configurations of the cluster endpoint.</p>
         * <ul>
         * <li><p><strong>DistributedTransaction</strong>: The status of transaction splitting. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Transaction splitting is enabled.</p>
         * </li>
         * <li><p><strong>off</strong>: Transaction splitting is disabled.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>ConsistLevel</strong>: The consistency level. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Eventual consistency.</p>
         * </li>
         * <li><p><strong>1</strong>: Session consistency.</p>
         * </li>
         * <li><p><strong>2</strong>: Global consistency.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>LoadBalanceStrategy</strong>: The load balancing policy for automatic scheduling based on loads. The value is fixed as <strong>load</strong>.</p>
         * </li>
         * <li><p><strong>MasterAcceptReads</strong>: Specifies whether the primary node accepts read requests. Valid values:</p>
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
         * <li><p>Cluster: the default cluster endpoint.</p>
         * </li>
         * <li><p>Primary: the primary endpoint.</p>
         * </li>
         * <li><p>Custom: a custom cluster endpoint.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The role of each node in the endpoint. The primary node has the Writer role. Because multiple read-only nodes can be added to an endpoint, each read-only node is assigned a role name suffixed with a number, such as Reader1 and Reader2.</p>
         * 
         * <strong>example:</strong>
         * <p>Reader1</p>
         */
        @NameInMap("NodeWithRoles")
        public String nodeWithRoles;

        /**
         * <p>The list of nodes that are configured for the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-<em><strong><strong><strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></strong></strong></em></p>
         */
        @NameInMap("Nodes")
        public String nodes;

        /**
         * <p>The policy for global consistency timeout. Valid values:</p>
         * <ul>
         * <li><p>0: Sends the request to the primary node.</p>
         * </li>
         * <li><p>2: Degrades the request. If a global consistency read times out, the query is automatically degraded to a regular request. The client does not receive an error message.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PolarSccTimeoutAction")
        public String polarSccTimeoutAction;

        /**
         * <p>The timeout period for global consistency.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PolarSccWaitTimeout")
        public String polarSccWaitTimeout;

        /**
         * <p>The read/write mode. Valid values:</p>
         * <ul>
         * <li><p>ReadWrite: read and write (automatic read/write splitting).</p>
         * </li>
         * <li><p>ReadOnly: read-only.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("ReadWriteMode")
        public String readWriteMode;

        /**
         * <p>Specifies whether global consistency (high-performance mode) is enabled for the node. Valid values:</p>
         * <ul>
         * <li><p>on: enabled.</p>
         * </li>
         * <li><p>off: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SccMode")
        public String sccMode;

        public static DescribeDBClusterEndpointsZonalResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterEndpointsZonalResponseBodyItems self = new DescribeDBClusterEndpointsZonalResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setAddressItems(java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems> addressItems) {
            this.addressItems = addressItems;
            return this;
        }
        public java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems> getAddressItems() {
            return this.addressItems;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setAutoAddNewNodes(String autoAddNewNodes) {
            this.autoAddNewNodes = autoAddNewNodes;
            return this;
        }
        public String getAutoAddNewNodes() {
            return this.autoAddNewNodes;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setDBEndpointDescription(String DBEndpointDescription) {
            this.DBEndpointDescription = DBEndpointDescription;
            return this;
        }
        public String getDBEndpointDescription() {
            return this.DBEndpointDescription;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setDBEndpointId(String DBEndpointId) {
            this.DBEndpointId = DBEndpointId;
            return this;
        }
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setEndpointConfig(String endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public String getEndpointConfig() {
            return this.endpointConfig;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setNodeWithRoles(String nodeWithRoles) {
            this.nodeWithRoles = nodeWithRoles;
            return this;
        }
        public String getNodeWithRoles() {
            return this.nodeWithRoles;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setNodes(String nodes) {
            this.nodes = nodes;
            return this;
        }
        public String getNodes() {
            return this.nodes;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setPolarSccTimeoutAction(String polarSccTimeoutAction) {
            this.polarSccTimeoutAction = polarSccTimeoutAction;
            return this;
        }
        public String getPolarSccTimeoutAction() {
            return this.polarSccTimeoutAction;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setPolarSccWaitTimeout(String polarSccWaitTimeout) {
            this.polarSccWaitTimeout = polarSccWaitTimeout;
            return this;
        }
        public String getPolarSccWaitTimeout() {
            return this.polarSccWaitTimeout;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setReadWriteMode(String readWriteMode) {
            this.readWriteMode = readWriteMode;
            return this;
        }
        public String getReadWriteMode() {
            return this.readWriteMode;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setSccMode(String sccMode) {
            this.sccMode = sccMode;
            return this;
        }
        public String getSccMode() {
            return this.sccMode;
        }

    }

}
