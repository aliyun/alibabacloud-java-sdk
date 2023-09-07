// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupLogsResponseBody extends TeaModel {
    /**
     * <p>The details of the backup logs.</p>
     */
    @NameInMap("Items")
    public DescribeBackupLogsResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeBackupLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLogsResponseBody self = new DescribeBackupLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLogsResponseBody setItems(DescribeBackupLogsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupLogsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBackupLogsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupLogsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeBackupLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupLogsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeBackupLogsResponseBodyItemsBackupLog extends TeaModel {
        /**
         * <p>The time when the backup task ended. The time follows the ISO 8601 standard in the `YYYY-MM-DD\"T\"HH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("BackupLogEndTime")
        public String backupLogEndTime;

        /**
         * <p>The ID of the backup log.</p>
         */
        @NameInMap("BackupLogId")
        public String backupLogId;

        /**
         * <p>The name of the backup log.</p>
         */
        @NameInMap("BackupLogName")
        public String backupLogName;

        /**
         * <p>The size of the backup log. Unit: bytes.</p>
         */
        @NameInMap("BackupLogSize")
        public String backupLogSize;

        /**
         * <p>The time when the backup task started. The time follows the ISO 8601 standard in the `YYYY-MM-DD\"T\"HH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("BackupLogStartTime")
        public String backupLogStartTime;

        /**
         * <p>The public URL used to download the backup log.</p>
         */
        @NameInMap("DownloadLink")
        public String downloadLink;

        /**
         * <p>The internal URL used to download the backup log.</p>
         */
        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        /**
         * <p>The time when the download URL expires.</p>
         */
        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        public static DescribeBackupLogsResponseBodyItemsBackupLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupLogsResponseBodyItemsBackupLog self = new DescribeBackupLogsResponseBodyItemsBackupLog();
            return TeaModel.build(map, self);
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setBackupLogEndTime(String backupLogEndTime) {
            this.backupLogEndTime = backupLogEndTime;
            return this;
        }
        public String getBackupLogEndTime() {
            return this.backupLogEndTime;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setBackupLogId(String backupLogId) {
            this.backupLogId = backupLogId;
            return this;
        }
        public String getBackupLogId() {
            return this.backupLogId;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setBackupLogName(String backupLogName) {
            this.backupLogName = backupLogName;
            return this;
        }
        public String getBackupLogName() {
            return this.backupLogName;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setBackupLogSize(String backupLogSize) {
            this.backupLogSize = backupLogSize;
            return this;
        }
        public String getBackupLogSize() {
            return this.backupLogSize;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setBackupLogStartTime(String backupLogStartTime) {
            this.backupLogStartTime = backupLogStartTime;
            return this;
        }
        public String getBackupLogStartTime() {
            return this.backupLogStartTime;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

    }

    public static class DescribeBackupLogsResponseBodyItems extends TeaModel {
        @NameInMap("BackupLog")
        public java.util.List<DescribeBackupLogsResponseBodyItemsBackupLog> backupLog;

        public static DescribeBackupLogsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupLogsResponseBodyItems self = new DescribeBackupLogsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupLogsResponseBodyItems setBackupLog(java.util.List<DescribeBackupLogsResponseBodyItemsBackupLog> backupLog) {
            this.backupLog = backupLog;
            return this;
        }
        public java.util.List<DescribeBackupLogsResponseBodyItemsBackupLog> getBackupLog() {
            return this.backupLog;
        }

    }

}
