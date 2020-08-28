// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TDEStatus")
    @Validation(required = true)
    public String TDEStatus;

    @NameInMap("Databases")
    @Validation(required = true)
    public DescribeDBInstanceTDEResponseDatabases databases;

    public static DescribeDBInstanceTDEResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDEResponse self = new DescribeDBInstanceTDEResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstanceTDEResponseDatabasesDatabase extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("TDEStatus")
        @Validation(required = true)
        public String TDEStatus;

        public static DescribeDBInstanceTDEResponseDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTDEResponseDatabasesDatabase self = new DescribeDBInstanceTDEResponseDatabasesDatabase();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstanceTDEResponseDatabases extends TeaModel {
        @NameInMap("Database")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceTDEResponseDatabasesDatabase> database;

        public static DescribeDBInstanceTDEResponseDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTDEResponseDatabases self = new DescribeDBInstanceTDEResponseDatabases();
            return TeaModel.build(map, self);
        }

    }

}
