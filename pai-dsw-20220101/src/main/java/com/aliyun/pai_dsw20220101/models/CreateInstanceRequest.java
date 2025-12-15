// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The instance accessibility.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PUBLIC: The instances are accessible to all members in the workspace.</li>
     * <li>PRIVATE: The instances are accessible only to you and the administrator of the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The affinity configuration.</p>
     */
    @NameInMap("Affinity")
    public CreateInstanceRequestAffinity affinity;

    @NameInMap("AssignNodeSpec")
    public CreateInstanceRequestAssignNodeSpec assignNodeSpec;

    /**
     * <p>The cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CloudDisks")
    public java.util.List<CreateInstanceRequestCloudDisks> cloudDisks;

    /**
     * <p>The credential configuration.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The datasets.</p>
     */
    @NameInMap("Datasets")
    public java.util.List<CreateInstanceRequestDatasets> datasets;

    /**
     * <p>The NVIDIA driver configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>535.54.03</p>
     */
    @NameInMap("Driver")
    public String driver;

    /**
     * <p>The dynamic mount configuration.</p>
     */
    @NameInMap("DynamicMount")
    public DynamicMount dynamicMount;

    /**
     * <p>The ECS instance type of the instance. You can call <a href="https://help.aliyun.com/document_detail/470423.html">ListEcsSpecs</a> to obtain the ECS instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <p>The environment variables.</p>
     * 
     * <strong>example:</strong>
     * <p>{userName: &quot;Chris&quot;}</p>
     */
    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The Base64-encoded account and password for the user\&quot;s private image. The password will be hidden.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ImageAuth")
    public String imageAuth;

    /**
     * <p>The image ID. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain the image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>image-05cefd0be2exxxx</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image address. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain the image address.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The instance name. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name can contain only letters, digits, and underscores (_).</li>
     * <li>The name can be up to 27 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>training_data</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The custom labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;foo\&quot;: \&quot;bar\&quot;}</p>
     */
    @NameInMap("Labels")
    public java.util.List<CreateInstanceRequestLabels> labels;

    @NameInMap("MigrationOptions")
    public java.util.Map<String, ?> migrationOptions;

    @NameInMap("OversoldType")
    public String oversoldType;

    /**
     * <p>The priority based on which resources are allocated to instances. Valid values: 1 to 9.</p>
     * <ul>
     * <li>1: the lowest priority.</li>
     * <li>9: the highest priority.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The resource configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;SharedMemory&quot;:&quot;4Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;Tesla-V100-16G&quot;}</p>
     */
    @NameInMap("RequestedResource")
    public CreateInstanceRequestRequestedResource requestedResource;

    /**
     * <p>The ID of the resource group. This parameter is configured during prepayment. For information about how to create a dedicated resource group, see <a href="https://help.aliyun.com/document_detail/202827.html">Create a dedicated resource group and purchase general computing resources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dsw-123456789</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("SpotSpec")
    public CreateInstanceRequestSpotSpec spotSpec;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    @NameInMap("UserCommand")
    public CreateInstanceRequestUserCommand userCommand;

    /**
     * <p>The ID of the instance owner. Valid values: Alibaba Cloud account and RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>161228528250****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The virtual private cloud (VPC) configurations.</p>
     */
    @NameInMap("UserVpc")
    public CreateInstanceRequestUserVpc userVpc;

    /**
     * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40823</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The storage corresponding to the working directory. You can mount disks or datasets to /mnt/workspace at the same time. OSS datasets and dynamically mounted datasets are not supported.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>rootfsCloudDisk: Mount the disk to the working directory.</li>
     * <li>Mount path of the dataset, such as /mnt/data: Datasets in URI format only support this method.</li>
     * <li>Dataset ID, such as d-vsqjvs\<em>\</em>\*\*rp5l206u: If a single dataset is mounted to multiple paths, the first path is selected. We recommend that you do not use this method, use the mount path instead.</li>
     * </ul>
     * <p>If you leave this parameter empty:</p>
     * <ul>
     * <li>If the instance uses cloud disks, cloud disks are selected by default.</li>
     * <li>if no cloud disks are available, the first NAS or CPFS dataset is selected as the working directory.</li>
     * <li>If no cloud disks, and NAS or CPFS datasets are available, the host space is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rootfsCloudDisk</p>
     */
    @NameInMap("WorkspaceSource")
    public String workspaceSource;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateInstanceRequest setAffinity(CreateInstanceRequestAffinity affinity) {
        this.affinity = affinity;
        return this;
    }
    public CreateInstanceRequestAffinity getAffinity() {
        return this.affinity;
    }

    public CreateInstanceRequest setAssignNodeSpec(CreateInstanceRequestAssignNodeSpec assignNodeSpec) {
        this.assignNodeSpec = assignNodeSpec;
        return this;
    }
    public CreateInstanceRequestAssignNodeSpec getAssignNodeSpec() {
        return this.assignNodeSpec;
    }

    public CreateInstanceRequest setCloudDisks(java.util.List<CreateInstanceRequestCloudDisks> cloudDisks) {
        this.cloudDisks = cloudDisks;
        return this;
    }
    public java.util.List<CreateInstanceRequestCloudDisks> getCloudDisks() {
        return this.cloudDisks;
    }

    public CreateInstanceRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateInstanceRequest setDatasets(java.util.List<CreateInstanceRequestDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<CreateInstanceRequestDatasets> getDatasets() {
        return this.datasets;
    }

    public CreateInstanceRequest setDriver(String driver) {
        this.driver = driver;
        return this;
    }
    public String getDriver() {
        return this.driver;
    }

    public CreateInstanceRequest setDynamicMount(DynamicMount dynamicMount) {
        this.dynamicMount = dynamicMount;
        return this;
    }
    public DynamicMount getDynamicMount() {
        return this.dynamicMount;
    }

    public CreateInstanceRequest setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public CreateInstanceRequest setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public CreateInstanceRequest setImageAuth(String imageAuth) {
        this.imageAuth = imageAuth;
        return this;
    }
    public String getImageAuth() {
        return this.imageAuth;
    }

    public CreateInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateInstanceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setLabels(java.util.List<CreateInstanceRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateInstanceRequestLabels> getLabels() {
        return this.labels;
    }

    public CreateInstanceRequest setMigrationOptions(java.util.Map<String, ?> migrationOptions) {
        this.migrationOptions = migrationOptions;
        return this;
    }
    public java.util.Map<String, ?> getMigrationOptions() {
        return this.migrationOptions;
    }

    public CreateInstanceRequest setOversoldType(String oversoldType) {
        this.oversoldType = oversoldType;
        return this;
    }
    public String getOversoldType() {
        return this.oversoldType;
    }

    public CreateInstanceRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public CreateInstanceRequest setRequestedResource(CreateInstanceRequestRequestedResource requestedResource) {
        this.requestedResource = requestedResource;
        return this;
    }
    public CreateInstanceRequestRequestedResource getRequestedResource() {
        return this.requestedResource;
    }

    public CreateInstanceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateInstanceRequest setSpotSpec(CreateInstanceRequestSpotSpec spotSpec) {
        this.spotSpec = spotSpec;
        return this;
    }
    public CreateInstanceRequestSpotSpec getSpotSpec() {
        return this.spotSpec;
    }

    public CreateInstanceRequest setTag(java.util.List<CreateInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateInstanceRequest setUserCommand(CreateInstanceRequestUserCommand userCommand) {
        this.userCommand = userCommand;
        return this;
    }
    public CreateInstanceRequestUserCommand getUserCommand() {
        return this.userCommand;
    }

    public CreateInstanceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateInstanceRequest setUserVpc(CreateInstanceRequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public CreateInstanceRequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public CreateInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateInstanceRequest setWorkspaceSource(String workspaceSource) {
        this.workspaceSource = workspaceSource;
        return this;
    }
    public String getWorkspaceSource() {
        return this.workspaceSource;
    }

    public static class CreateInstanceRequestAffinityCPU extends TeaModel {
        /**
         * <p>Specifies whether to enable the CPU affinity feature.</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static CreateInstanceRequestAffinityCPU build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestAffinityCPU self = new CreateInstanceRequestAffinityCPU();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestAffinityCPU setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class CreateInstanceRequestAffinity extends TeaModel {
        /**
         * <p>The CPU affinity configuration. Only subscription instances that use general-purpose computing resources support CPU affinity configuration.</p>
         */
        @NameInMap("CPU")
        public CreateInstanceRequestAffinityCPU CPU;

        public static CreateInstanceRequestAffinity build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestAffinity self = new CreateInstanceRequestAffinity();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestAffinity setCPU(CreateInstanceRequestAffinityCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public CreateInstanceRequestAffinityCPU getCPU() {
            return this.CPU;
        }

    }

    public static class CreateInstanceRequestAssignNodeSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>node-b</p>
         */
        @NameInMap("AntiAffinityNodeNames")
        public String antiAffinityNodeNames;

        /**
         * <strong>example:</strong>
         * <p>node-a</p>
         */
        @NameInMap("NodeNames")
        public String nodeNames;

        public static CreateInstanceRequestAssignNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestAssignNodeSpec self = new CreateInstanceRequestAssignNodeSpec();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestAssignNodeSpec setAntiAffinityNodeNames(String antiAffinityNodeNames) {
            this.antiAffinityNodeNames = antiAffinityNodeNames;
            return this;
        }
        public String getAntiAffinityNodeNames() {
            return this.antiAffinityNodeNames;
        }

        public CreateInstanceRequestAssignNodeSpec setNodeNames(String nodeNames) {
            this.nodeNames = nodeNames;
            return this;
        }
        public String getNodeNames() {
            return this.nodeNames;
        }

    }

    public static class CreateInstanceRequestCloudDisksStatus extends TeaModel {
        /**
         * <p>The available capacity. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>31841058816</p>
         */
        @NameInMap("Available")
        public Long available;

        /**
         * <p>The capacity. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>32212254720</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The used capacity. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>371195904</p>
         */
        @NameInMap("Usage")
        public Long usage;

        public static CreateInstanceRequestCloudDisksStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestCloudDisksStatus self = new CreateInstanceRequestCloudDisksStatus();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestCloudDisksStatus setAvailable(Long available) {
            this.available = available;
            return this;
        }
        public Long getAvailable() {
            return this.available;
        }

        public CreateInstanceRequestCloudDisksStatus setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public CreateInstanceRequestCloudDisksStatus setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

    public static class CreateInstanceRequestCloudDisks extends TeaModel {
        /**
         * <p>If <strong>Resource Type</strong> is <strong>Public Resource</strong> or if <strong>Resource Quota</strong> is subscription-based general-purpose computing resources (CPU cores ≥ 2 and memory ≥ 4 GB, or configured with GPU):</p>
         * <p>Each instance has a free system disk of 100 GiB for persistent storage. <strong>If the DSW instance is stopped and not launched for more than 15 days, the disk is cleared</strong>. The disk can be expanded. For specific pricing, refer to the console.</p>
         * <p>**</p>
         * <p><strong>Warning</strong></p>
         * <ul>
         * <li><p>After the expansion, you cannot reduce the storage space. Proceed with caution.</p>
         * </li>
         * <li><p>After the expansion, the disk is not cleared if the instance is stopped for more than 15 days. However, it will continue to incur fees.</p>
         * </li>
         * <li><p>If you delete the instance, the system disk is also released and the data stored in the disk is deleted. Make sure that you have backed up your data before you delete the instance.</p>
         * </li>
         * </ul>
         * <p>If you need persistent storage, you can <strong>mount a dataset</strong> or add the OSS, NAS, or CPFS path to the <strong>storage path</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100Gi</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <p>The mount path of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/systemDisk</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The subpath of the cloud disk that is mounted to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The disk or snapshot usage.</p>
         */
        @NameInMap("Status")
        public CreateInstanceRequestCloudDisksStatus status;

        /**
         * <p>The cloud disk type.</p>
         * <ul>
         * <li>rootfs: Mounts the disk as a system disk. The system environment is stored on the disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rootfs</p>
         */
        @NameInMap("SubType")
        public String subType;

        public static CreateInstanceRequestCloudDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestCloudDisks self = new CreateInstanceRequestCloudDisks();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestCloudDisks setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public CreateInstanceRequestCloudDisks setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateInstanceRequestCloudDisks setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateInstanceRequestCloudDisks setStatus(CreateInstanceRequestCloudDisksStatus status) {
            this.status = status;
            return this;
        }
        public CreateInstanceRequestCloudDisksStatus getStatus() {
            return this.status;
        }

        public CreateInstanceRequestCloudDisks setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

    }

    public static class CreateInstanceRequestDatasets extends TeaModel {
        /**
         * <p>The dataset ID. If the dataset is read-only, you cannot change the dataset permission from read-only to read and write by using MountAccess.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a> to obtain the dataset ID. If you configure the dataset ID, you cannot configure the dataset URI.</p>
         * 
         * <strong>example:</strong>
         * <p>d-vsqjvsjp4orp5l206u</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The dataset version. You must also configure DatasetId. If you leave this parameter empty, the value v1 is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("DatasetVersion")
        public String datasetVersion;

        /**
         * <p>Specifies whether to enable dynamic mounting. Default value: false.</p>
         * <ul>
         * <li>Currently, only instances using general-purpose computing resources are supported.</li>
         * <li>Currently, only OSS datasets are supported. The mounted datasets are read-only.</li>
         * <li>The mount path of the dynamically mounted dataset must be a subpath of the root path. Example: /mnt/dynamic/data1/</li>
         * <li>A dynamically mounted dataset must be after non-dynamic datasets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Dynamic")
        public Boolean dynamic;

        /**
         * <p>The read and write permissions of the dataset. If the dataset is read-only, it cannot be changed to read and write.</p>
         * 
         * <strong>example:</strong>
         * <p>RW</p>
         */
        @NameInMap("MountAccess")
        public String mountAccess;

        /**
         * <p>The mount path of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount type. You cannot specify Options at the same time. This is deprecated, and you can use Options instead.</p>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("OptionType")
        @Deprecated
        public String optionType;

        /**
         * <p>The custom dataset mount options. Only OSS is supported. You cannot specify OptionType at the same time. For more information, see <a href="https://www.alibabacloud.com/help/en/pai/user-guide/read-and-write-dataset-data">DSW mount configurations</a>.</p>
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
         * <p>The URI of the storage service directory, which can be directly mounted. This parameter is mutually exclusive with DatasetId.</p>
         * <p>URI formats of different types of storage:</p>
         * <ul>
         * <li>OSS: oss://bucket-name.oss-cn-shanghai-internal.aliyuncs.com/data/path/</li>
         * <li>NAS: nas://29\<em>\<em>d-b12\</em>\</em>\*\*446.cn-hangzhou.nas.aliyuncs.com/data/path/</li>
         * <li>Extreme NAS: nas://29\<em>\</em>\*\<em>123-y\</em>\*r.cn-hangzhou.extreme.nas.aliyuncs.com/data/path/</li>
         * <li>CPFS: cpfs://cpfs-213\<em>\</em>\<em>\<em>87.cn-wulanchabu/ptc-292\</em>\</em>\<em>\</em>\<em>cbb/exp-290\</em>\<em>\</em>\<em>\</em>\<em>\</em>\*03e/data/path/</li>
         * <li>Lingjun CPFS: bmcpfs://cpfs-290\<em>\</em>\<em>\</em>\<em>\<em>foflh-vpc-x\</em>\</em>\*\*8r.cn-wulanchabu.cpfs.aliyuncs.com/data/path/</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket-name.oss-cn-shanghai-internal.aliyuncs.com/data/path/</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static CreateInstanceRequestDatasets build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestDatasets self = new CreateInstanceRequestDatasets();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public CreateInstanceRequestDatasets setDatasetVersion(String datasetVersion) {
            this.datasetVersion = datasetVersion;
            return this;
        }
        public String getDatasetVersion() {
            return this.datasetVersion;
        }

        public CreateInstanceRequestDatasets setDynamic(Boolean dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Boolean getDynamic() {
            return this.dynamic;
        }

        public CreateInstanceRequestDatasets setMountAccess(String mountAccess) {
            this.mountAccess = mountAccess;
            return this;
        }
        public String getMountAccess() {
            return this.mountAccess;
        }

        public CreateInstanceRequestDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        @Deprecated
        public CreateInstanceRequestDatasets setOptionType(String optionType) {
            this.optionType = optionType;
            return this;
        }
        public String getOptionType() {
            return this.optionType;
        }

        public CreateInstanceRequestDatasets setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public CreateInstanceRequestDatasets setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class CreateInstanceRequestLabels extends TeaModel {
        /**
         * <p>The custom label key.</p>
         * 
         * <strong>example:</strong>
         * <p>stsTokenOwner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The custom label value.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxxxxxxx</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestLabels self = new CreateInstanceRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateInstanceRequestRequestedResource extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <p>The GPU memory type. Valid values:</p>
         * <ul>
         * <li>V100</li>
         * <li>A100</li>
         * <li>T4</li>
         * <li>A10</li>
         * <li>P100</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>v100</p>
         */
        @NameInMap("GPUType")
        public String GPUType;

        /**
         * <p>The memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The size of the shared memory. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("SharedMemory")
        public String sharedMemory;

        public static CreateInstanceRequestRequestedResource build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestRequestedResource self = new CreateInstanceRequestRequestedResource();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestRequestedResource setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public CreateInstanceRequestRequestedResource setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public CreateInstanceRequestRequestedResource setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public CreateInstanceRequestRequestedResource setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public CreateInstanceRequestRequestedResource setSharedMemory(String sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public String getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class CreateInstanceRequestSpotSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("SpotDiscountLimit")
        public String spotDiscountLimit;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpotDuration")
        public String spotDuration;

        /**
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("SpotPriceLimit")
        public String spotPriceLimit;

        /**
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        public static CreateInstanceRequestSpotSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestSpotSpec self = new CreateInstanceRequestSpotSpec();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestSpotSpec setSpotDiscountLimit(String spotDiscountLimit) {
            this.spotDiscountLimit = spotDiscountLimit;
            return this;
        }
        public String getSpotDiscountLimit() {
            return this.spotDiscountLimit;
        }

        public CreateInstanceRequestSpotSpec setSpotDuration(String spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public String getSpotDuration() {
            return this.spotDuration;
        }

        public CreateInstanceRequestSpotSpec setSpotPriceLimit(String spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public String getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public CreateInstanceRequestSpotSpec setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

    public static class CreateInstanceRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTag self = new CreateInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateInstanceRequestUserCommandOnStart extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static CreateInstanceRequestUserCommandOnStart build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestUserCommandOnStart self = new CreateInstanceRequestUserCommandOnStart();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestUserCommandOnStart setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateInstanceRequestUserCommand extends TeaModel {
        @NameInMap("OnStart")
        public CreateInstanceRequestUserCommandOnStart onStart;

        public static CreateInstanceRequestUserCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestUserCommand self = new CreateInstanceRequestUserCommand();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestUserCommand setOnStart(CreateInstanceRequestUserCommandOnStart onStart) {
            this.onStart = onStart;
            return this;
        }
        public CreateInstanceRequestUserCommandOnStart getOnStart() {
            return this.onStart;
        }

    }

    public static class CreateInstanceRequestUserVpc extends TeaModel {
        @NameInMap("BandwidthLimit")
        public BandwidthLimit bandwidthLimit;

        /**
         * <p>The default route. Valid values:</p>
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
         * <p>The extended CIDR blocks.</p>
         * <ul>
         * <li>If you leave the SwitchId and ExtendedCIDRs parameters empty, the system automatically obtains all CIDR blocks in a VPC.</li>
         * <li>If you configure the SwitchId and ExtendedCIDRs parameters, we recommend that you specify all CIDR blocks in a VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;192.168.0.1/24&quot;, &quot;192.168.1.1/24&quot;]</p>
         */
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        /**
         * <p>The forward information.</p>
         */
        @NameInMap("ForwardInfos")
        public java.util.List<ForwardInfo> forwardInfos;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxxxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateInstanceRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestUserVpc self = new CreateInstanceRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestUserVpc setBandwidthLimit(BandwidthLimit bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }
        public BandwidthLimit getBandwidthLimit() {
            return this.bandwidthLimit;
        }

        public CreateInstanceRequestUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public CreateInstanceRequestUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        public CreateInstanceRequestUserVpc setForwardInfos(java.util.List<ForwardInfo> forwardInfos) {
            this.forwardInfos = forwardInfos;
            return this;
        }
        public java.util.List<ForwardInfo> getForwardInfos() {
            return this.forwardInfos;
        }

        public CreateInstanceRequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateInstanceRequestUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateInstanceRequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
