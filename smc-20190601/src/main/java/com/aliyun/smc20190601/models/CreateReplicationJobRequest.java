// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateReplicationJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("ScheduledStartTime")
    public String scheduledStartTime;

    @NameInMap("ValidTime")
    public String validTime;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ReplicationParameters")
    public String replicationParameters;

    @NameInMap("NetMode")
    public Integer netMode;

    @NameInMap("RunOnce")
    public Boolean runOnce;

    @NameInMap("Frequency")
    public Integer frequency;

    @NameInMap("MaxNumberOfImageToKeep")
    public Integer maxNumberOfImageToKeep;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    @NameInMap("InstanceRamRole")
    public String instanceRamRole;

    @NameInMap("ContainerNamespace")
    public String containerNamespace;

    @NameInMap("ContainerRepository")
    public String containerRepository;

    @NameInMap("ContainerTag")
    public String containerTag;

    @NameInMap("LicenseType")
    public String licenseType;

    @NameInMap("DataDisk")
    public java.util.List<CreateReplicationJobRequestDataDisk> dataDisk;

    @NameInMap("Tag")
    public java.util.List<CreateReplicationJobRequestTag> tag;

    @NameInMap("SystemDiskPart")
    public java.util.List<CreateReplicationJobRequestSystemDiskPart> systemDiskPart;

    public static CreateReplicationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReplicationJobRequest self = new CreateReplicationJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateReplicationJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateReplicationJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateReplicationJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateReplicationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateReplicationJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateReplicationJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateReplicationJobRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateReplicationJobRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateReplicationJobRequest setScheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }
    public String getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    public CreateReplicationJobRequest setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public CreateReplicationJobRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateReplicationJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateReplicationJobRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateReplicationJobRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateReplicationJobRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateReplicationJobRequest setReplicationParameters(String replicationParameters) {
        this.replicationParameters = replicationParameters;
        return this;
    }
    public String getReplicationParameters() {
        return this.replicationParameters;
    }

    public CreateReplicationJobRequest setNetMode(Integer netMode) {
        this.netMode = netMode;
        return this;
    }
    public Integer getNetMode() {
        return this.netMode;
    }

    public CreateReplicationJobRequest setRunOnce(Boolean runOnce) {
        this.runOnce = runOnce;
        return this;
    }
    public Boolean getRunOnce() {
        return this.runOnce;
    }

    public CreateReplicationJobRequest setFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }
    public Integer getFrequency() {
        return this.frequency;
    }

    public CreateReplicationJobRequest setMaxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
        this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
        return this;
    }
    public Integer getMaxNumberOfImageToKeep() {
        return this.maxNumberOfImageToKeep;
    }

    public CreateReplicationJobRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateReplicationJobRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateReplicationJobRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public CreateReplicationJobRequest setInstanceRamRole(String instanceRamRole) {
        this.instanceRamRole = instanceRamRole;
        return this;
    }
    public String getInstanceRamRole() {
        return this.instanceRamRole;
    }

    public CreateReplicationJobRequest setContainerNamespace(String containerNamespace) {
        this.containerNamespace = containerNamespace;
        return this;
    }
    public String getContainerNamespace() {
        return this.containerNamespace;
    }

    public CreateReplicationJobRequest setContainerRepository(String containerRepository) {
        this.containerRepository = containerRepository;
        return this;
    }
    public String getContainerRepository() {
        return this.containerRepository;
    }

    public CreateReplicationJobRequest setContainerTag(String containerTag) {
        this.containerTag = containerTag;
        return this;
    }
    public String getContainerTag() {
        return this.containerTag;
    }

    public CreateReplicationJobRequest setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public CreateReplicationJobRequest setDataDisk(java.util.List<CreateReplicationJobRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateReplicationJobRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateReplicationJobRequest setTag(java.util.List<CreateReplicationJobRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateReplicationJobRequestTag> getTag() {
        return this.tag;
    }

    public CreateReplicationJobRequest setSystemDiskPart(java.util.List<CreateReplicationJobRequestSystemDiskPart> systemDiskPart) {
        this.systemDiskPart = systemDiskPart;
        return this;
    }
    public java.util.List<CreateReplicationJobRequestSystemDiskPart> getSystemDiskPart() {
        return this.systemDiskPart;
    }

    public static class CreateReplicationJobRequestDataDiskPart extends TeaModel {
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        @NameInMap("Block")
        public Boolean block;

        @NameInMap("Device")
        public String device;

        public static CreateReplicationJobRequestDataDiskPart build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestDataDiskPart self = new CreateReplicationJobRequestDataDiskPart();
            return TeaModel.build(map, self);
        }

        public CreateReplicationJobRequestDataDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public CreateReplicationJobRequestDataDiskPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public CreateReplicationJobRequestDataDiskPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class CreateReplicationJobRequestDataDisk extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Part")
        public java.util.List<CreateReplicationJobRequestDataDiskPart> part;

        @NameInMap("Size")
        public Integer size;

        public static CreateReplicationJobRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestDataDisk self = new CreateReplicationJobRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateReplicationJobRequestDataDisk setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public CreateReplicationJobRequestDataDisk setPart(java.util.List<CreateReplicationJobRequestDataDiskPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<CreateReplicationJobRequestDataDiskPart> getPart() {
            return this.part;
        }

        public CreateReplicationJobRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateReplicationJobRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateReplicationJobRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestTag self = new CreateReplicationJobRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateReplicationJobRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateReplicationJobRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateReplicationJobRequestSystemDiskPart extends TeaModel {
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        @NameInMap("Block")
        public Boolean block;

        @NameInMap("Device")
        public String device;

        public static CreateReplicationJobRequestSystemDiskPart build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestSystemDiskPart self = new CreateReplicationJobRequestSystemDiskPart();
            return TeaModel.build(map, self);
        }

        public CreateReplicationJobRequestSystemDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public CreateReplicationJobRequestSystemDiskPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public CreateReplicationJobRequestSystemDiskPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

}
