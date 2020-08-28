// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTasksForSQLServerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceID")
    @Validation(required = true)
    public String DBInstanceID;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeMigrateTasksForSQLServerResponseItems items;

    public static DescribeMigrateTasksForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTasksForSQLServerResponse self = new DescribeMigrateTasksForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMigrateTasksForSQLServerResponseItemsMigrateTask extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("MigrateIaskId")
        @Validation(required = true)
        public String migrateIaskId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("TaskType")
        @Validation(required = true)
        public String taskType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("IsDBReplaced")
        @Validation(required = true)
        public String isDBReplaced;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        public static DescribeMigrateTasksForSQLServerResponseItemsMigrateTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrateTasksForSQLServerResponseItemsMigrateTask self = new DescribeMigrateTasksForSQLServerResponseItemsMigrateTask();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMigrateTasksForSQLServerResponseItems extends TeaModel {
        @NameInMap("MigrateTask")
        @Validation(required = true)
        public java.util.List<DescribeMigrateTasksForSQLServerResponseItemsMigrateTask> migrateTask;

        public static DescribeMigrateTasksForSQLServerResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrateTasksForSQLServerResponseItems self = new DescribeMigrateTasksForSQLServerResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
