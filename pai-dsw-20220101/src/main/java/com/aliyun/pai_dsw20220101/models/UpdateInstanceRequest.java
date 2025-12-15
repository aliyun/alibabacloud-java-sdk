// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The visibility of the instance.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PUBLIC: Accessible to all members in the workspace.</li>
     * <li>PRIVATE: Accessible only to you and the administrator of the workspace.</li>
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
    public UpdateInstanceRequestAffinity affinity;

    @NameInMap("AssignNodeSpec")
    public UpdateInstanceRequestAssignNodeSpec assignNodeSpec;

    /**
     * <p>The cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CloudDisks")
    public java.util.List<UpdateInstanceRequestCloudDisks> cloudDisks;

    /**
     * <p>The credential configuration.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The datasets.</p>
     */
    @NameInMap("Datasets")
    public java.util.List<UpdateInstanceRequestDatasets> datasets;

    @NameInMap("DisassociateAssignNode")
    public Boolean disassociateAssignNode;

    /**
     * <p>Specifies whether to delete the credential injection information.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisassociateCredential")
    public Boolean disassociateCredential;

    /**
     * <p>Specifies whether to delete the associated datasets.</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisassociateDatasets")
    public Boolean disassociateDatasets;

    /**
     * <p>Specifies whether to delete the NVIDIA driver configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisassociateDriver")
    public Boolean disassociateDriver;

    @NameInMap("DisassociateEnvironmentVariables")
    public Boolean disassociateEnvironmentVariables;

    /**
     * <p>Specifies whether to delete the associated forward information.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisassociateForwardInfos")
    public Boolean disassociateForwardInfos;

    @NameInMap("DisassociateMigrationOptions")
    public Boolean disassociateMigrationOptions;

    @NameInMap("DisassociateSpot")
    public Boolean disassociateSpot;

    @NameInMap("DisassociateUserCommand")
    public Boolean disassociateUserCommand;

    /**
     * <p>Specifies whether to delete the associated user VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisassociateVpc")
    public Boolean disassociateVpc;

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

    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, ?> environmentVariables;

    /**
     * <p>The Base64-encoded account and password for the user‘s private image. The password will be hidden.</p>
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
     * <p>The instance name. Format requirements:</p>
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

    @NameInMap("MigrationOptions")
    public java.util.Map<String, ?> migrationOptions;

    @NameInMap("OversoldType")
    public String oversoldType;

    /**
     * <p>The priority based on which resources are allocated to instances. Valid values: 1 to 9.</p>
     * <ul>
     * <li>1: the lowest priority.</li>
     * <li>9 is the highest priority.</li>
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
    public UpdateInstanceRequestRequestedResource requestedResource;

    @NameInMap("SpotSpec")
    public UpdateInstanceRequestSpotSpec spotSpec;

    @NameInMap("StartInstance")
    public Boolean startInstance;

    @NameInMap("UserCommand")
    public UpdateInstanceRequestUserCommand userCommand;

    /**
     * <p>the User ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>16122**********</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The virtual private cloud (VPC) configurations.</p>
     */
    @NameInMap("UserVpc")
    public UpdateInstanceRequestUserVpc userVpc;

    /**
     * <p>Specifies the storage corresponding to the working directory. You can mount disks or datasets to /mnt/workspace at the same time. OSS datasets and dynamically mounted datasets are not supported.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>rootfsCloudDisk: Mount disk to the working directory.</li>
     * <li>Mount path of the dataset, such as /mnt/data: Datasets in URI format only support this method.</li>
     * <li>Dataset ID, such as d-vsqjvs\<em>\</em>\*\*rp5l206u: If a single dataset is mounted to multiple paths, the first path is selected. We recommend that you do not use this method, use the mount path instead.</li>
     * </ul>
     * <p>If you leave this parameter empty:</p>
     * <ul>
     * <li>If the instance uses cloud disks, cloud disks are selected by default.</li>
     * <li>if no disks are available, the first NAS or CPFS dataset is selected as the working directory.</li>
     * <li>If no disk, NAS, or CPFS datasets is available, the host space is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/mnt/data</p>
     */
    @NameInMap("WorkspaceSource")
    public String workspaceSource;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateInstanceRequest setAffinity(UpdateInstanceRequestAffinity affinity) {
        this.affinity = affinity;
        return this;
    }
    public UpdateInstanceRequestAffinity getAffinity() {
        return this.affinity;
    }

    public UpdateInstanceRequest setAssignNodeSpec(UpdateInstanceRequestAssignNodeSpec assignNodeSpec) {
        this.assignNodeSpec = assignNodeSpec;
        return this;
    }
    public UpdateInstanceRequestAssignNodeSpec getAssignNodeSpec() {
        return this.assignNodeSpec;
    }

    public UpdateInstanceRequest setCloudDisks(java.util.List<UpdateInstanceRequestCloudDisks> cloudDisks) {
        this.cloudDisks = cloudDisks;
        return this;
    }
    public java.util.List<UpdateInstanceRequestCloudDisks> getCloudDisks() {
        return this.cloudDisks;
    }

    public UpdateInstanceRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public UpdateInstanceRequest setDatasets(java.util.List<UpdateInstanceRequestDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<UpdateInstanceRequestDatasets> getDatasets() {
        return this.datasets;
    }

    public UpdateInstanceRequest setDisassociateAssignNode(Boolean disassociateAssignNode) {
        this.disassociateAssignNode = disassociateAssignNode;
        return this;
    }
    public Boolean getDisassociateAssignNode() {
        return this.disassociateAssignNode;
    }

    public UpdateInstanceRequest setDisassociateCredential(Boolean disassociateCredential) {
        this.disassociateCredential = disassociateCredential;
        return this;
    }
    public Boolean getDisassociateCredential() {
        return this.disassociateCredential;
    }

    public UpdateInstanceRequest setDisassociateDatasets(Boolean disassociateDatasets) {
        this.disassociateDatasets = disassociateDatasets;
        return this;
    }
    public Boolean getDisassociateDatasets() {
        return this.disassociateDatasets;
    }

    public UpdateInstanceRequest setDisassociateDriver(Boolean disassociateDriver) {
        this.disassociateDriver = disassociateDriver;
        return this;
    }
    public Boolean getDisassociateDriver() {
        return this.disassociateDriver;
    }

    public UpdateInstanceRequest setDisassociateEnvironmentVariables(Boolean disassociateEnvironmentVariables) {
        this.disassociateEnvironmentVariables = disassociateEnvironmentVariables;
        return this;
    }
    public Boolean getDisassociateEnvironmentVariables() {
        return this.disassociateEnvironmentVariables;
    }

    public UpdateInstanceRequest setDisassociateForwardInfos(Boolean disassociateForwardInfos) {
        this.disassociateForwardInfos = disassociateForwardInfos;
        return this;
    }
    public Boolean getDisassociateForwardInfos() {
        return this.disassociateForwardInfos;
    }

    public UpdateInstanceRequest setDisassociateMigrationOptions(Boolean disassociateMigrationOptions) {
        this.disassociateMigrationOptions = disassociateMigrationOptions;
        return this;
    }
    public Boolean getDisassociateMigrationOptions() {
        return this.disassociateMigrationOptions;
    }

    public UpdateInstanceRequest setDisassociateSpot(Boolean disassociateSpot) {
        this.disassociateSpot = disassociateSpot;
        return this;
    }
    public Boolean getDisassociateSpot() {
        return this.disassociateSpot;
    }

    public UpdateInstanceRequest setDisassociateUserCommand(Boolean disassociateUserCommand) {
        this.disassociateUserCommand = disassociateUserCommand;
        return this;
    }
    public Boolean getDisassociateUserCommand() {
        return this.disassociateUserCommand;
    }

    public UpdateInstanceRequest setDisassociateVpc(Boolean disassociateVpc) {
        this.disassociateVpc = disassociateVpc;
        return this;
    }
    public Boolean getDisassociateVpc() {
        return this.disassociateVpc;
    }

    public UpdateInstanceRequest setDriver(String driver) {
        this.driver = driver;
        return this;
    }
    public String getDriver() {
        return this.driver;
    }

    public UpdateInstanceRequest setDynamicMount(DynamicMount dynamicMount) {
        this.dynamicMount = dynamicMount;
        return this;
    }
    public DynamicMount getDynamicMount() {
        return this.dynamicMount;
    }

    public UpdateInstanceRequest setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public UpdateInstanceRequest setEnvironmentVariables(java.util.Map<String, ?> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, ?> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public UpdateInstanceRequest setImageAuth(String imageAuth) {
        this.imageAuth = imageAuth;
        return this;
    }
    public String getImageAuth() {
        return this.imageAuth;
    }

    public UpdateInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateInstanceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public UpdateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateInstanceRequest setMigrationOptions(java.util.Map<String, ?> migrationOptions) {
        this.migrationOptions = migrationOptions;
        return this;
    }
    public java.util.Map<String, ?> getMigrationOptions() {
        return this.migrationOptions;
    }

    public UpdateInstanceRequest setOversoldType(String oversoldType) {
        this.oversoldType = oversoldType;
        return this;
    }
    public String getOversoldType() {
        return this.oversoldType;
    }

    public UpdateInstanceRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public UpdateInstanceRequest setRequestedResource(UpdateInstanceRequestRequestedResource requestedResource) {
        this.requestedResource = requestedResource;
        return this;
    }
    public UpdateInstanceRequestRequestedResource getRequestedResource() {
        return this.requestedResource;
    }

    public UpdateInstanceRequest setSpotSpec(UpdateInstanceRequestSpotSpec spotSpec) {
        this.spotSpec = spotSpec;
        return this;
    }
    public UpdateInstanceRequestSpotSpec getSpotSpec() {
        return this.spotSpec;
    }

    public UpdateInstanceRequest setStartInstance(Boolean startInstance) {
        this.startInstance = startInstance;
        return this;
    }
    public Boolean getStartInstance() {
        return this.startInstance;
    }

    public UpdateInstanceRequest setUserCommand(UpdateInstanceRequestUserCommand userCommand) {
        this.userCommand = userCommand;
        return this;
    }
    public UpdateInstanceRequestUserCommand getUserCommand() {
        return this.userCommand;
    }

    public UpdateInstanceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateInstanceRequest setUserVpc(UpdateInstanceRequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UpdateInstanceRequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public UpdateInstanceRequest setWorkspaceSource(String workspaceSource) {
        this.workspaceSource = workspaceSource;
        return this;
    }
    public String getWorkspaceSource() {
        return this.workspaceSource;
    }

    public static class UpdateInstanceRequestAffinityCPU extends TeaModel {
        /**
         * <p>Specifies whether CPU affinity is enabled.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static UpdateInstanceRequestAffinityCPU build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestAffinityCPU self = new UpdateInstanceRequestAffinityCPU();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestAffinityCPU setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class UpdateInstanceRequestAffinity extends TeaModel {
        /**
         * <p>The CPU affinity configuration. Only subscription instances that use general-purpose computing resources support CPU affinity configuration.</p>
         */
        @NameInMap("CPU")
        public UpdateInstanceRequestAffinityCPU CPU;

        public static UpdateInstanceRequestAffinity build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestAffinity self = new UpdateInstanceRequestAffinity();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestAffinity setCPU(UpdateInstanceRequestAffinityCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public UpdateInstanceRequestAffinityCPU getCPU() {
            return this.CPU;
        }

    }

    public static class UpdateInstanceRequestAssignNodeSpec extends TeaModel {
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

        public static UpdateInstanceRequestAssignNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestAssignNodeSpec self = new UpdateInstanceRequestAssignNodeSpec();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestAssignNodeSpec setAntiAffinityNodeNames(String antiAffinityNodeNames) {
            this.antiAffinityNodeNames = antiAffinityNodeNames;
            return this;
        }
        public String getAntiAffinityNodeNames() {
            return this.antiAffinityNodeNames;
        }

        public UpdateInstanceRequestAssignNodeSpec setNodeNames(String nodeNames) {
            this.nodeNames = nodeNames;
            return this;
        }
        public String getNodeNames() {
            return this.nodeNames;
        }

    }

    public static class UpdateInstanceRequestCloudDisks extends TeaModel {
        /**
         * <p>If <strong>Resource Type</strong> is <strong>Public Resource</strong> or if <strong>Resource Quota</strong> is subscription-based general-purpose computing resources (CPU cores ≥ 2 and memory ≥ 4 GB, or configured with GPU):</p>
         * <p>Each instance has a free system disk quota of 100 GiB for persistent storage. <strong>If the DSW instance is stopped and not launched for more than 15 days, the disk is cleared</strong>. The disk can be expanded. For specific pricing, refer to the console.</p>
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
         * <p>Disk type:</p>
         * <ul>
         * <li>rootfs: Mounts the disk as a system disk. The system environment is stored on the disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rootfs</p>
         */
        @NameInMap("SubType")
        public String subType;

        public static UpdateInstanceRequestCloudDisks build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestCloudDisks self = new UpdateInstanceRequestCloudDisks();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestCloudDisks setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public UpdateInstanceRequestCloudDisks setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

    }

    public static class UpdateInstanceRequestDatasets extends TeaModel {
        /**
         * <p>The dataset ID. If the dataset is read-only, you cannot change the dataset pemission from read-only to read and write by using MountAccess.</p>
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
         * <p>Specifies whether dynamic mounting is enabled. Default value: false.</p>
         * <ul>
         * <li>Currently, only instances using general-purpose computing resources are supported.</li>
         * <li>Currently, only OSS datasets are supported. The mounted datasets are read-only.</li>
         * <li>The MountPath of the dynamically mounted dataset must be a subpath of the root path. Example: /mnt/dynamic/data1/</li>
         * <li>A dynamically mounted dataset must be after non-dynamic datasets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The mount type. You cannot specify Options at the same time. This is deprecated, you can use Options instead.</p>
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

        public static UpdateInstanceRequestDatasets build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestDatasets self = new UpdateInstanceRequestDatasets();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public UpdateInstanceRequestDatasets setDatasetVersion(String datasetVersion) {
            this.datasetVersion = datasetVersion;
            return this;
        }
        public String getDatasetVersion() {
            return this.datasetVersion;
        }

        public UpdateInstanceRequestDatasets setDynamic(Boolean dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Boolean getDynamic() {
            return this.dynamic;
        }

        public UpdateInstanceRequestDatasets setMountAccess(String mountAccess) {
            this.mountAccess = mountAccess;
            return this;
        }
        public String getMountAccess() {
            return this.mountAccess;
        }

        public UpdateInstanceRequestDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        @Deprecated
        public UpdateInstanceRequestDatasets setOptionType(String optionType) {
            this.optionType = optionType;
            return this;
        }
        public String getOptionType() {
            return this.optionType;
        }

        public UpdateInstanceRequestDatasets setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public UpdateInstanceRequestDatasets setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class UpdateInstanceRequestRequestedResource extends TeaModel {
        /**
         * <p>The number of vCPU cores.</p>
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
         * <p>The GPU type.</p>
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
         * <p>The shared memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("SharedMemory")
        public String sharedMemory;

        public static UpdateInstanceRequestRequestedResource build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestRequestedResource self = new UpdateInstanceRequestRequestedResource();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestRequestedResource setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public UpdateInstanceRequestRequestedResource setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public UpdateInstanceRequestRequestedResource setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public UpdateInstanceRequestRequestedResource setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public UpdateInstanceRequestRequestedResource setSharedMemory(String sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public String getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class UpdateInstanceRequestSpotSpec extends TeaModel {
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

        public static UpdateInstanceRequestSpotSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestSpotSpec self = new UpdateInstanceRequestSpotSpec();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestSpotSpec setSpotDiscountLimit(String spotDiscountLimit) {
            this.spotDiscountLimit = spotDiscountLimit;
            return this;
        }
        public String getSpotDiscountLimit() {
            return this.spotDiscountLimit;
        }

        public UpdateInstanceRequestSpotSpec setSpotDuration(String spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public String getSpotDuration() {
            return this.spotDuration;
        }

        public UpdateInstanceRequestSpotSpec setSpotPriceLimit(String spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public String getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public UpdateInstanceRequestSpotSpec setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

    public static class UpdateInstanceRequestUserCommandOnStart extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static UpdateInstanceRequestUserCommandOnStart build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestUserCommandOnStart self = new UpdateInstanceRequestUserCommandOnStart();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestUserCommandOnStart setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateInstanceRequestUserCommand extends TeaModel {
        @NameInMap("OnStart")
        public UpdateInstanceRequestUserCommandOnStart onStart;

        public static UpdateInstanceRequestUserCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestUserCommand self = new UpdateInstanceRequestUserCommand();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestUserCommand setOnStart(UpdateInstanceRequestUserCommandOnStart onStart) {
            this.onStart = onStart;
            return this;
        }
        public UpdateInstanceRequestUserCommandOnStart getOnStart() {
            return this.onStart;
        }

    }

    public static class UpdateInstanceRequestUserVpc extends TeaModel {
        @NameInMap("BandwidthLimit")
        public BandwidthLimit bandwidthLimit;

        /**
         * <p>The default route. Valid values:</p>
         * <ul>
         * <li>eth0: The default network interface is used to access the Internet through the public gateway.</li>
         * <li>eth1: The user\&quot;s Elastic Network Interface is used to access the Internet through the private gateway.</li>
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
         * <li>If you leave VSwitchId empty, this parameter is not required and the system automatically obtains all CIDR blocks in the VPC.</li>
         * <li>If VSwitchId is not empty, this parameter is required. Specify all CIDR blocks in the VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;192.168.0.1/24&quot;, &quot;192.168.1.1/24&quot;]</p>
         */
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        /**
         * <p>The forward configuration of the instance.</p>
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

        public static UpdateInstanceRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestUserVpc self = new UpdateInstanceRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestUserVpc setBandwidthLimit(BandwidthLimit bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }
        public BandwidthLimit getBandwidthLimit() {
            return this.bandwidthLimit;
        }

        public UpdateInstanceRequestUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public UpdateInstanceRequestUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        public UpdateInstanceRequestUserVpc setForwardInfos(java.util.List<ForwardInfo> forwardInfos) {
            this.forwardInfos = forwardInfos;
            return this;
        }
        public java.util.List<ForwardInfo> getForwardInfos() {
            return this.forwardInfos;
        }

        public UpdateInstanceRequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateInstanceRequestUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateInstanceRequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
