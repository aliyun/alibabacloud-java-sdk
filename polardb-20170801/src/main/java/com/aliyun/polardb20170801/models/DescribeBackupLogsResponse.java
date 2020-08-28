// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public String totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public String pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeBackupLogsResponseItems items;

    public static DescribeBackupLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLogsResponse self = new DescribeBackupLogsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeBackupLogsResponseItemsBackupLog extends TeaModel {
        @NameInMap("BackupLogId")
        @Validation(required = true)
        public String backupLogId;

        @NameInMap("BackupLogName")
        @Validation(required = true)
        public String backupLogName;

        @NameInMap("BackupLogStartTime")
        @Validation(required = true)
        public String backupLogStartTime;

        @NameInMap("BackupLogEndTime")
        @Validation(required = true)
        public String backupLogEndTime;

        @NameInMap("BackupLogSize")
        @Validation(required = true)
        public String backupLogSize;

        @NameInMap("DownloadLink")
        @Validation(required = true)
        public String downloadLink;

        @NameInMap("IntranetDownloadLink")
        @Validation(required = true)
        public String intranetDownloadLink;

        @NameInMap("LinkExpiredTime")
        @Validation(required = true)
        public String linkExpiredTime;

        public static DescribeBackupLogsResponseItemsBackupLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupLogsResponseItemsBackupLog self = new DescribeBackupLogsResponseItemsBackupLog();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeBackupLogsResponseItems extends TeaModel {
        @NameInMap("BackupLog")
        @Validation(required = true)
        public java.util.List<DescribeBackupLogsResponseItemsBackupLog> backupLog;

        public static DescribeBackupLogsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupLogsResponseItems self = new DescribeBackupLogsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
