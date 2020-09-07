// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBinlogFilesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("TotalFileSize")
    @Validation(required = true)
    public Long totalFileSize;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeBinlogFilesResponseItems items;

    public static DescribeBinlogFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBinlogFilesResponse self = new DescribeBinlogFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBinlogFilesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBinlogFilesResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeBinlogFilesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBinlogFilesResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeBinlogFilesResponse setTotalFileSize(Long totalFileSize) {
        this.totalFileSize = totalFileSize;
        return this;
    }
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    public DescribeBinlogFilesResponse setItems(DescribeBinlogFilesResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeBinlogFilesResponseItems getItems() {
        return this.items;
    }

    public static class DescribeBinlogFilesResponseItemsBinLogFile extends TeaModel {
        @NameInMap("FileSize")
        @Validation(required = true)
        public Long fileSize;

        @NameInMap("LogBeginTime")
        @Validation(required = true)
        public String logBeginTime;

        @NameInMap("LogEndTime")
        @Validation(required = true)
        public String logEndTime;

        @NameInMap("DownloadLink")
        @Validation(required = true)
        public String downloadLink;

        @NameInMap("IntranetDownloadLink")
        @Validation(required = true)
        public String intranetDownloadLink;

        @NameInMap("LinkExpiredTime")
        @Validation(required = true)
        public String linkExpiredTime;

        @NameInMap("Checksum")
        @Validation(required = true)
        public String checksum;

        @NameInMap("HostInstanceID")
        @Validation(required = true)
        public String hostInstanceID;

        @NameInMap("LogFileName")
        @Validation(required = true)
        public String logFileName;

        public static DescribeBinlogFilesResponseItemsBinLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinlogFilesResponseItemsBinLogFile self = new DescribeBinlogFilesResponseItemsBinLogFile();
            return TeaModel.build(map, self);
        }

        public DescribeBinlogFilesResponseItemsBinLogFile setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeBinlogFilesResponseItemsBinLogFile setLogBeginTime(String logBeginTime) {
            this.logBeginTime = logBeginTime;
            return this;
        }
        public String getLogBeginTime() {
            return this.logBeginTime;
        }

        public DescribeBinlogFilesResponseItemsBinLogFile setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public String getLogEndTime() {
            return this.logEndTime;
        }

        public DescribeBinlogFilesResponseItemsBinLogFile setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeBinlogFilesResponseItemsBinLogFile setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public DescribeBinlogFilesResponseItemsBinLogFile setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        public DescribeBinlogFilesResponseItemsBinLogFile setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }
        public String getChecksum() {
            return this.checksum;
        }

        public DescribeBinlogFilesResponseItemsBinLogFile setHostInstanceID(String hostInstanceID) {
            this.hostInstanceID = hostInstanceID;
            return this;
        }
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        public DescribeBinlogFilesResponseItemsBinLogFile setLogFileName(String logFileName) {
            this.logFileName = logFileName;
            return this;
        }
        public String getLogFileName() {
            return this.logFileName;
        }

    }

    public static class DescribeBinlogFilesResponseItems extends TeaModel {
        @NameInMap("BinLogFile")
        @Validation(required = true)
        public java.util.List<DescribeBinlogFilesResponseItemsBinLogFile> binLogFile;

        public static DescribeBinlogFilesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinlogFilesResponseItems self = new DescribeBinlogFilesResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeBinlogFilesResponseItems setBinLogFile(java.util.List<DescribeBinlogFilesResponseItemsBinLogFile> binLogFile) {
            this.binLogFile = binLogFile;
            return this;
        }
        public java.util.List<DescribeBinlogFilesResponseItemsBinLogFile> getBinLogFile() {
            return this.binLogFile;
        }

    }

}
