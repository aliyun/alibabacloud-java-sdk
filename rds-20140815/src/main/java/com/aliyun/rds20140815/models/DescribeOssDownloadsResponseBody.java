// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeOssDownloadsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    @NameInMap("Items")
    public DescribeOssDownloadsResponseBodyItems items;

    public static DescribeOssDownloadsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssDownloadsResponseBody self = new DescribeOssDownloadsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssDownloadsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssDownloadsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeOssDownloadsResponseBody setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    public DescribeOssDownloadsResponseBody setItems(DescribeOssDownloadsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeOssDownloadsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeOssDownloadsResponseBodyItemsOssDownload extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("Status")
        public String status;

        @NameInMap("IsAvailable")
        public String isAvailable;

        @NameInMap("Description")
        public String description;

        public static DescribeOssDownloadsResponseBodyItemsOssDownload build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsResponseBodyItemsOssDownload self = new DescribeOssDownloadsResponseBodyItemsOssDownload();
            return TeaModel.build(map, self);
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setIsAvailable(String isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public String getIsAvailable() {
            return this.isAvailable;
        }

        public DescribeOssDownloadsResponseBodyItemsOssDownload setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
