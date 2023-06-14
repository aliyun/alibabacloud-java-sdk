// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the ApsaraDB for Redis instance. You can call the [DescribeInstances](~~60933~~) operation to query instance IDs.</p>
     */
    @NameInMap("BackupJobs")
    public java.util.List<DescribeBackupTasksResponseBodyBackupJobs> backupJobs;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the backup task. Valid values:</p>
     * <br>
     * <p>*   **NoStart**: The backup task is not started.</p>
     * <p>*   **Preparing**: The backup task is being prepared.</p>
     * <p>*   **Waiting**: The backup task is pending.</p>
     * <p>*   **Uploading:** The system is uploading the backup file.</p>
     * <p>*   **Checking:** The system is checking the uploaded backup file.</p>
     * <p>*   **Finished**: The backup task is complete.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksResponseBody self = new DescribeBackupTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksResponseBody setBackupJobs(java.util.List<DescribeBackupTasksResponseBodyBackupJobs> backupJobs) {
        this.backupJobs = backupJobs;
        return this;
    }
    public java.util.List<DescribeBackupTasksResponseBodyBackupJobs> getBackupJobs() {
        return this.backupJobs;
    }

    public DescribeBackupTasksResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBackupTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupTasksResponseBodyBackupJobs extends TeaModel {
        /**
         * <p>The ID of the backup task.</p>
         */
        @NameInMap("BackupJobID")
        public Integer backupJobID;

        /**
         * <p>The beginning time when the backup task started. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format and displayed in UTC.</p>
         */
        @NameInMap("BackupProgressStatus")
        public String backupProgressStatus;

        /**
         * <p>Manual</p>
         */
        @NameInMap("JobMode")
        public String jobMode;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The backup mode. Valid values:</p>
         * <br>
         * <p>*   **Automated**: automatic backup</p>
         * <p>*   **Manual**: manual backup</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>1162****</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TaskAction")
        public String taskAction;

        public static DescribeBackupTasksResponseBodyBackupJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseBodyBackupJobs self = new DescribeBackupTasksResponseBodyBackupJobs();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTasksResponseBodyBackupJobs setBackupJobID(Integer backupJobID) {
            this.backupJobID = backupJobID;
            return this;
        }
        public Integer getBackupJobID() {
            return this.backupJobID;
        }

        public DescribeBackupTasksResponseBodyBackupJobs setBackupProgressStatus(String backupProgressStatus) {
            this.backupProgressStatus = backupProgressStatus;
            return this;
        }
        public String getBackupProgressStatus() {
            return this.backupProgressStatus;
        }

        public DescribeBackupTasksResponseBodyBackupJobs setJobMode(String jobMode) {
            this.jobMode = jobMode;
            return this;
        }
        public String getJobMode() {
            return this.jobMode;
        }

        public DescribeBackupTasksResponseBodyBackupJobs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeBackupTasksResponseBodyBackupJobs setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeBackupTasksResponseBodyBackupJobs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeBackupTasksResponseBodyBackupJobs setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

    }

}
