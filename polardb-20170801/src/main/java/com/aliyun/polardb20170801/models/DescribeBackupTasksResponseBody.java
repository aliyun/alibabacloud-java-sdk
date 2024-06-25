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
     * 
     * <strong>example:</strong>
     * <p>FA8C1EF1-E3D4-44D7-B809-823187******</p>
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
         * 
         * <strong>example:</strong>
         * <p>11111111</p>
         */
        @NameInMap("BackupJobId")
        public String backupJobId;

        /**
         * <p>The state of the backup task. Valid values:</p>
         * <ul>
         * <li><strong>NoStart</strong></li>
         * <li><strong>Preparing</strong></li>
         * <li><strong>Waiting</strong></li>
         * <li><strong>Uploading</strong></li>
         * <li><strong>Checking</strong></li>
         * <li><strong>Finished</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoStart</p>
         */
        @NameInMap("BackupProgressStatus")
        public String backupProgressStatus;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong></li>
         * <li><strong>Manual</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        @NameInMap("JobMode")
        public String jobMode;

        /**
         * <p>The progress of the backup task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The time when the backup task started. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-08T07:24:01Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The type of the backup task. Valid values:</p>
         * <ul>
         * <li><strong>TempBackupTask</strong>: The backup task is an adhoc backup task.</li>
         * <li><strong>NormalBackupTask</strong>: The backup task is a common backup task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NormalBackupTask</p>
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
