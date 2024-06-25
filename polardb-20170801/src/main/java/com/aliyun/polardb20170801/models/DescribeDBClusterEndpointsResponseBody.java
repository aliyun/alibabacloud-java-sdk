// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsResponseBody extends TeaModel {
    /**
     * <p>The details of the endpoints.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBClusterEndpointsResponseBodyItems> items;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>********.rwlb.polardb-pg-public.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.<em><strong>.</strong></em>.***</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong></li>
         * <li><strong>Private</strong></li>
         * </ul>
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
         * <p>The private domain name that is bound to the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>.</strong></em>.**.com</p>
         */
        @NameInMap("PrivateZoneConnectionString")
        public String privateZoneConnectionString;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-***************</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-************</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC) instance.</p>
         * <blockquote>
         * <p>This parameter is returned for only PolarDB for MySQL clusters.</p>
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
         * <p>The details of the endpoint.</p>
         */
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterEndpointsResponseBodyItemsAddressItems> addressItems;

        /**
         * <p>Indicates whether new nodes are automatically associated with the default cluster endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong></li>
         * <li><strong>Disable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AutoAddNewNodes")
        public String autoAddNewNodes;

        /**
         * <p>The ID of the cluster.</p>
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
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>pe-*************</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <p>The advanced configurations of the endpoint.</p>
         * <ul>
         * <li><p><strong>DistributedTransaction</strong>: indicates whether transaction splitting is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>ConsistLevel</strong>: the consistency level of sessions. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: eventual consistency.</li>
         * <li><strong>1</strong>: session consistency.</li>
         * <li><strong>2</strong>: global consistency.</li>
         * </ul>
         * </li>
         * <li><p><strong>LoadBalanceStrategy</strong>: the load balancing policy that automatically schedules loads. Only <strong>load</strong> may be returned.</p>
         * </li>
         * <li><p><strong>MasterAcceptReads</strong>: indicates whether the primary node processes read requests. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
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
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Cluster</strong>: the default endpoint.</li>
         * <li><strong>Primary</strong>: the primary endpoint.</li>
         * <li><strong>Custom</strong>: a custom cluster endpoint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The role name of each node in the endpoint. The role name of the primary node is <strong>Writer</strong>. Multiple read-only nodes can be associated with an endpoint. Therefore, the role name of each read-only node is suffixed with a number, such as <strong>Reader1</strong> and <strong>Reader2</strong>.</p>
         * <blockquote>
         * <p>This parameter is valid only for PolarDB for PostgreSQL clusters and PolarDB for PostgreSQL (Compatible with Oracle)) clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Reader1</p>
         */
        @NameInMap("NodeWithRoles")
        public String nodeWithRoles;

        /**
         * <p>The nodes in the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-<em><strong><strong><strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></strong></strong></em></p>
         */
        @NameInMap("Nodes")
        public String nodes;

        /**
         * <p>The read/write mode. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: handles read and write requests. Automatic read/write splitting is enabled.</li>
         * <li><strong>ReadOnly</strong>: handles read-only requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("ReadWriteMode")
        public String readWriteMode;

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

        public DescribeDBClusterEndpointsResponseBodyItems setReadWriteMode(String readWriteMode) {
            this.readWriteMode = readWriteMode;
            return this;
        }
        public String getReadWriteMode() {
            return this.readWriteMode;
        }

    }

}
