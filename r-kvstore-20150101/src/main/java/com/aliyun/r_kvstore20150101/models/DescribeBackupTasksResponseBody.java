// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponseBody extends TeaModel {
    /**
     * <p>The following parameters are no longer used. Ignore the parameters.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeBackupTasksResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The details of the backup tasks.</p>
     */
    @NameInMap("BackupJobs")
    public java.util.List<DescribeBackupTasksResponseBodyBackupJobs> backupJobs;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the backup task. Valid values:</p>
     * <ul>
     * <li><strong>NoStart</strong>: The backup task is not started.</li>
     * <li><strong>Preparing</strong>: The backup task is being prepared.</li>
     * <li><strong>Waiting</strong>: The backup task is pending.</li>
     * <li><strong>Uploading:</strong> The system is uploading the backup file.</li>
     * <li><strong>Checking:</strong> The system is checking the uploaded backup file.</li>
     * <li><strong>Finished</strong>: The backup task is complete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BB73740C-23E2-4392-9DA4-2660C74C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksResponseBody self = new DescribeBackupTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksResponseBody setAccessDeniedDetail(DescribeBackupTasksResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeBackupTasksResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public static class DescribeBackupTasksResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeBackupTasksResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseBodyAccessDeniedDetail self = new DescribeBackupTasksResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTasksResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeBackupTasksResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeBackupTasksResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeBackupTasksResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeBackupTasksResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeBackupTasksResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeBackupTasksResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeBackupTasksResponseBodyBackupJobs extends TeaModel {
        /**
         * <p>The ID of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>8491111</p>
         */
        @NameInMap("BackupJobID")
        public Long backupJobID;

        /**
         * <p>The state of the backup task. Valid values:</p>
         * <ul>
         * <li><strong>NoStart</strong>: The backup task is not started.</li>
         * <li><strong>Preparing</strong>: The backup task is being prepared.</li>
         * <li><strong>Waiting</strong>: The backup task is pending.</li>
         * <li><strong>Uploading</strong>: The system is uploading the backup file.</li>
         * <li><strong>Checking</strong>: The system is checking the uploaded backup file.</li>
         * <li><strong>Finished</strong>: The backup task is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        @NameInMap("BackupProgressStatus")
        public String backupProgressStatus;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong>: automatic backup</li>
         * <li><strong>Manual</strong>: manual backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("JobMode")
        public String jobMode;

        /**
         * <p>The ID of the data node.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The progress of the backup task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The start time of the backup task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-05T19:24:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The type of the backup task. Valid values:</p>
         * <ul>
         * <li><strong>TempBackupTask</strong>: The backup task was manually performed.</li>
         * <li><strong>NormalBackupTask</strong>: The backup task was automatically performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NormalBackupTask</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        public static DescribeBackupTasksResponseBodyBackupJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseBodyBackupJobs self = new DescribeBackupTasksResponseBodyBackupJobs();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTasksResponseBodyBackupJobs setBackupJobID(Long backupJobID) {
            this.backupJobID = backupJobID;
            return this;
        }
        public Long getBackupJobID() {
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
