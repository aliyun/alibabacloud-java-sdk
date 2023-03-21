// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobsResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribeRestoreJobsResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("ActualBytes")
        public Long actualBytes;

        @NameInMap("BytesDone")
        public Long bytesDone;

        @NameInMap("BytesTotal")
        public Long bytesTotal;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("CompleteTime")
        public Long completeTime;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("ErrorFile")
        public String errorFile;

        @NameInMap("ErrorFileUrl")
        public String errorFileUrl;

        @NameInMap("ErrorType")
        public String errorType;

        @NameInMap("Eta")
        public Long eta;

        @NameInMap("Excludes")
        public String excludes;

        @NameInMap("ExitCode")
        public String exitCode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Includes")
        public String includes;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("ItemsDone")
        public Long itemsDone;

        @NameInMap("ItemsTotal")
        public Long itemsTotal;

        @NameInMap("Message")
        public String message;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("RestoreId")
        public String restoreId;

        @NameInMap("RestoreName")
        public String restoreName;

        @NameInMap("RestoreType")
        public String restoreType;

        @NameInMap("SnapshotHash")
        public String snapshotHash;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("SnapshotVersion")
        public String snapshotVersion;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceClientId")
        public String sourceClientId;

        @NameInMap("Speed")
        public Long speed;

        @NameInMap("Status")
        public String status;

        @NameInMap("Target")
        public String target;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        @NameInMap("Uuid")
        public String uuid;

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
