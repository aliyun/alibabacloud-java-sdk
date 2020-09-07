// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeOssDownloadsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("MigrateTaskId")
    @Validation(required = true)
    public String migrateTaskId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeOssDownloadsResponseItems items;

    public static DescribeOssDownloadsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssDownloadsResponse self = new DescribeOssDownloadsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssDownloadsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssDownloadsResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeOssDownloadsResponse setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    public DescribeOssDownloadsResponse setItems(DescribeOssDownloadsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeOssDownloadsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeOssDownloadsResponseItemsOssDownload extends TeaModel {
        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("BackupMode")
        @Validation(required = true)
        public String backupMode;

        @NameInMap("FileSize")
        @Validation(required = true)
        public String fileSize;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("IsAvailable")
        @Validation(required = true)
        public String isAvailable;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeOssDownloadsResponseItemsOssDownload build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsResponseItemsOssDownload self = new DescribeOssDownloadsResponseItemsOssDownload();
            return TeaModel.build(map, self);
        }

        public DescribeOssDownloadsResponseItemsOssDownload setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeOssDownloadsResponseItemsOssDownload setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOssDownloadsResponseItemsOssDownload setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeOssDownloadsResponseItemsOssDownload setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeOssDownloadsResponseItemsOssDownload setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public DescribeOssDownloadsResponseItemsOssDownload setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOssDownloadsResponseItemsOssDownload setIsAvailable(String isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public String getIsAvailable() {
            return this.isAvailable;
        }

        public DescribeOssDownloadsResponseItemsOssDownload setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeOssDownloadsResponseItems extends TeaModel {
        @NameInMap("OssDownload")
        @Validation(required = true)
        public java.util.List<DescribeOssDownloadsResponseItemsOssDownload> ossDownload;

        public static DescribeOssDownloadsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsResponseItems self = new DescribeOssDownloadsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeOssDownloadsResponseItems setOssDownload(java.util.List<DescribeOssDownloadsResponseItemsOssDownload> ossDownload) {
            this.ossDownload = ossDownload;
            return this;
        }
        public java.util.List<DescribeOssDownloadsResponseItemsOssDownload> getOssDownload() {
            return this.ossDownload;
        }

    }

}
