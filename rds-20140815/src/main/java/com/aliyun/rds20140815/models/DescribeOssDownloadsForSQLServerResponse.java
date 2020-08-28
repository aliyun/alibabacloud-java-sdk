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

    }

    public static class DescribeOssDownloadsForSQLServerResponseItems extends TeaModel {
        @NameInMap("OssDownload")
        @Validation(required = true)
        public java.util.List<DescribeOssDownloadsForSQLServerResponseItemsOssDownload> ossDownload;

        public static DescribeOssDownloadsForSQLServerResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsForSQLServerResponseItems self = new DescribeOssDownloadsForSQLServerResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
