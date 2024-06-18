// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTaskByIdResponseBody extends TeaModel {
    /**
     * <p>The type of the migration task. Valid values:</p>
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
     * <p>2020-05-30T12:11:04Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>mytestdb</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The description of the migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>Success to DBCC checkdb asynchronously</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the migration task was completed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-30T15:15:05Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Indicates whether the imported data overwrites the existing data. Valid values:</p>
     * <ul>
     * <li><strong>False</strong>: The imported data does not overwrite the existing data.</li>
     * <li><strong>True</strong>: The imported data overwrites the existing data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsDBReplaced")
    public String isDBReplaced;

    /**
     * <p>The ID of the migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>235943</p>
     */
    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6ED3635A-01F9-47BD-B9C8-CB3FD70A336E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the migration task. Valid values:</p>
     * <ul>
     * <li><strong>NoStart</strong>: The task has not started.</li>
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

    public static DescribeMigrateTaskByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTaskByIdResponseBody self = new DescribeMigrateTaskByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrateTaskByIdResponseBody setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public DescribeMigrateTaskByIdResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeMigrateTaskByIdResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeMigrateTaskByIdResponseBody setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeMigrateTaskByIdResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeMigrateTaskByIdResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMigrateTaskByIdResponseBody setIsDBReplaced(String isDBReplaced) {
        this.isDBReplaced = isDBReplaced;
        return this;
    }
    public String getIsDBReplaced() {
        return this.isDBReplaced;
    }

    public DescribeMigrateTaskByIdResponseBody setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    public DescribeMigrateTaskByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrateTaskByIdResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
