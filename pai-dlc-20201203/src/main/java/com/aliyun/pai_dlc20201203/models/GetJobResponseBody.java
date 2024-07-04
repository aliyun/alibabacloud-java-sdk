// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a*****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CodeSource")
    public GetJobResponseBodyCodeSource codeSource;

    @NameInMap("DataSources")
    public java.util.List<GetJobResponseBodyDataSources> dataSources;

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
     * <p>2021-01-12T15:36:08Z</p>
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
     * <p>2021-01-12T14:36:21Z</p>
     */
    @NameInMap("GmtRunningTime")
    public String gmtRunningTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:08Z</p>
     */
    @NameInMap("GmtStoppedTime")
    public String gmtStoppedTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtSubmittedTime")
    public String gmtSubmittedTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:08Z</p>
     */
    @NameInMap("GmtSuccessedTime")
    public String gmtSuccessedTime;

    /**
     * <strong>example:</strong>
     * <p>dlc*******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobSpecs")
    public java.util.List<JobSpec> jobSpecs;

    /**
     * <strong>example:</strong>
     * <p>TFJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    @NameInMap("Pods")
    public java.util.List<GetJobResponseBodyPods> pods;

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
     * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>r******</p>
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
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>0/10</p>
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
     * <p>python /root/code/mnist.py</p>
     */
    @NameInMap("UserCommand")
    public String userCommand;

    /**
     * <strong>example:</strong>
     * <p>12*********</p>
     */
    @NameInMap("UserId")
    public String userId;

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

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
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
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Branch")
        public String branch;

        /**
         * <strong>example:</strong>
         * <p>code******</p>
         */
        @NameInMap("CodeSourceId")
        public String codeSourceId;

        /**
         * <strong>example:</strong>
         * <p>44da109b59f8596152987eaa8f3b2487xxxxxx</p>
         */
        @NameInMap("Commit")
        public String commit;

        /**
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

    public static class GetJobResponseBodyDataSources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d*******</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>/mnt/data/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
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
        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtFinishTime")
        public String gmtFinishTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        /**
         * <strong>example:</strong>
         * <p>10.0.1.3</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("PodId")
        public String podId;

        /**
         * <strong>example:</strong>
         * <p>fe846462-af2c-4521-bd6f-96787a57591d</p>
         */
        @NameInMap("PodUid")
        public String podUid;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>Failed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SubStatus")
        public String subStatus;

        /**
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetJobResponseBodyPodsHistoryPods build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyPodsHistoryPods self = new GetJobResponseBodyPodsHistoryPods();
            return TeaModel.build(map, self);
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

        public GetJobResponseBodyPodsHistoryPods setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
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
        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T15:36:05Z</p>
         */
        @NameInMap("GmtFinishTime")
        public String gmtFinishTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        @NameInMap("HistoryPods")
        public java.util.List<GetJobResponseBodyPodsHistoryPods> historyPods;

        /**
         * <strong>example:</strong>
         * <p>10.0.1.2</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("PodId")
        public String podId;

        /**
         * <strong>example:</strong>
         * <p>fe846462-af2c-4521-bd6f-96787a57591d</p>
         */
        @NameInMap("PodUid")
        public String podUid;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SubStatus")
        public String subStatus;

        /**
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetJobResponseBodyPods build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyPods self = new GetJobResponseBodyPods();
            return TeaModel.build(map, self);
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

        public GetJobResponseBodyPods setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
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

}
