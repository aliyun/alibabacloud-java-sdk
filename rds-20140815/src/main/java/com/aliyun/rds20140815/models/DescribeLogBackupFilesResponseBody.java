// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeLogBackupFilesResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeLogBackupFilesResponseBodyItems items;

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

    public static DescribeLogBackupFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupFilesResponseBody self = new DescribeLogBackupFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupFilesResponseBody setItems(DescribeLogBackupFilesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeLogBackupFilesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeLogBackupFilesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLogBackupFilesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeLogBackupFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogBackupFilesResponseBody setTotalFileSize(Long totalFileSize) {
        this.totalFileSize = totalFileSize;
        return this;
    }
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    public DescribeLogBackupFilesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeLogBackupFilesResponseBodyItemsBinLogFile extends TeaModel {
        @NameInMap("DownloadLink")
        public String downloadLink;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        @NameInMap("LogBeginTime")
        public String logBeginTime;

        @NameInMap("LogEndTime")
        public String logEndTime;

        public static DescribeLogBackupFilesResponseBodyItemsBinLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupFilesResponseBodyItemsBinLogFile self = new DescribeLogBackupFilesResponseBodyItemsBinLogFile();
            return TeaModel.build(map, self);
        }

        public DescribeLogBackupFilesResponseBodyItemsBinLogFile setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeLogBackupFilesResponseBodyItemsBinLogFile setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeLogBackupFilesResponseBodyItemsBinLogFile setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public DescribeLogBackupFilesResponseBodyItemsBinLogFile setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        public DescribeLogBackupFilesResponseBodyItemsBinLogFile setLogBeginTime(String logBeginTime) {
            this.logBeginTime = logBeginTime;
            return this;
        }
        public String getLogBeginTime() {
            return this.logBeginTime;
        }

        public DescribeLogBackupFilesResponseBodyItemsBinLogFile setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public String getLogEndTime() {
            return this.logEndTime;
        }

    }

    public static class DescribeLogBackupFilesResponseBodyItems extends TeaModel {
        @NameInMap("BinLogFile")
        public java.util.List<DescribeLogBackupFilesResponseBodyItemsBinLogFile> binLogFile;

        public static DescribeLogBackupFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupFilesResponseBodyItems self = new DescribeLogBackupFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeLogBackupFilesResponseBodyItems setBinLogFile(java.util.List<DescribeLogBackupFilesResponseBodyItemsBinLogFile> binLogFile) {
            this.binLogFile = binLogFile;
            return this;
        }
        public java.util.List<DescribeLogBackupFilesResponseBodyItemsBinLogFile> getBinLogFile() {
            return this.binLogFile;
        }

    }

}
