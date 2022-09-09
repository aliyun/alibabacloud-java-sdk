// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeDBClusterEndpointsResponseBodyItems> items;

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
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Port")
        public String port;

        @NameInMap("PrivateZoneConnectionString")
        public String privateZoneConnectionString;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterEndpointsResponseBodyItemsAddressItems> addressItems;

        @NameInMap("AutoAddNewNodes")
        public String autoAddNewNodes;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DBEndpointDescription")
        public String DBEndpointDescription;

        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        @NameInMap("EndpointConfig")
        public String endpointConfig;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("NodeWithRoles")
        public String nodeWithRoles;

        @NameInMap("Nodes")
        public String nodes;

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
