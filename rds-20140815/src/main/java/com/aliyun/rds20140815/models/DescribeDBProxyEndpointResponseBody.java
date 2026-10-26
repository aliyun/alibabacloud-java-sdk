// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyEndpointResponseBody extends TeaModel {
    /**
     * <p>The timeout period for consistent reads. Unit: milliseconds. Default value: <strong>10</strong>. Valid values: <strong>0</strong> to <strong>60000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CausalConsistReadTimeout")
    public String causalConsistReadTimeout;

    /**
     * <p>The proxy endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>testproxy****.rwlb.rds.aliyuncs.com</p>
     */
    @NameInMap("DBProxyConnectString")
    public String DBProxyConnectString;

    /**
     * <p>The network type of the proxy endpoint. Valid values:</p>
     * <ul>
     * <li><strong>InnerString</strong>: internal endpoint.</li>
     * <li><strong>OuterString</strong>: public endpoint.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InnerString</p>
     */
    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    /**
     * <p>The port of the proxy endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DBProxyConnectStringPort")
    public String DBProxyConnectStringPort;

    /**
     * <p>The execution cost threshold for SQL statements in automatic request distribution among row store and column store nodes for HTAP.</p>
     * 
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("DBProxyEndpointCostThresholdForDuckdb")
    public String DBProxyEndpointCostThresholdForDuckdb;

    /**
     * <p>The ID of the proxy endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>keaxncrjluwu0gue****</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>The minimum number of reserved instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBProxyEndpointMinSlaveCount")
    public String DBProxyEndpointMinSlaveCount;

    /**
     * <p>An internal parameter. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The settings of the proxy endpoint. The value is in JSON format and includes the following parameters:</p>
     * <ul>
     * <li><strong>TransactionReadSqlRouteOptimizeStatus</strong>: the transaction splitting setting. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled).</li>
     * <li><strong>ConnectionPersist</strong>: the connection pool setting. Valid values: <strong>0</strong> (disabled), <strong>1</strong> (session-level connection pool), and <strong>2</strong> (transaction-level connection pooling).</li>
     * <li><strong>ReadWriteSpliting</strong>: the read/write splitting setting. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled).</li>
     * <li><strong>AZProximityAccess</strong>: the nearest access setting. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled).</li>
     * <li><strong>CausalConsistRead</strong>: the read consistency setting. Valid values: <strong>0</strong> (eventual consistency), <strong>1</strong> (session consistency), and <strong>2</strong> (global consistency).</li>
     * <li><strong>HtapFilter</strong>: the automatic request distribution among row store and column store nodes for HTAP setting. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled).</li>
     * <li><strong>PinPreparedStmt</strong>: an internal parameter visible only in ApsaraDB RDS for PostgreSQL.</li>
     * </ul>
     * <blockquote>
     * <p>For ApsaraDB RDS for PostgreSQL, only <strong>ReadWriteSpliting</strong> can be modified. <strong>TransactionReadSqlRouteOptimizeStatus</strong> and <strong>PinPreparedStmt</strong> are set to 1 by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TransactionReadSqlRouteOptimizeStatus:1;ConnectionPersist:0;ReadWriteSpliting:1</p>
     */
    @NameInMap("DBProxyFeatures")
    public String DBProxyFeatures;

    @NameInMap("DBProxyNodes")
    public DescribeDBProxyEndpointResponseBodyDBProxyNodes DBProxyNodes;

    /**
     * <p>The description of the proxy endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>proxyterminal-test</p>
     */
    @NameInMap("DbProxyEndpointAliases")
    public String dbProxyEndpointAliases;

    /**
     * <p>The read/write mode of the proxy endpoint. Valid values:</p>
     * <ul>
     * <li><strong>ReadWrite</strong>: read/write mode.</li>
     * <li><strong>ReadOnly</strong>: read-only mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("DbProxyEndpointReadWriteMode")
    public String dbProxyEndpointReadWriteMode;

    /**
     * <p>The VPC ID of the proxy endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("DbProxyEndpointVpcId")
    public String dbProxyEndpointVpcId;

    /**
     * <p>The vSwitch ID of the proxy endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-****</p>
     */
    @NameInMap("DbProxyEndpointVswitchId")
    public String dbProxyEndpointVswitchId;

    /**
     * <p>The zone information of the proxy endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("DbProxyEndpointZoneId")
    public String dbProxyEndpointZoneId;

    @NameInMap("EndpointConnectItems")
    public DescribeDBProxyEndpointResponseBodyEndpointConnectItems endpointConnectItems;

    /**
     * <p>The read weight distribution mode. For more information, see <a href="https://help.aliyun.com/document_detail/96076.html">Read weight distribution</a>. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: automatic allocation based on instance specifications</li>
     * <li><strong>Custom</strong>: custom weight allocation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ReadOnlyInstanceDistributionType")
    public String readOnlyInstanceDistributionType;

    /**
     * <p>The latency threshold for read/write splitting. If the latency of a read-only instance exceeds this threshold, read traffic is not routed to the instance. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    public String readOnlyInstanceMaxDelayTime;

    /**
     * <p>The read weight distribution information, which specifies the read request weights of the primary and read-only instances. The value is in JSON format and includes the following parameters:</p>
     * <ul>
     * <li><strong>DBInstanceId</strong>: instance ID of the instance.</li>
     * <li><strong>DBInstanceType</strong>: the type of the instance. Valid values: <strong>Master</strong> (primary instance) and <strong>ReadOnly</strong> (read-only instance).</li>
     * <li><strong>NodeID</strong>: instance IDs of the primary and secondary nodes of the primary instance in the Cluster Edition.</li>
     * <li><strong>NodeType</strong>: the type of the node in the Cluster Edition. Valid values: <strong>Primary</strong> (primary node of the primary instance) and <strong>Secondary</strong> (secondary node of the primary instance).</li>
     * <li><strong>Weight</strong>: the read request weight. The weight increases in increments of <strong>100</strong>, and the maximum value is <strong>10000</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Availability\&quot;:\&quot;Available\&quot;,\&quot;DBInstanceId\&quot;:\&quot;rm-2z****\&quot;，\&quot;DBInstanceType\&quot;:\&quot;Master\&quot;,\&quot;NodeId\&quot;:\&quot;rn-t2****\&quot;,\&quot;NodeType\&quot;:\&quot;Primary\&quot;,\&quot;Weight\&quot;:0}, {\&quot;Availability\&quot;:\&quot;Available\&quot;,\&quot;DBInstanceId\&quot;:\&quot;rm-2z****\&quot;，\&quot;DBInstanceType\&quot;:\&quot;Master\&quot;,\&quot;NodeId\&quot;:\&quot;rn-z9****\&quot;,\&quot;NodeType\&quot;:\&quot;Secondary\&quot;,\&quot;Weight\&quot;:400}, {\&quot;Availability\&quot;:\&quot;Available\&quot;,,\&quot;DBInstanceId\&quot;:\&quot;rm-2z****\&quot;，\&quot;DBInstanceType\&quot;:\&quot;Master\&quot;,\&quot;NodeId\&quot;:\&quot;rn-1c****\&quot;,\&quot;NodeType\&quot;:\&quot;Secondary\&quot;,\&quot;Weight\&quot;:400}]]</p>
     */
    @NameInMap("ReadOnlyInstanceWeight")
    public String readOnlyInstanceWeight;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
     */
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

    public DescribeDBProxyEndpointResponseBody setDBProxyEndpointCostThresholdForDuckdb(String DBProxyEndpointCostThresholdForDuckdb) {
        this.DBProxyEndpointCostThresholdForDuckdb = DBProxyEndpointCostThresholdForDuckdb;
        return this;
    }
    public String getDBProxyEndpointCostThresholdForDuckdb() {
        return this.DBProxyEndpointCostThresholdForDuckdb;
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
