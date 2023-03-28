// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Datasets")
    public java.util.List<CreateInstanceRequestDatasets> datasets;

    @NameInMap("EcsSpec")
    public String ecsSpec;

    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Labels")
    public java.util.List<CreateInstanceRequestLabels> labels;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("RequestedResource")
    public CreateInstanceRequestRequestedResource requestedResource;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("UserVpc")
    public CreateInstanceRequestUserVpc userVpc;

    @NameInMap("WorkspaceId")
    public String workspaceId;

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

    public CreateInstanceRequest setDatasets(java.util.List<CreateInstanceRequestDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<CreateInstanceRequestDatasets> getDatasets() {
        return this.datasets;
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

    public static class CreateInstanceRequestDatasets extends TeaModel {
        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("MountPath")
        public String mountPath;

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

    }

    public static class CreateInstanceRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

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
        @NameInMap("CPU")
        public String CPU;

        @NameInMap("GPU")
        public String GPU;

        @NameInMap("GPUType")
        public String GPUType;

        @NameInMap("Memory")
        public String memory;

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
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>Vpc Id。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateInstanceRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestUserVpc self = new CreateInstanceRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
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
