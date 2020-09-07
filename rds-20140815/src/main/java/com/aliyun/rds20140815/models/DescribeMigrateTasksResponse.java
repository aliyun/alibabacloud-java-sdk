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

    public DescribeMigrateTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrateTasksResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeMigrateTasksResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeMigrateTasksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrateTasksResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeMigrateTasksResponse setItems(DescribeMigrateTasksResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeMigrateTasksResponseItems getItems() {
        return this.items;
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

        public DescribeMigrateTasksResponseItemsMigrateTask setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeMigrateTasksResponseItemsMigrateTask setMigrateTaskId(String migrateTaskId) {
            this.migrateTaskId = migrateTaskId;
            return this;
        }
        public String getMigrateTaskId() {
            return this.migrateTaskId;
        }

        public DescribeMigrateTasksResponseItemsMigrateTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeMigrateTasksResponseItemsMigrateTask setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeMigrateTasksResponseItemsMigrateTask setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeMigrateTasksResponseItemsMigrateTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrateTasksResponseItemsMigrateTask setIsDBReplaced(String isDBReplaced) {
            this.isDBReplaced = isDBReplaced;
            return this;
        }
        public String getIsDBReplaced() {
            return this.isDBReplaced;
        }

        public DescribeMigrateTasksResponseItemsMigrateTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public DescribeMigrateTasksResponseItems setMigrateTask(java.util.List<DescribeMigrateTasksResponseItemsMigrateTask> migrateTask) {
            this.migrateTask = migrateTask;
            return this;
        }
        public java.util.List<DescribeMigrateTasksResponseItemsMigrateTask> getMigrateTask() {
            return this.migrateTask;
        }

    }

}
