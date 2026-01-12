// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CodeSource")
    public JobItemCodeSource codeSource;

    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("DataSources")
    public java.util.List<JobItemDataSources> dataSources;

    /**
     * <strong>example:</strong>
     * <p>tf-mnist-test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>3602</p>
     */
    @NameInMap("Duration")
    public Long duration;

    @NameInMap("ElasticSpec")
    public JobElasticSpec elasticSpec;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePreemptibleJob")
    public Boolean enablePreemptibleJob;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnabledDebugger")
    public Boolean enabledDebugger;

    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtFailedTime")
    public String gmtFailedTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:08Z</p>
     */
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:08Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtRunningTime")
    public String gmtRunningTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtStoppedTime")
    public String gmtStoppedTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtSubmittedTime")
    public String gmtSubmittedTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtSuccessedTime")
    public String gmtSuccessedTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDeleted")
    public Boolean isDeleted;

    /**
     * <strong>example:</strong>
     * <p>dlc-20210126170216-mtl37ge7gkvdz</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("JobMaxRunningTimeMinutes")
    public Long jobMaxRunningTimeMinutes;

    @NameInMap("JobReplicaStatuses")
    public java.util.List<JobReplicaStatus> jobReplicaStatuses;

    @NameInMap("JobSpecs")
    public java.util.List<JobSpec> jobSpecs;

    /**
     * <strong>example:</strong>
     * <p>TFJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NodeCount")
    public String nodeCount;

    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    @NameInMap("Pods")
    public java.util.List<PodItem> pods;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <strong>example:</strong>
     * <p>JobStoppedByUser</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <strong>example:</strong>
     * <p>Job is stopped by user.</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RequestCPU")
    public Long requestCPU;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RequestGPU")
    public String requestGPU;

    /**
     * <strong>example:</strong>
     * <p>1Gi</p>
     */
    @NameInMap("RequestMemory")
    public String requestMemory;

    /**
     * <strong>example:</strong>
     * <p>dlc-quota</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>L0</p>
     */
    @NameInMap("ResourceLevel")
    public String resourceLevel;

    /**
     * <strong>example:</strong>
     * <p>my_resource_group</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceQuotaName")
    public String resourceQuotaName;

    /**
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RestartTimes")
    public String restartTimes;

    @NameInMap("Settings")
    public JobSettings settings;

    /**
     * <strong>example:</strong>
     * <p>Stopped</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("StatusHistory")
    public java.util.List<StatusTransitionItem> statusHistory;

    /**
     * <strong>example:</strong>
     * <p>Restarting</p>
     */
    @NameInMap("SubStatus")
    public String subStatus;

    @NameInMap("SystemEnvs")
    public java.util.Map<String, String> systemEnvs;

    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>/root/code/</p>
     */
    @NameInMap("ThirdpartyLibDir")
    public String thirdpartyLibDir;

    @NameInMap("ThirdpartyLibs")
    public java.util.List<String> thirdpartyLibs;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseOversoldResource")
    public Boolean useOversoldResource;

    /**
     * <strong>example:</strong>
     * <p>python /root/code/mnist.py</p>
     */
    @NameInMap("UserCommand")
    public String userCommand;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>ls</p>
     */
    @NameInMap("UserScript")
    public String userScript;

    /**
     * <strong>example:</strong>
     * <p>vpc-1</p>
     */
    @NameInMap("UserVpc")
    public JobItemUserVpc userVpc;

    /**
     * <strong>example:</strong>
     * <p>pai-dlc-role</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <strong>example:</strong>
     * <p>/mnt/data</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    /**
     * <strong>example:</strong>
     * <p>268</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>dlc-workspace</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static JobItem build(java.util.Map<String, ?> map) throws Exception {
        JobItem self = new JobItem();
        return TeaModel.build(map, self);
    }

    public JobItem setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public JobItem setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public JobItem setCodeSource(JobItemCodeSource codeSource) {
        this.codeSource = codeSource;
        return this;
    }
    public JobItemCodeSource getCodeSource() {
        return this.codeSource;
    }

    public JobItem setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public JobItem setDataSources(java.util.List<JobItemDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<JobItemDataSources> getDataSources() {
        return this.dataSources;
    }

    public JobItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public JobItem setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public JobItem setElasticSpec(JobElasticSpec elasticSpec) {
        this.elasticSpec = elasticSpec;
        return this;
    }
    public JobElasticSpec getElasticSpec() {
        return this.elasticSpec;
    }

    public JobItem setEnablePreemptibleJob(Boolean enablePreemptibleJob) {
        this.enablePreemptibleJob = enablePreemptibleJob;
        return this;
    }
    public Boolean getEnablePreemptibleJob() {
        return this.enablePreemptibleJob;
    }

    public JobItem setEnabledDebugger(Boolean enabledDebugger) {
        this.enabledDebugger = enabledDebugger;
        return this;
    }
    public Boolean getEnabledDebugger() {
        return this.enabledDebugger;
    }

    public JobItem setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public JobItem setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public JobItem setGmtFailedTime(String gmtFailedTime) {
        this.gmtFailedTime = gmtFailedTime;
        return this;
    }
    public String getGmtFailedTime() {
        return this.gmtFailedTime;
    }

    public JobItem setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public JobItem setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public JobItem setGmtRunningTime(String gmtRunningTime) {
        this.gmtRunningTime = gmtRunningTime;
        return this;
    }
    public String getGmtRunningTime() {
        return this.gmtRunningTime;
    }

    public JobItem setGmtStoppedTime(String gmtStoppedTime) {
        this.gmtStoppedTime = gmtStoppedTime;
        return this;
    }
    public String getGmtStoppedTime() {
        return this.gmtStoppedTime;
    }

    public JobItem setGmtSubmittedTime(String gmtSubmittedTime) {
        this.gmtSubmittedTime = gmtSubmittedTime;
        return this;
    }
    public String getGmtSubmittedTime() {
        return this.gmtSubmittedTime;
    }

    public JobItem setGmtSuccessedTime(String gmtSuccessedTime) {
        this.gmtSuccessedTime = gmtSuccessedTime;
        return this;
    }
    public String getGmtSuccessedTime() {
        return this.gmtSuccessedTime;
    }

    public JobItem setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public JobItem setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public JobItem setJobMaxRunningTimeMinutes(Long jobMaxRunningTimeMinutes) {
        this.jobMaxRunningTimeMinutes = jobMaxRunningTimeMinutes;
        return this;
    }
    public Long getJobMaxRunningTimeMinutes() {
        return this.jobMaxRunningTimeMinutes;
    }

    public JobItem setJobReplicaStatuses(java.util.List<JobReplicaStatus> jobReplicaStatuses) {
        this.jobReplicaStatuses = jobReplicaStatuses;
        return this;
    }
    public java.util.List<JobReplicaStatus> getJobReplicaStatuses() {
        return this.jobReplicaStatuses;
    }

    public JobItem setJobSpecs(java.util.List<JobSpec> jobSpecs) {
        this.jobSpecs = jobSpecs;
        return this;
    }
    public java.util.List<JobSpec> getJobSpecs() {
        return this.jobSpecs;
    }

    public JobItem setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public JobItem setNodeCount(String nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public String getNodeCount() {
        return this.nodeCount;
    }

    public JobItem setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public JobItem setPods(java.util.List<PodItem> pods) {
        this.pods = pods;
        return this;
    }
    public java.util.List<PodItem> getPods() {
        return this.pods;
    }

    public JobItem setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public JobItem setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public JobItem setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public JobItem setRequestCPU(Long requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public Long getRequestCPU() {
        return this.requestCPU;
    }

    public JobItem setRequestGPU(String requestGPU) {
        this.requestGPU = requestGPU;
        return this;
    }
    public String getRequestGPU() {
        return this.requestGPU;
    }

    public JobItem setRequestMemory(String requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public String getRequestMemory() {
        return this.requestMemory;
    }

    public JobItem setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public JobItem setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }
    public String getResourceLevel() {
        return this.resourceLevel;
    }

    public JobItem setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public JobItem setResourceQuotaName(String resourceQuotaName) {
        this.resourceQuotaName = resourceQuotaName;
        return this;
    }
    public String getResourceQuotaName() {
        return this.resourceQuotaName;
    }

    public JobItem setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public JobItem setRestartTimes(String restartTimes) {
        this.restartTimes = restartTimes;
        return this;
    }
    public String getRestartTimes() {
        return this.restartTimes;
    }

    public JobItem setSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }
    public JobSettings getSettings() {
        return this.settings;
    }

    public JobItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public JobItem setStatusHistory(java.util.List<StatusTransitionItem> statusHistory) {
        this.statusHistory = statusHistory;
        return this;
    }
    public java.util.List<StatusTransitionItem> getStatusHistory() {
        return this.statusHistory;
    }

    public JobItem setSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }
    public String getSubStatus() {
        return this.subStatus;
    }

    public JobItem setSystemEnvs(java.util.Map<String, String> systemEnvs) {
        this.systemEnvs = systemEnvs;
        return this;
    }
    public java.util.Map<String, String> getSystemEnvs() {
        return this.systemEnvs;
    }

    public JobItem setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public JobItem setThirdpartyLibDir(String thirdpartyLibDir) {
        this.thirdpartyLibDir = thirdpartyLibDir;
        return this;
    }
    public String getThirdpartyLibDir() {
        return this.thirdpartyLibDir;
    }

    public JobItem setThirdpartyLibs(java.util.List<String> thirdpartyLibs) {
        this.thirdpartyLibs = thirdpartyLibs;
        return this;
    }
    public java.util.List<String> getThirdpartyLibs() {
        return this.thirdpartyLibs;
    }

    public JobItem setUseOversoldResource(Boolean useOversoldResource) {
        this.useOversoldResource = useOversoldResource;
        return this;
    }
    public Boolean getUseOversoldResource() {
        return this.useOversoldResource;
    }

    public JobItem setUserCommand(String userCommand) {
        this.userCommand = userCommand;
        return this;
    }
    public String getUserCommand() {
        return this.userCommand;
    }

    public JobItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public JobItem setUserScript(String userScript) {
        this.userScript = userScript;
        return this;
    }
    public String getUserScript() {
        return this.userScript;
    }

    public JobItem setUserVpc(JobItemUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public JobItemUserVpc getUserVpc() {
        return this.userVpc;
    }

    public JobItem setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public JobItem setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public JobItem setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public JobItem setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class JobItemCodeSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Branch")
        public String branch;

        /**
         * <strong>example:</strong>
         * <p>code-20210111103721-85qz78ia96lu</p>
         */
        @NameInMap("CodeSourceId")
        public String codeSourceId;

        /**
         * <strong>example:</strong>
         * <p>44da109b59f8596152987eaa8f3b2487bb72ea63</p>
         */
        @NameInMap("Commit")
        public String commit;

        /**
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        public static JobItemCodeSource build(java.util.Map<String, ?> map) throws Exception {
            JobItemCodeSource self = new JobItemCodeSource();
            return TeaModel.build(map, self);
        }

        public JobItemCodeSource setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public JobItemCodeSource setCodeSourceId(String codeSourceId) {
            this.codeSourceId = codeSourceId;
            return this;
        }
        public String getCodeSourceId() {
            return this.codeSourceId;
        }

        public JobItemCodeSource setCommit(String commit) {
            this.commit = commit;
            return this;
        }
        public String getCommit() {
            return this.commit;
        }

        public JobItemCodeSource setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class JobItemDataSources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>data-20210114104214-vf9lowjt3pso</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        public static JobItemDataSources build(java.util.Map<String, ?> map) throws Exception {
            JobItemDataSources self = new JobItemDataSources();
            return TeaModel.build(map, self);
        }

        public JobItemDataSources setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public JobItemDataSources setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class JobItemUserVpc extends TeaModel {
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        @NameInMap("ExtendedCidrs")
        public java.util.List<String> extendedCidrs;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SwitchId")
        public String switchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static JobItemUserVpc build(java.util.Map<String, ?> map) throws Exception {
            JobItemUserVpc self = new JobItemUserVpc();
            return TeaModel.build(map, self);
        }

        public JobItemUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public JobItemUserVpc setExtendedCidrs(java.util.List<String> extendedCidrs) {
            this.extendedCidrs = extendedCidrs;
            return this;
        }
        public java.util.List<String> getExtendedCidrs() {
            return this.extendedCidrs;
        }

        public JobItemUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public JobItemUserVpc setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public JobItemUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
