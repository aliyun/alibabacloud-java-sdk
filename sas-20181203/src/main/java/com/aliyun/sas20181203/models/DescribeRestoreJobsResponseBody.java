// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobsResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeRestoreJobsResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the restoration tasks.
    @NameInMap("RestoreJobs")
    public java.util.List<DescribeRestoreJobsResponseBodyRestoreJobs> restoreJobs;

    public static DescribeRestoreJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreJobsResponseBody self = new DescribeRestoreJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreJobsResponseBody setPageInfo(DescribeRestoreJobsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeRestoreJobsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeRestoreJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreJobsResponseBody setRestoreJobs(java.util.List<DescribeRestoreJobsResponseBodyRestoreJobs> restoreJobs) {
        this.restoreJobs = restoreJobs;
        return this;
    }
    public java.util.List<DescribeRestoreJobsResponseBodyRestoreJobs> getRestoreJobs() {
        return this.restoreJobs;
    }

    public static class DescribeRestoreJobsResponseBodyPageInfo extends TeaModel {
        // The number of restoration tasks returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **10**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of restoration tasks returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeRestoreJobsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreJobsResponseBodyPageInfo self = new DescribeRestoreJobsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreJobsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeRestoreJobsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeRestoreJobsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeRestoreJobsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeRestoreJobsResponseBodyRestoreJobs extends TeaModel {
        // The size of backup data. Unit: bytes.
        @NameInMap("ActualBytes")
        public Long actualBytes;

        // The total size of data that is restored. Unit: bytes.
        @NameInMap("BytesDone")
        public Long bytesDone;

        // The total size of data that you want to restore. Unit: bytes.
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        // The ID of the anti-ransomware agent that is used to restore data.
        @NameInMap("ClientId")
        public String clientId;

        // The timestamp when the restoration task is complete. Unit: milliseconds.
        @NameInMap("CompleteTime")
        public Long completeTime;

        // The timestamp when the restoration task is created. Unit: milliseconds.
        @NameInMap("CreatedTime")
        public Long createdTime;

        // The duration of the restoration task. Unit: seconds.
        @NameInMap("Duration")
        public Long duration;

        // The number of the restoration tasks on which errors occur.
        @NameInMap("ErrorCount")
        public Long errorCount;

        // The name of the CSV file. The CSV file contains the files that fail to be restored.
        @NameInMap("ErrorFile")
        public String errorFile;

        // The URL to download the CSV file. The CSV file contains the files that fail to be restored.
        @NameInMap("ErrorFileUrl")
        public String errorFileUrl;

        // The error code that is returned for the restoration task.
        @NameInMap("ErrorType")
        public String errorType;

        // The timestamp when the in-progress restoration task is expected to be complete. Unit: seconds.
        @NameInMap("Eta")
        public Long eta;

        // The directory excluded from the anti-ransomware policy. The value is the directory that you specify to skip protection when you create the anti-ransomware policy.
        @NameInMap("Excludes")
        public String excludes;

        // The return value of the restoration task.
        @NameInMap("ExitCode")
        public String exitCode;

        // The time when the restoration task is created.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The time when the restoration task is updated.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The included directory based on which the files to restore are located. The value is the directory that you specify for protection when you create the anti-ransomware policy
        @NameInMap("Includes")
        public String includes;

        // The ID of the server whose data you want to restore.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server whose data you want to restore.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the server whose data you want to restore.
        @NameInMap("InternetIp")
        public String internetIp;

        // The internal IP address of the server whose data you want to restore.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The number of files that are backed up.
        @NameInMap("ItemsDone")
        public Long itemsDone;

        // The total number of files that you want to restore.
        @NameInMap("ItemsTotal")
        public Long itemsTotal;

        // The error message returned.
        @NameInMap("Message")
        public String message;

        // The progress of the restoration task in percentage.
        @NameInMap("Percentage")
        public Integer percentage;

        // The ID of the request, which is used to locate and troubleshoot issues.
        @NameInMap("RequestId")
        public String requestId;

        // The ID of the restoration task.
        @NameInMap("RestoreId")
        public String restoreId;

        // The name of the restoration task.
        @NameInMap("RestoreName")
        public String restoreName;

        // The type of the file that is restored. Valid values:
        // 
        // *   **ECS_FILE**: files on Elastic Compute Service (ECS) instances
        // *   **FILE**: files on servers in data centers
        @NameInMap("RestoreType")
        public String restoreType;

        // The hash value of the snapshot that stores backup data when the data is backed up.
        @NameInMap("SnapshotHash")
        public String snapshotHash;

        // The hash value ID of the snapshot that stores backup data when the data is backed up.
        @NameInMap("SnapshotId")
        public String snapshotId;

        // The version of the backup data.
        @NameInMap("SnapshotVersion")
        public String snapshotVersion;

        // The path to the source file that you want to restore.
        @NameInMap("Source")
        public String source;

        // The ID of the anti-ransomware agent that is used to back up data.
        @NameInMap("SourceClientId")
        public String sourceClientId;

        // The speed of data restoration. Unit: byte/s.
        @NameInMap("Speed")
        public Long speed;

        // The status of the restoration task. Valid values:
        // 
        // *   **RUNNING**: The task is running.
        // *   **COMPLETE**: The task is complete.
        // *   **FAILED**: The task fails.
        // *   **CANCELING**: The task is being canceled.
        // *   **CANCELED**: The task is canceled.
        // *   **PARTIAL_COMPLETE**: The task is partially successful.
        // *   **CREATED**: The task is created but is not run.
        // *   **EXPIRED**: The task is not updated.
        // *   **QUEUED**: The task is waiting to be run.
        // *   **CLIENT_DELETED**: The task fails because the anti-ransomware agent is uninstalled.
        @NameInMap("Status")
        public String status;

        // The folder to which the backup data is restored. After you create the restoration task, the backup data is restored to the specified folder.
        @NameInMap("Target")
        public String target;

        // The timestamp when the restoration task was last updated. Unit: milliseconds.
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        // The UUID of the server whose data you want to restore.
        @NameInMap("Uuid")
        public String uuid;

        // The ID of the backup vault in which the backup data is stored.
        @NameInMap("VaultId")
        public String vaultId;

        public static DescribeRestoreJobsResponseBodyRestoreJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreJobsResponseBodyRestoreJobs self = new DescribeRestoreJobsResponseBodyRestoreJobs();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setActualBytes(Long actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public Long getActualBytes() {
            return this.actualBytes;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setBytesDone(Long bytesDone) {
            this.bytesDone = bytesDone;
            return this;
        }
        public Long getBytesDone() {
            return this.bytesDone;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setErrorFile(String errorFile) {
            this.errorFile = errorFile;
            return this;
        }
        public String getErrorFile() {
            return this.errorFile;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setErrorFileUrl(String errorFileUrl) {
            this.errorFileUrl = errorFileUrl;
            return this;
        }
        public String getErrorFileUrl() {
            return this.errorFileUrl;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setEta(Long eta) {
            this.eta = eta;
            return this;
        }
        public Long getEta() {
            return this.eta;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setExcludes(String excludes) {
            this.excludes = excludes;
            return this;
        }
        public String getExcludes() {
            return this.excludes;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setExitCode(String exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public String getExitCode() {
            return this.exitCode;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setIncludes(String includes) {
            this.includes = includes;
            return this;
        }
        public String getIncludes() {
            return this.includes;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setItemsDone(Long itemsDone) {
            this.itemsDone = itemsDone;
            return this;
        }
        public Long getItemsDone() {
            return this.itemsDone;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setItemsTotal(Long itemsTotal) {
            this.itemsTotal = itemsTotal;
            return this;
        }
        public Long getItemsTotal() {
            return this.itemsTotal;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setRestoreId(String restoreId) {
            this.restoreId = restoreId;
            return this;
        }
        public String getRestoreId() {
            return this.restoreId;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setRestoreName(String restoreName) {
            this.restoreName = restoreName;
            return this;
        }
        public String getRestoreName() {
            return this.restoreName;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setRestoreType(String restoreType) {
            this.restoreType = restoreType;
            return this;
        }
        public String getRestoreType() {
            return this.restoreType;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setSnapshotHash(String snapshotHash) {
            this.snapshotHash = snapshotHash;
            return this;
        }
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setSnapshotVersion(String snapshotVersion) {
            this.snapshotVersion = snapshotVersion;
            return this;
        }
        public String getSnapshotVersion() {
            return this.snapshotVersion;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setSourceClientId(String sourceClientId) {
            this.sourceClientId = sourceClientId;
            return this;
        }
        public String getSourceClientId() {
            return this.sourceClientId;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setSpeed(Long speed) {
            this.speed = speed;
            return this;
        }
        public Long getSpeed() {
            return this.speed;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeRestoreJobsResponseBodyRestoreJobs setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

}
