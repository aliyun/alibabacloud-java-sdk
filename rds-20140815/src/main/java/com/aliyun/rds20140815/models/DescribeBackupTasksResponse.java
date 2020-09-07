// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeBackupTasksResponseItems items;

    public static DescribeBackupTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksResponse self = new DescribeBackupTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupTasksResponse setItems(DescribeBackupTasksResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupTasksResponseItems getItems() {
        return this.items;
    }

    public static class DescribeBackupTasksResponseItemsBackupJob extends TeaModel {
        @NameInMap("BackupProgressStatus")
        @Validation(required = true)
        public String backupProgressStatus;

        @NameInMap("BackupStatus")
        @Validation(required = true)
        public String backupStatus;

        @NameInMap("JobMode")
        @Validation(required = true)
        public String jobMode;

        @NameInMap("Process")
        @Validation(required = true)
        public String process;

        @NameInMap("TaskAction")
        @Validation(required = true)
        public String taskAction;

        @NameInMap("BackupJobId")
        @Validation(required = true)
        public String backupJobId;

        @NameInMap("BackupId")
        @Validation(required = true)
        public String backupId;

        public static DescribeBackupTasksResponseItemsBackupJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseItemsBackupJob self = new DescribeBackupTasksResponseItemsBackupJob();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTasksResponseItemsBackupJob setBackupProgressStatus(String backupProgressStatus) {
            this.backupProgressStatus = backupProgressStatus;
            return this;
        }
        public String getBackupProgressStatus() {
            return this.backupProgressStatus;
        }

        public DescribeBackupTasksResponseItemsBackupJob setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeBackupTasksResponseItemsBackupJob setJobMode(String jobMode) {
            this.jobMode = jobMode;
            return this;
        }
        public String getJobMode() {
            return this.jobMode;
        }

        public DescribeBackupTasksResponseItemsBackupJob setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeBackupTasksResponseItemsBackupJob setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public DescribeBackupTasksResponseItemsBackupJob setBackupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }
        public String getBackupJobId() {
            return this.backupJobId;
        }

        public DescribeBackupTasksResponseItemsBackupJob setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

    }

    public static class DescribeBackupTasksResponseItems extends TeaModel {
        @NameInMap("BackupJob")
        @Validation(required = true)
        public java.util.List<DescribeBackupTasksResponseItemsBackupJob> backupJob;

        public static DescribeBackupTasksResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseItems self = new DescribeBackupTasksResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTasksResponseItems setBackupJob(java.util.List<DescribeBackupTasksResponseItemsBackupJob> backupJob) {
            this.backupJob = backupJob;
            return this;
        }
        public java.util.List<DescribeBackupTasksResponseItemsBackupJob> getBackupJob() {
            return this.backupJob;
        }

    }

}
