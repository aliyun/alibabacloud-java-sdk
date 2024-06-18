// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBinlogFilesResponseBody extends TeaModel {
    /**
     * <p>The details of the log file.</p>
     */
    @NameInMap("Items")
    public DescribeBinlogFilesResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of log files on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ED169A3E-1657-4104-82AB-24EA8CD0DB75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total size of the log file.</p>
     * 
     * <strong>example:</strong>
     * <p>2269410</p>
     */
    @NameInMap("TotalFileSize")
    public Long totalFileSize;

    /**
     * <p>The total number of log files.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
         * 
         * <strong>example:</strong>
         * <p>18358304393468701857</p>
         */
        @NameInMap("Checksum")
        public String checksum;

        /**
         * <p>The HTTP-based download URL of the log file. If the return value of this parameter is NULL, ApsaraDB RDS does not provide a download URL for the log file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://rdsxxxxx.oss.aliyuncs.com/xxxxxx">http://rdsxxxxx.oss.aliyuncs.com/xxxxxx</a></p>
         */
        @NameInMap("DownloadLink")
        public String downloadLink;

        /**
         * <p>The size of the log file.</p>
         * <p>Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2269410</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The ID of the instance to which the log file belongs. This parameter helps determine whether the log file is generated on the primary instance or the secondary instance.</p>
         * <blockquote>
         * <p> You can log on to the ApsaraDB RDS console and go to the instance details page. In the left-side navigation pane, click <strong>Service Availability</strong> to view the values of <strong>Primary Instance No.</strong> and <strong>Secondary Instance No.</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5841973</p>
         */
        @NameInMap("HostInstanceID")
        public String hostInstanceID;

        /**
         * <p>The URL that is used to download files over an internal network.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://rdslog-hz-v3.oss-cn-hangzhou-internal.aliyuncs.com/xxxxxx">http://rdslog-hz-v3.oss-cn-hangzhou-internal.aliyuncs.com/xxxxxx</a></p>
         */
        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        /**
         * <p>The expiration time of the URL.</p>
         * <p>The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2013-06-09T18:00:00Z</p>
         */
        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-09T17:45:21Z</p>
         */
        @NameInMap("LogBeginTime")
        public String logBeginTime;

        /**
         * <p>The end of the time range to query.</p>
         * <p>The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-15T13:10:28Z</p>
         */
        @NameInMap("LogEndTime")
        public String logEndTime;

        /**
         * <p>The log file name.</p>
         * 
         * <strong>example:</strong>
         * <p>000000040000000000000019</p>
         */
        @NameInMap("LogFileName")
        public String logFileName;

        /**
         * <p>The status of the log file that is stored in the Object Storage Service (OSS) bucket.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong></li>
         * <li><strong>Completed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
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
