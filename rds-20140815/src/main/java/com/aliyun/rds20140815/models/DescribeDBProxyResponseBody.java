// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyResponseBody extends TeaModel {
    @NameInMap("DBProxyAVZones")
    public DescribeDBProxyResponseBodyDBProxyAVZones DBProxyAVZones;

    /**
     * <p>An array consisting of the information about the proxy endpoint that is created for the instance.</p>
     */
    @NameInMap("DBProxyConnectStringItems")
    public DescribeDBProxyResponseBodyDBProxyConnectStringItems DBProxyConnectStringItems;

    /**
     * <p>An internal parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The proxy version that is run by the instance.</p>
     */
    @NameInMap("DBProxyInstanceCurrentMinorVersion")
    public String DBProxyInstanceCurrentMinorVersion;

    /**
     * <p>The latest proxy version that is available for the instance.</p>
     */
    @NameInMap("DBProxyInstanceLatestMinorVersion")
    public String DBProxyInstanceLatestMinorVersion;

    /**
     * <p>The name of the proxy instance.</p>
     */
    @NameInMap("DBProxyInstanceName")
    public String DBProxyInstanceName;

    /**
     * <p>The number of proxies that are enabled on the instance.</p>
     */
    @NameInMap("DBProxyInstanceNum")
    public Integer DBProxyInstanceNum;

    /**
     * <p>The specifications of the proxy instance. This parameter is available only for ApsaraDB RDS for PostgreSQL instances.</p>
     * <br>
     * <p>Format: Number of cores/Memory capacity. For example, the value 4/8 indicates that the proxy instance has 4 cores and 8 GB of memory.</p>
     */
    @NameInMap("DBProxyInstanceSize")
    public String DBProxyInstanceSize;

    /**
     * <p>The status of the proxy instance. Valid values:</p>
     * <br>
     * <p>*   **Creating**: The proxy instance is being created.</p>
     * <p>*   **Running**: The proxy instance is running.</p>
     * <p>*   **DBInstanceClassChanging**: The specifications of the proxy instance are being changed.</p>
     * <p>*   **Deleting**: The proxy instance is being deleted.</p>
     */
    @NameInMap("DBProxyInstanceStatus")
    public String DBProxyInstanceStatus;

    /**
     * <p>The type of the database proxy that is enabled on the instance. Valid values:</p>
     * <br>
     * <p>*   **1**: shared proxy</p>
     * <p>*   **2**: dedicated proxy</p>
     * <br>
     * <p>>  ApsaraDB RDS for PostgreSQL instances support only dedicated proxies.</p>
     */
    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    /**
     * <p>The status of the database proxy feature. Valid values:</p>
     * <br>
     * <p>*   **Startup**: enabled</p>
     * <p>*   **Shutdown**: disabled</p>
     */
    @NameInMap("DBProxyServiceStatus")
    public String DBProxyServiceStatus;

    /**
     * <p>An array consisting of the information about the proxy terminal.</p>
     */
    @NameInMap("DbProxyEndpointItems")
    public DescribeDBProxyResponseBodyDbProxyEndpointItems dbProxyEndpointItems;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDBProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyResponseBody self = new DescribeDBProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyResponseBody setDBProxyAVZones(DescribeDBProxyResponseBodyDBProxyAVZones DBProxyAVZones) {
        this.DBProxyAVZones = DBProxyAVZones;
        return this;
    }
    public DescribeDBProxyResponseBodyDBProxyAVZones getDBProxyAVZones() {
        return this.DBProxyAVZones;
    }

    public DescribeDBProxyResponseBody setDBProxyConnectStringItems(DescribeDBProxyResponseBodyDBProxyConnectStringItems DBProxyConnectStringItems) {
        this.DBProxyConnectStringItems = DBProxyConnectStringItems;
        return this;
    }
    public DescribeDBProxyResponseBodyDBProxyConnectStringItems getDBProxyConnectStringItems() {
        return this.DBProxyConnectStringItems;
    }

    public DescribeDBProxyResponseBody setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceCurrentMinorVersion(String DBProxyInstanceCurrentMinorVersion) {
        this.DBProxyInstanceCurrentMinorVersion = DBProxyInstanceCurrentMinorVersion;
        return this;
    }
    public String getDBProxyInstanceCurrentMinorVersion() {
        return this.DBProxyInstanceCurrentMinorVersion;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceLatestMinorVersion(String DBProxyInstanceLatestMinorVersion) {
        this.DBProxyInstanceLatestMinorVersion = DBProxyInstanceLatestMinorVersion;
        return this;
    }
    public String getDBProxyInstanceLatestMinorVersion() {
        return this.DBProxyInstanceLatestMinorVersion;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceName(String DBProxyInstanceName) {
        this.DBProxyInstanceName = DBProxyInstanceName;
        return this;
    }
    public String getDBProxyInstanceName() {
        return this.DBProxyInstanceName;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceNum(Integer DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public Integer getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceSize(String DBProxyInstanceSize) {
        this.DBProxyInstanceSize = DBProxyInstanceSize;
        return this;
    }
    public String getDBProxyInstanceSize() {
        return this.DBProxyInstanceSize;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceStatus(String DBProxyInstanceStatus) {
        this.DBProxyInstanceStatus = DBProxyInstanceStatus;
        return this;
    }
    public String getDBProxyInstanceStatus() {
        return this.DBProxyInstanceStatus;
    }

    public DescribeDBProxyResponseBody setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public DescribeDBProxyResponseBody setDBProxyServiceStatus(String DBProxyServiceStatus) {
        this.DBProxyServiceStatus = DBProxyServiceStatus;
        return this;
    }
    public String getDBProxyServiceStatus() {
        return this.DBProxyServiceStatus;
    }

    public DescribeDBProxyResponseBody setDbProxyEndpointItems(DescribeDBProxyResponseBodyDbProxyEndpointItems dbProxyEndpointItems) {
        this.dbProxyEndpointItems = dbProxyEndpointItems;
        return this;
    }
    public DescribeDBProxyResponseBodyDbProxyEndpointItems getDbProxyEndpointItems() {
        return this.dbProxyEndpointItems;
    }

    public DescribeDBProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBProxyResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class DescribeDBProxyResponseBodyDBProxyAVZones extends TeaModel {
        @NameInMap("DBProxyAVZones")
        public java.util.List<String> DBProxyAVZones;

        public static DescribeDBProxyResponseBodyDBProxyAVZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseBodyDBProxyAVZones self = new DescribeDBProxyResponseBodyDBProxyAVZones();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyResponseBodyDBProxyAVZones setDBProxyAVZones(java.util.List<String> DBProxyAVZones) {
            this.DBProxyAVZones = DBProxyAVZones;
            return this;
        }
        public java.util.List<String> getDBProxyAVZones() {
            return this.DBProxyAVZones;
        }

    }

    public static class DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems extends TeaModel {
        /**
         * <p>The endpoint of the proxy terminal.</p>
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
         * <p>The network type of the database proxy. Valid values:</p>
         * <br>
         * <p>*   **0**: Internet</p>
         * <p>*   **1**: classic network</p>
         * <p>*   **2**: virtual private cloud (VPC)</p>
         */
        @NameInMap("DBProxyConnectStringNetWorkType")
        public String DBProxyConnectStringNetWorkType;

        /**
         * <p>The port number that is associated with the proxy endpoint.</p>
         */
        @NameInMap("DBProxyConnectStringPort")
        public String DBProxyConnectStringPort;

        /**
         * <p>The ID of the proxy terminal to which the proxy endpoint belongs.</p>
         */
        @NameInMap("DBProxyEndpointId")
        public String DBProxyEndpointId;

        /**
         * <p>The name of the proxy terminal to which the proxy endpoint belongs.</p>
         */
        @NameInMap("DBProxyEndpointName")
        public String DBProxyEndpointName;

        @NameInMap("DBProxyVpcId")
        public String DBProxyVpcId;

        /**
         * <p>The ID of the proxy instance.</p>
         */
        @NameInMap("DBProxyVpcInstanceId")
        public String DBProxyVpcInstanceId;

        @NameInMap("DBProxyVswitchId")
        public String DBProxyVswitchId;

        public static DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems self = new DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectString(String DBProxyConnectString) {
            this.DBProxyConnectString = DBProxyConnectString;
            return this;
        }
        public String getDBProxyConnectString() {
            return this.DBProxyConnectString;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
            this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
            return this;
        }
        public String getDBProxyConnectStringNetType() {
            return this.DBProxyConnectStringNetType;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectStringNetWorkType(String DBProxyConnectStringNetWorkType) {
            this.DBProxyConnectStringNetWorkType = DBProxyConnectStringNetWorkType;
            return this;
        }
        public String getDBProxyConnectStringNetWorkType() {
            return this.DBProxyConnectStringNetWorkType;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyConnectStringPort(String DBProxyConnectStringPort) {
            this.DBProxyConnectStringPort = DBProxyConnectStringPort;
            return this;
        }
        public String getDBProxyConnectStringPort() {
            return this.DBProxyConnectStringPort;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyEndpointId(String DBProxyEndpointId) {
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }
        public String getDBProxyEndpointId() {
            return this.DBProxyEndpointId;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyEndpointName(String DBProxyEndpointName) {
            this.DBProxyEndpointName = DBProxyEndpointName;
            return this;
        }
        public String getDBProxyEndpointName() {
            return this.DBProxyEndpointName;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyVpcId(String DBProxyVpcId) {
            this.DBProxyVpcId = DBProxyVpcId;
            return this;
        }
        public String getDBProxyVpcId() {
            return this.DBProxyVpcId;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyVpcInstanceId(String DBProxyVpcInstanceId) {
            this.DBProxyVpcInstanceId = DBProxyVpcInstanceId;
            return this;
        }
        public String getDBProxyVpcInstanceId() {
            return this.DBProxyVpcInstanceId;
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems setDBProxyVswitchId(String DBProxyVswitchId) {
            this.DBProxyVswitchId = DBProxyVswitchId;
            return this;
        }
        public String getDBProxyVswitchId() {
            return this.DBProxyVswitchId;
        }

    }

    public static class DescribeDBProxyResponseBodyDBProxyConnectStringItems extends TeaModel {
        @NameInMap("DBProxyConnectStringItems")
        public java.util.List<DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems;

        public static DescribeDBProxyResponseBodyDBProxyConnectStringItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseBodyDBProxyConnectStringItems self = new DescribeDBProxyResponseBodyDBProxyConnectStringItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyResponseBodyDBProxyConnectStringItems setDBProxyConnectStringItems(java.util.List<DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems) {
            this.DBProxyConnectStringItems = DBProxyConnectStringItems;
            return this;
        }
        public java.util.List<DescribeDBProxyResponseBodyDBProxyConnectStringItemsDBProxyConnectStringItems> getDBProxyConnectStringItems() {
            return this.DBProxyConnectStringItems;
        }

    }

    public static class DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems extends TeaModel {
        /**
         * <p>The description of the proxy terminal.</p>
         */
        @NameInMap("DbProxyEndpointAliases")
        public String dbProxyEndpointAliases;

        /**
         * <p>The ID of the proxy terminal.</p>
         */
        @NameInMap("DbProxyEndpointName")
        public String dbProxyEndpointName;

        /**
         * <p>The type of the proxy terminal. Valid values:</p>
         * <br>
         * <p>- **RWSplit**: default proxy terminal</p>
         * <p>- **Custom**: custom proxy terminal</p>
         */
        @NameInMap("DbProxyEndpointType")
        public String dbProxyEndpointType;

        /**
         * <p>The read and write attributes of the proxy terminal.</p>
         * <br>
         * <p>- **ReadWrite**: The proxy terminal supports read and write requests.</p>
         * <p>- **ReadOnly**: The proxy terminal supports only read requests.</p>
         */
        @NameInMap("DbProxyReadWriteMode")
        public String dbProxyReadWriteMode;

        public static DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems self = new DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems setDbProxyEndpointAliases(String dbProxyEndpointAliases) {
            this.dbProxyEndpointAliases = dbProxyEndpointAliases;
            return this;
        }
        public String getDbProxyEndpointAliases() {
            return this.dbProxyEndpointAliases;
        }

        public DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems setDbProxyEndpointName(String dbProxyEndpointName) {
            this.dbProxyEndpointName = dbProxyEndpointName;
            return this;
        }
        public String getDbProxyEndpointName() {
            return this.dbProxyEndpointName;
        }

        public DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems setDbProxyEndpointType(String dbProxyEndpointType) {
            this.dbProxyEndpointType = dbProxyEndpointType;
            return this;
        }
        public String getDbProxyEndpointType() {
            return this.dbProxyEndpointType;
        }

        public DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems setDbProxyReadWriteMode(String dbProxyReadWriteMode) {
            this.dbProxyReadWriteMode = dbProxyReadWriteMode;
            return this;
        }
        public String getDbProxyReadWriteMode() {
            return this.dbProxyReadWriteMode;
        }

    }

    public static class DescribeDBProxyResponseBodyDbProxyEndpointItems extends TeaModel {
        @NameInMap("DbProxyEndpointItems")
        public java.util.List<DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems> dbProxyEndpointItems;

        public static DescribeDBProxyResponseBodyDbProxyEndpointItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseBodyDbProxyEndpointItems self = new DescribeDBProxyResponseBodyDbProxyEndpointItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyResponseBodyDbProxyEndpointItems setDbProxyEndpointItems(java.util.List<DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems> dbProxyEndpointItems) {
            this.dbProxyEndpointItems = dbProxyEndpointItems;
            return this;
        }
        public java.util.List<DescribeDBProxyResponseBodyDbProxyEndpointItemsDbProxyEndpointItems> getDbProxyEndpointItems() {
            return this.dbProxyEndpointItems;
        }

    }

}
