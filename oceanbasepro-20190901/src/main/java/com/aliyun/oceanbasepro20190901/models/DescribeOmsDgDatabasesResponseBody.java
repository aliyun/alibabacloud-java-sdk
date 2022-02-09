// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsDgDatabasesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeOmsDgDatabasesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOmsDgDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsDgDatabasesResponseBody self = new DescribeOmsDgDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsDgDatabasesResponseBody setData(java.util.List<DescribeOmsDgDatabasesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOmsDgDatabasesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOmsDgDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOmsDgDatabasesResponseBodyData extends TeaModel {
        @NameInMap("ConnectHost")
        public String connectHost;

        @NameInMap("ConnectPort")
        public Integer connectPort;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GatewayName")
        public String gatewayName;

        @NameInMap("Host")
        public String host;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeOmsDgDatabasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsDgDatabasesResponseBodyData self = new DescribeOmsDgDatabasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOmsDgDatabasesResponseBodyData setConnectHost(String connectHost) {
            this.connectHost = connectHost;
            return this;
        }
        public String getConnectHost() {
            return this.connectHost;
        }

        public DescribeOmsDgDatabasesResponseBodyData setConnectPort(Integer connectPort) {
            this.connectPort = connectPort;
            return this;
        }
        public Integer getConnectPort() {
            return this.connectPort;
        }

        public DescribeOmsDgDatabasesResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeOmsDgDatabasesResponseBodyData setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public DescribeOmsDgDatabasesResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeOmsDgDatabasesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOmsDgDatabasesResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeOmsDgDatabasesResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeOmsDgDatabasesResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeOmsDgDatabasesResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeOmsDgDatabasesResponseBodyData setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeOmsDgDatabasesResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeOmsDgDatabasesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOmsDgDatabasesResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribeOmsDgDatabasesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeOmsDgDatabasesResponseBodyData setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

}
