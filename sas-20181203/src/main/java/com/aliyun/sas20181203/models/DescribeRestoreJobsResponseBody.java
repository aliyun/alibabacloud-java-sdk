// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobsResponseBody extends TeaModel {
    /**
     * <p>The folder to which the backup data is restored. After you create the restoration task, the backup data is restored to the specified folder.</p>
     */
    @NameInMap("PageInfo")
    public DescribeRestoreJobsResponseBodyPageInfo pageInfo;

    /**
     * <p>The directory excluded from the anti-ransomware policy. The value is the directory that you specify to skip protection when you create the anti-ransomware policy.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp when the restoration task is created. Unit: milliseconds.</p>
     */
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
        /**
         * <p>The hash value of the snapshot that stores backup data when the data is backed up.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries to return on each page. Default value: **10**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The number of the page to return. Default value: **1**.</p>
         */
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
        /**
         * <p>The URL to download the CSV file. The CSV file contains the files that fail to be restored.</p>
         */
        @NameInMap("ActualBytes")
        public Long actualBytes;

        @NameInMap("BytesDone")
        public Long bytesDone;

        /**
         * <p>The size of backup data. Unit: bytes.</p>
         */
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        /**
         * <p>The time when the restoration task is updated.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The ID of the backup vault in which the backup data is stored.</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>RUNNING</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>DescribeRestoreJobs</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>WB01014029</p>
         */
        @NameInMap("ErrorCount")
        public Long errorCount;

        /**
         * <p>The included directory based on which the files to restore are located. The value is the directory that you specify for protection when you create the anti-ransomware policy</p>
         */
        @NameInMap("ErrorFile")
        public String errorFile;

        /**
         * <p>The status of the restoration task. Valid values:</p>
         * <br>
         * <p>*   **RUNNING**: The task is running.</p>
         * <p>*   **COMPLETE**: The task is complete.</p>
         * <p>*   **FAILED**: The task fails.</p>
         * <p>*   **CANCELING**: The task is being canceled.</p>
         * <p>*   **CANCELED**: The task is canceled.</p>
         * <p>*   **PARTIAL_COMPLETE**: The task is partially successful.</p>
         * <p>*   **CREATED**: The task is created but is not run.</p>
         * <p>*   **EXPIRED**: The task is not updated.</p>
         * <p>*   **QUEUED**: The task is waiting to be run.</p>
         * <p>*   **CLIENT_DELETED**: The task fails because the anti-ransomware agent is uninstalled.</p>
         */
        @NameInMap("ErrorFileUrl")
        public String errorFileUrl;

        /**
         * <p>1</p>
         */
        @NameInMap("ErrorType")
        public String errorType;

        /**
         * <p>Queries the details about restoration tasks.</p>
         */
        @NameInMap("Eta")
        public Long eta;

        /**
         * <p>The public IP address of the server whose data you want to restore.</p>
         */
        @NameInMap("Excludes")
        public String excludes;

        /**
         * <p>The total number of restoration tasks returned.</p>
         */
        @NameInMap("ExitCode")
        public String exitCode;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The ID of the anti-ransomware agent that is used to back up data.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The total size of data that you want to restore. Unit: bytes.</p>
         */
        @NameInMap("Includes")
        public String includes;

        /**
         * <p>The speed of data restoration. Unit: byte/s.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The error code that is returned for the restoration task.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>10</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The timestamp when the restoration task is complete. Unit: milliseconds.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The number of files that are backed up.</p>
         */
        @NameInMap("ItemsDone")
        public Long itemsDone;

        @NameInMap("ItemsTotal")
        public Long itemsTotal;

        /**
         * <p>The total number of files that you want to restore.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the anti-ransomware agent that is used to restore data.</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>The internal IP address of the server whose data you want to restore.</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The version of the backup data.</p>
         */
        @NameInMap("RestoreId")
        public String restoreId;

        /**
         * <p>The UUID of the server whose data you want to restore.</p>
         */
        @NameInMap("RestoreName")
        public String restoreName;

        /**
         * <p>The total size of data that is restored. Unit: bytes.</p>
         */
        @NameInMap("RestoreType")
        public String restoreType;

        /**
         * <p>The number of restoration tasks returned on the current page.</p>
         */
        @NameInMap("SnapshotHash")
        public String snapshotHash;

        /**
         * <p>The ID of the server whose data you want to restore.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The time when the restoration task is created.</p>
         */
        @NameInMap("SnapshotVersion")
        public String snapshotVersion;

        /**
         * <p>The hash value ID of the snapshot that stores backup data when the data is backed up.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>An array that consists of the restoration tasks.</p>
         */
        @NameInMap("SourceClientId")
        public String sourceClientId;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("Speed")
        public Long speed;

        /**
         * <p>The path to the source file that you want to restore.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The number of entries returned per page. Default value: **10**.</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The name of the restoration task.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the restoration task.</p>
         */
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
