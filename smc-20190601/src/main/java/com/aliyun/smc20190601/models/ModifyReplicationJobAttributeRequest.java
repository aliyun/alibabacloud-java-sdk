// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifyReplicationJobAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("ScheduledStartTime")
    public String scheduledStartTime;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

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

    @NameInMap("ValidTime")
    public String validTime;

    @NameInMap("SystemDiskPart")
    public java.util.List<ModifyReplicationJobAttributeRequestSystemDiskPart> systemDiskPart;

    @NameInMap("DataDisk")
    public java.util.List<ModifyReplicationJobAttributeRequestDataDisk> dataDisk;

    public static ModifyReplicationJobAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReplicationJobAttributeRequest self = new ModifyReplicationJobAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReplicationJobAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyReplicationJobAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyReplicationJobAttributeRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ModifyReplicationJobAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyReplicationJobAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyReplicationJobAttributeRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public ModifyReplicationJobAttributeRequest setScheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }
    public String getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    public ModifyReplicationJobAttributeRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ModifyReplicationJobAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyReplicationJobAttributeRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public ModifyReplicationJobAttributeRequest setFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }
    public Integer getFrequency() {
        return this.frequency;
    }

    public ModifyReplicationJobAttributeRequest setMaxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
        this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
        return this;
    }
    public Integer getMaxNumberOfImageToKeep() {
        return this.maxNumberOfImageToKeep;
    }

    public ModifyReplicationJobAttributeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyReplicationJobAttributeRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public ModifyReplicationJobAttributeRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public ModifyReplicationJobAttributeRequest setInstanceRamRole(String instanceRamRole) {
        this.instanceRamRole = instanceRamRole;
        return this;
    }
    public String getInstanceRamRole() {
        return this.instanceRamRole;
    }

    public ModifyReplicationJobAttributeRequest setContainerNamespace(String containerNamespace) {
        this.containerNamespace = containerNamespace;
        return this;
    }
    public String getContainerNamespace() {
        return this.containerNamespace;
    }

    public ModifyReplicationJobAttributeRequest setContainerRepository(String containerRepository) {
        this.containerRepository = containerRepository;
        return this;
    }
    public String getContainerRepository() {
        return this.containerRepository;
    }

    public ModifyReplicationJobAttributeRequest setContainerTag(String containerTag) {
        this.containerTag = containerTag;
        return this;
    }
    public String getContainerTag() {
        return this.containerTag;
    }

    public ModifyReplicationJobAttributeRequest setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public ModifyReplicationJobAttributeRequest setSystemDiskPart(java.util.List<ModifyReplicationJobAttributeRequestSystemDiskPart> systemDiskPart) {
        this.systemDiskPart = systemDiskPart;
        return this;
    }
    public java.util.List<ModifyReplicationJobAttributeRequestSystemDiskPart> getSystemDiskPart() {
        return this.systemDiskPart;
    }

    public ModifyReplicationJobAttributeRequest setDataDisk(java.util.List<ModifyReplicationJobAttributeRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<ModifyReplicationJobAttributeRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public static class ModifyReplicationJobAttributeRequestSystemDiskPart extends TeaModel {
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        @NameInMap("Block")
        public Boolean block;

        @NameInMap("Device")
        public String device;

        public static ModifyReplicationJobAttributeRequestSystemDiskPart build(java.util.Map<String, ?> map) throws Exception {
            ModifyReplicationJobAttributeRequestSystemDiskPart self = new ModifyReplicationJobAttributeRequestSystemDiskPart();
            return TeaModel.build(map, self);
        }

        public ModifyReplicationJobAttributeRequestSystemDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public ModifyReplicationJobAttributeRequestSystemDiskPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public ModifyReplicationJobAttributeRequestSystemDiskPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class ModifyReplicationJobAttributeRequestDataDiskPart extends TeaModel {
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        @NameInMap("Block")
        public Boolean block;

        @NameInMap("Device")
        public String device;

        public static ModifyReplicationJobAttributeRequestDataDiskPart build(java.util.Map<String, ?> map) throws Exception {
            ModifyReplicationJobAttributeRequestDataDiskPart self = new ModifyReplicationJobAttributeRequestDataDiskPart();
            return TeaModel.build(map, self);
        }

        public ModifyReplicationJobAttributeRequestDataDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public ModifyReplicationJobAttributeRequestDataDiskPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public ModifyReplicationJobAttributeRequestDataDiskPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class ModifyReplicationJobAttributeRequestDataDisk extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Part")
        public java.util.List<ModifyReplicationJobAttributeRequestDataDiskPart> part;

        @NameInMap("Size")
        public Integer size;

        public static ModifyReplicationJobAttributeRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyReplicationJobAttributeRequestDataDisk self = new ModifyReplicationJobAttributeRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public ModifyReplicationJobAttributeRequestDataDisk setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ModifyReplicationJobAttributeRequestDataDisk setPart(java.util.List<ModifyReplicationJobAttributeRequestDataDiskPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<ModifyReplicationJobAttributeRequestDataDiskPart> getPart() {
            return this.part;
        }

        public ModifyReplicationJobAttributeRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
