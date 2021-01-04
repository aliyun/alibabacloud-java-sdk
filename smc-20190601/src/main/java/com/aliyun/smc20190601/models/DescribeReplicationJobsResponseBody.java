// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeReplicationJobsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ReplicationJobs")
    public DescribeReplicationJobsResponseBodyReplicationJobs replicationJobs;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeReplicationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationJobsResponseBody self = new DescribeReplicationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeReplicationJobsResponseBody setReplicationJobs(DescribeReplicationJobsResponseBodyReplicationJobs replicationJobs) {
        this.replicationJobs = replicationJobs;
        return this;
    }
    public DescribeReplicationJobsResponseBodyReplicationJobs getReplicationJobs() {
        return this.replicationJobs;
    }

    public DescribeReplicationJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReplicationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReplicationJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart extends TeaModel {
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        @NameInMap("Block")
        public Boolean block;

        @NameInMap("Device")
        public String device;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts extends TeaModel {
        @NameInMap("Part")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart> part;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts setPart(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart> getPart() {
            return this.part;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Parts")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts parts;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk setParts(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts parts) {
            this.parts = parts;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts getParts() {
            return this.parts;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk> dataDisk;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks setDataDisk(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart extends TeaModel {
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        @NameInMap("Block")
        public Boolean block;

        @NameInMap("Device")
        public String device;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts extends TeaModel {
        @NameInMap("SystemDiskPart")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart> systemDiskPart;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts setSystemDiskPart(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart> systemDiskPart) {
            this.systemDiskPart = systemDiskPart;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart> getSystemDiskPart() {
            return this.systemDiskPart;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ImageId")
        public String imageId;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns extends TeaModel {
        @NameInMap("ReplicationJobRun")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun> replicationJobRun;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns setReplicationJobRun(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun> replicationJobRun) {
            this.replicationJobRun = replicationJobRun;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun> getReplicationJobRun() {
            return this.replicationJobRun;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob extends TeaModel {
        @NameInMap("Frequency")
        public Integer frequency;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ScheduledStartTime")
        public String scheduledStartTime;

        @NameInMap("MaxNumberOfImageToKeep")
        public Integer maxNumberOfImageToKeep;

        @NameInMap("ContainerNamespace")
        public String containerNamespace;

        @NameInMap("DataDisks")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks dataDisks;

        @NameInMap("StatusInfo")
        public String statusInfo;

        @NameInMap("InstanceRamRole")
        public String instanceRamRole;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("Description")
        public String description;

        @NameInMap("ReplicationParameters")
        public String replicationParameters;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ValidTime")
        public String validTime;

        @NameInMap("NetMode")
        public Integer netMode;

        @NameInMap("ContainerTag")
        public String containerTag;

        @NameInMap("LicenseType")
        public String licenseType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Progress")
        public Float progress;

        @NameInMap("RunOnce")
        public Boolean runOnce;

        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("ContainerRepository")
        public String containerRepository;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SystemDiskParts")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts systemDiskParts;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TransitionInstanceId")
        public String transitionInstanceId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("ReplicationJobRuns")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns replicationJobRuns;

        @NameInMap("TargetType")
        public String targetType;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setFrequency(Integer frequency) {
            this.frequency = frequency;
            return this;
        }
        public Integer getFrequency() {
            return this.frequency;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setScheduledStartTime(String scheduledStartTime) {
            this.scheduledStartTime = scheduledStartTime;
            return this;
        }
        public String getScheduledStartTime() {
            return this.scheduledStartTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setMaxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
            this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
            return this;
        }
        public Integer getMaxNumberOfImageToKeep() {
            return this.maxNumberOfImageToKeep;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setContainerNamespace(String containerNamespace) {
            this.containerNamespace = containerNamespace;
            return this;
        }
        public String getContainerNamespace() {
            return this.containerNamespace;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setDataDisks(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks getDataDisks() {
            return this.dataDisks;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setStatusInfo(String statusInfo) {
            this.statusInfo = statusInfo;
            return this;
        }
        public String getStatusInfo() {
            return this.statusInfo;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setInstanceRamRole(String instanceRamRole) {
            this.instanceRamRole = instanceRamRole;
            return this;
        }
        public String getInstanceRamRole() {
            return this.instanceRamRole;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setReplicationParameters(String replicationParameters) {
            this.replicationParameters = replicationParameters;
            return this;
        }
        public String getReplicationParameters() {
            return this.replicationParameters;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setValidTime(String validTime) {
            this.validTime = validTime;
            return this;
        }
        public String getValidTime() {
            return this.validTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setNetMode(Integer netMode) {
            this.netMode = netMode;
            return this;
        }
        public Integer getNetMode() {
            return this.netMode;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setContainerTag(String containerTag) {
            this.containerTag = containerTag;
            return this;
        }
        public String getContainerTag() {
            return this.containerTag;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setLicenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public String getLicenseType() {
            return this.licenseType;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setRunOnce(Boolean runOnce) {
            this.runOnce = runOnce;
            return this;
        }
        public Boolean getRunOnce() {
            return this.runOnce;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setContainerRepository(String containerRepository) {
            this.containerRepository = containerRepository;
            return this;
        }
        public String getContainerRepository() {
            return this.containerRepository;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setSystemDiskParts(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts systemDiskParts) {
            this.systemDiskParts = systemDiskParts;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts getSystemDiskParts() {
            return this.systemDiskParts;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setTransitionInstanceId(String transitionInstanceId) {
            this.transitionInstanceId = transitionInstanceId;
            return this;
        }
        public String getTransitionInstanceId() {
            return this.transitionInstanceId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setReplicationJobRuns(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns replicationJobRuns) {
            this.replicationJobRuns = replicationJobRuns;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns getReplicationJobRuns() {
            return this.replicationJobRuns;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobs extends TeaModel {
        @NameInMap("ReplicationJob")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob> replicationJob;

        public static DescribeReplicationJobsResponseBodyReplicationJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobs self = new DescribeReplicationJobsResponseBodyReplicationJobs();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobs setReplicationJob(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob> replicationJob) {
            this.replicationJob = replicationJob;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob> getReplicationJob() {
            return this.replicationJob;
        }

    }

}
