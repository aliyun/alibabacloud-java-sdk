// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListUserBackupFilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Records")
    public java.util.List<ListUserBackupFilesResponseBodyRecords> records;

    public static ListUserBackupFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserBackupFilesResponseBody self = new ListUserBackupFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserBackupFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserBackupFilesResponseBody setRecords(java.util.List<ListUserBackupFilesResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListUserBackupFilesResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListUserBackupFilesResponseBodyRecords extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("OssFilePath")
        public String ossFilePath;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("OssFileSize")
        public Long ossFileSize;

        @NameInMap("OssFileName")
        public String ossFileName;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("RestoreSize")
        public String restoreSize;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Retention")
        public Integer retention;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("OssUrl")
        public String ossUrl;

        @NameInMap("OssFileMetaData")
        public String ossFileMetaData;

        @NameInMap("BinlogInfo")
        public String binlogInfo;

        @NameInMap("Reason")
        public String reason;

        public static ListUserBackupFilesResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUserBackupFilesResponseBodyRecords self = new ListUserBackupFilesResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListUserBackupFilesResponseBodyRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserBackupFilesResponseBodyRecords setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListUserBackupFilesResponseBodyRecords setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListUserBackupFilesResponseBodyRecords setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListUserBackupFilesResponseBodyRecords setOssFilePath(String ossFilePath) {
            this.ossFilePath = ossFilePath;
            return this;
        }
        public String getOssFilePath() {
            return this.ossFilePath;
        }

        public ListUserBackupFilesResponseBodyRecords setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public ListUserBackupFilesResponseBodyRecords setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ListUserBackupFilesResponseBodyRecords setOssFileSize(Long ossFileSize) {
            this.ossFileSize = ossFileSize;
            return this;
        }
        public Long getOssFileSize() {
            return this.ossFileSize;
        }

        public ListUserBackupFilesResponseBodyRecords setOssFileName(String ossFileName) {
            this.ossFileName = ossFileName;
            return this;
        }
        public String getOssFileName() {
            return this.ossFileName;
        }

        public ListUserBackupFilesResponseBodyRecords setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public ListUserBackupFilesResponseBodyRecords setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public ListUserBackupFilesResponseBodyRecords setRestoreSize(String restoreSize) {
            this.restoreSize = restoreSize;
            return this;
        }
        public String getRestoreSize() {
            return this.restoreSize;
        }

        public ListUserBackupFilesResponseBodyRecords setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListUserBackupFilesResponseBodyRecords setRetention(Integer retention) {
            this.retention = retention;
            return this;
        }
        public Integer getRetention() {
            return this.retention;
        }

        public ListUserBackupFilesResponseBodyRecords setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListUserBackupFilesResponseBodyRecords setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public ListUserBackupFilesResponseBodyRecords setOssFileMetaData(String ossFileMetaData) {
            this.ossFileMetaData = ossFileMetaData;
            return this;
        }
        public String getOssFileMetaData() {
            return this.ossFileMetaData;
        }

        public ListUserBackupFilesResponseBodyRecords setBinlogInfo(String binlogInfo) {
            this.binlogInfo = binlogInfo;
            return this;
        }
        public String getBinlogInfo() {
            return this.binlogInfo;
        }

        public ListUserBackupFilesResponseBodyRecords setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
