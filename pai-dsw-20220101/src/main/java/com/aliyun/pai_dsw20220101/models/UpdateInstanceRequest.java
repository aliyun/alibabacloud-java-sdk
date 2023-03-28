// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Datasets")
    public java.util.List<UpdateInstanceRequestDatasets> datasets;

    @NameInMap("DisassociateDatasets")
    public Boolean disassociateDatasets;

    @NameInMap("DisassociateVpc")
    public Boolean disassociateVpc;

    @NameInMap("EcsSpec")
    public String ecsSpec;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("RequestedResource")
    public UpdateInstanceRequestRequestedResource requestedResource;

    @NameInMap("UserVpc")
    public UpdateInstanceRequestUserVpc userVpc;

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

    public UpdateInstanceRequest setDisassociateVpc(Boolean disassociateVpc) {
        this.disassociateVpc = disassociateVpc;
        return this;
    }
    public Boolean getDisassociateVpc() {
        return this.disassociateVpc;
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

    public UpdateInstanceRequest setRequestedResource(UpdateInstanceRequestRequestedResource requestedResource) {
        this.requestedResource = requestedResource;
        return this;
    }
    public UpdateInstanceRequestRequestedResource getRequestedResource() {
        return this.requestedResource;
    }

    public UpdateInstanceRequest setUserVpc(UpdateInstanceRequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UpdateInstanceRequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public static class UpdateInstanceRequestDatasets extends TeaModel {
        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("MountPath")
        public String mountPath;

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

    }

    public static class UpdateInstanceRequestRequestedResource extends TeaModel {
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

        public static UpdateInstanceRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestUserVpc self = new UpdateInstanceRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
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
