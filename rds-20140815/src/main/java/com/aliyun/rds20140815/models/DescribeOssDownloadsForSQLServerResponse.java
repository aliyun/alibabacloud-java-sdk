// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeOssDownloadsForSQLServerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("MigrateIaskId")
    @Validation(required = true)
    public String migrateIaskId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeOssDownloadsForSQLServerResponseItems items;

    public static DescribeOssDownloadsForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssDownloadsForSQLServerResponse self = new DescribeOssDownloadsForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssDownloadsForSQLServerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssDownloadsForSQLServerResponse setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeOssDownloadsForSQLServerResponse setMigrateIaskId(String migrateIaskId) {
        this.migrateIaskId = migrateIaskId;
        return this;
    }
    public String getMigrateIaskId() {
        return this.migrateIaskId;
    }

    public DescribeOssDownloadsForSQLServerResponse setItems(DescribeOssDownloadsForSQLServerResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeOssDownloadsForSQLServerResponseItems getItems() {
        return this.items;
    }

    public static class DescribeOssDownloadsForSQLServerResponseItemsOssDownload extends TeaModel {
        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("BakType")
        @Validation(required = true)
        public String bakType;

        @NameInMap("FileSize")
        @Validation(required = true)
        public String fileSize;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("IsAvail")
        @Validation(required = true)
        public String isAvail;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        public static DescribeOssDownloadsForSQLServerResponseItemsOssDownload build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsForSQLServerResponseItemsOssDownload self = new DescribeOssDownloadsForSQLServerResponseItemsOssDownload();
            return TeaModel.build(map, self);
        }

        public DescribeOssDownloadsForSQLServerResponseItemsOssDownload setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeOssDownloadsForSQLServerResponseItemsOssDownload setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOssDownloadsForSQLServerResponseItemsOssDownload setBakType(String bakType) {
            this.bakType = bakType;
            return this;
        }
        public String getBakType() {
            return this.bakType;
        }

        public DescribeOssDownloadsForSQLServerResponseItemsOssDownload setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public DescribeOssDownloadsForSQLServerResponseItemsOssDownload setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOssDownloadsForSQLServerResponseItemsOssDownload setIsAvail(String isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public String getIsAvail() {
            return this.isAvail;
        }

        public DescribeOssDownloadsForSQLServerResponseItemsOssDownload setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class DescribeOssDownloadsForSQLServerResponseItems extends TeaModel {
        @NameInMap("OssDownload")
        @Validation(required = true)
        public java.util.List<DescribeOssDownloadsForSQLServerResponseItemsOssDownload> ossDownload;

        public static DescribeOssDownloadsForSQLServerResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsForSQLServerResponseItems self = new DescribeOssDownloadsForSQLServerResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeOssDownloadsForSQLServerResponseItems setOssDownload(java.util.List<DescribeOssDownloadsForSQLServerResponseItemsOssDownload> ossDownload) {
            this.ossDownload = ossDownload;
            return this;
        }
        public java.util.List<DescribeOssDownloadsForSQLServerResponseItemsOssDownload> getOssDownload() {
            return this.ossDownload;
        }

    }

}
