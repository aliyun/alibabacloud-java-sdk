// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogFilesResponse extends TeaModel {
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

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSQLLogFilesResponseItems items;

    public static DescribeSQLLogFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogFilesResponse self = new DescribeSQLLogFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogFilesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogFilesResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSQLLogFilesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogFilesResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogFilesResponse setItems(DescribeSQLLogFilesResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogFilesResponseItems getItems() {
        return this.items;
    }

    public static class DescribeSQLLogFilesResponseItemsLogFile extends TeaModel {
        @NameInMap("FileID")
        @Validation(required = true)
        public String fileID;

        @NameInMap("LogStatus")
        @Validation(required = true)
        public String logStatus;

        @NameInMap("LogDownloadURL")
        @Validation(required = true)
        public String logDownloadURL;

        @NameInMap("LogSize")
        @Validation(required = true)
        public String logSize;

        @NameInMap("LogStartTime")
        @Validation(required = true)
        public String logStartTime;

        @NameInMap("LogEndTime")
        @Validation(required = true)
        public String logEndTime;

        public static DescribeSQLLogFilesResponseItemsLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogFilesResponseItemsLogFile self = new DescribeSQLLogFilesResponseItemsLogFile();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogFilesResponseItemsLogFile setFileID(String fileID) {
            this.fileID = fileID;
            return this;
        }
        public String getFileID() {
            return this.fileID;
        }

        public DescribeSQLLogFilesResponseItemsLogFile setLogStatus(String logStatus) {
            this.logStatus = logStatus;
            return this;
        }
        public String getLogStatus() {
            return this.logStatus;
        }

        public DescribeSQLLogFilesResponseItemsLogFile setLogDownloadURL(String logDownloadURL) {
            this.logDownloadURL = logDownloadURL;
            return this;
        }
        public String getLogDownloadURL() {
            return this.logDownloadURL;
        }

        public DescribeSQLLogFilesResponseItemsLogFile setLogSize(String logSize) {
            this.logSize = logSize;
            return this;
        }
        public String getLogSize() {
            return this.logSize;
        }

        public DescribeSQLLogFilesResponseItemsLogFile setLogStartTime(String logStartTime) {
            this.logStartTime = logStartTime;
            return this;
        }
        public String getLogStartTime() {
            return this.logStartTime;
        }

        public DescribeSQLLogFilesResponseItemsLogFile setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public String getLogEndTime() {
            return this.logEndTime;
        }

    }

    public static class DescribeSQLLogFilesResponseItems extends TeaModel {
        @NameInMap("LogFile")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogFilesResponseItemsLogFile> logFile;

        public static DescribeSQLLogFilesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogFilesResponseItems self = new DescribeSQLLogFilesResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogFilesResponseItems setLogFile(java.util.List<DescribeSQLLogFilesResponseItemsLogFile> logFile) {
            this.logFile = logFile;
            return this;
        }
        public java.util.List<DescribeSQLLogFilesResponseItemsLogFile> getLogFile() {
            return this.logFile;
        }

    }

}
