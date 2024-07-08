// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Affinity")
    public UpdateInstanceRequestAffinity affinity;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CloudDisks")
    public java.util.List<UpdateInstanceRequestCloudDisks> cloudDisks;

    @NameInMap("Datasets")
    public java.util.List<UpdateInstanceRequestDatasets> datasets;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisassociateDatasets")
    public Boolean disassociateDatasets;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisassociateDriver")
    public Boolean disassociateDriver;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisassociateForwardInfos")
    public Boolean disassociateForwardInfos;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisassociateVpc")
    public Boolean disassociateVpc;

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
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <strong>example:</strong>
     * <p>{&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;SharedMemory&quot;:&quot;4Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;Tesla-V100-16G&quot;}</p>
     */
    @NameInMap("RequestedResource")
    public UpdateInstanceRequestRequestedResource requestedResource;

    /**
     * <strong>example:</strong>
     * <p>1612285282502324</p>
     */
    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserVpc")
    public UpdateInstanceRequestUserVpc userVpc;

    /**
     * <strong>example:</strong>
     * <p>d-123456789</p>
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

    public UpdateInstanceRequest setCloudDisks(java.util.List<UpdateInstanceRequestCloudDisks> cloudDisks) {
        this.cloudDisks = cloudDisks;
        return this;
    }
    public java.util.List<UpdateInstanceRequestCloudDisks> getCloudDisks() {
        return this.cloudDisks;
    }

    public UpdateInstanceRequest setDatasets(java.util.List<UpdateInstanceRequestDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<UpdateInstanceRequestDatasets> getDatasets() {
        return this.datasets;
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

    public UpdateInstanceRequest setDisassociateForwardInfos(Boolean disassociateForwardInfos) {
        this.disassociateForwardInfos = disassociateForwardInfos;
        return this;
    }
    public Boolean getDisassociateForwardInfos() {
        return this.disassociateForwardInfos;
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

    public UpdateInstanceRequest setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
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

    public static class UpdateInstanceRequestCloudDisks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30Gi</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
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

        public UpdateInstanceRequestDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

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

    public static class UpdateInstanceRequestUserVpc extends TeaModel {
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

        public static UpdateInstanceRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestUserVpc self = new UpdateInstanceRequestUserVpc();
            return TeaModel.build(map, self);
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
