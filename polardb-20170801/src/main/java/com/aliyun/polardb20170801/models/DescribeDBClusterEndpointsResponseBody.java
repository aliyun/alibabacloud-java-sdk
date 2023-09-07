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
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Public**</p>
         * <p>*   **Private**</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The private domain name that is bound to the endpoint.</p>
         */
        @NameInMap("PrivateZoneConnectionString")
        public String privateZoneConnectionString;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC) instance.</p>
         * <br>
         * <p>> This parameter is returned for only PolarDB for MySQL clusters.</p>
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
         * <br>
         * <p>*   **Enable**</p>
         * <p>*   **Disable**</p>
         */
        @NameInMap("AutoAddNewNodes")
        public String autoAddNewNodes;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The name of the endpoint.</p>
         */
        @NameInMap("DBEndpointDescription")
        public String DBEndpointDescription;

        /**
         * <p>The ID of the endpoint.</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <p>The advanced configurations of the endpoint.</p>
         * <br>
         * <p>*   **DistributedTransaction**: indicates whether transaction splitting is enabled. Valid values:</p>
         * <br>
         * <p>    *   **on**</p>
         * <p>    *   **off**</p>
         * <br>
         * <p>*   **ConsistLevel**: the consistency level of sessions. Valid values:</p>
         * <br>
         * <p>    *   **0**: eventual consistency.</p>
         * <p>    *   **1**: session consistency.</p>
         * <p>    *   **2**: global consistency.</p>
         * <br>
         * <p>*   **LoadBalanceStrategy**: the load balancing policy that automatically schedules loads. Only **load** may be returned.</p>
         * <br>
         * <p>*   **MasterAcceptReads**: indicates whether the primary node processes read requests. Valid values:</p>
         * <br>
         * <p>    *   **on**</p>
         * <p>    *   **off**</p>
         */
        @NameInMap("EndpointConfig")
        public String endpointConfig;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Cluster**: the default endpoint.</p>
         * <p>*   **Primary**: the primary endpoint.</p>
         * <p>*   **Custom**: a custom cluster endpoint.</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The role name of each node in the endpoint. The role name of the primary node is **Writer**. Multiple read-only nodes can be associated with an endpoint. Therefore, the role name of each read-only node is suffixed with a number, such as **Reader1** and **Reader2**.</p>
         * <br>
         * <p>> This parameter is valid only for PolarDB for PostgreSQL clusters and PolarDB for PostgreSQL (Compatible with Oracle)) clusters.</p>
         */
        @NameInMap("NodeWithRoles")
        public String nodeWithRoles;

        /**
         * <p>The nodes in the endpoint.</p>
         */
        @NameInMap("Nodes")
        public String nodes;

        /**
         * <p>The read/write mode. Valid values:</p>
         * <br>
         * <p>*   **ReadWrite**: handles read and write requests. Automatic read/write splitting is enabled.</p>
         * <p>*   **ReadOnly**: handles read-only requests.</p>
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
