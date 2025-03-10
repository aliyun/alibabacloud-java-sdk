// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateReplicationJobRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>The data disks.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<CreateReplicationJobRequestDataDisk> dataDisk;

    /**
     * <p>The description of the migration job.</p>
     * <p>The description must be 2 to 128 characters in length, and can contain digits, colons (:), underscores (_), and hyphens (-). The description must start with a letter, but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This_is_a_migration_task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The information about the disk.</p>
     */
    @NameInMap("Disks")
    public CreateReplicationJobRequestDisks disks;

    /**
     * <p>The interval at which SMC synchronizes incremental data to Alibaba Cloud. Unit: hour. Valid values: 1 to 168.</p>
     * <p>This parameter is required if you set the <code>RunOnce</code> parameter to false.</p>
     * <p>By default, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Frequency")
    public Integer frequency;

    /**
     * <p>The name of the destination image. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be unique within an Alibaba Cloud region.</li>
     * <li>The name must be 2 to 128 characters in length, and can contain digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter, but cannot start with <code>http://</code> or <code>https://</code>.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify an image name that already exists in the destination region, the migration job ID is appended to the image name as a suffix. Example: ImageName_j-2zexxxxxxxxxxxxx.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testAliCloudImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The ID of the destination ECS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1f1dvfto1sigz5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the Resource Access Management (RAM) role that is assigned to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>SMCAdmin</p>
     */
    @NameInMap("InstanceRamRole")
    public String instanceRamRole;

    /**
     * <p>The type of the intermediate instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to obtain the ECS instance types.</p>
     * <ul>
     * <li>If you specify this parameter, SMC creates an intermediate instance of the specified instance type. If the specified instance type is unavailable, you cannot create the migration job.</li>
     * <li>If you do not specify this parameter, SMC selects an available instance type in a specific order to create an intermediate instance. For more information, see <a href="https://help.aliyun.com/document_detail/121707.html">SMC FAQ</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The type of the migration job. Valid values:</p>
     * <ul>
     * <li>0: server migration.</li>
     * <li>1: operating system migration.</li>
     * <li>2: cross-zone migration.</li>
     * <li>3: agentless migration for a VMware VM.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("JobType")
    public Integer jobType;

    /**
     * <p>The ID of the launch template.</p>
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
     * <p>1</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The license type. Valid values:</p>
     * <ul>
     * <li>An empty value specifies no license.</li>
     * <li>A value of BYOL specifies Bring Your Own License (BYOL).</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/121707.html">SMC FAQ</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>BYOL</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The maximum number of images retained for the incremental migration job. Valid values: 1 to 10.</p>
     * <p>This parameter is required if you set the <code>RunOnce</code> parameter to false.</p>
     * <p>By default, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxNumberOfImageToKeep")
    public Integer maxNumberOfImageToKeep;

    /**
     * <p>The name of the migration job. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be unique.</li>
     * <li>The name must be 2 to 128 characters in length, and can contain digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter, but cannot start with <code>http://</code> or <code>https://</code>.</li>
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
     * <li>2: Data is transmitted over a VPC. If you specify this value, you must specify the VSwitchId parameter. You do not need to specify the VpcId parameter because the value of the VpcId parameter can be retrieved based on the value of the VSwitchId parameter.</li>
     * </ul>
     * <p>Default value: 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NetMode")
    public Integer netMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the Alibaba Cloud region to which you want to migrate the source server.</p>
     * <p>For example, if you want to migrate the source server to the China (Hangzhou) region, set this parameter to <code>cn-hangzhou</code>. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the latest regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The parameters of the replication driver. The parameters must be specified as key-value pairs in the JSON format. The keys are fixed for each type of replication driver. The JSON string can be up to 2,048 characters in length.</p>
     * <p>A replication driver is a tool that is used to migrate a source server to an intermediate instance. The parameters vary based on the replication driver type. If you use a Server Migration Tool (SMT) driver, you can specify the following parameters:</p>
     * <ul>
     * <li>bandwidth_limit: the maximum bandwidth for data transmission.</li>
     * <li>compress_level: the compression ratio of data to be transmitted.</li>
     * <li>checksum: specifies whether to enable checksum verification.</li>
     * </ul>
     * <p>For more information about replication drivers, see the response parameter <code>SourceServers.ReplicationDriver</code> of the <a href="https://help.aliyun.com/document_detail/121818.html">DescribeSourceServers</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;bandwidth_limit&quot;:0,&quot;compress_level&quot;:1,&quot;checksum&quot;:true}</p>
     */
    @NameInMap("ReplicationParameters")
    public String replicationParameters;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw3ty5y7****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>Specifies whether to disable incremental migration for the source server. Valid values:</p>
     * <ul>
     * <li>true: creates a migration job that runs only once. This is the default value. Incremental data of the source server is not synchronized.</li>
     * <li>false: creates an incremental migration job. In this case, you must specify the <code>Frequency</code> parameter. SMC synchronizes incremental data of the source server to Alibaba Cloud at the specified frequency. You can use an incremental migration job to synchronize incremental data from the source server to Alibaba Cloud without the need to interrupt your business. A full data image is generated for the source server when the job is running.</li>
     * </ul>
     * <blockquote>
     * <p> You can specify this parameter only when you create a migration job. The parameter value cannot be changed after the migration job is created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RunOnce")
    public Boolean runOnce;

    /**
     * <p>The time when you want to run the migration job. The time must meet the following requirements:</p>
     * <ul>
     * <li>The time must be specified in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. For example, 2018-01-01T12:00:00Z specifies 20:00:00 on January 1, 2018 (UTC+8).</li>
     * <li>The value must be within 30 days after the current time.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, you must manually start the migration job after the job is created. You can call the <a href="https://help.aliyun.com/document_detail/121823.html">StartReplicationJob</a> operation to start the migration job.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-06-04T13:35:00Z</p>
     */
    @NameInMap("ScheduledStartTime")
    public String scheduledStartTime;

    /**
     * <p>The ID of the source server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp1e2fsl57knvuug****</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The information about system disk partitions.</p>
     */
    @NameInMap("SystemDiskPart")
    public java.util.List<CreateReplicationJobRequestSystemDiskPart> systemDiskPart;

    /**
     * <p>The system disk size of the destination ECS instance. Unit: GiB. Valid values: 20 to 2048.</p>
     * <blockquote>
     * <p> The value must be greater than the used space of the system disk on the source server. For example, if the total size of the source disk is 500 GiB and the used space is 100 GiB, the value of this parameter must be greater than 100 GiB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateReplicationJobRequestTag> tag;

    /**
     * <p>The type of destination to which you want to migrate the source server. Valid values:</p>
     * <ul>
     * <li>Image: After the migration job is complete, SMC generates an Elastic Compute Service (ECS) image for the source server.</li>
     * <li>ContainerImage: After the migration job is complete, SMC generates a Docker container image for the source server.</li>
     * <li>TargetInstance: After the migration job is completed, SMC migrates the source server to the destination instance. If you set this parameter to TargetInstance, you must set the <code>InstanceId</code> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Image</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The ID of the vSwitch in the specified VPC.</p>
     * <p>You must set this parameter if you use a VPC to migrate data.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1ddbrxdlrcbim46****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The time when the migration job expires. You can schedule the migration job to expire 7 to 90 days after the job is created.</p>
     * <ul>
     * <li>The time must be specified in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. For example, 2018-01-01T12:00:00Z specifies 20:00:00 on January 1, 2018 (UTC+8).</li>
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
     * <p>The ID of a VPC for which you have configured an Express Connect circuit or a VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1vwnn14rqpyiczj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateReplicationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReplicationJobRequest self = new CreateReplicationJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateReplicationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public CreateReplicationJobRequest setDataDisk(java.util.List<CreateReplicationJobRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateReplicationJobRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateReplicationJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateReplicationJobRequest setDisks(CreateReplicationJobRequestDisks disks) {
        this.disks = disks;
        return this;
    }
    public CreateReplicationJobRequestDisks getDisks() {
        return this.disks;
    }

    public CreateReplicationJobRequest setFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }
    public Integer getFrequency() {
        return this.frequency;
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

    public CreateReplicationJobRequest setInstanceRamRole(String instanceRamRole) {
        this.instanceRamRole = instanceRamRole;
        return this;
    }
    public String getInstanceRamRole() {
        return this.instanceRamRole;
    }

    public CreateReplicationJobRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateReplicationJobRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
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

    public CreateReplicationJobRequest setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public CreateReplicationJobRequest setMaxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
        this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
        return this;
    }
    public Integer getMaxNumberOfImageToKeep() {
        return this.maxNumberOfImageToKeep;
    }

    public CreateReplicationJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateReplicationJobRequest setNetMode(Integer netMode) {
        this.netMode = netMode;
        return this;
    }
    public Integer getNetMode() {
        return this.netMode;
    }

    public CreateReplicationJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateReplicationJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateReplicationJobRequest setReplicationParameters(String replicationParameters) {
        this.replicationParameters = replicationParameters;
        return this;
    }
    public String getReplicationParameters() {
        return this.replicationParameters;
    }

    public CreateReplicationJobRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateReplicationJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateReplicationJobRequest setRunOnce(Boolean runOnce) {
        this.runOnce = runOnce;
        return this;
    }
    public Boolean getRunOnce() {
        return this.runOnce;
    }

    public CreateReplicationJobRequest setScheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }
    public String getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    public CreateReplicationJobRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateReplicationJobRequest setSystemDiskPart(java.util.List<CreateReplicationJobRequestSystemDiskPart> systemDiskPart) {
        this.systemDiskPart = systemDiskPart;
        return this;
    }
    public java.util.List<CreateReplicationJobRequestSystemDiskPart> getSystemDiskPart() {
        return this.systemDiskPart;
    }

    public CreateReplicationJobRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateReplicationJobRequest setTag(java.util.List<CreateReplicationJobRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateReplicationJobRequestTag> getTag() {
        return this.tag;
    }

    public CreateReplicationJobRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateReplicationJobRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateReplicationJobRequest setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public CreateReplicationJobRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateReplicationJobRequestDataDiskPart extends TeaModel {
        /**
         * <p>Specifies whether to enable block replication for partition N in the destination data disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Block")
        public Boolean block;

        /**
         * <p>The device ID of partition N in the destination data disk. The partitions in the destination data disk are arranged in the same sequential order as those in the source data disk.</p>
         * <blockquote>
         * <p> You must set both the DataDisk.N.Part.N.Device and <code>DataDisk.N.Part.N.SizeBytes</code> parameters or leave both parameters empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0_1</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The size of partition N in the destination data disk. Unit: bytes. The default value is equal to the corresponding partition size of the source data disk.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The total size of all partitions in a destination data disk cannot exceed the size of the destination data disk.</p>
         * </li>
         * <li><p>You must set both the <code>DataDisk.N.Part.N.Device</code> and DataDisk.N.Part.N.SizeBytes parameters or leave both parameters empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>254803968</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static CreateReplicationJobRequestDataDiskPart build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestDataDiskPart self = new CreateReplicationJobRequestDataDiskPart();
            return TeaModel.build(map, self);
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

        public CreateReplicationJobRequestDataDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class CreateReplicationJobRequestDataDisk extends TeaModel {
        /**
         * <p>The index of data disk N on the destination ECS instance. Data disks on a destination ECS instance are arranged in a sequential order that starts from 1. Valid values: 1 to 16.</p>
         * <blockquote>
         * <p> To create a destination data disk for a source server, make sure that the source server has data disks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The data disk partitions.</p>
         */
        @NameInMap("Part")
        public java.util.List<CreateReplicationJobRequestDataDiskPart> part;

        /**
         * <p>The size of the data disk on the destination ECS instance. Unit: GiB. Valid values: 20 to 32768.</p>
         * <blockquote>
         * <p> The size of a destination data disk must be larger than the size of data in the source data disk. For example, if the size of the source data disk is 500 GiB and the used space is 100 GiB, you must set this parameter to a value greater than 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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

    public static class CreateReplicationJobRequestDisksDataPart extends TeaModel {
        /**
         * <p>Whether block replication is enabled for the data disk partition. Valid values:</p>
         * <ul>
         * <li>true: Block replication is enabled for the data disk partition.</li>
         * <li>false: Block replication is disabled for the data disk partition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Block")
        public Boolean block;

        /**
         * <p>The path of the data disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/date</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The size of the data disk partition. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>21474836480</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static CreateReplicationJobRequestDisksDataPart build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestDisksDataPart self = new CreateReplicationJobRequestDisksDataPart();
            return TeaModel.build(map, self);
        }

        public CreateReplicationJobRequestDisksDataPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public CreateReplicationJobRequestDisksDataPart setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateReplicationJobRequestDisksDataPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class CreateReplicationJobRequestDisksData extends TeaModel {
        /**
         * <p>The ID of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-2ze8hyowhdgd6ou2m5z6</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>Specifies whether the data disk uses LVM. Valid values:</p>
         * <ul>
         * <li>true: Use LVM.</li>
         * <li>false: Not use LVM.</li>
         * </ul>
         */
        @NameInMap("LVM")
        public Boolean LVM;

        /**
         * <p>The information about the data disk partition.</p>
         */
        @NameInMap("Part")
        public java.util.List<CreateReplicationJobRequestDisksDataPart> part;

        /**
         * <p>The size of the data disk of the migration source. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateReplicationJobRequestDisksData build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestDisksData self = new CreateReplicationJobRequestDisksData();
            return TeaModel.build(map, self);
        }

        public CreateReplicationJobRequestDisksData setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public CreateReplicationJobRequestDisksData setLVM(Boolean LVM) {
            this.LVM = LVM;
            return this;
        }
        public Boolean getLVM() {
            return this.LVM;
        }

        public CreateReplicationJobRequestDisksData setPart(java.util.List<CreateReplicationJobRequestDisksDataPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<CreateReplicationJobRequestDisksDataPart> getPart() {
            return this.part;
        }

        public CreateReplicationJobRequestDisksData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateReplicationJobRequestDisksSystemPart extends TeaModel {
        /**
         * <p>Specifies whether block replication is enabled for the system disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Block")
        public Boolean block;

        /**
         * <p>The path of the system disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>/boot</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The size of the system disk partition. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>254803968</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static CreateReplicationJobRequestDisksSystemPart build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestDisksSystemPart self = new CreateReplicationJobRequestDisksSystemPart();
            return TeaModel.build(map, self);
        }

        public CreateReplicationJobRequestDisksSystemPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public CreateReplicationJobRequestDisksSystemPart setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateReplicationJobRequestDisksSystemPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class CreateReplicationJobRequestDisksSystem extends TeaModel {
        /**
         * <p>Specifies whether to use LVM. Valid values:</p>
         * <ul>
         * <li>true: Use LVM.</li>
         * <li>false: Not use LVM.</li>
         * </ul>
         * <p>LVM is not supported:</p>
         * <ul>
         * <li>If your source server runs Windows, LVM is not supported.</li>
         * <li>The system disk does not have a boot partition, and LVM is not supported.</li>
         * </ul>
         * <p>After LVM is enabled, this feature does not take effect in the following scenarios:</p>
         * <ul>
         * <li>LVM2 is not supported on your source server and the software package is not installed.</li>
         * <li>Your source server runs Debian with a kernel version of 3.x or earlier and XFS file systems are mounted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LVM")
        public Boolean LVM;

        /**
         * <p>The information about the system disk partition.</p>
         */
        @NameInMap("Part")
        public java.util.List<CreateReplicationJobRequestDisksSystemPart> part;

        /**
         * <p>The size of the source system disk. Unit: GiB. Valid values: 20 to 32768.</p>
         * <blockquote>
         * <p> The parameter value must be greater than the actual used space of the data disk on the source server. For example, if the size of the source disk is 500 GiB but the actual used space is 100 GiB, you must set this parameter to a value greater than 100 GiB.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateReplicationJobRequestDisksSystem build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestDisksSystem self = new CreateReplicationJobRequestDisksSystem();
            return TeaModel.build(map, self);
        }

        public CreateReplicationJobRequestDisksSystem setLVM(Boolean LVM) {
            this.LVM = LVM;
            return this;
        }
        public Boolean getLVM() {
            return this.LVM;
        }

        public CreateReplicationJobRequestDisksSystem setPart(java.util.List<CreateReplicationJobRequestDisksSystemPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<CreateReplicationJobRequestDisksSystemPart> getPart() {
            return this.part;
        }

        public CreateReplicationJobRequestDisksSystem setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateReplicationJobRequestDisks extends TeaModel {
        /**
         * <p>The information about the data disk partition.</p>
         */
        @NameInMap("Data")
        public java.util.List<CreateReplicationJobRequestDisksData> data;

        /**
         * <p>The information about the system disk.</p>
         */
        @NameInMap("System")
        public CreateReplicationJobRequestDisksSystem system;

        public static CreateReplicationJobRequestDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestDisks self = new CreateReplicationJobRequestDisks();
            return TeaModel.build(map, self);
        }

        public CreateReplicationJobRequestDisks setData(java.util.List<CreateReplicationJobRequestDisksData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CreateReplicationJobRequestDisksData> getData() {
            return this.data;
        }

        public CreateReplicationJobRequestDisks setSystem(CreateReplicationJobRequestDisksSystem system) {
            this.system = system;
            return this;
        }
        public CreateReplicationJobRequestDisksSystem getSystem() {
            return this.system;
        }

    }

    public static class CreateReplicationJobRequestSystemDiskPart extends TeaModel {
        /**
         * <p>Specifies whether to enable block replication for partition N in the destination system disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Block")
        public Boolean block;

        /**
         * <p>The ID of partition N in the destination system disk. The partitions in the destination system disk are arranged in the same sequential order as those in the source system disk.</p>
         * <blockquote>
         * <p> You must set both the SystemDiskPart.N.Device and <code>SystemDiskPart.N.SizeBytes</code> parameters or leave both parameters empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0_1</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The size of the partition N in the destination system disk. Unit: bytes. The default value is equal to the partition size of the source system disk.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The total size of all partitions in the destination system disk cannot exceed the size of the destination system disk.</p>
         * </li>
         * <li><p>You must set both the <code>SystemDiskPart.N.Device</code> and SystemDiskPart.N.SizeBytes parameters or leave both parameters empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>254803968</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static CreateReplicationJobRequestSystemDiskPart build(java.util.Map<String, ?> map) throws Exception {
            CreateReplicationJobRequestSystemDiskPart self = new CreateReplicationJobRequestSystemDiskPart();
            return TeaModel.build(map, self);
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

        public CreateReplicationJobRequestSystemDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class CreateReplicationJobRequestTag extends TeaModel {
        /**
         * <p>The key of the tag for the migration job. Valid values of N: 1 to 20.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag for the migration job. Valid values of N: 1 to 20.</p>
         * <p>The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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

}
