// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Items")
    public DescribeMigrateTasksResponseBodyItems items;

    public static DescribeMigrateTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTasksResponseBody self = new DescribeMigrateTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrateTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrateTasksResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeMigrateTasksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeMigrateTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrateTasksResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeMigrateTasksResponseBody setItems(DescribeMigrateTasksResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeMigrateTasksResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeMigrateTasksResponseBodyItemsMigrateTask extends TeaModel {
        @NameInMap("DBName")
        public String DBName;

        @NameInMap("MigrateTaskId")
        public String migrateTaskId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("Status")
        public String status;

        @NameInMap("IsDBReplaced")
        public String isDBReplaced;

        @NameInMap("Description")
        public String description;

        public static DescribeMigrateTasksResponseBodyItemsMigrateTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrateTasksResponseBodyItemsMigrateTask self = new DescribeMigrateTasksResponseBodyItemsMigrateTask();
            return TeaModel.build(map, self);
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setMigrateTaskId(String migrateTaskId) {
            this.migrateTaskId = migrateTaskId;
            return this;
        }
        public String getMigrateTaskId() {
            return this.migrateTaskId;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setIsDBReplaced(String isDBReplaced) {
            this.isDBReplaced = isDBReplaced;
            return this;
        }
        public String getIsDBReplaced() {
            return this.isDBReplaced;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeMigrateTasksResponseBodyItems extends TeaModel {
        @NameInMap("MigrateTask")
        public java.util.List<DescribeMigrateTasksResponseBodyItemsMigrateTask> migrateTask;

        public static DescribeMigrateTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrateTasksResponseBodyItems self = new DescribeMigrateTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeMigrateTasksResponseBodyItems setMigrateTask(java.util.List<DescribeMigrateTasksResponseBodyItemsMigrateTask> migrateTask) {
            this.migrateTask = migrateTask;
            return this;
        }
        public java.util.List<DescribeMigrateTasksResponseBodyItemsMigrateTask> getMigrateTask() {
            return this.migrateTask;
        }

    }

}
