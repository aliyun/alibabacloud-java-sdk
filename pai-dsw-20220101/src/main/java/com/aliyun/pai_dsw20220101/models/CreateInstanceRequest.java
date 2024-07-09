// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Affinity")
    public CreateInstanceRequestAffinity affinity;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CloudDisks")
    public java.util.List<CreateInstanceRequestCloudDisks> cloudDisks;

    @NameInMap("Datasets")
    public java.util.List<CreateInstanceRequestDatasets> datasets;

    /**
     * <strong>example:</strong>
     * <p>535.54.03</p>
     */
    @NameInMap("Driver")
    public String driver;

    /**
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <strong>example:</strong>
     * <p>{userName: &quot;Chris&quot;}</p>
     */
    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    @NameInMap("ImageAuth")
    public String imageAuth;

    /**
     * <strong>example:</strong>
     * <p>image-05cefd0be2exxxx</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>training_data</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;foo\&quot;: \&quot;bar\&quot;}</p>
     */
    @NameInMap("Labels")
    public java.util.List<CreateInstanceRequestLabels> labels;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <strong>example:</strong>
     * <p>{&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;SharedMemory&quot;:&quot;4Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;Tesla-V100-16G&quot;}</p>
     */
    @NameInMap("RequestedResource")
    public CreateInstanceRequestRequestedResource requestedResource;

    /**
     * <strong>example:</strong>
     * <p>dsw-123456789</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>1612285282502324</p>
     */
    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserVpc")
    public CreateInstanceRequestUserVpc userVpc;

    /**
     * <strong>example:</strong>
     * <p>40823</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>d-123456789</p>
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

    public CreateInstanceRequest setCloudDisks(java.util.List<CreateInstanceRequestCloudDisks> cloudDisks) {
        this.cloudDisks = cloudDisks;
        return this;
    }
    public java.util.List<CreateInstanceRequestCloudDisks> getCloudDisks() {
        return this.cloudDisks;
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

    public static class CreateInstanceRequestCloudDisksStatus extends TeaModel {
        @NameInMap("Available")
        public Long available;

        @NameInMap("Capacity")
        public Long capacity;

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
         * <strong>example:</strong>
         * <p>30Gi</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <strong>example:</strong>
         * <p>/mmt/workspace</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <strong>example:</strong>
         * <p>workspace</p>
         */
        @NameInMap("Path")
        public String path;

        @NameInMap("Status")
        public CreateInstanceRequestCloudDisksStatus status;

        /**
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
         * <strong>example:</strong>
         * <p>d-vsqjvsjp4orp5l206u</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("OptionType")
        public String optionType;

        @NameInMap("Options")
        public String options;

        /**
         * <strong>example:</strong>
         * <p>oss://bucket.oss-cn-shanghai.aliyuncs.com/data/path/</p>
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

        public CreateInstanceRequestDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

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
         * <strong>example:</strong>
         * <p>stsTokenOwner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <strong>example:</strong>
         * <p>v100</p>
         */
        @NameInMap("GPUType")
        public String GPUType;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
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

    public static class CreateInstanceRequestUserVpc extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eth0 | eth1</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <strong>example:</strong>
         * <p>[&quot;192.168.0.1/24&quot;, &quot;192.168.1.1/24&quot;]</p>
         */
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        @NameInMap("ForwardInfos")
        public java.util.List<ForwardInfo> forwardInfos;

        /**
         * <strong>example:</strong>
         * <p>sg-xxxxxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>vsw-xxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-xxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateInstanceRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestUserVpc self = new CreateInstanceRequestUserVpc();
            return TeaModel.build(map, self);
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
