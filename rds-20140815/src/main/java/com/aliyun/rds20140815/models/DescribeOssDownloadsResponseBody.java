// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeOssDownloadsResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Details of the backup file.</p>
     */
    @NameInMap("Items")
    public DescribeOssDownloadsResponseBodyItems items;

    /**
     * <p>The ID of the migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>562154852</p>
     */
    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5409D02-D661-4BF3-8F3D-0A814D0574E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOssDownloadsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssDownloadsResponseBody self = new DescribeOssDownloadsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssDownloadsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeOssDownloadsResponseBody setItems(DescribeOssDownloadsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeOssDownloadsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeOssDownloadsResponseBody setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    public DescribeOssDownloadsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOssDownloadsResponseBodyItemsOssDownload extends TeaModel {
        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>Database</strong>: full backup file</li>
         * <li><strong>Differential_Database</strong>: incremental backup file</li>
         * <li><strong>Transaction_Log</strong>: log backup file</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Database</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The time when the backup file was created in the download list. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-08-17T12:45:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>App description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-08-27T12:45:15Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the backup file stored in the Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The size of the backup file. Unit: MB</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>Indicates whether the backup file is available. Valid values: <strong>True and False</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsAvailable")
        public String isAvailable;

        /**
         * <p>The state of the backup file. Valid values:</p>
         * <ul>
         * <li><strong>NoStart</strong></li>
         * <li><strong>Downloading</strong></li>
         * <li><strong>Finished</strong></li>
         * <li><strong>DownloadFailed</strong></li>
         * <li><strong>VerifyFailed</strong></li>
         * <li><strong>Deleted</strong></li>
         * <li><strong>DeleteFailed</strong></li>
         * <li><strong>CheckSuccess</strong></li>
         * <li><strong>CheckFailed</strong></li>
         * <li><strong>Restoring</strong></li>
         * <li><strong>Restored</strong></li>
         * <li><strong>RestoreFailed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeOssDownloadsResponseBodyItemsOssDownload build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsResponseBodyItemsOssDownload self = new DescribeOssDownloadsResponseBodyItemsOssDownload();
            return TeaModel.build(map, self);
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setIsAvailable(String isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public String getIsAvailable() {
            return this.isAvailable;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeOssDownloadsResponseBodyItems extends TeaModel {
        @NameInMap("OssDownload")
        public java.util.List<DescribeOssDownloadsResponseBodyItemsOssDownload> ossDownload;

        public static DescribeOssDownloadsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsResponseBodyItems self = new DescribeOssDownloadsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeOssDownloadsResponseBodyItems setOssDownload(java.util.List<DescribeOssDownloadsResponseBodyItemsOssDownload> ossDownload) {
            this.ossDownload = ossDownload;
            return this;
        }
        public java.util.List<DescribeOssDownloadsResponseBodyItemsOssDownload> getOssDownload() {
            return this.ossDownload;
        }

    }

}
