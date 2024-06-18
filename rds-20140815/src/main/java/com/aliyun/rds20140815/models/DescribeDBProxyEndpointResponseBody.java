// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyEndpointResponseBody extends TeaModel {
    /**
     * <p>The proxy endpoint queried.</p>
     * 
     * <strong>example:</strong>
     * <p>testproxy****.rwlb.rds.aliyuncs.com</p>
     */
    @NameInMap("DBProxyConnectString")
    public String DBProxyConnectString;

    /**
     * <p>The network type of the proxy endpoint. Valid values:</p>
     * <ul>
     * <li><strong>InnerString</strong>: internal network</li>
     * <li><strong>OuterString</strong>: Internet</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InnerString</p>
     */
    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    /**
     * <p>The port number that is associated with the proxy endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DBProxyConnectStringPort")
    public String DBProxyConnectStringPort;

    /**
     * <p>The ID of the proxy endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>keaxncrjluwu0gue****</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>An internal parameter. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The configuration of the proxy terminal. The value of this parameter is a JSON string that consists of the following fields:</p>
     * <ul>
     * <li><strong>TransactionReadSqlRouteOptimizeStatus</strong>: the status of the transaction splitting feature. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.</li>
     * <li><strong>ConnectionPersist</strong>: the status of the connection pooling feature. Valid values: <strong>0</strong>, <strong>1</strong>, and <strong>2</strong>. The value 0 indicates that the connection pooling feature is disabled. The value 1 indicates that the session connection pooling feature is enabled. The value 2 indicates that the transaction connection pooling feature is enabled.</li>
     * <li><strong>ReadWriteSpliting</strong>: the status of the read/write splitting feature. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.</li>
     * <li><strong>PinPreparedStmt</strong>: an internal field that is available only for ApsaraDB RDS for PostgreSQL instances.</li>
     * </ul>
     * <blockquote>
     * <p> If the instance runs PostgreSQL, you can change only the value of the <strong>ReadWriteSpliting</strong> field. The <strong>TransactionReadSqlRouteOptimizeStatus</strong> and <strong>PinPreparedStmt</strong> fields are set to their default values 1.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TransactionReadSqlRouteOptimizeStatus:1;ConnectionPersist:0;ReadWriteSpliting:1</p>
     */
    @NameInMap("DBProxyFeatures")
    public String DBProxyFeatures;

    /**
     * <p>The description of the proxy terminal.</p>
     * 
     * <strong>example:</strong>
     * <p>proxyterminal-test</p>
     */
    @NameInMap("DbProxyEndpointAliases")
    public String dbProxyEndpointAliases;

    /**
     * <p>The read and write attributes of the proxy terminal. Valid values:</p>
     * <ul>
     * <li><strong>ReadWrite</strong>: The proxy terminal supports read and write requests.</li>
     * <li><strong>ReadOnly</strong>: The proxy terminal supports only read requests.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("DbProxyEndpointReadWriteMode")
    public String dbProxyEndpointReadWriteMode;

    /**
     * <p>An array that consists of the information about the proxy endpoint.</p>
     */
    @NameInMap("EndpointConnectItems")
    public DescribeDBProxyEndpointResponseBodyEndpointConnectItems endpointConnectItems;

    /**
     * <p>The method that is used to assign read weights. For more information, see <a href="https://help.aliyun.com/document_detail/96076.html">Modify the latency threshold and read weights of ApsaraDB RDS for MySQL instances</a>. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: The system automatically assigns read weights to the instance and its read-only instances based on the specifications of these instances.</li>
     * <li><strong>Custom</strong>: You must manually assign read weights to the instance and its read-only instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ReadOnlyInstanceDistributionType")
    public String readOnlyInstanceDistributionType;

    /**
     * <p>The latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the specified threshold, ApsaraDB RDS no longer forwards read requests to the read-only instance.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    public String readOnlyInstanceMaxDelayTime;

    /**
     * <p>The read weights of the instance and its read-only instances. The value of this parameter is a JSON string that consists of the following parameters:</p>
     * <ul>
     * <li><strong>DBInstanceId</strong>: the ID of the instance.</li>
     * <li><strong>DBInstanceType</strong>: the role of the instance. Valid values: <strong>Master</strong> and <strong>ReadOnly</strong>.</li>
     * <li><strong>NodeID</strong>: The IDs of the primary and secondary nodes of the cluster. An instance that runs RDS Cluster Edition refers to a cluster.</li>
     * <li><strong>NodeType</strong>: The node type. Valid values: <strong>Primary</strong> and <strong>Secondary</strong>.</li>
     * <li><strong>Weight</strong>: the read weight of the instance. The read weight increases in increments of <strong>100</strong> and cannot exceed <strong>10000</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Availability\&quot;:\&quot;Available\&quot;,\&quot;DBInstanceId\&quot;:\&quot;rr-bp176984qewd8****\&quot;,\&quot;DBInstanceType\&quot;:\&quot;ReadOnly\&quot;,\&quot;Weight\&quot;:400},{\&quot;Availability\&quot;:\&quot;Available\&quot;,\&quot;DBInstanceId\&quot;:\&quot;rm-bp1ja4f56s7us****\&quot;,\&quot;DBInstanceType\&quot;:\&quot;Master\&quot;,\&quot;Weight\&quot;:0}]</p>
     */
    @NameInMap("ReadOnlyInstanceWeight")
    public String readOnlyInstanceWeight;

    /**
     * <p>The request ID.</p>
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

    public static class DescribeDBProxyEndpointResponseBodyEndpointConnectItemsEndpointConnectItems extends TeaModel {
        /**
         * <p>The proxy endpoint queried.</p>
         * 
         * <strong>example:</strong>
         * <p>testproxy****.rwlb.rds.aliyuncs.com</p>
         */
        @NameInMap("DbProxyEndpointConnectString")
        public String dbProxyEndpointConnectString;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Internet</li>
         * <li><strong>1</strong>: classic network</li>
         * <li><strong>2</strong>: virtual private cloud (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DbProxyEndpointNetType")
        public String dbProxyEndpointNetType;

        /**
         * <p>The port number that is associated with the proxy endpoint. Default value: <strong>3306</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
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
