// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    // 集群ID
    @NameInMap("ClusterId")
    public String clusterId;

    // 代码源配置
    @NameInMap("CodeSource")
    public GetJobResponseBodyCodeSource codeSource;

    // 数据源配置列表
    @NameInMap("DataSources")
    public java.util.List<GetJobResponseBodyDataSources> dataSources;

    // 作业显示名称
    @NameInMap("DisplayName")
    public String displayName;

    // 作业运行时长（s）
    @NameInMap("Duration")
    public Long duration;

    // 弹性任务参数
    @NameInMap("ElasticSpec")
    public JobElasticSpec elasticSpec;

    // 是否开启debugger任务
    @NameInMap("EnabledDebugger")
    public Boolean enabledDebugger;

    // 环境变量配置
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    // 作业创建时间（UTC）
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtFailedTime")
    public String gmtFailedTime;

    // 作业结束时间（UTC）
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    @NameInMap("GmtRunningTime")
    public String gmtRunningTime;

    @NameInMap("GmtStoppedTime")
    public String gmtStoppedTime;

    @NameInMap("GmtSubmittedTime")
    public String gmtSubmittedTime;

    @NameInMap("GmtSuccessedTime")
    public String gmtSuccessedTime;

    // 作业Id
    @NameInMap("JobId")
    public String jobId;

    // 作业规格配置
    @NameInMap("JobSpecs")
    public java.util.List<JobSpec> jobSpecs;

    // 作业类型
    @NameInMap("JobType")
    public String jobType;

    // 作业所以运行Pod列表
    @NameInMap("Pods")
    public java.util.List<GetJobResponseBodyPods> pods;

    // 任务的优先级
    @NameInMap("Priority")
    public Integer priority;

    // 状态详情码
    @NameInMap("ReasonCode")
    public String reasonCode;

    // 状态详情
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 作业运行所在的资源组ID
    @NameInMap("ResourceId")
    public String resourceId;

    // 作业运行时使用的资源级别
    @NameInMap("ResourceLevel")
    public String resourceLevel;

    // 作业额外参数配置
    @NameInMap("Settings")
    public JobSettings settings;

    // 作业状态
    @NameInMap("Status")
    public String status;

    // 三方库(requirements.txt)文件路径
    @NameInMap("ThirdpartyLibDir")
    public String thirdpartyLibDir;

    // 三方库配置列表
    @NameInMap("ThirdpartyLibs")
    public java.util.List<String> thirdpartyLibs;

    // 用户命令
    @NameInMap("UserCommand")
    public String userCommand;

    // 作业提交人Id
    @NameInMap("UserId")
    public String userId;

    // 作业所属工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 作业所属工作空间名称
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
        // 代码分支
        @NameInMap("Branch")
        public String branch;

        // 代码源Id
        @NameInMap("CodeSourceId")
        public String codeSourceId;

        // 代码Commit
        @NameInMap("Commit")
        public String commit;

        // 本地挂载路径
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
        // 数据源Id
        @NameInMap("DataSourceId")
        public String dataSourceId;

        // 本地挂载路径
        @NameInMap("MountPath")
        public String mountPath;

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

    }

    public static class GetJobResponseBodyPodsHistoryPods extends TeaModel {
        // Pod创建时间（UTC）
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        // Pod结束时间（UTC）
        @NameInMap("GmtFinishTime")
        public String gmtFinishTime;

        // Pod启动时间（UTC）
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        // Pod Ip
        @NameInMap("Ip")
        public String ip;

        // Pod Id
        @NameInMap("PodId")
        public String podId;

        // Pod UId
        @NameInMap("PodUid")
        public String podUid;

        // Pod状态
        @NameInMap("Status")
        public String status;

        // Pod类型
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

        public GetJobResponseBodyPodsHistoryPods setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
        // Pod创建时间（UTC）
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        // Pod结束时间（UTC）
        @NameInMap("GmtFinishTime")
        public String gmtFinishTime;

        // Pod启动时间（UTC）
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        // 历史Pods
        @NameInMap("HistoryPods")
        public java.util.List<GetJobResponseBodyPodsHistoryPods> historyPods;

        // Pod Ip
        @NameInMap("Ip")
        public String ip;

        // Pod Id
        @NameInMap("PodId")
        public String podId;

        // Pod UId
        @NameInMap("PodUid")
        public String podUid;

        // Pod状态
        @NameInMap("Status")
        public String status;

        // Pod类型
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

        public GetJobResponseBodyPods setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
