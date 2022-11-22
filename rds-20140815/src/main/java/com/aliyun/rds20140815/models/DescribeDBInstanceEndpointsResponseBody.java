// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEndpointsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDBInstanceEndpointsResponseBodyData data;

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
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("IpType")
        public String ipType;

        @NameInMap("Port")
        public String port;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("NodeId")
        public String nodeId;

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
        @NameInMap("AddressItems")
        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpointsDBInstanceEndpointAddressItems addressItems;

        @NameInMap("EndpointDescription")
        public String endpointDescription;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointType")
        public String endpointType;

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
        @NameInMap("DBInstanceEndpoints")
        public DescribeDBInstanceEndpointsResponseBodyDataDBInstanceEndpoints DBInstanceEndpoints;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

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
