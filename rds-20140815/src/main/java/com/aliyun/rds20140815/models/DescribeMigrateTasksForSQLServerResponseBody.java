// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTasksForSQLServerResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("DBInstanceID")
    public String DBInstanceID;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public DescribeMigrateTasksForSQLServerResponseBodyItems items;

    public static DescribeMigrateTasksForSQLServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTasksForSQLServerResponseBody self = new DescribeMigrateTasksForSQLServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrateTasksForSQLServerResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMigrateTasksForSQLServerResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeMigrateTasksForSQLServerResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeMigrateTasksForSQLServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrateTasksForSQLServerResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeMigrateTasksForSQLServerResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeMigrateTasksForSQLServerResponseBody setDBInstanceID(String DBInstanceID) {
        this.DBInstanceID = DBInstanceID;
        return this;
    }
    public String getDBInstanceID() {
        return this.DBInstanceID;
    }

    public DescribeMigrateTasksForSQLServerResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrateTasksForSQLServerResponseBody setItems(DescribeMigrateTasksForSQLServerResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeMigrateTasksForSQLServerResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask extends TeaModel {
        @NameInMap("MigrateIaskId")
        public String migrateIaskId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("IsDBReplaced")
        public String isDBReplaced;

        @NameInMap("Desc")
        public String desc;

        public static DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask self = new DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask();
            return TeaModel.build(map, self);
        }

        public DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask setMigrateIaskId(String migrateIaskId) {
            this.migrateIaskId = migrateIaskId;
            return this;
        }
        public String getMigrateIaskId() {
            return this.migrateIaskId;
        }

        public DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask setIsDBReplaced(String isDBReplaced) {
            this.isDBReplaced = isDBReplaced;
            return this;
        }
        public String getIsDBReplaced() {
            return this.isDBReplaced;
        }

        public DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class DescribeMigrateTasksForSQLServerResponseBodyItems extends TeaModel {
        @NameInMap("MigrateTask")
        public java.util.List<DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask> migrateTask;

        public static DescribeMigrateTasksForSQLServerResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrateTasksForSQLServerResponseBodyItems self = new DescribeMigrateTasksForSQLServerResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeMigrateTasksForSQLServerResponseBodyItems setMigrateTask(java.util.List<DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask> migrateTask) {
            this.migrateTask = migrateTask;
            return this;
        }
        public java.util.List<DescribeMigrateTasksForSQLServerResponseBodyItemsMigrateTask> getMigrateTask() {
            return this.migrateTask;
        }

    }

}
