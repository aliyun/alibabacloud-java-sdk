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

    public DescribeMigrateTasksForSQLServerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrateTasksForSQLServerResponse setDBInstanceID(String DBInstanceID) {
        this.DBInstanceID = DBInstanceID;
        return this;
    }
    public String getDBInstanceID() {
        return this.DBInstanceID;
    }

    public DescribeMigrateTasksForSQLServerResponse setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeMigrateTasksForSQLServerResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeMigrateTasksForSQLServerResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMigrateTasksForSQLServerResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeMigrateTasksForSQLServerResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrateTasksForSQLServerResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeMigrateTasksForSQLServerResponse setItems(DescribeMigrateTasksForSQLServerResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeMigrateTasksForSQLServerResponseItems getItems() {
        return this.items;
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

        public DescribeMigrateTasksForSQLServerResponseItemsMigrateTask setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeMigrateTasksForSQLServerResponseItemsMigrateTask setMigrateIaskId(String migrateIaskId) {
            this.migrateIaskId = migrateIaskId;
            return this;
        }
        public String getMigrateIaskId() {
            return this.migrateIaskId;
        }

        public DescribeMigrateTasksForSQLServerResponseItemsMigrateTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeMigrateTasksForSQLServerResponseItemsMigrateTask setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeMigrateTasksForSQLServerResponseItemsMigrateTask setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeMigrateTasksForSQLServerResponseItemsMigrateTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrateTasksForSQLServerResponseItemsMigrateTask setIsDBReplaced(String isDBReplaced) {
            this.isDBReplaced = isDBReplaced;
            return this;
        }
        public String getIsDBReplaced() {
            return this.isDBReplaced;
        }

        public DescribeMigrateTasksForSQLServerResponseItemsMigrateTask setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
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

        public DescribeMigrateTasksForSQLServerResponseItems setMigrateTask(java.util.List<DescribeMigrateTasksForSQLServerResponseItemsMigrateTask> migrateTask) {
            this.migrateTask = migrateTask;
            return this;
        }
        public java.util.List<DescribeMigrateTasksForSQLServerResponseItemsMigrateTask> getMigrateTask() {
            return this.migrateTask;
        }

    }

}
