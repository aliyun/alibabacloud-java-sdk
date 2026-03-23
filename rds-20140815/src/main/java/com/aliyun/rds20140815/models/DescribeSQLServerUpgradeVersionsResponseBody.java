// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLServerUpgradeVersionsResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeSQLServerUpgradeVersionsResponseBodyItems items;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>866F5EB8-4650-4061-87F0-379F6F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLServerUpgradeVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLServerUpgradeVersionsResponseBody self = new DescribeSQLServerUpgradeVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLServerUpgradeVersionsResponseBody setItems(DescribeSQLServerUpgradeVersionsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLServerUpgradeVersionsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSQLServerUpgradeVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem extends TeaModel {
        /**
         * <p>可升级的版本规格的CPU大小</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>可升级的版本规格</p>
         * 
         * <strong>example:</strong>
         * <p>mssql.x4.medium.s2</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>可升级的版本规格的类型</p>
         * 
         * <strong>example:</strong>
         * <p>独享型</p>
         */
        @NameInMap("DBInstanceClassType")
        public String DBInstanceClassType;

        /**
         * <p>组类型</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>可升级的版本规格的内存大小</p>
         * 
         * <strong>example:</strong>
         * <p>8GB</p>
         */
        @NameInMap("Memory")
        public String memory;

        public static DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem self = new DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

    }

    public static class DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItems extends TeaModel {
        @NameInMap("DBInstanceClassItem")
        public java.util.List<DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem> DBInstanceClassItem;

        public static DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItems self = new DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItems setDBInstanceClassItem(java.util.List<DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem> DBInstanceClassItem) {
            this.DBInstanceClassItem = DBInstanceClassItem;
            return this;
        }
        public java.util.List<DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItemsDBInstanceClassItem> getDBInstanceClassItem() {
            return this.DBInstanceClassItem;
        }

    }

    public static class DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersion extends TeaModel {
        /**
         * <p>一个列表，描述了每个版本是否可以成为升级目标</p>
         */
        @NameInMap("DBInstanceClassItems")
        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItems DBInstanceClassItems;

        /**
         * <p>是否支持升级到该版本</p>
         * 
         * <strong>example:</strong>
         * <p>NO/YES</p>
         */
        @NameInMap("EnableUpgrade")
        public String enableUpgrade;

        /**
         * <p>版本值</p>
         * 
         * <strong>example:</strong>
         * <p>2016_std</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersion self = new DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersion();
            return TeaModel.build(map, self);
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersion setDBInstanceClassItems(DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItems DBInstanceClassItems) {
            this.DBInstanceClassItems = DBInstanceClassItems;
            return this;
        }
        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersionDBInstanceClassItems getDBInstanceClassItems() {
            return this.DBInstanceClassItems;
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersion setEnableUpgrade(String enableUpgrade) {
            this.enableUpgrade = enableUpgrade;
            return this;
        }
        public String getEnableUpgrade() {
            return this.enableUpgrade;
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersions extends TeaModel {
        @NameInMap("SQLServerUpgradeVersion")
        public java.util.List<DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersion> SQLServerUpgradeVersion;

        public static DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersions self = new DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersions();
            return TeaModel.build(map, self);
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersions setSQLServerUpgradeVersion(java.util.List<DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersion> SQLServerUpgradeVersion) {
            this.SQLServerUpgradeVersion = SQLServerUpgradeVersion;
            return this;
        }
        public java.util.List<DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersionsSQLServerUpgradeVersion> getSQLServerUpgradeVersion() {
            return this.SQLServerUpgradeVersion;
        }

    }

    public static class DescribeSQLServerUpgradeVersionsResponseBodyItemsItem extends TeaModel {
        /**
         * <p>当前的版本。若传DBInstanceId，则返回实例版本。若未传DBInstanceId，但传了EngineVersion，则返回EngineVersion。</p>
         * 
         * <strong>example:</strong>
         * <p>2016_web</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>一个列表，显示是否支持升级到目标版本</p>
         */
        @NameInMap("SQLServerUpgradeVersions")
        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersions SQLServerUpgradeVersions;

        public static DescribeSQLServerUpgradeVersionsResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLServerUpgradeVersionsResponseBodyItemsItem self = new DescribeSQLServerUpgradeVersionsResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItem setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItem setSQLServerUpgradeVersions(DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersions SQLServerUpgradeVersions) {
            this.SQLServerUpgradeVersions = SQLServerUpgradeVersions;
            return this;
        }
        public DescribeSQLServerUpgradeVersionsResponseBodyItemsItemSQLServerUpgradeVersions getSQLServerUpgradeVersions() {
            return this.SQLServerUpgradeVersions;
        }

    }

    public static class DescribeSQLServerUpgradeVersionsResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeSQLServerUpgradeVersionsResponseBodyItemsItem> item;

        public static DescribeSQLServerUpgradeVersionsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLServerUpgradeVersionsResponseBodyItems self = new DescribeSQLServerUpgradeVersionsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLServerUpgradeVersionsResponseBodyItems setItem(java.util.List<DescribeSQLServerUpgradeVersionsResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeSQLServerUpgradeVersionsResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
