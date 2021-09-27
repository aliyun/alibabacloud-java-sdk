// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobItem extends TeaModel {
    // 作业Id
    @NameInMap("JobId")
    public String jobId;

    // 作业类型
    @NameInMap("JobType")
    public String jobType;

    // 作业显示名称
    @NameInMap("DisplayName")
    public String displayName;

    // 作业提交人Id
    @NameInMap("UserId")
    public String userId;

    // 作业状态
    @NameInMap("Status")
    public String status;

    // 作业所属工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 作业所属工作空间名称
    @NameInMap("WorkspaceName")
    public String workspaceName;

    // 作业运行所在的资源组ID
    @NameInMap("ResourceId")
    public String resourceId;

    // 状态详情码
    @NameInMap("ReasonCode")
    public String reasonCode;

    // 状态详情
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    // 作业规格配置
    @NameInMap("JobSpecs")
    public java.util.List<JobSpec> jobSpecs;

    // 用户命令
    @NameInMap("UserCommand")
    public String userCommand;

    // 数据源配置列表
    @NameInMap("DataSources")
    public java.util.List<JobItemDataSources> dataSources;

    // 代码源配置
    @NameInMap("CodeSource")
    public JobItemCodeSource codeSource;

    // 三方库配置列表
    @NameInMap("ThirdpartyLibs")
    public java.util.List<String> thirdpartyLibs;

    // 三方库(requirements.txt)文件路径
    @NameInMap("ThirdpartyLibDir")
    public String thirdpartyLibDir;

    // 环境变量配置
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    // 作业创建时间（UTC）
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 作业结束时间（UTC）
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    // 作业运行时长，单位：秒
    @NameInMap("Duration")
    public Long duration;

    // 作业额外参数
    @NameInMap("Settings")
    public JobSettings settings;

    public static JobItem build(java.util.Map<String, ?> map) throws Exception {
        JobItem self = new JobItem();
        return TeaModel.build(map, self);
    }

    public JobItem setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public JobItem setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public JobItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public JobItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public JobItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
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

    public JobItem setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
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

    public JobItem setJobSpecs(java.util.List<JobSpec> jobSpecs) {
        this.jobSpecs = jobSpecs;
        return this;
    }
    public java.util.List<JobSpec> getJobSpecs() {
        return this.jobSpecs;
    }

    public JobItem setUserCommand(String userCommand) {
        this.userCommand = userCommand;
        return this;
    }
    public String getUserCommand() {
        return this.userCommand;
    }

    public JobItem setDataSources(java.util.List<JobItemDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<JobItemDataSources> getDataSources() {
        return this.dataSources;
    }

    public JobItem setCodeSource(JobItemCodeSource codeSource) {
        this.codeSource = codeSource;
        return this;
    }
    public JobItemCodeSource getCodeSource() {
        return this.codeSource;
    }

    public JobItem setThirdpartyLibs(java.util.List<String> thirdpartyLibs) {
        this.thirdpartyLibs = thirdpartyLibs;
        return this;
    }
    public java.util.List<String> getThirdpartyLibs() {
        return this.thirdpartyLibs;
    }

    public JobItem setThirdpartyLibDir(String thirdpartyLibDir) {
        this.thirdpartyLibDir = thirdpartyLibDir;
        return this;
    }
    public String getThirdpartyLibDir() {
        return this.thirdpartyLibDir;
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

    public JobItem setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public JobItem setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public JobItem setSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }
    public JobSettings getSettings() {
        return this.settings;
    }

    public static class JobItemDataSources extends TeaModel {
        // 数据源Id
        @NameInMap("DataSourceId")
        public String dataSourceId;

        // 本地挂载路径
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

    public static class JobItemCodeSource extends TeaModel {
        // 代码源Id
        @NameInMap("CodeSourceId")
        public String codeSourceId;

        // 代码分支
        @NameInMap("Branch")
        public String branch;

        // 代码Commit
        @NameInMap("Commit")
        public String commit;

        // 本地挂载路径
        @NameInMap("MountPath")
        public String mountPath;

        public static JobItemCodeSource build(java.util.Map<String, ?> map) throws Exception {
            JobItemCodeSource self = new JobItemCodeSource();
            return TeaModel.build(map, self);
        }

        public JobItemCodeSource setCodeSourceId(String codeSourceId) {
            this.codeSourceId = codeSourceId;
            return this;
        }
        public String getCodeSourceId() {
            return this.codeSourceId;
        }

        public JobItemCodeSource setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
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

}
