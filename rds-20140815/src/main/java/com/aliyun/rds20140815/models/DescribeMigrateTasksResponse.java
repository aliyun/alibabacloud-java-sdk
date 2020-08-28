// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

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
    public DescribeMigrateTasksResponseItems items;

    public static DescribeMigrateTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTasksResponse self = new DescribeMigrateTasksResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMigrateTasksResponseItemsMigrateTask extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("MigrateTaskId")
        @Validation(required = true)
        public String migrateTaskId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("BackupMode")
        @Validation(required = true)
        public String backupMode;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("IsDBReplaced")
        @Validation(required = true)
        public String isDBReplaced;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeMigrateTasksResponseItemsMigrateTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrateTasksResponseItemsMigrateTask self = new DescribeMigrateTasksResponseItemsMigrateTask();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMigrateTasksResponseItems extends TeaModel {
        @NameInMap("MigrateTask")
        @Validation(required = true)
        public java.util.List<DescribeMigrateTasksResponseItemsMigrateTask> migrateTask;

        public static DescribeMigrateTasksResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrateTasksResponseItems self = new DescribeMigrateTasksResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
