// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBinlogFilesResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeBinlogFilesResponseBodyItems items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalFileSize")
    public Long totalFileSize;

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
        @NameInMap("Checksum")
        public String checksum;

        @NameInMap("DownloadLink")
        public String downloadLink;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("HostInstanceID")
        public String hostInstanceID;

        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        @NameInMap("LogBeginTime")
        public String logBeginTime;

        @NameInMap("LogEndTime")
        public String logEndTime;

        @NameInMap("LogFileName")
        public String logFileName;

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
