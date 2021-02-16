// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupLogsResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("Items")
    public DescribeBackupLogsResponseBodyItems items;

    public static DescribeBackupLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLogsResponseBody self = new DescribeBackupLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLogsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
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

    public DescribeBackupLogsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupLogsResponseBody setItems(DescribeBackupLogsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupLogsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeBackupLogsResponseBodyItemsBackupLog extends TeaModel {
        @NameInMap("BackupLogId")
        public String backupLogId;

        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        @NameInMap("BackupLogStartTime")
        public String backupLogStartTime;

        @NameInMap("BackupLogEndTime")
        public String backupLogEndTime;

        @NameInMap("DownloadLink")
        public String downloadLink;

        @NameInMap("BackupLogSize")
        public String backupLogSize;

        @NameInMap("BackupLogName")
        public String backupLogName;

        public static DescribeBackupLogsResponseBodyItemsBackupLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupLogsResponseBodyItemsBackupLog self = new DescribeBackupLogsResponseBodyItemsBackupLog();
            return TeaModel.build(map, self);
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setBackupLogId(String backupLogId) {
            this.backupLogId = backupLogId;
            return this;
        }
        public String getBackupLogId() {
            return this.backupLogId;
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

        public DescribeBackupLogsResponseBodyItemsBackupLog setBackupLogStartTime(String backupLogStartTime) {
            this.backupLogStartTime = backupLogStartTime;
            return this;
        }
        public String getBackupLogStartTime() {
            return this.backupLogStartTime;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setBackupLogEndTime(String backupLogEndTime) {
            this.backupLogEndTime = backupLogEndTime;
            return this;
        }
        public String getBackupLogEndTime() {
            return this.backupLogEndTime;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setBackupLogSize(String backupLogSize) {
            this.backupLogSize = backupLogSize;
            return this;
        }
        public String getBackupLogSize() {
            return this.backupLogSize;
        }

        public DescribeBackupLogsResponseBodyItemsBackupLog setBackupLogName(String backupLogName) {
            this.backupLogName = backupLogName;
            return this;
        }
        public String getBackupLogName() {
            return this.backupLogName;
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
