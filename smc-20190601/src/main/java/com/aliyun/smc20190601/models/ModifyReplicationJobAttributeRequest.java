// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifyReplicationJobAttributeRequest extends TeaModel {
    /**
     * <p>The namespace of the destination Docker container image. For more information about Docker container images, see <a href="https://help.aliyun.com/document_detail/60744.html">Terms</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>testNamespace</p>
     */
    @NameInMap("ContainerNamespace")
    public String containerNamespace;

    /**
     * <p>The repository that stores the destination Docker container image. For more information about Docker container images, see <a href="https://help.aliyun.com/document_detail/60744.html">Terms</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>testRepository</p>
     */
    @NameInMap("ContainerRepository")
    public String containerRepository;

    /**
     * <p>The tag of the destination Docker container image. For more information about Docker container images, see <a href="https://help.aliyun.com/document_detail/60744.html">Terms</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS:v1</p>
     */
    @NameInMap("ContainerTag")
    public String containerTag;

    /**
     * <p>The information about the data disk.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<ModifyReplicationJobAttributeRequestDataDisk> dataDisk;

    /**
     * <p>The description of the migration job.</p>
     * <p>The description must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This_is_my_migration_task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The interval at which an incremental migration job runs. Unit: hour. Valid values: 1 to 168.</p>
     * <p>This parameter is required if you set the <code>RunOnce</code> parameter to false.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Frequency")
    public Integer frequency;

    /**
     * <p>The name of the destination image. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be unique within an Alibaba Cloud region.</li>
     * <li>The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * </ul>
     * <blockquote>
     * <p> If an image whose name is the same as that of the destination image already exists in the current region when the migration job is in progress, the system adds the migration job ID to the end of the image name by default. Example: ImageName-JobId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testAliCloudImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The destination instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1f1dvfto1sigz5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the Resource Access Management (RAM) role that is attached to the intermediate instance.</p>
     * 
     * <strong>example:</strong>
     * <p>SMCAdmin</p>
     */
    @NameInMap("InstanceRamRole")
    public String instanceRamRole;

    /**
     * <p>The type of the intermediate instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the ECS instance types.</p>
     * <ul>
     * <li>If you specify this parameter, SMC creates an intermediate instance of the specified instance type. If the specified instance type is unavailable, you cannot create the migration job.</li>
     * <li>If you do not specify this parameter, SMC selects an available instance type in a specific order to create an intermediate instance. For more information,</li>
     * </ul>
     * <p>see the &quot;How does SMC create an intermediate instance?&quot; section of the &quot;FAQ&quot; topic.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The migration job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j-bp19vlwm0tyigbmj****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The launch template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-bp16jovvln1cgaaq****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The version number of the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>Latest</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The maximum number of images that are retained for an incremental migration job. Valid values: 1 to 10.</p>
     * <p>This parameter is required if you set the <code>RunOnce</code> parameter to false.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxNumberOfImageToKeep")
    public Integer maxNumberOfImageToKeep;

    /**
     * <p>The name of the migration job. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be unique.</li>
     * <li>The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testMigrationTaskName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network mode for data transmission. Valid values:</p>
     * <ul>
     * <li>0: Data is transmitted over the Internet. Make sure that the source server can access the Internet.</li>
     * <li>2: Data is transmitted over a virtual private cloud (VPC). If you set this parameter to 2, you must specify the VSwitchId parameter. You can leave the VpcId parameter empty, the VPC ID can be queried by calling an operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NetMode")
    public Integer netMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The parameters of the replication driver. The parameters are fixed key-value pairs of the JSON format. The value can be up to 2,048 characters in length.</p>
     * <p>A replication driver is a tool that is used to replicate the data of a source server to an intermediate instance. The parameters vary based on the replication driver type. If you use a Server Migration Tool (SMT) driver, you can set the following parameters:</p>
     * <ul>
     * <li>bandwidth_limit: the maximum bandwidth for data transmission.</li>
     * <li>compress_level: the compression ratio of data to be transmitted.</li>
     * <li>checksum: specifies whether to enable checksum verification</li>
     * </ul>
     * <p>For more information about the replication driver, see the response parameter <code>SourceServers.ReplicationDriver</code> of the <a href="https://help.aliyun.com/document_detail/2402126.html">DescribeSourceServers</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;bandwidth_limit&quot;:0,&quot;compress_level&quot;:1,&quot;checksum&quot;:true}</p>
     */
    @NameInMap("ReplicationParameters")
    public String replicationParameters;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The time when the migration job is executed. SMC starts the migration job at the specified time.</p>
     * <p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC. For example, 2018-01-01T12:00:00Z indicates 20:00:00 on January 1, 2018 (UTC+8).</p>
     * <blockquote>
     * <p> If ScheduledStartTime is left empty, SMC does not automatically start the migration job. In this case, you must call the <a href="https://help.aliyun.com/document_detail/121823.html">StartReplicationJob</a> operation to start the migration job.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-06-04T13:35:00Z</p>
     */
    @NameInMap("ScheduledStartTime")
    public String scheduledStartTime;

    /**
     * <p>The partition information of the system disk.</p>
     */
    @NameInMap("SystemDiskPart")
    public java.util.List<ModifyReplicationJobAttributeRequestSystemDiskPart> systemDiskPart;

    /**
     * <p>The system disk size of the destination ECS instance. Unit: GiB. Valid values: 20 to 500.</p>
     * <blockquote>
     * <p> The size of a destination data disk must be greater than the size of data in the source data disk. For example, if the source data disk has 500 GiB of storage space and 100 GiB of data, you must set this parameter to a value greater than 100.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The type of destination to which the source server is migrated. You can modify the value only before the migration job starts. Valid values:</p>
     * <ul>
     * <li>Image: After the migration job is complete, Server Migration Center (SMC) generates a destination Elastic Compute Service (ECS) image for the source server. You can use the image to create an ECS instance.</li>
     * <li>ContainerImage: After the migration job is complete, SMC generates a container image for the source server. You can use the container image in Container Registry.</li>
     * <li>TargetInstance: After the migration job is complete, SMC migrates the source server to the destination instance. If you set this parameter to TargetInstance, you must set the <code>InstanceId</code> parameter.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The value of this parameter is not case-sensitive.</p>
     * </li>
     * <li><p>SMC does not allow you to migrate Windows servers or servers that run operating systems on the ARM architecture to Container Registry.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Image</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The ID of the vSwitch in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1ddbrxdlrcbim46****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The time when the migration job expires. You can schedule the migration job to expire 7 to 90 days after the job is created.</p>
     * <ul>
     * <li>This parameter can be modified only if the migration job is in the Ready, Running, Stopped, InError, or Waiting state.</li>
     * <li>Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC. For example, 2018-01-01T12:00:00Z indicates 20:00:00 on January 1, 2018 (UTC+8).</li>
     * <li>If you do not specify this parameter, the migration job does not expire.</li>
     * <li>After a migration job expires, the job state changes to Expired. SMC retains the migration job for seven days after the job expires. After the job is retained for seven days, SMC deletes the migration job.</li>
     * </ul>
     * <p>By default, a migration job is valid for 30 days after it is created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-04T13:35:00Z</p>
     */
    @NameInMap("ValidTime")
    public String validTime;

    /**
     * <p>The ID of the VPC for which an Express Connect circuit or VPN gateway is configured.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1vwnn14rqpyiczj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ModifyReplicationJobAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReplicationJobAttributeRequest self = new ModifyReplicationJobAttributeRequest();
        return TeaModel.build(map, self);
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

    public ModifyReplicationJobAttributeRequest setDataDisk(java.util.List<ModifyReplicationJobAttributeRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<ModifyReplicationJobAttributeRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public ModifyReplicationJobAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyReplicationJobAttributeRequest setFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }
    public Integer getFrequency() {
        return this.frequency;
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

    public ModifyReplicationJobAttributeRequest setInstanceRamRole(String instanceRamRole) {
        this.instanceRamRole = instanceRamRole;
        return this;
    }
    public String getInstanceRamRole() {
        return this.instanceRamRole;
    }

    public ModifyReplicationJobAttributeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyReplicationJobAttributeRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
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

    public ModifyReplicationJobAttributeRequest setMaxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
        this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
        return this;
    }
    public Integer getMaxNumberOfImageToKeep() {
        return this.maxNumberOfImageToKeep;
    }

    public ModifyReplicationJobAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyReplicationJobAttributeRequest setNetMode(Integer netMode) {
        this.netMode = netMode;
        return this;
    }
    public Integer getNetMode() {
        return this.netMode;
    }

    public ModifyReplicationJobAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyReplicationJobAttributeRequest setReplicationParameters(String replicationParameters) {
        this.replicationParameters = replicationParameters;
        return this;
    }
    public String getReplicationParameters() {
        return this.replicationParameters;
    }

    public ModifyReplicationJobAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyReplicationJobAttributeRequest setScheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }
    public String getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    public ModifyReplicationJobAttributeRequest setSystemDiskPart(java.util.List<ModifyReplicationJobAttributeRequestSystemDiskPart> systemDiskPart) {
        this.systemDiskPart = systemDiskPart;
        return this;
    }
    public java.util.List<ModifyReplicationJobAttributeRequestSystemDiskPart> getSystemDiskPart() {
        return this.systemDiskPart;
    }

    public ModifyReplicationJobAttributeRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public ModifyReplicationJobAttributeRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public ModifyReplicationJobAttributeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyReplicationJobAttributeRequest setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public ModifyReplicationJobAttributeRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ModifyReplicationJobAttributeRequestDataDiskPart extends TeaModel {
        /**
         * <p>Specifies whether to enable block replication for partition N in the destination data disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Block")
        public Boolean block;

        /**
         * <p>The ID of partition N in the destination data disk.</p>
         * <blockquote>
         * <p> The partitions in the destination data disk are arranged in the same sequential order as those in the source data disk.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0_1</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The size of partition N in the destination data disk. Unit: bytes. The default value is equal to the corresponding size of the partition in the source data disk.</p>
         * <blockquote>
         * <p> The total size of all partitions in the destination data disk cannot exceed the size of the destination data disk.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>254803968</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static ModifyReplicationJobAttributeRequestDataDiskPart build(java.util.Map<String, ?> map) throws Exception {
            ModifyReplicationJobAttributeRequestDataDiskPart self = new ModifyReplicationJobAttributeRequestDataDiskPart();
            return TeaModel.build(map, self);
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

        public ModifyReplicationJobAttributeRequestDataDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class ModifyReplicationJobAttributeRequestDataDisk extends TeaModel {
        /**
         * <p>The index of data disk N on the destination ECS instance. Valid values of N: 1 to 16.</p>
         * <p>Data disks on a destination ECS instance are arranged in a sequential order that starts from 1.</p>
         * <blockquote>
         * <p> You can create a destination data disk only for a source server that has data disks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The information about partitions.</p>
         */
        @NameInMap("Part")
        public java.util.List<ModifyReplicationJobAttributeRequestDataDiskPart> part;

        /**
         * <p>The size of the data disk on the destination ECS instance. Unit: GiB. Valid values: 20 to 32768.</p>
         * <blockquote>
         * <p> The size of a destination data disk must be greater than the size of data in the source data disk. For example, if the source data disk has 500 GiB of storage space and 100 GiB of data, you must set this parameter to a value greater than 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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

    public static class ModifyReplicationJobAttributeRequestSystemDiskPart extends TeaModel {
        /**
         * <p>Specifies whether to enable block replication for partition N in the destination system disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Block")
        public Boolean block;

        /**
         * <p>The ID of partition N in the destination system disk.</p>
         * <blockquote>
         * <p> The partitions in the destination system disk are arranged in the same sequential order as those in the source system disk.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0_1</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The size of partition N in the destination system disk. Unit: bytes. The default value is equal to the partition size of the source system disk.</p>
         * <blockquote>
         * <p> The total size of all partitions in the destination system disk cannot exceed the size of the destination system disk.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>254803968</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static ModifyReplicationJobAttributeRequestSystemDiskPart build(java.util.Map<String, ?> map) throws Exception {
            ModifyReplicationJobAttributeRequestSystemDiskPart self = new ModifyReplicationJobAttributeRequestSystemDiskPart();
            return TeaModel.build(map, self);
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

        public ModifyReplicationJobAttributeRequestSystemDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

}
