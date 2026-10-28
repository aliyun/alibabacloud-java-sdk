// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>The visibility of the job. Valid values:</p>
     * <ul>
     * <li>PUBLIC: Visible to all users in the workspace.</li>
     * <li>PRIVATE: Visible only to you and administrators in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The code source used by the job. Before the nodes of the job start, DLC automatically downloads the code configured in the code source and mounts it to a local directory in the container.</p>
     */
    @NameInMap("CodeSource")
    public CreateJobRequestCodeSource codeSource;

    /**
     * <p>The access credential configuration.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The list of custom environment variables.</p>
     */
    @NameInMap("CustomEnvs")
    public java.util.List<CreateJobRequestCustomEnvs> customEnvs;

    /**
     * <p>The list of data sources used to run the job.</p>
     */
    @NameInMap("DataSources")
    public java.util.List<CreateJobRequestDataSources> dataSources;

    /**
     * <p>This parameter is not supported. You can ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("DebuggerConfigContent")
    public String debuggerConfigContent;

    /**
     * <p>The description of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a training job</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the job. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name can be up to 256 characters in length.</li>
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
     * <p>Specifies whether to enable the dry run mode.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is not supported. You can ignore it.</p>
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
     * <p><strong>JobSpecs</strong> describes various configurations when the job runs, such as the image address, startup command, node resource declaration, and number of replicas.</p>
     * <p>A DLC job consists of different types of nodes. Nodes of the same type have identical configurations, which are called a JobSpec. <strong>JobSpecs</strong> describes the configurations of all types of nodes and is an array of JobSpecs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobSpecs")
    public java.util.List<JobSpec> jobSpecs;

    /**
     * <p>The type of the job. This parameter is case-sensitive. Valid values:</p>
     * <ul>
     * <li>TFJob</li>
     * <li>PyTorchJob</li>
     * <li>MPIJob</li>
     * <li>XGBoostJob</li>
     * <li>OneFlowJob</li>
     * <li>ElasticBatchJob</li>
     * <li>SlurmJob</li>
     * <li>RayJob</li>
     * <li>DataJuicerJob</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TFJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The additional configurations for the job. You can use this parameter to adjust the behavior of mounted data sources. For example, if the node has an OSS data source mounted, you can set this parameter to <code>fs.oss.download.thread.concurrency=4,fs.oss.download.queue.size=16</code> to overwrite the default parameter settings of JindoFS.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1,key2=value2</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The priority of the job. This parameter is optional. Default value: 1. Valid values: 1 to 9.</p>
     * <ul>
     * <li>1: The lowest priority.</li>
     * <li>9: The highest priority.</li>
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
     * <li>If this parameter is left empty, the job is submitted to a public resource group.</li>
     * <li>If you attach a resource quota to the current workspace, you can specify the corresponding resource quota ID here. For details about how to query the resource quota ID, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quotas</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rs-xxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The scheduling strategy.</p>
     * 
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
     * <p>The success policy for distributed multi-node jobs. Currently, only multi-node TensorFlow jobs are supported. Valid values:</p>
     * <ul>
     * <li>ChiefWorker: If this value is specified, the entire job is considered successful as long as the chief pod ends successfully.</li>
     * <li>AllWorkers: This is the default value. The entire job is considered successful only when all worker pods end successfully.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AllWorkers</p>
     */
    @NameInMap("SuccessPolicy")
    public String successPolicy;

    /**
     * <p>The ID of the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>tplabc1234567</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The version of the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateVersion")
    public Integer templateVersion;

    /**
     * <p>The name of the folder where the Python third-party library (requirements.txt) file is located. Before each node runs the specified user command, PAI-DLC retrieves the requirements.txt file from the specified folder and runs the <code>pip install -r</code> command to install the libraries.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/code/</p>
     */
    @NameInMap("ThirdpartyLibDir")
    public String thirdpartyLibDir;

    /**
     * <p>The list of Python third-party libraries to be installed.</p>
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
     * <p>The workspace ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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

    public CreateJobRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
         * <p>The branch of the code repository referenced when the job runs. This parameter is optional. By default, the branch configured in the code source is used.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Branch")
        public String branch;

        /**
         * <p>The ID of the code source. &lt;props=&quot;china&quot;&gt;For more information about how to obtain the code source ID, see <a href="https://help.aliyun.com/document_detail/459922.html">ListCodeSources</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>code-20210111103721-xxxxxxx</p>
         */
        @NameInMap("CodeSourceId")
        public String codeSourceId;

        /**
         * <p>The commit ID of the code to be downloaded for the job. This parameter is optional. By default, the commit ID configured in the code source is used.</p>
         * 
         * <strong>example:</strong>
         * <p>44da109b5******</p>
         */
        @NameInMap("Commit")
        public String commit;

        /**
         * <p>Specifies whether the mount path configured for access code source is a shared cloud storage path. If this parameter is set to true, the system enables code clone optimization. In a multi-node job scenario, the clone operation is performed on only one node, and other nodes can directly access access code through the shared cloud storage path.</p>
         */
        @NameInMap("IsSharedMountPath")
        public Boolean isSharedMountPath;

        /**
         * <p>The path to be mounted for the job. This parameter is optional. By default, the mount path configured in the code source is used.</p>
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

        public CreateJobRequestCodeSource setIsSharedMountPath(Boolean isSharedMountPath) {
            this.isSharedMountPath = isSharedMountPath;
            return this;
        }
        public Boolean getIsSharedMountPath() {
            return this.isSharedMountPath;
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
        /**
         * <p>The name of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>PUB</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>keep</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The visibility of the environment variable. A value of public indicates that the variable is public, and a value of private indicates that the variable is private.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
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
         * <p>The ID of the access point. Currently, only access points of AI CPFS are supported.</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The ID of the data source. &lt;props=&quot;china&quot;&gt;For more information about how to view the data source ID, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cn9dl*******</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The version of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("DataSourceVersion")
        public String dataSourceVersion;

        /**
         * <p>Specifies whether to enable the cache service for the data source. This parameter takes effect only when the cluster supports the cache service and a resource group is configured.</p>
         */
        @NameInMap("EnableCache")
        public Boolean enableCache;

        /**
         * <p>The permissions when the dataset is mounted. Valid values:</p>
         * <ul>
         * <li>RO: Read-only mount.</li>
         * <li>RW: Read/write mount.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RO</p>
         */
        @NameInMap("MountAccess")
        public String mountAccess;

        /**
         * <p>The path to be mounted for the job. This parameter is optional. By default, the mount path configured in the data source is used.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount property of the custom dataset. Currently, only OSS is supported.</p>
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
         * <p>The ARN of the data source role. This parameter is required when OSS and CPFS access point authentication are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1872xxxxxxxxx:role/account-pai-prod</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The role chain, which is a JSON-formatted string. Example: [{&quot;roleType&quot;:&quot;service&quot;,&quot;roleArn&quot;:&quot;acs:ram::cloud_product_resource_account_uid:role/xxxtodlcrole&quot;,&quot;assumeRoleFor&quot;:&quot;cloud_product_resource_account_uid&quot;},{&quot;roleType&quot;:&quot;user&quot;,&quot;roleArn&quot;:&quot;acs:ram::cloud_product_service_account_uid:role/roletoassumecustomerrole&quot;},{&quot;roleType&quot;:&quot;service&quot;,&quot;roleArn&quot;:&quot;acs:ram::end_user_uid:role/use-bmcpfs-access-ap-role&quot;,&quot;assumeRoleFor&quot;:&quot;end_user_uid&quot;}].</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;roleType&quot;:&quot;service&quot;,&quot;roleArn&quot;:&quot;acs:ram::cloud_product_resource_account_uid:role/xxxtodlcrole&quot;,&quot;assumeRoleFor&quot;:&quot;cloud_product_resource_account_uid&quot;},{&quot;roleType&quot;:&quot;user&quot;,&quot;roleArn&quot;:&quot;acs:ram::cloud_product_service_account_uid:role/roletoassumecustomerrole&quot;},{&quot;roleType&quot;:&quot;service&quot;,&quot;roleArn&quot;:&quot;acs:ram::end_user_uid:role/use-bmcpfs-access-ap-role&quot;,&quot;assumeRoleFor&quot;:&quot;end_user_uid&quot;}]</p>
         */
        @NameInMap("RoleChain")
        public String roleChain;

        /**
         * <p>The path of the data source.</p>
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

        public CreateJobRequestDataSources setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
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
         * <li>eth0: Uses the default network interface controller (NIC) to access external networks through the public gateway.</li>
         * <li>eth1: Uses the user elastic network interfaces (ENIs) to access external networks through the private gateway. For the specific configuration method, see <a href="https://help.aliyun.com/document_detail/2525343.html">Configure a DSW instance to access the Internet through a dedicated public gateway</a>.</li>
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
         * <li>If the vSwitch ID is empty, this parameter is optional. The system automatically retrieves all CIDR blocks in the VPC.</li>
         * <li>If the vSwitch ID is not empty, this parameter is required. Specify all CIDR blocks in the VPC.</li>
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
         * <li>If this parameter is empty, the system automatically selects an appropriate vSwitch based on inventory.</li>
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
