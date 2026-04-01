// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListUserBackupFilesResponseBody extends TeaModel {
    /**
     * <p>The information about the full backup files.</p>
     */
    @NameInMap("Records")
    public java.util.List<ListUserBackupFilesResponseBodyRecords> records;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AD67C22F-64F3-4448-A9A8-D1606D242879</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUserBackupFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserBackupFilesResponseBody self = new ListUserBackupFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserBackupFilesResponseBody setRecords(java.util.List<ListUserBackupFilesResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListUserBackupFilesResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListUserBackupFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserBackupFilesResponseBodyRecords extends TeaModel {
        /**
         * <p>The ID of the full backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>b-kwwvr7v8t7of********</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The information about the binary log file that contains incremental data. If incremental data is generated during the full backup, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;binlogPosition\&quot;:\&quot;154\&quot;,\&quot;binlogFile\&quot;:\&quot;0.000002\&quot;}</p>
         */
        @NameInMap("BinlogInfo")
        public String binlogInfo;

        /**
         * <p>The description of the full backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupTest</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the system started to import the full backup file. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1623231084000</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the full backup file is successfully imported. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1623231750000</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The time when the full backup file is successfully imported. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1623231750000</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The name of the OSS bucket in which the full backup file is stored as an object.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupTest</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <p>The metadata of the full backup file. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Accept-Ranges\&quot;:\&quot;bytes\&quot;,\&quot;Connection\&quot;:\&quot;keep-alive\&quot;,\&quot;Content-Length\&quot;:81014337,\&quot;Content-Type\&quot;:\&quot;application/octet-stream\&quot;,\&quot;Date\&quot;:1623309548000,\&quot;ETag\&quot;:\&quot;889FE9E5FCEBFE4781829488A352863B-1\&quot;,\&quot;Last-Modified\&quot;:1622186844000,\&quot;Server\&quot;:\&quot;AliyunOSS\&quot;,\&quot;x-oss-hash-crc64ecma\&quot;:\&quot;5793608435727323129\&quot;,\&quot;x-oss-object-type\&quot;:\&quot;Multipart\&quot;,\&quot;x-oss-request-id\&quot;:\&quot;60C1BCEC92572F37318BD499\&quot;,\&quot;x-oss-server-time\&quot;:\&quot;166\&quot;,\&quot;x-oss-storage-class\&quot;:\&quot;Standard\&quot;}</p>
         */
        @NameInMap("OssFileMetaData")
        public String ossFileMetaData;

        /**
         * <p>The name of the full backup file that is stored as an object in an OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>backup_qp.xb</p>
         */
        @NameInMap("OssFileName")
        public String ossFileName;

        /**
         * <p>The path of the full backup file that is stored as an object in an OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test/backup_qp.xb</p>
         */
        @NameInMap("OssFilePath")
        public String ossFilePath;

        /**
         * <p>The size of the full backup file that is stored as an object in an OSS bucket. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>79115</p>
         */
        @NameInMap("OssFileSize")
        public Long ossFileSize;

        /**
         * <p>The URL to download the full backup file from the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong><strong>.oss-ap-</strong></strong></strong>**.aliyuncs.com/backup_qp.xb</p>
         */
        @NameInMap("OssUrl")
        public String ossUrl;

        /**
         * <p>The reason why the full backup file failed to be imported.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The amount of storage that is required to restore the data of the full backup file. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("RestoreSize")
        public String restoreSize;

        /**
         * <p>The retention period of the full backup file. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Retention")
        public Integer retention;

        /**
         * <p>The status of the full backup file. Valid values:</p>
         * <ul>
         * <li><strong>Importing</strong>: The full backup file is being imported.</li>
         * <li><strong>Failed</strong>: The full backup file fails to be imported.</li>
         * <li><strong>CheckSucccess</strong>: The full backup file passes the check.</li>
         * <li><strong>BackupSuccess</strong>: The full backup file is imported.</li>
         * <li><strong>Deleted</strong>: The full backup file is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BackupSuccess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The zone ID of the full backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListUserBackupFilesResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUserBackupFilesResponseBodyRecords self = new ListUserBackupFilesResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListUserBackupFilesResponseBodyRecords setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public ListUserBackupFilesResponseBodyRecords setBinlogInfo(String binlogInfo) {
            this.binlogInfo = binlogInfo;
            return this;
        }
        public String getBinlogInfo() {
            return this.binlogInfo;
        }

        public ListUserBackupFilesResponseBodyRecords setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListUserBackupFilesResponseBodyRecords setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListUserBackupFilesResponseBodyRecords setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListUserBackupFilesResponseBodyRecords setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public ListUserBackupFilesResponseBodyRecords setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListUserBackupFilesResponseBodyRecords setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ListUserBackupFilesResponseBodyRecords setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public ListUserBackupFilesResponseBodyRecords setOssFileMetaData(String ossFileMetaData) {
            this.ossFileMetaData = ossFileMetaData;
            return this;
        }
        public String getOssFileMetaData() {
            return this.ossFileMetaData;
        }

        public ListUserBackupFilesResponseBodyRecords setOssFileName(String ossFileName) {
            this.ossFileName = ossFileName;
            return this;
        }
        public String getOssFileName() {
            return this.ossFileName;
        }

        public ListUserBackupFilesResponseBodyRecords setOssFilePath(String ossFilePath) {
            this.ossFilePath = ossFilePath;
            return this;
        }
        public String getOssFilePath() {
            return this.ossFilePath;
        }

        public ListUserBackupFilesResponseBodyRecords setOssFileSize(Long ossFileSize) {
            this.ossFileSize = ossFileSize;
            return this;
        }
        public Long getOssFileSize() {
            return this.ossFileSize;
        }

        public ListUserBackupFilesResponseBodyRecords setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public ListUserBackupFilesResponseBodyRecords setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListUserBackupFilesResponseBodyRecords setRestoreSize(String restoreSize) {
            this.restoreSize = restoreSize;
            return this;
        }
        public String getRestoreSize() {
            return this.restoreSize;
        }

        public ListUserBackupFilesResponseBodyRecords setRetention(Integer retention) {
            this.retention = retention;
            return this;
        }
        public Integer getRetention() {
            return this.retention;
        }

        public ListUserBackupFilesResponseBodyRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserBackupFilesResponseBodyRecords setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
