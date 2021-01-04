// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeSourceServersResponseBody extends TeaModel {
    @NameInMap("SourceServers")
    public DescribeSourceServersResponseBodySourceServers sourceServers;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeSourceServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSourceServersResponseBody self = new DescribeSourceServersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSourceServersResponseBody setSourceServers(DescribeSourceServersResponseBodySourceServers sourceServers) {
        this.sourceServers = sourceServers;
        return this;
    }
    public DescribeSourceServersResponseBodySourceServers getSourceServers() {
        return this.sourceServers;
    }

    public DescribeSourceServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSourceServersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSourceServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSourceServersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart extends TeaModel {
        @NameInMap("CanBlock")
        public Boolean canBlock;

        @NameInMap("SizeBytes")
        public Long sizeBytes;

        @NameInMap("Need")
        public Boolean need;

        @NameInMap("Device")
        public String device;

        @NameInMap("Path")
        public String path;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart self = new DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart setCanBlock(Boolean canBlock) {
            this.canBlock = canBlock;
            return this;
        }
        public Boolean getCanBlock() {
            return this.canBlock;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart setNeed(Boolean need) {
            this.need = need;
            return this;
        }
        public Boolean getNeed() {
            return this.need;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts extends TeaModel {
        @NameInMap("Part")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart> part;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts self = new DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts setPart(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart> getPart() {
            return this.part;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Parts")
        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts parts;

        @NameInMap("Path")
        public String path;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk self = new DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk setParts(DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts parts) {
            this.parts = parts;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts getParts() {
            return this.parts;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk> dataDisk;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDataDisks self = new DescribeSourceServersResponseBodySourceServersSourceServerDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisks setDataDisk(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart extends TeaModel {
        @NameInMap("CanBlock")
        public Boolean canBlock;

        @NameInMap("SizeBytes")
        public Long sizeBytes;

        @NameInMap("Need")
        public Boolean need;

        @NameInMap("Device")
        public String device;

        @NameInMap("Path")
        public String path;

        public static DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart self = new DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart setCanBlock(Boolean canBlock) {
            this.canBlock = canBlock;
            return this;
        }
        public Boolean getCanBlock() {
            return this.canBlock;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart setNeed(Boolean need) {
            this.need = need;
            return this;
        }
        public Boolean getNeed() {
            return this.need;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts extends TeaModel {
        @NameInMap("SystemDiskPart")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart> systemDiskPart;

        public static DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts self = new DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts setSystemDiskPart(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart> systemDiskPart) {
            this.systemDiskPart = systemDiskPart;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart> getSystemDiskPart() {
            return this.systemDiskPart;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServer extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("HeartbeatRate")
        public Integer heartbeatRate;

        @NameInMap("State")
        public String state;

        @NameInMap("DataDisks")
        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisks dataDisks;

        @NameInMap("SystemDiskParts")
        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts systemDiskParts;

        @NameInMap("KernelLevel")
        public Integer kernelLevel;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("AgentVersion")
        public String agentVersion;

        @NameInMap("StatusInfo")
        public String statusInfo;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("Description")
        public String description;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ReplicationDriver")
        public String replicationDriver;

        @NameInMap("Name")
        public String name;

        @NameInMap("SystemInfo")
        public String systemInfo;

        @NameInMap("Architecture")
        public String architecture;

        public static DescribeSourceServersResponseBodySourceServersSourceServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServer self = new DescribeSourceServersResponseBodySourceServersSourceServer();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setHeartbeatRate(Integer heartbeatRate) {
            this.heartbeatRate = heartbeatRate;
            return this;
        }
        public Integer getHeartbeatRate() {
            return this.heartbeatRate;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setDataDisks(DescribeSourceServersResponseBodySourceServersSourceServerDataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisks getDataDisks() {
            return this.dataDisks;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setSystemDiskParts(DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts systemDiskParts) {
            this.systemDiskParts = systemDiskParts;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts getSystemDiskParts() {
            return this.systemDiskParts;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setKernelLevel(Integer kernelLevel) {
            this.kernelLevel = kernelLevel;
            return this;
        }
        public Integer getKernelLevel() {
            return this.kernelLevel;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setStatusInfo(String statusInfo) {
            this.statusInfo = statusInfo;
            return this;
        }
        public String getStatusInfo() {
            return this.statusInfo;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setReplicationDriver(String replicationDriver) {
            this.replicationDriver = replicationDriver;
            return this;
        }
        public String getReplicationDriver() {
            return this.replicationDriver;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setSystemInfo(String systemInfo) {
            this.systemInfo = systemInfo;
            return this;
        }
        public String getSystemInfo() {
            return this.systemInfo;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServers extends TeaModel {
        @NameInMap("SourceServer")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServer> sourceServer;

        public static DescribeSourceServersResponseBodySourceServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServers self = new DescribeSourceServersResponseBodySourceServers();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServers setSourceServer(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServer> sourceServer) {
            this.sourceServer = sourceServer;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServer> getSourceServer() {
            return this.sourceServer;
        }

    }

}
