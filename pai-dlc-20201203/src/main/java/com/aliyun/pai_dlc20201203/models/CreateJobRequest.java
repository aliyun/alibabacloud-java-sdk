// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    // 代码源配置
    @NameInMap("CodeSource")
    public CreateJobRequestCodeSource codeSource;

    // 数据源配置列表
    @NameInMap("DataSources")
    public java.util.List<CreateJobRequestDataSources> dataSources;

    // 作业显示名称
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("ElasticSpec")
    public JobElasticSpec elasticSpec;

    // 环境变量配置
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    // 作业最大运行时间
    @NameInMap("JobMaxRunningTimeMinutes")
    public Long jobMaxRunningTimeMinutes;

    // 作业规格配置
    @NameInMap("JobSpecs")
    public java.util.List<JobSpec> jobSpecs;

    // 作业类型
    @NameInMap("JobType")
    public String jobType;

    // 作业优先级
    @NameInMap("Priority")
    public Integer priority;

    // 资源组编号
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("Settings")
    public JobSettings settings;

    // 三方库(requirements.txt)文件路径
    @NameInMap("ThirdpartyLibDir")
    public String thirdpartyLibDir;

    // 三方库配置列表
    @NameInMap("ThirdpartyLibs")
    public java.util.List<String> thirdpartyLibs;

    // 作业命令
    @NameInMap("UserCommand")
    public String userCommand;

    // 用户VPC
    @NameInMap("UserVpc")
    public CreateJobRequestUserVpc userVpc;

    // 工作空间编号
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setCodeSource(CreateJobRequestCodeSource codeSource) {
        this.codeSource = codeSource;
        return this;
    }
    public CreateJobRequestCodeSource getCodeSource() {
        return this.codeSource;
    }

    public CreateJobRequest setDataSources(java.util.List<CreateJobRequestDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<CreateJobRequestDataSources> getDataSources() {
        return this.dataSources;
    }

    public CreateJobRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateJobRequest setElasticSpec(JobElasticSpec elasticSpec) {
        this.elasticSpec = elasticSpec;
        return this;
    }
    public JobElasticSpec getElasticSpec() {
        return this.elasticSpec;
    }

    public CreateJobRequest setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public CreateJobRequest setJobMaxRunningTimeMinutes(Long jobMaxRunningTimeMinutes) {
        this.jobMaxRunningTimeMinutes = jobMaxRunningTimeMinutes;
        return this;
    }
    public Long getJobMaxRunningTimeMinutes() {
        return this.jobMaxRunningTimeMinutes;
    }

    public CreateJobRequest setJobSpecs(java.util.List<JobSpec> jobSpecs) {
        this.jobSpecs = jobSpecs;
        return this;
    }
    public java.util.List<JobSpec> getJobSpecs() {
        return this.jobSpecs;
    }

    public CreateJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateJobRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateJobRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateJobRequest setSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }
    public JobSettings getSettings() {
        return this.settings;
    }

    public CreateJobRequest setThirdpartyLibDir(String thirdpartyLibDir) {
        this.thirdpartyLibDir = thirdpartyLibDir;
        return this;
    }
    public String getThirdpartyLibDir() {
        return this.thirdpartyLibDir;
    }

    public CreateJobRequest setThirdpartyLibs(java.util.List<String> thirdpartyLibs) {
        this.thirdpartyLibs = thirdpartyLibs;
        return this;
    }
    public java.util.List<String> getThirdpartyLibs() {
        return this.thirdpartyLibs;
    }

    public CreateJobRequest setUserCommand(String userCommand) {
        this.userCommand = userCommand;
        return this;
    }
    public String getUserCommand() {
        return this.userCommand;
    }

    public CreateJobRequest setUserVpc(CreateJobRequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public CreateJobRequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public CreateJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateJobRequestCodeSource extends TeaModel {
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

        public static CreateJobRequestCodeSource build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestCodeSource self = new CreateJobRequestCodeSource();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestCodeSource setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public CreateJobRequestCodeSource setCodeSourceId(String codeSourceId) {
            this.codeSourceId = codeSourceId;
            return this;
        }
        public String getCodeSourceId() {
            return this.codeSourceId;
        }

        public CreateJobRequestCodeSource setCommit(String commit) {
            this.commit = commit;
            return this;
        }
        public String getCommit() {
            return this.commit;
        }

        public CreateJobRequestCodeSource setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class CreateJobRequestDataSources extends TeaModel {
        // 数据源Id
        @NameInMap("DataSourceId")
        public String dataSourceId;

        // 本地挂载路径
        @NameInMap("MountPath")
        public String mountPath;

        public static CreateJobRequestDataSources build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestDataSources self = new CreateJobRequestDataSources();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestDataSources setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public CreateJobRequestDataSources setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class CreateJobRequestUserVpc extends TeaModel {
        // 扩展网段
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        // 用户安全组的id
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // 用户交换机的id
        @NameInMap("SwitchId")
        public String switchId;

        // 用户VPC的id
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateJobRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestUserVpc self = new CreateJobRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        public CreateJobRequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateJobRequestUserVpc setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public CreateJobRequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
