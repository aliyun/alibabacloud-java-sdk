// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupSetDownloadLinkResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeBackupSetDownloadLinkResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupSetDownloadLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetDownloadLinkResponseBody self = new DescribeBackupSetDownloadLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetDownloadLinkResponseBody setData(DescribeBackupSetDownloadLinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBackupSetDownloadLinkResponseBodyData getData() {
        return this.data;
    }

    public DescribeBackupSetDownloadLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupSetDownloadLinkResponseBodyData extends TeaModel {
        @NameInMap("BackupRestorableTime")
        public String backupRestorableTime;

        @NameInMap("BackupSetId")
        public String backupSetId;

        @NameInMap("DownloadTaskCreateTime")
        public String downloadTaskCreateTime;

        @NameInMap("DownloadTaskId")
        public Long downloadTaskId;

        @NameInMap("DownloadTaskStatus")
        public String downloadTaskStatus;

        @NameInMap("InternalUrl")
        public String internalUrl;

        @NameInMap("UrlAliveTime")
        public Long urlAliveTime;

        @NameInMap("UrlExpiredTime")
        public String urlExpiredTime;

        public static DescribeBackupSetDownloadLinkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetDownloadLinkResponseBodyData self = new DescribeBackupSetDownloadLinkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetDownloadLinkResponseBodyData setBackupRestorableTime(String backupRestorableTime) {
            this.backupRestorableTime = backupRestorableTime;
            return this;
        }
        public String getBackupRestorableTime() {
            return this.backupRestorableTime;
        }

        public DescribeBackupSetDownloadLinkResponseBodyData setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeBackupSetDownloadLinkResponseBodyData setDownloadTaskCreateTime(String downloadTaskCreateTime) {
            this.downloadTaskCreateTime = downloadTaskCreateTime;
            return this;
        }
        public String getDownloadTaskCreateTime() {
            return this.downloadTaskCreateTime;
        }

        public DescribeBackupSetDownloadLinkResponseBodyData setDownloadTaskId(Long downloadTaskId) {
            this.downloadTaskId = downloadTaskId;
            return this;
        }
        public Long getDownloadTaskId() {
            return this.downloadTaskId;
        }

        public DescribeBackupSetDownloadLinkResponseBodyData setDownloadTaskStatus(String downloadTaskStatus) {
            this.downloadTaskStatus = downloadTaskStatus;
            return this;
        }
        public String getDownloadTaskStatus() {
            return this.downloadTaskStatus;
        }

        public DescribeBackupSetDownloadLinkResponseBodyData setInternalUrl(String internalUrl) {
            this.internalUrl = internalUrl;
            return this;
        }
        public String getInternalUrl() {
            return this.internalUrl;
        }

        public DescribeBackupSetDownloadLinkResponseBodyData setUrlAliveTime(Long urlAliveTime) {
            this.urlAliveTime = urlAliveTime;
            return this;
        }
        public Long getUrlAliveTime() {
            return this.urlAliveTime;
        }

        public DescribeBackupSetDownloadLinkResponseBodyData setUrlExpiredTime(String urlExpiredTime) {
            this.urlExpiredTime = urlExpiredTime;
            return this;
        }
        public String getUrlExpiredTime() {
            return this.urlExpiredTime;
        }

    }

}
