// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyEndpointResponseBody extends TeaModel {
    /**
     * <p>The proxy endpoint queried.</p>
     */
    @NameInMap("DBProxyConnectString")
    public String DBProxyConnectString;

    /**
     * <p>The network type of the proxy endpoint. Valid values:</p>
     * <br>
     * <p>*   **InnerString**: internal network</p>
     * <p>*   **OuterString**: Internet</p>
     */
    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    /**
     * <p>The port number that is associated with the proxy endpoint.</p>
     */
    @NameInMap("DBProxyConnectStringPort")
    public String DBProxyConnectStringPort;

    /**
     * <p>The ID of the proxy endpoint.</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>An internal parameter. You can ignore this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The configuration of the proxy terminal. The value of this parameter is a JSON string that consists of the following fields:</p>
     * <br>
     * <p>*   **TransactionReadSqlRouteOptimizeStatus**: the status of the transaction splitting feature. Valid values: **0** and **1**. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.</p>
     * <p>*   **ConnectionPersist**: the status of the connection pooling feature. Valid values: **0**, **1**, and **2**. The value 0 indicates that the connection pooling feature is disabled. The value 1 indicates that the session connection pooling feature is enabled. The value 2 indicates that the transaction connection pooling feature is enabled.</p>
     * <p>*   **ReadWriteSpliting**: the status of the read/write splitting feature. Valid values: **0** and **1**. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.</p>
     * <p>*   **PinPreparedStmt**: an internal field that is available only for ApsaraDB RDS for PostgrSQL instances.</p>
     * <br>
     * <p>>  If the instance runs PostgreSQL, you can change only the value of the **ReadWriteSpliting** field. The **TransactionReadSqlRouteOptimizeStatus** and **PinPreparedStmt** fields are set to their default values 1.</p>
     */
    @NameInMap("DBProxyFeatures")
    public String DBProxyFeatures;

    /**
     * <p>The description of the proxy terminal.</p>
     */
    @NameInMap("DbProxyEndpointAliases")
    public String dbProxyEndpointAliases;

    /**
     * <p>The read and write attributes of the proxy terminal. Valid values:</p>
     * <br>
     * <p>*   **ReadWrite**: The proxy terminal supports read and write requests.</p>
     * <p>*   **ReadOnly**: The proxy terminal supports only read requests.</p>
     */
    @NameInMap("DbProxyEndpointReadWriteMode")
    public String dbProxyEndpointReadWriteMode;

    /**
     * <p>An array that consists of the information about the proxy endpoint.</p>
     */
    @NameInMap("EndpointConnectItems")
    public DescribeDBProxyEndpointResponseBodyEndpointConnectItems endpointConnectItems;

    /**
     * <p>The method that is used to assign read weights. For more information, see [Modify the latency threshold and read weights of ApsaraDB RDS for MySQL instances](~~96076~~). Valid values:</p>
     * <br>
     * <p>*   **Standard**: The system automatically assigns read weights to the instance and its read-only instances based on the specifications of these instances.</p>
     * <p>*   **Custom**: You must manually assign read weights to the instance and its read-only instances.</p>
     */
    @NameInMap("ReadOnlyInstanceDistributionType")
    public String readOnlyInstanceDistributionType;

    /**
     * <p>The latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the specified threshold, ApsaraDB RDS no longer forwards read requests to the read-only instance.</p>
     */
    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    public String readOnlyInstanceMaxDelayTime;

    /**
     * <p>The read weights of the instance and its read-only instances. The value of this parameter is a JSON string that consists of the following fields:</p>
     * <br>
     * <p>*   **DBInstanceId**: the ID of the instance.</p>
     * <p>*   **DBInstanceType**: the role of the instance. Valid values: **Master** and **ReadOnly**.</p>
     * <p>*   **NodeID**: the IDs of the primary and secondary nodes on the primary instance if the instance runs RDS Cluster Edition.</p>
     * <p>*   **NodeType**: the type of the node if the instance runs RDS Cluster Edition. Valid values: **Primary** and **Secondary**. The value Primary indicates the primary node on the primary instance. The value Secondary indicates the secondary node on the primary instance.</p>
     * <p>*   **Weight**: the read weight of the instance. The read weight increases in increments of **100** and cannot exceed **10000**.</p>
     */
    @NameInMap("ReadOnlyInstanceWeight")
    public String readOnlyInstanceWeight;

    /**
     * <p>The request ID.</p>
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
         */
        @NameInMap("DbProxyEndpointConnectString")
        public String dbProxyEndpointConnectString;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: Internet</p>
         * <p>*   **1**: classic network</p>
         * <p>*   **2**: virtual private cloud (VPC)</p>
         */
        @NameInMap("DbProxyEndpointNetType")
        public String dbProxyEndpointNetType;

        /**
         * <p>The port number that is associated with the proxy endpoint. Default value: **3306**.</p>
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
