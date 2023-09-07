// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponseBody extends TeaModel {
    /**
     * <p>The details of the backup task.</p>
     */
    @NameInMap("Items")
    public DescribeBackupTasksResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksResponseBody self = new DescribeBackupTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksResponseBody setItems(DescribeBackupTasksResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupTasksResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBackupTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupTasksResponseBodyItemsBackupJob extends TeaModel {
        /**
         * <p>The ID of the backup task.</p>
         */
        @NameInMap("BackupJobId")
        public String backupJobId;

        /**
         * <p>The state of the backup task. Valid values:</p>
         * <br>
         * <p>*   **NoStart**</p>
         * <p>*   **Preparing**</p>
         * <p>*   **Waiting**</p>
         * <p>*   **Uploading**</p>
         * <p>*   **Checking**</p>
         * <p>*   **Finished**</p>
         */
        @NameInMap("BackupProgressStatus")
        public String backupProgressStatus;

        /**
         * <p>The backup mode. Valid values:</p>
         * <br>
         * <p>*   **Automated**</p>
         * <p>*   **Manual**</p>
         */
        @NameInMap("JobMode")
        public String jobMode;

        /**
         * <p>The progress of the backup task in percentage.</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The time when the backup task started. The time follows the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The type of the backup task. Valid values:</p>
         * <br>
         * <p>*   **TempBackupTask**: The backup task is an adhoc backup task.</p>
         * <p>*   **NormalBackupTask**: The backup task is a common backup task.</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        public static DescribeBackupTasksResponseBodyItemsBackupJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseBodyItemsBackupJob self = new DescribeBackupTasksResponseBodyItemsBackupJob();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setBackupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }
        public String getBackupJobId() {
            return this.backupJobId;
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setBackupProgressStatus(String backupProgressStatus) {
            this.backupProgressStatus = backupProgressStatus;
            return this;
        }
        public String getBackupProgressStatus() {
            return this.backupProgressStatus;
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setJobMode(String jobMode) {
            this.jobMode = jobMode;
            return this;
        }
        public String getJobMode() {
            return this.jobMode;
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

    }

    public static class DescribeBackupTasksResponseBodyItems extends TeaModel {
        @NameInMap("BackupJob")
        public java.util.List<DescribeBackupTasksResponseBodyItemsBackupJob> backupJob;

        public static DescribeBackupTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseBodyItems self = new DescribeBackupTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTasksResponseBodyItems setBackupJob(java.util.List<DescribeBackupTasksResponseBodyItemsBackupJob> backupJob) {
            this.backupJob = backupJob;
            return this;
        }
        public java.util.List<DescribeBackupTasksResponseBodyItemsBackupJob> getBackupJob() {
            return this.backupJob;
        }

    }

}
