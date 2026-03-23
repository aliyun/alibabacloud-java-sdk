// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyEndpointResponseBody extends TeaModel {
    @NameInMap("CausalConsistReadTimeout")
    public String causalConsistReadTimeout;

    @NameInMap("DBProxyConnectString")
    public String DBProxyConnectString;

    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    @NameInMap("DBProxyConnectStringPort")
    public String DBProxyConnectStringPort;

    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    @NameInMap("DBProxyEndpointMinSlaveCount")
    public String DBProxyEndpointMinSlaveCount;

    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    @NameInMap("DBProxyFeatures")
    public String DBProxyFeatures;

    @NameInMap("DBProxyNodes")
    public DescribeDBProxyEndpointResponseBodyDBProxyNodes DBProxyNodes;

    @NameInMap("DbProxyEndpointAliases")
    public String dbProxyEndpointAliases;

    @NameInMap("DbProxyEndpointReadWriteMode")
    public String dbProxyEndpointReadWriteMode;

    @NameInMap("DbProxyEndpointVpcId")
    public String dbProxyEndpointVpcId;

    @NameInMap("DbProxyEndpointVswitchId")
    public String dbProxyEndpointVswitchId;

    @NameInMap("DbProxyEndpointZoneId")
    public String dbProxyEndpointZoneId;

    @NameInMap("EndpointConnectItems")
    public DescribeDBProxyEndpointResponseBodyEndpointConnectItems endpointConnectItems;

    @NameInMap("ReadOnlyInstanceDistributionType")
    public String readOnlyInstanceDistributionType;

    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    public String readOnlyInstanceMaxDelayTime;

    @NameInMap("ReadOnlyInstanceWeight")
    public String readOnlyInstanceWeight;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBProxyEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyEndpointResponseBody self = new DescribeDBProxyEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyEndpointResponseBody setCausalConsistReadTimeout(String causalConsistReadTimeout) {
        this.causalConsistReadTimeout = causalConsistReadTimeout;
        return this;
    }
    public String getCausalConsistReadTimeout() {
        return this.causalConsistReadTimeout;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyConnectString(String DBProxyConnectString) {
        this.DBProxyConnectString = DBProxyConnectString;
        return this;
    }
    public String getDBProxyConnectString() {
        return this.DBProxyConnectString;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
        this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
        return this;
    }
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyConnectStringPort(String DBProxyConnectStringPort) {
        this.DBProxyConnectStringPort = DBProxyConnectStringPort;
        return this;
    }
    public String getDBProxyConnectStringPort() {
        return this.DBProxyConnectStringPort;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyEndpointId(String DBProxyEndpointId) {
        this.DBProxyEndpointId = DBProxyEndpointId;
        return this;
    }
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyEndpointMinSlaveCount(String DBProxyEndpointMinSlaveCount) {
        this.DBProxyEndpointMinSlaveCount = DBProxyEndpointMinSlaveCount;
        return this;
    }
    public String getDBProxyEndpointMinSlaveCount() {
        return this.DBProxyEndpointMinSlaveCount;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyFeatures(String DBProxyFeatures) {
        this.DBProxyFeatures = DBProxyFeatures;
        return this;
    }
    public String getDBProxyFeatures() {
        return this.DBProxyFeatures;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyNodes(DescribeDBProxyEndpointResponseBodyDBProxyNodes DBProxyNodes) {
        this.DBProxyNodes = DBProxyNodes;
        return this;
    }
    public DescribeDBProxyEndpointResponseBodyDBProxyNodes getDBProxyNodes() {
        return this.DBProxyNodes;
    }

    public DescribeDBProxyEndpointResponseBody setDbProxyEndpointAliases(String dbProxyEndpointAliases) {
        this.dbProxyEndpointAliases = dbProxyEndpointAliases;
        return this;
    }
    public String getDbProxyEndpointAliases() {
        return this.dbProxyEndpointAliases;
    }

    public DescribeDBProxyEndpointResponseBody setDbProxyEndpointReadWriteMode(String dbProxyEndpointReadWriteMode) {
        this.dbProxyEndpointReadWriteMode = dbProxyEndpointReadWriteMode;
        return this;
    }
    public String getDbProxyEndpointReadWriteMode() {
        return this.dbProxyEndpointReadWriteMode;
    }

    public DescribeDBProxyEndpointResponseBody setDbProxyEndpointVpcId(String dbProxyEndpointVpcId) {
        this.dbProxyEndpointVpcId = dbProxyEndpointVpcId;
        return this;
    }
    public String getDbProxyEndpointVpcId() {
        return this.dbProxyEndpointVpcId;
    }

    public DescribeDBProxyEndpointResponseBody setDbProxyEndpointVswitchId(String dbProxyEndpointVswitchId) {
        this.dbProxyEndpointVswitchId = dbProxyEndpointVswitchId;
        return this;
    }
    public String getDbProxyEndpointVswitchId() {
        return this.dbProxyEndpointVswitchId;
    }

    public DescribeDBProxyEndpointResponseBody setDbProxyEndpointZoneId(String dbProxyEndpointZoneId) {
        this.dbProxyEndpointZoneId = dbProxyEndpointZoneId;
        return this;
    }
    public String getDbProxyEndpointZoneId() {
        return this.dbProxyEndpointZoneId;
    }

    public DescribeDBProxyEndpointResponseBody setEndpointConnectItems(DescribeDBProxyEndpointResponseBodyEndpointConnectItems endpointConnectItems) {
        this.endpointConnectItems = endpointConnectItems;
        return this;
    }
    public DescribeDBProxyEndpointResponseBodyEndpointConnectItems getEndpointConnectItems() {
        return this.endpointConnectItems;
    }

    public DescribeDBProxyEndpointResponseBody setReadOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
        this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
        return this;
    }
    public String getReadOnlyInstanceDistributionType() {
        return this.readOnlyInstanceDistributionType;
    }

    public DescribeDBProxyEndpointResponseBody setReadOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
        this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
        return this;
    }
    public String getReadOnlyInstanceMaxDelayTime() {
        return this.readOnlyInstanceMaxDelayTime;
    }

    public DescribeDBProxyEndpointResponseBody setReadOnlyInstanceWeight(String readOnlyInstanceWeight) {
        this.readOnlyInstanceWeight = readOnlyInstanceWeight;
        return this;
    }
    public String getReadOnlyInstanceWeight() {
        return this.readOnlyInstanceWeight;
    }

    public DescribeDBProxyEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBProxyEndpointResponseBodyDBProxyNodesDBProxyNodes extends TeaModel {
        @NameInMap("cpuCores")
        public String cpuCores;

        @NameInMap("nodeId")
        public String nodeId;

        @NameInMap("zoneId")
        public String zoneId;

        public static DescribeDBProxyEndpointResponseBodyDBProxyNodesDBProxyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyEndpointResponseBodyDBProxyNodesDBProxyNodes self = new DescribeDBProxyEndpointResponseBodyDBProxyNodesDBProxyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyEndpointResponseBodyDBProxyNodesDBProxyNodes setCpuCores(String cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public String getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDBProxyEndpointResponseBodyDBProxyNodesDBProxyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBProxyEndpointResponseBodyDBProxyNodesDBProxyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBProxyEndpointResponseBodyDBProxyNodes extends TeaModel {
        @NameInMap("DBProxyNodes")
        public java.util.List<DescribeDBProxyEndpointResponseBodyDBProxyNodesDBProxyNodes> DBProxyNodes;

        public static DescribeDBProxyEndpointResponseBodyDBProxyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyEndpointResponseBodyDBProxyNodes self = new DescribeDBProxyEndpointResponseBodyDBProxyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyEndpointResponseBodyDBProxyNodes setDBProxyNodes(java.util.List<DescribeDBProxyEndpointResponseBodyDBProxyNodesDBProxyNodes> DBProxyNodes) {
            this.DBProxyNodes = DBProxyNodes;
            return this;
        }
        public java.util.List<DescribeDBProxyEndpointResponseBodyDBProxyNodesDBProxyNodes> getDBProxyNodes() {
            return this.DBProxyNodes;
        }

    }

    public static class DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems extends TeaModel {
        @NameInMap("DbProxyEndpointConnectString")
        public String dbProxyEndpointConnectString;

        @NameInMap("DbProxyEndpointNetType")
        public String dbProxyEndpointNetType;

        @NameInMap("DbProxyEndpointPort")
        public String dbProxyEndpointPort;

        public static DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems self = new DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems setDbProxyEndpointConnectString(String dbProxyEndpointConnectString) {
            this.dbProxyEndpointConnectString = dbProxyEndpointConnectString;
            return this;
        }
        public String getDbProxyEndpointConnectString() {
            return this.dbProxyEndpointConnectString;
        }

        public DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems setDbProxyEndpointNetType(String dbProxyEndpointNetType) {
            this.dbProxyEndpointNetType = dbProxyEndpointNetType;
            return this;
        }
        public String getDbProxyEndpointNetType() {
            return this.dbProxyEndpointNetType;
        }

        public DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems setDbProxyEndpointPort(String dbProxyEndpointPort) {
            this.dbProxyEndpointPort = dbProxyEndpointPort;
            return this;
        }
        public String getDbProxyEndpointPort() {
            return this.dbProxyEndpointPort;
        }

    }

    public static class DescribeDBProxyEndpointResponseBodyEndpointConnectItems extends TeaModel {
        @NameInMap("EndpointConnectItems")
        public java.util.List<DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems> endpointConnectItems;

        public static DescribeDBProxyEndpointResponseBodyEndpointConnectItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyEndpointResponseBodyEndpointConnectItems self = new DescribeDBProxyEndpointResponseBodyEndpointConnectItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyEndpointResponseBodyEndpointConnectItems setEndpointConnectItems(java.util.List<DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems> endpointConnectItems) {
            this.endpointConnectItems = endpointConnectItems;
            return this;
        }
        public java.util.List<DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems> getEndpointConnectItems() {
            return this.endpointConnectItems;
        }

    }

}
