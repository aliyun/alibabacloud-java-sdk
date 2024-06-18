// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTasksResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The details of the migration task.</p>
     */
    @NameInMap("Items")
    public DescribeMigrateTasksResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4E356DDF-6B83-45DB-99D5-4B1E8A0D286B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeMigrateTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTasksResponseBody self = new DescribeMigrateTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrateTasksResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeMigrateTasksResponseBody setItems(DescribeMigrateTasksResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeMigrateTasksResponseBodyItems getItems() {
        return this.items;
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

    public DescribeMigrateTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrateTasksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeMigrateTasksResponseBodyItemsMigrateTask extends TeaModel {
        /**
         * <p>The migration task type. Valid values:</p>
         * <ul>
         * <li><strong>FULL</strong>: The migration task migrates full backup files that can be used to restore the full data of the instance.</li>
         * <li><strong>UPDF</strong>: The migration task migrates incremental or log backup files that can be used to restore the incremental data of the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FULL</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The time when the migration task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-05-30T12:11:04Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The description of the migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>Api description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the migration task was completed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-05-30T13:11:04Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether the imported data overwrites the existing data.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsDBReplaced")
        public String isDBReplaced;

        /**
         * <p>The migration task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>564522545</p>
         */
        @NameInMap("MigrateTaskId")
        public String migrateTaskId;

        /**
         * <p>The status of the migration task. Valid values:</p>
         * <ul>
         * <li><strong>NoStart</strong>: The task is not started.</li>
         * <li><strong>Running</strong>:The task is in progress.</li>
         * <li><strong>Success</strong>: The task is successful.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * <li><strong>Waiting</strong>: The task is waiting for an incremental backup file to be imported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeMigrateTasksResponseBodyItemsMigrateTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrateTasksResponseBodyItemsMigrateTask self = new DescribeMigrateTasksResponseBodyItemsMigrateTask();
            return TeaModel.build(map, self);
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setIsDBReplaced(String isDBReplaced) {
            this.isDBReplaced = isDBReplaced;
            return this;
        }
        public String getIsDBReplaced() {
            return this.isDBReplaced;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setMigrateTaskId(String migrateTaskId) {
            this.migrateTaskId = migrateTaskId;
            return this;
        }
        public String getMigrateTaskId() {
            return this.migrateTaskId;
        }

        public DescribeMigrateTasksResponseBodyItemsMigrateTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
