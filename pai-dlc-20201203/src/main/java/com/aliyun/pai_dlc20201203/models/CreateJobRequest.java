// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>The visibility of the job. Valid values:</p>
     * <ul>
     * <li>PUBLIC: visible to all members in the workspace.</li>
     * <li>PRIVATE: visible only to you and administrators in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The code source used by this job. Before the job nodes start, DLC automatically downloads the code configured in the code source and mounts it to a local directory of the container.</p>
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
     * <p>The list of data sources used by the job.</p>
     */
    @NameInMap("DataSources")
    public java.util.List<CreateJobRequestDataSources> dataSources;

    /**
     * <p>This parameter is not supported. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("DebuggerConfigContent")
    public String debuggerConfigContent;

    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the job. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name cannot exceed 256 characters in length.</li>
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
     * <p>This parameter is not supported. Ignore this parameter.</p>
     */
    @NameInMap("ElasticSpec")
    public JobElasticSpec elasticSpec;

    /**
     * <p>The environment variable configuration.</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <p>The maximum running duration of the job, in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("JobMaxRunningTimeMinutes")
    public Long jobMaxRunningTimeMinutes;

    /**
     * <p>The various runtime configurations of the job, such as the image address, startup command, node resource declarations, and number of replicas.</p>
     * <p>A DLC job consists of different types of nodes. Nodes of the same type share identical configurations, which is called a JobSpec. <strong>JobSpecs</strong> describes the configurations of all node types and is an array of JobSpec objects.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobSpecs")
    public java.util.List<JobSpec> jobSpecs;

    /**
     * <p>The job type. This parameter is case-sensitive. Valid values:</p>
     * <ul>
     * <li>TFJob</li>
     * <li>PyTorchJob</li>
     * <li>MPIJob</li>
     * <li>XGBoostJob</li>
     * <li>OneFlowJob</li>
     * <li>ElasticBatchJob</li>
     * <li>SlurmJob</li>
     * <li>RayJob</li>
     * <li>DataJuicerJob.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TFJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The additional configuration for this node. You can use this parameter to adjust the behavior of mounted data sources. For example, if the node has an OSS data source mounted, you can set this parameter to <code>fs.oss.download.thread.concurrency=4,fs.oss.download.queue.size=16</code> to overwrite the default JindoFS parameter settings.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1,key2=value2</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The priority of the job. This parameter is optional. Default value: 1. Valid values: 1 to 9.</p>
     * <ul>
     * <li>1: the lowest priority.</li>
     * <li>9: the highest priority.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The resource group ID. This parameter is optional.</p>
     * <ul>
     * <li>If this parameter is left empty, the job is submitted to the public resource group.</li>
     * <li>If the current workspace has an attached resource quota, you can specify the corresponding resource quota ID. For details about how to query the resource quota ID, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quotas</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rs-xxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("SchedulingStrategy")
    public String schedulingStrategy;

    /**
     * <p>The additional parameter settings for the job.</p>
     */
    @NameInMap("Settings")
    public JobSettings settings;

    /**
     * <p>The success policy for distributed multi-node jobs. Only TensorFlow multi-node jobs support this parameter. Valid values:</p>
     * <ul>
     * <li>ChiefWorker: the entire job is considered successful when the Chief pod finishes successfully.</li>
     * <li>AllWorkers (default): the entire job is considered successful only when all Worker pods finish successfully.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AllWorkers</p>
     */
    @NameInMap("SuccessPolicy")
    public String successPolicy;

    /**
     * <p>The job template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tplabc1234567</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The job template version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateVersion")
    public Integer templateVersion;

    /**
     * <p>The name of the folder that contains the third-party Python library file (requirements.txt). Before running the specified UserCommand on each node, PAI-DLC retrieves the requirements.txt file from the specified folder and runs <code>pip install -r</code> to install the libraries.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/code/</p>
     */
    @NameInMap("ThirdpartyLibDir")
    public String thirdpartyLibDir;

    /**
     * <p>The list of third-party Python libraries to install.</p>
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
     * <p>The user VPC configuration.</p>
     */
    @NameInMap("UserVpc")
    public CreateJobRequestUserVpc userVpc;

    /**
     * <p>The workspace ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>..</p>
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

    public CreateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

    public CreateJobRequest setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
        return this;
    }
    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
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

    public CreateJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateJobRequest setTemplateVersion(Integer templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Integer getTemplateVersion() {
        return this.templateVersion;
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
         * <p>The branch of the code repository referenced at runtime. This parameter is optional. By default, the branch configured in the code source is used.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Branch")
        public String branch;

        /**
         * <p>The code source ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the code source ID, see <a href="https://help.aliyun.com/document_detail/459922.html">ListCodeSources</a>..</p>
         * 
         * <strong>example:</strong>
         * <p>code-20210111103721-xxxxxxx</p>
         */
        @NameInMap("CodeSourceId")
        public String codeSourceId;

        /**
         * <p>The commit ID of the code to download for this job. This parameter is optional. By default, the commit ID configured in the code source is used.</p>
         * 
         * <strong>example:</strong>
         * <p>44da109b5******</p>
         */
        @NameInMap("Commit")
        public String commit;

        /**
         * <p>The mount path for this job. This parameter is optional. By default, the mount path configured in the code source is used.</p>
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
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The ID of the data source. &lt;props=&quot;china&quot;&gt;For information about how to obtain the data source ID, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>..</p>
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
         * <p>The mount path for this job. This parameter is optional. By default, the mount path configured in the data source is used.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The custom dataset mount properties. Only OSS is supported.</p>
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

        @NameInMap("RoleChain")
        public String roleChain;

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

        public CreateJobRequestDataSources setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
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

        public CreateJobRequestDataSources setRoleChain(String roleChain) {
            this.roleChain = roleChain;
            return this;
        }
        public String getRoleChain() {
            return this.roleChain;
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
         * <p>The default routing. Valid values:</p>
         * <ul>
         * <li>eth0: uses the default network interface controller (NIC) to access external networks through the public gateway.</li>
         * <li>eth1: uses the user elastic network interfaces (ENIs) to access external networks through the private gateway. For the specific configuration method, see <a href="https://help.aliyun.com/document_detail/2525343.html">Configure a DSW instance to access the Internet through a dedicated public gateway</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <p>The extended CIDR blocks.</p>
         * <ul>
         * <li>If the vSwitch ID is empty, this parameter is not required. The system automatically obtains all CIDR blocks under the VPC.</li>
         * <li>If the vSwitch ID is specified, this parameter is required. Specify all CIDR blocks under the VPC.</li>
         * </ul>
         */
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        /**
         * <p>The ID of the user security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-abcdef****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the user vSwitch. This parameter is optional.</p>
         * <ul>
         * <li>If this parameter is left empty, the system automatically selects an appropriate vSwitch based on inventory.</li>
         * <li>You can also specify a vSwitch ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vs-abcdef****</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>The ID of the user VPC.</p>
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
