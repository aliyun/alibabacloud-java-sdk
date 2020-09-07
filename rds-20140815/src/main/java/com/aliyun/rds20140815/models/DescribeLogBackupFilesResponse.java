// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeLogBackupFilesResponse extends TeaModel {
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
    public DescribeLogBackupFilesResponseItems items;

    public static DescribeLogBackupFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupFilesResponse self = new DescribeLogBackupFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupFilesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogBackupFilesResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeLogBackupFilesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLogBackupFilesResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeLogBackupFilesResponse setTotalFileSize(Long totalFileSize) {
        this.totalFileSize = totalFileSize;
        return this;
    }
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    public DescribeLogBackupFilesResponse setItems(DescribeLogBackupFilesResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeLogBackupFilesResponseItems getItems() {
        return this.items;
    }

    public static class DescribeLogBackupFilesResponseItemsBinLogFile extends TeaModel {
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

        public static DescribeLogBackupFilesResponseItemsBinLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupFilesResponseItemsBinLogFile self = new DescribeLogBackupFilesResponseItemsBinLogFile();
            return TeaModel.build(map, self);
        }

        public DescribeLogBackupFilesResponseItemsBinLogFile setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeLogBackupFilesResponseItemsBinLogFile setLogBeginTime(String logBeginTime) {
            this.logBeginTime = logBeginTime;
            return this;
        }
        public String getLogBeginTime() {
            return this.logBeginTime;
        }

        public DescribeLogBackupFilesResponseItemsBinLogFile setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public String getLogEndTime() {
            return this.logEndTime;
        }

        public DescribeLogBackupFilesResponseItemsBinLogFile setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeLogBackupFilesResponseItemsBinLogFile setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public DescribeLogBackupFilesResponseItemsBinLogFile setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

    }

    public static class DescribeLogBackupFilesResponseItems extends TeaModel {
        @NameInMap("BinLogFile")
        @Validation(required = true)
        public java.util.List<DescribeLogBackupFilesResponseItemsBinLogFile> binLogFile;

        public static DescribeLogBackupFilesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupFilesResponseItems self = new DescribeLogBackupFilesResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeLogBackupFilesResponseItems setBinLogFile(java.util.List<DescribeLogBackupFilesResponseItemsBinLogFile> binLogFile) {
            this.binLogFile = binLogFile;
            return this;
        }
        public java.util.List<DescribeLogBackupFilesResponseItemsBinLogFile> getBinLogFile() {
            return this.binLogFile;
        }

    }

}
