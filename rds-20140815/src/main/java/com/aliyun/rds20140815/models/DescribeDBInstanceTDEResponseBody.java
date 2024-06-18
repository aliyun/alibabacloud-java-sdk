// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEResponseBody extends TeaModel {
    /**
     * <p>The TDE status at the database level.</p>
     * <blockquote>
     * <p> If your instance runs SQL Server 2019 SE or SQL Server EE, you can specify whether to enable TDE at the database level when you enable TDE at the instance level.</p>
     * </blockquote>
     */
    @NameInMap("Databases")
    public DescribeDBInstanceTDEResponseBodyDatabases databases;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C816A4BF-A6EC-4722-95F9-2055859CCFD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The method that is used to generate the key for TDE at the instance level. Valid values:</p>
     * <ul>
     * <li><strong>Aliyun_Generate_Key</strong></li>
     * <li><strong>Customer_Provided_Key</strong></li>
     * <li><strong>Unknown</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Aliyun_Generate_Key</p>
     */
    @NameInMap("TDEMode")
    public String TDEMode;

    /**
     * <p>The TDE status of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong></li>
     * <li><strong>Disabled</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("TDEStatus")
    public String TDEStatus;

    public static DescribeDBInstanceTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDEResponseBody self = new DescribeDBInstanceTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTDEResponseBody setDatabases(DescribeDBInstanceTDEResponseBodyDatabases databases) {
        this.databases = databases;
        return this;
    }
    public DescribeDBInstanceTDEResponseBodyDatabases getDatabases() {
        return this.databases;
    }

    public DescribeDBInstanceTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceTDEResponseBody setTDEMode(String TDEMode) {
        this.TDEMode = TDEMode;
        return this;
    }
    public String getTDEMode() {
        return this.TDEMode;
    }

    public DescribeDBInstanceTDEResponseBody setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static class DescribeDBInstanceTDEResponseBodyDatabasesDatabase extends TeaModel {
        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test02</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The TDE status at the database level. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("TDEStatus")
        public String TDEStatus;

        public static DescribeDBInstanceTDEResponseBodyDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTDEResponseBodyDatabasesDatabase self = new DescribeDBInstanceTDEResponseBodyDatabasesDatabase();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTDEResponseBodyDatabasesDatabase setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeDBInstanceTDEResponseBodyDatabasesDatabase setTDEStatus(String TDEStatus) {
            this.TDEStatus = TDEStatus;
            return this;
        }
        public String getTDEStatus() {
            return this.TDEStatus;
        }

    }

    public static class DescribeDBInstanceTDEResponseBodyDatabases extends TeaModel {
        @NameInMap("Database")
        public java.util.List<DescribeDBInstanceTDEResponseBodyDatabasesDatabase> database;

        public static DescribeDBInstanceTDEResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTDEResponseBodyDatabases self = new DescribeDBInstanceTDEResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTDEResponseBodyDatabases setDatabase(java.util.List<DescribeDBInstanceTDEResponseBodyDatabasesDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<DescribeDBInstanceTDEResponseBodyDatabasesDatabase> getDatabase() {
            return this.database;
        }

    }

}
