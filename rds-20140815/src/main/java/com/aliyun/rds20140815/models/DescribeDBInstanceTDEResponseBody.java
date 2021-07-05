// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEResponseBody extends TeaModel {
    @NameInMap("TDEStatus")
    public String TDEStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Databases")
    public DescribeDBInstanceTDEResponseBodyDatabases databases;

    public static DescribeDBInstanceTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDEResponseBody self = new DescribeDBInstanceTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTDEResponseBody setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public DescribeDBInstanceTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceTDEResponseBody setDatabases(DescribeDBInstanceTDEResponseBodyDatabases databases) {
        this.databases = databases;
        return this;
    }
    public DescribeDBInstanceTDEResponseBodyDatabases getDatabases() {
        return this.databases;
    }

    public static class DescribeDBInstanceTDEResponseBodyDatabasesDatabase extends TeaModel {
        @NameInMap("DBName")
        public String DBName;

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
