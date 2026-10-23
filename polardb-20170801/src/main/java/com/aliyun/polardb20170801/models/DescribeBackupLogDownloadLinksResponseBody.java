// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupLogDownloadLinksResponseBody extends TeaModel {
    /**
     * <p>The details of the redo log backups.</p>
     */
    @NameInMap("BackupLogDownloadLinkItem")
    public java.util.List<DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem> backupLogDownloadLinkItem;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupLogDownloadLinksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLogDownloadLinksResponseBody self = new DescribeBackupLogDownloadLinksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLogDownloadLinksResponseBody setBackupLogDownloadLinkItem(java.util.List<DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem> backupLogDownloadLinkItem) {
        this.backupLogDownloadLinkItem = backupLogDownloadLinkItem;
        return this;
    }
    public java.util.List<DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem> getBackupLogDownloadLinkItem() {
        return this.backupLogDownloadLinkItem;
    }

    public DescribeBackupLogDownloadLinksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem extends TeaModel {
        /**
         * <p>The ID of the redo log backup.</p>
         * 
         * <strong>example:</strong>
         * <p>78167430</p>
         */
        @NameInMap("BackupLogId")
        public String backupLogId;

        /**
         * <p>The public download link for the redo log backup.</p>
         */
        @NameInMap("DownloadLink")
        public String downloadLink;

        /**
         * <p>The error code for the individual record. Empty if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupLogNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The internal network download link for the redo log backup.</p>
         */
        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        /**
         * <p>The expiration time of the download link in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-23T03:00:00Z</p>
         */
        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        /**
         * <p>The error message for the individual record. Empty if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified archived log file does not exist or has been cleaned up.</p>
         */
        @NameInMap("Message")
        public String message;

        public static DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem self = new DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem();
            return TeaModel.build(map, self);
        }

        public DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem setBackupLogId(String backupLogId) {
            this.backupLogId = backupLogId;
            return this;
        }
        public String getBackupLogId() {
            return this.backupLogId;
        }

        public DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        public DescribeBackupLogDownloadLinksResponseBodyBackupLogDownloadLinkItem setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
