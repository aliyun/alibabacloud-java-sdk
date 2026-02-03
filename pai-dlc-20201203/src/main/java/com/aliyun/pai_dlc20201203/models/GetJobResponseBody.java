// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    /**
     * <p>The visibility of the job. Valid values:</p>
     * <ul>
     * <li>PUBLIC: The code is public in the workspace.</li>
     * <li>PRIVATE: The workspace is visible only to you and the administrator of the workspace. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a*****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The code source.</p>
     */
    @NameInMap("CodeSource")
    public GetJobResponseBodyCodeSource codeSource;

    /**
     * <p>The access credential configurations.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("CustomEnvs")
    public java.util.List<GetJobResponseBodyCustomEnvs> customEnvs;

    /**
     * <p>The data sources.</p>
     */
    @NameInMap("DataSources")
    public java.util.List<GetJobResponseBodyDataSources> dataSources;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>tf-mnist-test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The duration of the job (seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>3602</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>The elastic job parameters.</p>
     */
    @NameInMap("ElasticSpec")
    public JobElasticSpec elasticSpec;

    /**
     * <p>Specifies whether to enable the debugger job.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnabledDebugger")
    public Boolean enabledDebugger;

    /**
     * <p>The configurations of environment variables.</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <p>The time when the job was created (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time of the job failed (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:08Z</p>
     */
    @NameInMap("GmtFailedTime")
    public String gmtFailedTime;

    /**
     * <p>The time when the job ended (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:08Z</p>
     */
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    /**
     * <p>The start time of the job (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:21Z</p>
     */
    @NameInMap("GmtRunningTime")
    public String gmtRunningTime;

    /**
     * <p>The time when the job stopped (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:08Z</p>
     */
    @NameInMap("GmtStoppedTime")
    public String gmtStoppedTime;

    /**
     * <p>The time when the job was submitted to the cluster (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtSubmittedTime")
    public String gmtSubmittedTime;

    /**
     * <p>The time when the job succeeded (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:08Z</p>
     */
    @NameInMap("GmtSuccessedTime")
    public String gmtSuccessedTime;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc*******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobReplicaStatuses")
    public java.util.List<JobReplicaStatus> jobReplicaStatuses;

    /**
     * <p>The node configuration of the job, which is <strong>JobSpecs</strong> in the CreateJob operation.</p>
     */
    @NameInMap("JobSpecs")
    public java.util.List<JobSpec> jobSpecs;

    /**
     * <p>The job type. Specified by the JobType parameter of the <a href="https://help.aliyun.com/document_detail/459672.html">CreateJob</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>TFJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>All running nodes of the job.</p>
     */
    @NameInMap("Pods")
    public java.util.List<GetJobResponseBodyPods> pods;

    /**
     * <p>The priority of the job. Valid values: 1 to 9.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The status detail code, which is a sub-status under the current status.</p>
     * 
     * <strong>example:</strong>
     * <p>JobStoppedByUser</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <p>The description of the status detail code.</p>
     * 
     * <strong>example:</strong>
     * <p>Job is stopped by user.</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>The request ID, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the job belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>r******</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource level that the job uses.</p>
     * 
     * <strong>example:</strong>
     * <p>L0</p>
     */
    @NameInMap("ResourceLevel")
    public String resourceLevel;

    /**
     * <p>The resource type. Valid values: ECS, Lingjun, and ACS.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("RestartRecord")
    public java.util.List<GetJobResponseBodyRestartRecord> restartRecord;

    /**
     * <p>The number of retries and the maximum number of retries used by the job.</p>
     * 
     * <strong>example:</strong>
     * <p>0/10</p>
     */
    @NameInMap("RestartTimes")
    public String restartTimes;

    /**
     * <p>The additional parameter configurations of the job.</p>
     */
    @NameInMap("Settings")
    public JobSettings settings;

    /**
     * <p>The status of the job. Valid values:</p>
     * <ul>
     * <li>Creating</li>
     * <li>Queuing</li>
     * <li>Bidding (Only for Lingjun preemptible jobs)</li>
     * <li>EnvPreparing</li>
     * <li>SanityChecking</li>
     * <li>Running</li>
     * <li>Restarting</li>
     * <li>Stopping</li>
     * <li>SucceededReserving</li>
     * <li>FailedReserving</li>
     * <li>Succeeded</li>
     * <li>Failed</li>
     * <li>Stopped</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Stopped</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The status history.</p>
     */
    @NameInMap("StatusHistory")
    public java.util.List<StatusTransitionItem> statusHistory;

    /**
     * <p>The sub-status of the job, such as its preemption status.</p>
     * 
     * <strong>example:</strong>
     * <p>Restarting</p>
     */
    @NameInMap("SubStatus")
    public String subStatus;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>GAR***W134</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The directory that contains requirements.txt.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/code/</p>
     */
    @NameInMap("ThirdpartyLibDir")
    public String thirdpartyLibDir;

    /**
     * <p>The third-party Python libraries to be installed.</p>
     */
    @NameInMap("ThirdpartyLibs")
    public java.util.List<String> thirdpartyLibs;

    /**
     * <p>The command that is run to start each node.</p>
     * 
     * <strong>example:</strong>
     * <p>python /root/code/mnist.py</p>
     */
    @NameInMap("UserCommand")
    public String userCommand;

    /**
     * <p>The UID of the Alibaba Cloud account who submitted the job.</p>
     * 
     * <strong>example:</strong>
     * <p>12*********</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The VPC of the user.</p>
     */
    @NameInMap("UserVpc")
    public GetJobResponseBodyUserVpc userVpc;

    /**
     * <p>The ID of the workspace to which the job belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>268</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The name of the workspace to which the job belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-workspace</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetJobResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetJobResponseBody setCodeSource(GetJobResponseBodyCodeSource codeSource) {
        this.codeSource = codeSource;
        return this;
    }
    public GetJobResponseBodyCodeSource getCodeSource() {
        return this.codeSource;
    }

    public GetJobResponseBody setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public GetJobResponseBody setCustomEnvs(java.util.List<GetJobResponseBodyCustomEnvs> customEnvs) {
        this.customEnvs = customEnvs;
        return this;
    }
    public java.util.List<GetJobResponseBodyCustomEnvs> getCustomEnvs() {
        return this.customEnvs;
    }

    public GetJobResponseBody setDataSources(java.util.List<GetJobResponseBodyDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<GetJobResponseBodyDataSources> getDataSources() {
        return this.dataSources;
    }

    public GetJobResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetJobResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public GetJobResponseBody setElasticSpec(JobElasticSpec elasticSpec) {
        this.elasticSpec = elasticSpec;
        return this;
    }
    public JobElasticSpec getElasticSpec() {
        return this.elasticSpec;
    }

    public GetJobResponseBody setEnabledDebugger(Boolean enabledDebugger) {
        this.enabledDebugger = enabledDebugger;
        return this;
    }
    public Boolean getEnabledDebugger() {
        return this.enabledDebugger;
    }

    public GetJobResponseBody setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public GetJobResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetJobResponseBody setGmtFailedTime(String gmtFailedTime) {
        this.gmtFailedTime = gmtFailedTime;
        return this;
    }
    public String getGmtFailedTime() {
        return this.gmtFailedTime;
    }

    public GetJobResponseBody setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public GetJobResponseBody setGmtRunningTime(String gmtRunningTime) {
        this.gmtRunningTime = gmtRunningTime;
        return this;
    }
    public String getGmtRunningTime() {
        return this.gmtRunningTime;
    }

    public GetJobResponseBody setGmtStoppedTime(String gmtStoppedTime) {
        this.gmtStoppedTime = gmtStoppedTime;
        return this;
    }
    public String getGmtStoppedTime() {
        return this.gmtStoppedTime;
    }

    public GetJobResponseBody setGmtSubmittedTime(String gmtSubmittedTime) {
        this.gmtSubmittedTime = gmtSubmittedTime;
        return this;
    }
    public String getGmtSubmittedTime() {
        return this.gmtSubmittedTime;
    }

    public GetJobResponseBody setGmtSuccessedTime(String gmtSuccessedTime) {
        this.gmtSuccessedTime = gmtSuccessedTime;
        return this;
    }
    public String getGmtSuccessedTime() {
        return this.gmtSuccessedTime;
    }

    public GetJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobResponseBody setJobReplicaStatuses(java.util.List<JobReplicaStatus> jobReplicaStatuses) {
        this.jobReplicaStatuses = jobReplicaStatuses;
        return this;
    }
    public java.util.List<JobReplicaStatus> getJobReplicaStatuses() {
        return this.jobReplicaStatuses;
    }

    public GetJobResponseBody setJobSpecs(java.util.List<JobSpec> jobSpecs) {
        this.jobSpecs = jobSpecs;
        return this;
    }
    public java.util.List<JobSpec> getJobSpecs() {
        return this.jobSpecs;
    }

    public GetJobResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public GetJobResponseBody setPods(java.util.List<GetJobResponseBodyPods> pods) {
        this.pods = pods;
        return this;
    }
    public java.util.List<GetJobResponseBodyPods> getPods() {
        return this.pods;
    }

    public GetJobResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public GetJobResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public GetJobResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetJobResponseBody setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }
    public String getResourceLevel() {
        return this.resourceLevel;
    }

    public GetJobResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetJobResponseBody setRestartRecord(java.util.List<GetJobResponseBodyRestartRecord> restartRecord) {
        this.restartRecord = restartRecord;
        return this;
    }
    public java.util.List<GetJobResponseBodyRestartRecord> getRestartRecord() {
        return this.restartRecord;
    }

    public GetJobResponseBody setRestartTimes(String restartTimes) {
        this.restartTimes = restartTimes;
        return this;
    }
    public String getRestartTimes() {
        return this.restartTimes;
    }

    public GetJobResponseBody setSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }
    public JobSettings getSettings() {
        return this.settings;
    }

    public GetJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetJobResponseBody setStatusHistory(java.util.List<StatusTransitionItem> statusHistory) {
        this.statusHistory = statusHistory;
        return this;
    }
    public java.util.List<StatusTransitionItem> getStatusHistory() {
        return this.statusHistory;
    }

    public GetJobResponseBody setSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }
    public String getSubStatus() {
        return this.subStatus;
    }

    public GetJobResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetJobResponseBody setThirdpartyLibDir(String thirdpartyLibDir) {
        this.thirdpartyLibDir = thirdpartyLibDir;
        return this;
    }
    public String getThirdpartyLibDir() {
        return this.thirdpartyLibDir;
    }

    public GetJobResponseBody setThirdpartyLibs(java.util.List<String> thirdpartyLibs) {
        this.thirdpartyLibs = thirdpartyLibs;
        return this;
    }
    public java.util.List<String> getThirdpartyLibs() {
        return this.thirdpartyLibs;
    }

    public GetJobResponseBody setUserCommand(String userCommand) {
        this.userCommand = userCommand;
        return this;
    }
    public String getUserCommand() {
        return this.userCommand;
    }

    public GetJobResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetJobResponseBody setUserVpc(GetJobResponseBodyUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public GetJobResponseBodyUserVpc getUserVpc() {
        return this.userVpc;
    }

    public GetJobResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetJobResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class GetJobResponseBodyCodeSource extends TeaModel {
        /**
         * <p>The code branch.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Branch")
        public String branch;

        /**
         * <p>The code source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>code******</p>
         */
        @NameInMap("CodeSourceId")
        public String codeSourceId;

        /**
         * <p>The code commit ID</p>
         * 
         * <strong>example:</strong>
         * <p>44da109b59f8596152987eaa8f3b2487xxxxxx</p>
         */
        @NameInMap("Commit")
        public String commit;

        /**
         * <p>The local mount path.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        public static GetJobResponseBodyCodeSource build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyCodeSource self = new GetJobResponseBodyCodeSource();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyCodeSource setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetJobResponseBodyCodeSource setCodeSourceId(String codeSourceId) {
            this.codeSourceId = codeSourceId;
            return this;
        }
        public String getCodeSourceId() {
            return this.codeSourceId;
        }

        public GetJobResponseBodyCodeSource setCommit(String commit) {
            this.commit = commit;
            return this;
        }
        public String getCommit() {
            return this.commit;
        }

        public GetJobResponseBodyCodeSource setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class GetJobResponseBodyCustomEnvs extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Visible")
        public String visible;

        public static GetJobResponseBodyCustomEnvs build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyCustomEnvs self = new GetJobResponseBodyCustomEnvs();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyCustomEnvs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobResponseBodyCustomEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetJobResponseBodyCustomEnvs setVisible(String visible) {
            this.visible = visible;
            return this;
        }
        public String getVisible() {
            return this.visible;
        }

    }

    public static class GetJobResponseBodyDataSources extends TeaModel {
        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d*******</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The local mount path. This parameter is optional. The default value is empty, which specifies that the mount path in the data source is used.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The data source URL.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static GetJobResponseBodyDataSources build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyDataSources self = new GetJobResponseBodyDataSources();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyDataSources setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetJobResponseBodyDataSources setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetJobResponseBodyDataSources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class GetJobResponseBodyPodsHistoryPods extends TeaModel {
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The time when the node was created (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The end time of the node (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtFinishTime")
        public String gmtFinishTime;

        /**
         * <p>The start time of the node (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.3</p>
         */
        @NameInMap("Ip")
        public String ip;

        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("PodId")
        public String podId;

        @NameInMap("PodIps")
        public java.util.List<PodNetworkInterface> podIps;

        /**
         * <p>The UID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>fe846462-af2c-4521-bd6f-96787a57591d</p>
         */
        @NameInMap("PodUid")
        public String podUid;

        /**
         * <p>The resource type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The sub-status of the node, such as its preemption status. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Evicted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SubStatus")
        public String subStatus;

        /**
         * <p>The type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetJobResponseBodyPodsHistoryPods build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyPodsHistoryPods self = new GetJobResponseBodyPodsHistoryPods();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyPodsHistoryPods setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public GetJobResponseBodyPodsHistoryPods setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetJobResponseBodyPodsHistoryPods setGmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }
        public String getGmtFinishTime() {
            return this.gmtFinishTime;
        }

        public GetJobResponseBodyPodsHistoryPods setGmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        public GetJobResponseBodyPodsHistoryPods setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetJobResponseBodyPodsHistoryPods setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetJobResponseBodyPodsHistoryPods setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
        }

        public GetJobResponseBodyPodsHistoryPods setPodIps(java.util.List<PodNetworkInterface> podIps) {
            this.podIps = podIps;
            return this;
        }
        public java.util.List<PodNetworkInterface> getPodIps() {
            return this.podIps;
        }

        public GetJobResponseBodyPodsHistoryPods setPodUid(String podUid) {
            this.podUid = podUid;
            return this;
        }
        public String getPodUid() {
            return this.podUid;
        }

        public GetJobResponseBodyPodsHistoryPods setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetJobResponseBodyPodsHistoryPods setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobResponseBodyPodsHistoryPods setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

        public GetJobResponseBodyPodsHistoryPods setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetJobResponseBodyPods extends TeaModel {
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The time when the node was created (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The end time of the node (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T15:36:05Z</p>
         */
        @NameInMap("GmtFinishTime")
        public String gmtFinishTime;

        /**
         * <p>The start time of the node (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        /**
         * <p>The historical nodes.</p>
         */
        @NameInMap("HistoryPods")
        public java.util.List<GetJobResponseBodyPodsHistoryPods> historyPods;

        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.2</p>
         */
        @NameInMap("Ip")
        public String ip;

        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The node ID. It can be used in the GetPodLogs and GetPodEvents operations to obtain the detailed logs and events of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("PodId")
        public String podId;

        @NameInMap("PodIps")
        public java.util.List<PodNetworkInterface> podIps;

        /**
         * <p>The UID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>fe846462-af2c-4521-bd6f-96787a57591d</p>
         */
        @NameInMap("PodUid")
        public String podUid;

        /**
         * <p>The resource type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the node. Valid values:</p>
         * <ul>
         * <li>Pending</li>
         * <li>Running</li>
         * <li>Succeeded</li>
         * <li>Failed</li>
         * <li>Unknown</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The sub-status of the node, such as its preemption status. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Evicted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SubStatus")
        public String subStatus;

        /**
         * <p>The node type, which corresponds to a specific JobSpec in JobSpecs of the CreateJob operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetJobResponseBodyPods build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyPods self = new GetJobResponseBodyPods();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyPods setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public GetJobResponseBodyPods setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetJobResponseBodyPods setGmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }
        public String getGmtFinishTime() {
            return this.gmtFinishTime;
        }

        public GetJobResponseBodyPods setGmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        public GetJobResponseBodyPods setHistoryPods(java.util.List<GetJobResponseBodyPodsHistoryPods> historyPods) {
            this.historyPods = historyPods;
            return this;
        }
        public java.util.List<GetJobResponseBodyPodsHistoryPods> getHistoryPods() {
            return this.historyPods;
        }

        public GetJobResponseBodyPods setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetJobResponseBodyPods setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetJobResponseBodyPods setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
        }

        public GetJobResponseBodyPods setPodIps(java.util.List<PodNetworkInterface> podIps) {
            this.podIps = podIps;
            return this;
        }
        public java.util.List<PodNetworkInterface> getPodIps() {
            return this.podIps;
        }

        public GetJobResponseBodyPods setPodUid(String podUid) {
            this.podUid = podUid;
            return this;
        }
        public String getPodUid() {
            return this.podUid;
        }

        public GetJobResponseBodyPods setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetJobResponseBodyPods setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobResponseBodyPods setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

        public GetJobResponseBodyPods setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetJobResponseBodyRestartRecordDetailErrorInfoList extends TeaModel {
        @NameInMap("AddJobLevelBlacklist")
        public Boolean addJobLevelBlacklist;

        @NameInMap("AddNodeToBlacklist")
        public Boolean addNodeToBlacklist;

        @NameInMap("DetailErrorMsg")
        public String detailErrorMsg;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ErrorSource")
        public String errorSource;

        @NameInMap("Node")
        public String node;

        @NameInMap("Pod")
        public String pod;

        @NameInMap("TriggerRestart")
        public Boolean triggerRestart;

        public static GetJobResponseBodyRestartRecordDetailErrorInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyRestartRecordDetailErrorInfoList self = new GetJobResponseBodyRestartRecordDetailErrorInfoList();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyRestartRecordDetailErrorInfoList setAddJobLevelBlacklist(Boolean addJobLevelBlacklist) {
            this.addJobLevelBlacklist = addJobLevelBlacklist;
            return this;
        }
        public Boolean getAddJobLevelBlacklist() {
            return this.addJobLevelBlacklist;
        }

        public GetJobResponseBodyRestartRecordDetailErrorInfoList setAddNodeToBlacklist(Boolean addNodeToBlacklist) {
            this.addNodeToBlacklist = addNodeToBlacklist;
            return this;
        }
        public Boolean getAddNodeToBlacklist() {
            return this.addNodeToBlacklist;
        }

        public GetJobResponseBodyRestartRecordDetailErrorInfoList setDetailErrorMsg(String detailErrorMsg) {
            this.detailErrorMsg = detailErrorMsg;
            return this;
        }
        public String getDetailErrorMsg() {
            return this.detailErrorMsg;
        }

        public GetJobResponseBodyRestartRecordDetailErrorInfoList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetJobResponseBodyRestartRecordDetailErrorInfoList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetJobResponseBodyRestartRecordDetailErrorInfoList setErrorSource(String errorSource) {
            this.errorSource = errorSource;
            return this;
        }
        public String getErrorSource() {
            return this.errorSource;
        }

        public GetJobResponseBodyRestartRecordDetailErrorInfoList setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

        public GetJobResponseBodyRestartRecordDetailErrorInfoList setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public GetJobResponseBodyRestartRecordDetailErrorInfoList setTriggerRestart(Boolean triggerRestart) {
            this.triggerRestart = triggerRestart;
            return this;
        }
        public Boolean getTriggerRestart() {
            return this.triggerRestart;
        }

    }

    public static class GetJobResponseBodyRestartRecord extends TeaModel {
        @NameInMap("DetailErrorInfoList")
        public java.util.List<GetJobResponseBodyRestartRecordDetailErrorInfoList> detailErrorInfoList;

        @NameInMap("JobRestartCount")
        public Long jobRestartCount;

        @NameInMap("OccurPhase")
        public String occurPhase;

        @NameInMap("OccurTime")
        public String occurTime;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("RestartDurationInSec")
        public Long restartDurationInSec;

        @NameInMap("RestartFailReason")
        public String restartFailReason;

        @NameInMap("RestartStatus")
        public String restartStatus;

        @NameInMap("TriggerID")
        public String triggerID;

        public static GetJobResponseBodyRestartRecord build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyRestartRecord self = new GetJobResponseBodyRestartRecord();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyRestartRecord setDetailErrorInfoList(java.util.List<GetJobResponseBodyRestartRecordDetailErrorInfoList> detailErrorInfoList) {
            this.detailErrorInfoList = detailErrorInfoList;
            return this;
        }
        public java.util.List<GetJobResponseBodyRestartRecordDetailErrorInfoList> getDetailErrorInfoList() {
            return this.detailErrorInfoList;
        }

        public GetJobResponseBodyRestartRecord setJobRestartCount(Long jobRestartCount) {
            this.jobRestartCount = jobRestartCount;
            return this;
        }
        public Long getJobRestartCount() {
            return this.jobRestartCount;
        }

        public GetJobResponseBodyRestartRecord setOccurPhase(String occurPhase) {
            this.occurPhase = occurPhase;
            return this;
        }
        public String getOccurPhase() {
            return this.occurPhase;
        }

        public GetJobResponseBodyRestartRecord setOccurTime(String occurTime) {
            this.occurTime = occurTime;
            return this;
        }
        public String getOccurTime() {
            return this.occurTime;
        }

        public GetJobResponseBodyRestartRecord setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetJobResponseBodyRestartRecord setRestartDurationInSec(Long restartDurationInSec) {
            this.restartDurationInSec = restartDurationInSec;
            return this;
        }
        public Long getRestartDurationInSec() {
            return this.restartDurationInSec;
        }

        public GetJobResponseBodyRestartRecord setRestartFailReason(String restartFailReason) {
            this.restartFailReason = restartFailReason;
            return this;
        }
        public String getRestartFailReason() {
            return this.restartFailReason;
        }

        public GetJobResponseBodyRestartRecord setRestartStatus(String restartStatus) {
            this.restartStatus = restartStatus;
            return this;
        }
        public String getRestartStatus() {
            return this.restartStatus;
        }

        public GetJobResponseBodyRestartRecord setTriggerID(String triggerID) {
            this.triggerID = triggerID;
            return this;
        }
        public String getTriggerID() {
            return this.triggerID;
        }

    }

    public static class GetJobResponseBodyUserVpc extends TeaModel {
        /**
         * <p>The default router. This parameter is valid only for general-purpose computing resources. Valid values:</p>
         * <p>eth0: The default network interface is used to access the Internet through the public gateway. eth1: The user\&quot;s Elastic Network Interface is used to access the Internet through the private gateway.</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <p>The extended CIDR block. Example: 192.168.0.1/24.</p>
         */
        @NameInMap("ExtendedCidrs")
        public java.util.List<String> extendedCidrs;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-abcdef****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vs-abcdef****</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-abcdef****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetJobResponseBodyUserVpc build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyUserVpc self = new GetJobResponseBodyUserVpc();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public GetJobResponseBodyUserVpc setExtendedCidrs(java.util.List<String> extendedCidrs) {
            this.extendedCidrs = extendedCidrs;
            return this;
        }
        public java.util.List<String> getExtendedCidrs() {
            return this.extendedCidrs;
        }

        public GetJobResponseBodyUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetJobResponseBodyUserVpc setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public GetJobResponseBodyUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
