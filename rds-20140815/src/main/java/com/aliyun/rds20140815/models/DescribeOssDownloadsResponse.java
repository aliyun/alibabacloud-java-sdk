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

    }

    public static class DescribeOssDownloadsResponseItems extends TeaModel {
        @NameInMap("OssDownload")
        @Validation(required = true)
        public java.util.List<DescribeOssDownloadsResponseItemsOssDownload> ossDownload;

        public static DescribeOssDownloadsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssDownloadsResponseItems self = new DescribeOssDownloadsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
