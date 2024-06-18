// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEndpointsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeDBInstanceEndpointsResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>777C4593-8053-427B-****105593277CAB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceEndpointsResponseBody self = new DescribeDBInstanceEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceEndpointsResponseBody setData(DescribeDBInstanceEndpointsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceEndpointsResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem extends TeaModel {
        /**
         * <p>The endpoints of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm****.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.71.XX.XX</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The type of the IP address. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: Internet</li>
         * <li><strong>Private</strong>: internal network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("IpType")
        public String ipType;

        /**
         * <p>The port number of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp12u14ecz****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp17xdic25d****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem self = new DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItems extends TeaModel {
        @NameInMap("AddressItem")
        public java.util.List<DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem> addressItem;

        public static DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItems self = new DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItems setAddressItem(java.util.List<DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem> addressItem) {
            this.addressItem = addressItem;
            return this;
        }
        public java.util.List<DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItemsAddressItem> getAddressItem() {
            return this.addressItem;
        }

    }

    public static class DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItemsNodeItem extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-u****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rn-****13p6tum4289h</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The weight of the node. Read requests are distributed based on the weight.</p>
         * <p>Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItemsNodeItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItemsNodeItem self = new DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItemsNodeItem();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItemsNodeItem setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItemsNodeItem setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItemsNodeItem setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItems extends TeaModel {
        @NameInMap("NodeItem")
        public java.util.List<DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItemsNodeItem> nodeItem;

        public static DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItems self = new DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItems setNodeItem(java.util.List<DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItemsNodeItem> nodeItem) {
            this.nodeItem = nodeItem;
            return this;
        }
        public java.util.List<DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItemsNodeItem> getNodeItem() {
            return this.nodeItem;
        }

    }

    public static class DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint extends TeaModel {
        /**
         * <p>The information about the endpoint.</p>
         */
        @NameInMap("AddressItems")
        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItems addressItems;

        /**
         * <p>The user-defined description of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>for readonly business</p>
         */
        @NameInMap("EndpointDescription")
        public String endpointDescription;

        /**
         * <p>The endpoint ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Primary</strong>: the read/write endpoint of the instance</li>
         * <li><strong>Readonly</strong>: the read-only endpoint of the instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Readonly</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The information about the node that is configured for the endpoint.</p>
         */
        @NameInMap("NodeItems")
        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItems nodeItems;

        public static DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint self = new DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint setAddressItems(DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItems addressItems) {
            this.addressItems = addressItems;
            return this;
        }
        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItems getAddressItems() {
            return this.addressItems;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint setEndpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }
        public String getEndpointDescription() {
            return this.endpointDescription;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint setNodeItems(DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItems nodeItems) {
            this.nodeItems = nodeItems;
            return this;
        }
        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointNodeItems getNodeItems() {
            return this.nodeItems;
        }

    }

    public static class DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpoints extends TeaModel {
        @NameInMap("DBInstanceEndpoint")
        public java.util.List<DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint> DBInstanceEndpoint;

        public static DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpoints self = new DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpoints setDBInstanceEndpoint(java.util.List<DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint> DBInstanceEndpoint) {
            this.DBInstanceEndpoint = DBInstanceEndpoint;
            return this;
        }
        public java.util.List<DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpoint> getDBInstanceEndpoint() {
            return this.DBInstanceEndpoint;
        }

    }

    public static class DescribeDBInstanceEndpointsResponseBodyData extends TeaModel {
        /**
         * <p>The information of the endpoints of the instance.</p>
         */
        @NameInMap("DBInstanceEndpoints")
        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpoints DBInstanceEndpoints;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-u****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The version of the IP protocol. Valid values:</p>
         * <ul>
         * <li><strong>ipv4</strong></li>
         * <li><strong>ipv6</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        public static DescribeDBInstanceEndpointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEndpointsResponseBodyData self = new DescribeDBInstanceEndpointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEndpointsResponseBodyData setDBInstanceEndpoints(DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpoints DBInstanceEndpoints) {
            this.DBInstanceEndpoints = DBInstanceEndpoints;
            return this;
        }
        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpoints getDBInstanceEndpoints() {
            return this.DBInstanceEndpoints;
        }

        public DescribeDBInstanceEndpointsResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDBInstanceEndpointsResponseBodyData setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

    }

}
