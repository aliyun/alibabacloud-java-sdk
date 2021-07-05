// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeOssDownloadsForSQLServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("MigrateIaskId")
    public String migrateIaskId;

    @NameInMap("Items")
    public DescribeOssDownloadsForSQLServerResponseBodyItems items;

    public static DescribeOssDownloadsForSQLServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssDownloadsForSQLServerResponseBody self = new DescribeOssDownloadsForSQLServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssDownloadsForSQLServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssDownloadsForSQLServerResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeOssDownloadsForSQLServerResponseBody setMigrateIaskId(String migrateIaskId) {
        this.migrateIaskId = migrateIaskId;
        return this;
    }
    public String getMigrateIaskId() {
        return this.migrateIaskId;
    }

    public DescribeOssDownloadsForSQLServerResponseBody setItems(DescribeOssDownloadsForSQLServerResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeOssDownloadsForSQLServerResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("BakType")
        public String bakType;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("Status")
        public String status;

        @NameInMap("IsAvail")
        public String isAvail;

        @NameInMap("Desc")
        public String desc;

        public static DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload self = new DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload();
            return TeaModel.build(map, self);
        }

        public DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload setBakType(String bakType) {
            this.bakType = bakType;
            return this;
        }
        public String getBakType() {
            return this.bakType;
        }

        public DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload setIsAvail(String isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public String getIsAvail() {
            return this.isAvail;
        }

        public DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class DescribeOssDownloadsForSQLServerResponseBodyItems extends TeaModel {
        @NameInMap("OssDownload")
        public java.util.List<DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload> ossDownload;

        public static DescribeOssDownloadsForSQLServerResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsForSQLServerResponseBodyItems self = new DescribeOssDownloadsForSQLServerResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeOssDownloadsForSQLServerResponseBodyItems setOssDownload(java.util.List<DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload> ossDownload) {
            this.ossDownload = ossDownload;
            return this;
        }
        public java.util.List<DescribeOssDownloadsForSQLServerResponseBodyItemsOssDownload> getOssDownload() {
            return this.ossDownload;
        }

    }

}
