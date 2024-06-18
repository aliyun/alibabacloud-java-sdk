// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyResponseBody extends TeaModel {
    /**
     * <p>The list of zones that are available for the database proxy.</p>
     */
    @NameInMap("DBProxyAVZones")
    public DescribeDBProxyResponseBodyDBProxyAVZones DBProxyAVZones;

    /**
     * <p>An array consisting of the information about the database proxy endpoint that is created for the instance.</p>
     */
    @NameInMap("DBProxyConnectStringItems")
    public DescribeDBProxyResponseBodyDBProxyConnectStringItems DBProxyConnectStringItems;

    /**
     * <p>An internal parameter. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The version of the proxy instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1.13.11</p>
     */
    @NameInMap("DBProxyInstanceCurrentMinorVersion")
    public String DBProxyInstanceCurrentMinorVersion;

    /**
     * <p>The latest version that is available for the proxy instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1.13.12</p>
     */
    @NameInMap("DBProxyInstanceLatestMinorVersion")
    public String DBProxyInstanceLatestMinorVersion;

    /**
     * <p>The name of the proxy instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gos787jog2wk0ye1****</p>
     */
    @NameInMap("DBProxyInstanceName")
    public String DBProxyInstanceName;

    /**
     * <p>The number of proxies that are enabled on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBProxyInstanceNum")
    public Integer DBProxyInstanceNum;

    /**
     * <p>This parameter is available only for ApsaraDB RDS for PostgreSQL instances. The specifications of the proxy instance that is enabled.</p>
     * <p>Format: <code>Number of cores/Memory capacity</code>.</p>
     * <p>For example, a value of 4/8 indicates that the proxy instance has 4 cores and 8 GB of memory.</p>
     * 
     * <strong>example:</strong>
     * <p>4/8</p>
     */
    @NameInMap("DBProxyInstanceSize")
    public String DBProxyInstanceSize;

    /**
     * <p>The status of the proxy instance.</p>
     * <ul>
     * <li>DBInstanceClassChanging: The specifications of the proxy instance are being changed.</li>
     * <li>Creating: The proxy instance is being created.</li>
     * <li>Running: The proxy instance is running.</li>
     * <li>Deleting: The proxy instance is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBProxyInstanceStatus")
    public String DBProxyInstanceStatus;

    /**
     * <p>The type of the database proxy that is enabled on the instance.</p>
     * <ul>
     * <li>1: shared proxy</li>
     * <li>2: dedicated proxy</li>
     * </ul>
     * <blockquote>
     * <p> ApsaraDB RDS for PostgreSQL instances support only dedicated proxies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    /**
     * <p>Connection Persistence State. </p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Enabled: Enabled</li>
     * <li>Disabled: Disabled</li>
     * <li>Unsupported: The instance does not support connection persistence</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("DBProxyPersistentConnectionStatus")
    public String DBProxyPersistentConnectionStatus;

    /**
     * <p>The status of the database proxy.</p>
     * <ul>
     * <li>Shutdown: disabled</li>
     * <li>Startup: enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Startup</p>
     */
    @NameInMap("DBProxyServiceStatus")
    public String DBProxyServiceStatus;

    /**
     * <p>The proxy terminals of the instance.</p>
     */
    @NameInMap("DbProxyEndpointItems")
    public DescribeDBProxyResponseBodyDbProxyEndpointItems dbProxyEndpointItems;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>909A69EE-71C8-4417-A0B9-FF085407E1E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
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

    public DescribeDBProxyResponseBody setDBProxyPersistentConnectionStatus(String DBProxyPersistentConnectionStatus) {
        this.DBProxyPersistentConnectionStatus = DBProxyPersistentConnectionStatus;
        return this;
    }
    public String getDBProxyPersistentConnectionStatus() {
        return this.DBProxyPersistentConnectionStatus;
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
         * <p>The database proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>gos787jog2wk0ye1****-rw4rm.rwlb.rds.aliyuncs.com</p>
         */
        @NameInMap("DBProxyConnectString")
        public String DBProxyConnectString;

        /**
         * <p>The network type of the database proxy endpoint. A database proxy endpoint is formerly referred to as a proxy terminal. Valid values:</p>
         * <ul>
         * <li>OuterString: Internet</li>
         * <li>InnerString: internal network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InnerString</p>
         */
        @NameInMap("DBProxyConnectStringNetType")
        public String DBProxyConnectStringNetType;

        /**
         * <p>The network type of the database proxy. Valid values:</p>
         * <ul>
         * <li>0: Internet</li>
         * <li>1: classic network</li>
         * <li>2: virtual private cloud (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DBProxyConnectStringNetWorkType")
        public String DBProxyConnectStringNetWorkType;

        /**
         * <p>The port that is associated with the database proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("DBProxyConnectStringPort")
        public String DBProxyConnectStringPort;

        /**
         * <p>The ID of the backend database proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>20****</p>
         */
        @NameInMap("DBProxyEndpointId")
        public String DBProxyEndpointId;

        /**
         * <p>The name of the database proxy endpoint. The name can be replaced by the ID of the database proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>gos787jog2wk0ye1****</p>
         */
        @NameInMap("DBProxyEndpointName")
        public String DBProxyEndpointName;

        /**
         * <p>The VPC of the database proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6oobt****</p>
         */
        @NameInMap("DBProxyVpcId")
        public String DBProxyVpcId;

        /**
         * <p>The ID of the database proxy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp145737x5<strong><strong>131161274792</strong></strong></p>
         */
        @NameInMap("DBProxyVpcInstanceId")
        public String DBProxyVpcInstanceId;

        /**
         * <p>The vSwitch of the database proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6l0pic17****</p>
         */
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
         * <p>The description of the database proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy-test</p>
         */
        @NameInMap("DbProxyEndpointAliases")
        public String dbProxyEndpointAliases;

        /**
         * <p>The ID of the database proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>gos787jog2wk0ye1****</p>
         */
        @NameInMap("DbProxyEndpointName")
        public String dbProxyEndpointName;

        /**
         * <p>The type of the database proxy endpoint. Valid values:</p>
         * <ul>
         * <li>Custom: custom database proxy endpoint</li>
         * <li>RWSplit: default database proxy endpoint</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RWSplit</p>
         */
        @NameInMap("DbProxyEndpointType")
        public String dbProxyEndpointType;

        /**
         * <p>The read and write attributes of the database proxy endpoint.</p>
         * <ul>
         * <li>ReadOnly</li>
         * <li>ReadWrite</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
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
