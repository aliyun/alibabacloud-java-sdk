// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupSetDownloadLinkResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeBackupSetDownloadLinkResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
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
        /**
         * <p>The restorable time of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("BackupRestorableTime")
        public String backupRestorableTime;

        /**
         * <p>The ID of the target backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>bak-4n****gacpa8</p>
         */
        @NameInMap("BackupSetId")
        public String backupSetId;

        /**
         * <p>The time when the download task corresponding to the target backup set was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-22T17:04:18</p>
         */
        @NameInMap("DownloadTaskCreateTime")
        public String downloadTaskCreateTime;

        /**
         * <p>The ID of the download task corresponding to the target backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>1000002</p>
         */
        @NameInMap("DownloadTaskId")
        public Long downloadTaskId;

        /**
         * <p>The status of the download task corresponding to the target backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("DownloadTaskStatus")
        public String downloadTaskStatus;

        /**
         * <p>The internal URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://bucket.oss-region-internal.aliyuncs.com/xxxxx">http://bucket.oss-region-internal.aliyuncs.com/xxxxx</a></p>
         */
        @NameInMap("InternalUrl")
        public String internalUrl;

        /**
         * <p>The validity period of the URL, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("UrlAliveTime")
        public Long urlAliveTime;

        /**
         * <p>The expiration time of the URL.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-04 17:39:49</p>
         */
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
