// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>The job visibility. Valid values:</p>
     * <ul>
     * <li>PUBLIC: The job is visible to all members in the workspace.</li>
     * <li>PRIVATE: The job is visible only to you and the administrator of the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The code source of the job. Before the node of the job runs, DLC automatically downloads the configured code from the code source and mounts the code to the local path of the container.</p>
     */
    @NameInMap("CodeSource")
    public CreateJobRequestCodeSource codeSource;

    /**
     * <p>The access credential configuration.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("CustomEnvs")
    public java.util.List<CreateJobRequestCustomEnvs> customEnvs;

    /**
     * <p>The data sources for job running.</p>
     */
    @NameInMap("DataSources")
    public java.util.List<CreateJobRequestDataSources> dataSources;

    /**
     * <p>This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("DebuggerConfigContent")
    public String debuggerConfigContent;

    /**
     * <p>The job name. The name must be in the following format:</p>
     * <ul>
     * <li>The name must be 1 to 256 characters in length.</li>
     * <li>The name can contain digits, letters, underscores (_), periods (.), and hyphens (-).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tf-mnist-test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>This parameter is not supported.</p>
     */
    @NameInMap("ElasticSpec")
    public JobElasticSpec elasticSpec;

    /**
     * <p>The environment variables.</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <p>The maximum running duration of the job. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("JobMaxRunningTimeMinutes")
    public Long jobMaxRunningTimeMinutes;

    /**
     * <p><strong>JobSpecs</strong> describes the configurations for job running, such as the image address, startup command, node resource declaration, and number of replicas.</p>
     * <p>A DLC job consists of different types of nodes. If nodes of the same type have exactly the same configuration, the configuration is called JobSpec. <strong>JobSpecs</strong> specifies the configurations of all types of nodes. The value is of the array type.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobSpecs")
    public java.util.List<JobSpec> jobSpecs;

    /**
     * <p>The job type. The value is case-sensitive. The following job types are supported:</p>
     * <ul>
     * <li>TFJob</li>
     * <li>PyTorchJob</li>
     * <li>MPIJob</li>
     * <li>XGBoostJob</li>
     * <li>OneFlowJob</li>
     * <li>ElasticBatchJob</li>
     * <li>SlurmJob</li>
     * <li>RayJob</li>
     * </ul>
     * <p>Valid values and corresponding frameworks:</p>
     * <ul>
     * <li>OneFlowJob: OneFlow.</li>
     * <li>PyTorchJob: PyTorch.</li>
     * <li>SlurmJob: Slurm.</li>
     * <li>XGBoostJob: XGBoost.</li>
     * <li>ElasticBatchJob: ElasticBatch.</li>
     * <li>MPIJob: MPIJob.</li>
     * <li>TFJob: Tensorflow.</li>
     * <li>RayJob: Ray.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TFJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The additional configuration of the job. You can use this parameter to adjust the behavior of the attached data source. For example, if the attached data source of the job is of the OSS type, you can use this parameter to add the following configurations to override the default parameters of JindoFS: <code>fs.oss.download.thread.concurrency=4,fs.oss.download.queue.size=16</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1,key2=value2</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The priority of the job. Default value: 1. Valid values: 1 to 9.</p>
     * <ul>
     * <li>1 is the lowest priority.</li>
     * <li>9: the highest priority.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the resource group. This parameter is optional.</p>
     * <ul>
     * <li>If you leave this parameter empty, the job is submitted to a public resource group.</li>
     * <li>If a resource quota is bound to the current workspace, you can specify the resource quota ID. For more information about how to query the resource quota ID, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quotas</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rs-xxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The additional parameter configurations of the job.</p>
     */
    @NameInMap("Settings")
    public JobSettings settings;

    /**
     * <p>The policy that is used to check whether a distributed multi-node job is successful. Only TensorFlow distributed multi-node jobs are supported.</p>
     * <ul>
     * <li>ChiefWorker: If you use this policy, the job is considered successful when the pod on the chief node completes operations.</li>
     * <li>AllWorkers (default): If you use this policy, the job is considered successful when all worker nodes complete operations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AllWorkers</p>
     */
    @NameInMap("SuccessPolicy")
    public String successPolicy;

    /**
     * <p>The folder in which the third-party Python library file requirements.txt is stored. Before the startup command specified by the UserCommand parameter is run on each node, DLC fetches the requirements.txt file from the folder and runs <code>pip install -r</code> to install the required package and library.</p>
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
     * <p>The startup command for all nodes of the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>python /root/code/mnist.py</p>
     */
    @NameInMap("UserCommand")
    public String userCommand;

    /**
     * <p>The VPC settings.</p>
     */
    @NameInMap("UserVpc")
    public CreateJobRequestUserVpc userVpc;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-20210126170216-xxxxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateJobRequest setCodeSource(CreateJobRequestCodeSource codeSource) {
        this.codeSource = codeSource;
        return this;
    }
    public CreateJobRequestCodeSource getCodeSource() {
        return this.codeSource;
    }

    public CreateJobRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateJobRequest setCustomEnvs(java.util.List<CreateJobRequestCustomEnvs> customEnvs) {
        this.customEnvs = customEnvs;
        return this;
    }
    public java.util.List<CreateJobRequestCustomEnvs> getCustomEnvs() {
        return this.customEnvs;
    }

    public CreateJobRequest setDataSources(java.util.List<CreateJobRequestDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<CreateJobRequestDataSources> getDataSources() {
        return this.dataSources;
    }

    public CreateJobRequest setDebuggerConfigContent(String debuggerConfigContent) {
        this.debuggerConfigContent = debuggerConfigContent;
        return this;
    }
    public String getDebuggerConfigContent() {
        return this.debuggerConfigContent;
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

    public CreateJobRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
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

    public CreateJobRequest setSuccessPolicy(String successPolicy) {
        this.successPolicy = successPolicy;
        return this;
    }
    public String getSuccessPolicy() {
        return this.successPolicy;
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
        /**
         * <p>The branch of the referenced code repository. By default, the branch configured in the code source is used. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Branch")
        public String branch;

        /**
         * <p>The ID of the code source.</p>
         * 
         * <strong>example:</strong>
         * <p>code-20210111103721-xxxxxxx</p>
         */
        @NameInMap("CodeSourceId")
        public String codeSourceId;

        /**
         * <p>The commit ID of the code to be downloaded. By default, the commit ID configured in the code source is used. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>44da109b5******</p>
         */
        @NameInMap("Commit")
        public String commit;

        /**
         * <p>The path to which the job is mounted. By default, the mount path configured in the data source is used. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/data</p>
         */
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

    public static class CreateJobRequestCustomEnvs extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Visible")
        public String visible;

        public static CreateJobRequestCustomEnvs build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestCustomEnvs self = new CreateJobRequestCustomEnvs();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestCustomEnvs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateJobRequestCustomEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateJobRequestCustomEnvs setVisible(String visible) {
            this.visible = visible;
            return this;
        }
        public String getVisible() {
            return this.visible;
        }

    }

    public static class CreateJobRequestDataSources extends TeaModel {
        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cn9dl*******</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("DataSourceVersion")
        public String dataSourceVersion;

        @NameInMap("EnableCache")
        public Boolean enableCache;

        @NameInMap("MountAccess")
        public String mountAccess;

        /**
         * <p>The path to which the job is mounted. By default, the mount path in the data source configuration is used. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount attribute of the custom dataset. Set the value to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;fs.oss.download.thread.concurrency&quot;: &quot;10&quot;,
         *   &quot;fs.oss.upload.thread.concurrency&quot;: &quot;10&quot;,
         *   &quot;fs.jindo.args&quot;: &quot;-oattr_timeout=3 -oentry_timeout=0 -onegative_timeout=0 -oauto_cache -ono_symlink&quot;
         * }</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The data source path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/</p>
         */
        @NameInMap("Uri")
        public String uri;

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

        public CreateJobRequestDataSources setDataSourceVersion(String dataSourceVersion) {
            this.dataSourceVersion = dataSourceVersion;
            return this;
        }
        public String getDataSourceVersion() {
            return this.dataSourceVersion;
        }

        public CreateJobRequestDataSources setEnableCache(Boolean enableCache) {
            this.enableCache = enableCache;
            return this;
        }
        public Boolean getEnableCache() {
            return this.enableCache;
        }

        public CreateJobRequestDataSources setMountAccess(String mountAccess) {
            this.mountAccess = mountAccess;
            return this;
        }
        public String getMountAccess() {
            return this.mountAccess;
        }

        public CreateJobRequestDataSources setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateJobRequestDataSources setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public CreateJobRequestDataSources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class CreateJobRequestUserVpc extends TeaModel {
        /**
         * <p>The default route. Default value: false. Valid values:</p>
         * <ul>
         * <li>eth0: The default network interface is used to access the Internet through the public gateway.</li>
         * <li>eth1: The user\&quot;s elastic network interface (ENI) is used to access the Internet through the private gateway. For more information about the configuration method, see <a href="https://help.aliyun.com/document_detail/2525343.html">Enable Internet access for a DSW instance by using a private Internet NAT gateway</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <p>The extended CIDR block.</p>
         * <ul>
         * <li>If you leave the SwitchId and ExtendedCIDRs parameters empty, the system automatically obtains all CIDR blocks in a VPC.</li>
         * <li>If you configure the SwitchId and ExtendedCIDRs parameters, we recommend that you specify all CIDR blocks in a VPC.</li>
         * </ul>
         */
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-abcdef****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID. This parameter is optional.</p>
         * <ul>
         * <li>If you leave this parameter empty, the system automatically selects a vSwitch based on the inventory status.</li>
         * <li>You can also specify a vSwitch ID.</li>
         * </ul>
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

        public static CreateJobRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestUserVpc self = new CreateJobRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
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
