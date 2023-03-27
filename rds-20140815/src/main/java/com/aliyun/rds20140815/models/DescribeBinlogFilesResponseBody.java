// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBinlogFilesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of information about the binary log file.</p>
     */
    @NameInMap("Items")
    public DescribeBinlogFilesResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of binary log files returned on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total size of the binary log files.</p>
     */
    @NameInMap("TotalFileSize")
    public Long totalFileSize;

    /**
     * <p>The total number of binary log files returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeBinlogFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBinlogFilesResponseBody self = new DescribeBinlogFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBinlogFilesResponseBody setItems(DescribeBinlogFilesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBinlogFilesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBinlogFilesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBinlogFilesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeBinlogFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBinlogFilesResponseBody setTotalFileSize(Long totalFileSize) {
        this.totalFileSize = totalFileSize;
        return this;
    }
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    public DescribeBinlogFilesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeBinlogFilesResponseBodyItemsBinLogFile extends TeaModel {
        /**
         * <p>The checksum. The value of this parameter is calculated by using the CRC64 algorithm.</p>
         */
        @NameInMap("Checksum")
        public String checksum;

        /**
         * <p>The HTTP-based download URL of the binary log file. If the return value of this parameter is NULL, ApsaraDB RDS does not provide a download URL for the file.</p>
         */
        @NameInMap("DownloadLink")
        public String downloadLink;

        /**
         * <p>The size of the binary log file. Unit: bytes.</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The ID of the instance to which the binary log file belongs. This parameter is used to distinguish between the binary log files that are generated on a primary instance and those that are generated on a secondary instance.</p>
         */
        @NameInMap("HostInstanceID")
        public String hostInstanceID;

        /**
         * <p>The download URL that is used over an internal network.</p>
         */
        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        /**
         * <p>The expiration time of the URL. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        /**
         * <p>The start time of the log data recorded in the binary log file. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("LogBeginTime")
        public String logBeginTime;

        /**
         * <p>The end time of the log data recorded in the binary log file. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("LogEndTime")
        public String logEndTime;

        /**
         * <p>The name of the binary log file.</p>
         */
        @NameInMap("LogFileName")
        public String logFileName;

        /**
         * <p>The status of the binary log file that is stored in the Object Storage Service (OSS) bucket. Valid values:</p>
         * <br>
         * <p>*   **Uploading**</p>
         * <p>*   **Completed**</p>
         */
        @NameInMap("RemoteStatus")
        public String remoteStatus;

        public static DescribeBinlogFilesResponseBodyItemsBinLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinlogFilesResponseBodyItemsBinLogFile self = new DescribeBinlogFilesResponseBodyItemsBinLogFile();
            return TeaModel.build(map, self);
        }

        public DescribeBinlogFilesResponseBodyItemsBinLogFile setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }
        public String getChecksum() {
            return this.checksum;
        }

        public DescribeBinlogFilesResponseBodyItemsBinLogFile setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeBinlogFilesResponseBodyItemsBinLogFile setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeBinlogFilesResponseBodyItemsBinLogFile setHostInstanceID(String hostInstanceID) {
            this.hostInstanceID = hostInstanceID;
            return this;
        }
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        public DescribeBinlogFilesResponseBodyItemsBinLogFile setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public DescribeBinlogFilesResponseBodyItemsBinLogFile setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        public DescribeBinlogFilesResponseBodyItemsBinLogFile setLogBeginTime(String logBeginTime) {
            this.logBeginTime = logBeginTime;
            return this;
        }
        public String getLogBeginTime() {
            return this.logBeginTime;
        }

        public DescribeBinlogFilesResponseBodyItemsBinLogFile setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public String getLogEndTime() {
            return this.logEndTime;
        }

        public DescribeBinlogFilesResponseBodyItemsBinLogFile setLogFileName(String logFileName) {
            this.logFileName = logFileName;
            return this;
        }
        public String getLogFileName() {
            return this.logFileName;
        }

        public DescribeBinlogFilesResponseBodyItemsBinLogFile setRemoteStatus(String remoteStatus) {
            this.remoteStatus = remoteStatus;
            return this;
        }
        public String getRemoteStatus() {
            return this.remoteStatus;
        }

    }

    public static class DescribeBinlogFilesResponseBodyItems extends TeaModel {
        @NameInMap("BinLogFile")
        public java.util.List<DescribeBinlogFilesResponseBodyItemsBinLogFile> binLogFile;

        public static DescribeBinlogFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinlogFilesResponseBodyItems self = new DescribeBinlogFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBinlogFilesResponseBodyItems setBinLogFile(java.util.List<DescribeBinlogFilesResponseBodyItemsBinLogFile> binLogFile) {
            this.binLogFile = binLogFile;
            return this;
        }
        public java.util.List<DescribeBinlogFilesResponseBodyItemsBinLogFile> getBinLogFile() {
            return this.binLogFile;
        }

    }

}
