// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribeSnapshotsResponseBodyPageInfo pageInfo;

    @NameInMap("Snapshots")
    public java.util.List<DescribeSnapshotsResponseBodySnapshots> snapshots;

    public static DescribeSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsResponseBody self = new DescribeSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotsResponseBody setPageInfo(DescribeSnapshotsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeSnapshotsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeSnapshotsResponseBody setSnapshots(java.util.List<DescribeSnapshotsResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<DescribeSnapshotsResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public static class DescribeSnapshotsResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribeSnapshotsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodyPageInfo self = new DescribeSnapshotsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeSnapshotsResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeSnapshotsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSnapshotsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSnapshotsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeSnapshotsResponseBodySnapshots extends TeaModel {
        @NameInMap("ContainerSnapshotId")
        public String containerSnapshotId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SnapshotHash")
        public String snapshotHash;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ActualItems")
        public Long actualItems;

        @NameInMap("VaultId")
        public String vaultId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("ActualBytes")
        public Long actualBytes;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ExitCode")
        public String exitCode;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ItemsDone")
        public Long itemsDone;

        @NameInMap("BytesTotal")
        public Long bytesTotal;

        @NameInMap("CompleteTime")
        public Long completeTime;

        @NameInMap("Retention")
        public Long retention;

        @NameInMap("ErrorType")
        public String errorType;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("ParentSnapshotHash")
        public String parentSnapshotHash;

        @NameInMap("MachineInfoJson")
        public String machineInfoJson;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("Source")
        public String source;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("ParentHash")
        public String parentHash;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("ErrorFile")
        public String errorFile;

        @NameInMap("SnapshotType")
        public String snapshotType;

        @NameInMap("SnapshotName")
        public String snapshotName;

        @NameInMap("SnapshotOption")
        public String snapshotOption;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Path")
        public String path;

        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("ItemsTotal")
        public Long itemsTotal;

        @NameInMap("BytesDone")
        public Long bytesDone;

        @NameInMap("Paths")
        public java.util.List<String> paths;

        public static DescribeSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshots self = new DescribeSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshots setContainerSnapshotId(String containerSnapshotId) {
            this.containerSnapshotId = containerSnapshotId;
            return this;
        }
        public String getContainerSnapshotId() {
            return this.containerSnapshotId;
        }

        public DescribeSnapshotsResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotHash(String snapshotHash) {
            this.snapshotHash = snapshotHash;
            return this;
        }
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        public DescribeSnapshotsResponseBodySnapshots setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSnapshotsResponseBodySnapshots setActualItems(Long actualItems) {
            this.actualItems = actualItems;
            return this;
        }
        public Long getActualItems() {
            return this.actualItems;
        }

        public DescribeSnapshotsResponseBodySnapshots setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

        public DescribeSnapshotsResponseBodySnapshots setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSnapshotsResponseBodySnapshots setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeSnapshotsResponseBodySnapshots setActualBytes(Long actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public Long getActualBytes() {
            return this.actualBytes;
        }

        public DescribeSnapshotsResponseBodySnapshots setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DescribeSnapshotsResponseBodySnapshots setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeSnapshotsResponseBodySnapshots setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeSnapshotsResponseBodySnapshots setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeSnapshotsResponseBodySnapshots setExitCode(String exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public String getExitCode() {
            return this.exitCode;
        }

        public DescribeSnapshotsResponseBodySnapshots setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeSnapshotsResponseBodySnapshots setItemsDone(Long itemsDone) {
            this.itemsDone = itemsDone;
            return this;
        }
        public Long getItemsDone() {
            return this.itemsDone;
        }

        public DescribeSnapshotsResponseBodySnapshots setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public DescribeSnapshotsResponseBodySnapshots setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public DescribeSnapshotsResponseBodySnapshots setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribeSnapshotsResponseBodySnapshots setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public DescribeSnapshotsResponseBodySnapshots setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeSnapshotsResponseBodySnapshots setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeSnapshotsResponseBodySnapshots setParentSnapshotHash(String parentSnapshotHash) {
            this.parentSnapshotHash = parentSnapshotHash;
            return this;
        }
        public String getParentSnapshotHash() {
            return this.parentSnapshotHash;
        }

        public DescribeSnapshotsResponseBodySnapshots setMachineInfoJson(String machineInfoJson) {
            this.machineInfoJson = machineInfoJson;
            return this;
        }
        public String getMachineInfoJson() {
            return this.machineInfoJson;
        }

        public DescribeSnapshotsResponseBodySnapshots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSnapshotsResponseBodySnapshots setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public DescribeSnapshotsResponseBodySnapshots setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeSnapshotsResponseBodySnapshots setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSnapshotsResponseBodySnapshots setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeSnapshotsResponseBodySnapshots setParentHash(String parentHash) {
            this.parentHash = parentHash;
            return this;
        }
        public String getParentHash() {
            return this.parentHash;
        }

        public DescribeSnapshotsResponseBodySnapshots setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeSnapshotsResponseBodySnapshots setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeSnapshotsResponseBodySnapshots setErrorFile(String errorFile) {
            this.errorFile = errorFile;
            return this;
        }
        public String getErrorFile() {
            return this.errorFile;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotType(String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public String getSnapshotType() {
            return this.snapshotType;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotOption(String snapshotOption) {
            this.snapshotOption = snapshotOption;
            return this;
        }
        public String getSnapshotOption() {
            return this.snapshotOption;
        }

        public DescribeSnapshotsResponseBodySnapshots setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSnapshotsResponseBodySnapshots setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeSnapshotsResponseBodySnapshots setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeSnapshotsResponseBodySnapshots setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSnapshotsResponseBodySnapshots setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public DescribeSnapshotsResponseBodySnapshots setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeSnapshotsResponseBodySnapshots setItemsTotal(Long itemsTotal) {
            this.itemsTotal = itemsTotal;
            return this;
        }
        public Long getItemsTotal() {
            return this.itemsTotal;
        }

        public DescribeSnapshotsResponseBodySnapshots setBytesDone(Long bytesDone) {
            this.bytesDone = bytesDone;
            return this;
        }
        public Long getBytesDone() {
            return this.bytesDone;
        }

        public DescribeSnapshotsResponseBodySnapshots setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

    }

}
