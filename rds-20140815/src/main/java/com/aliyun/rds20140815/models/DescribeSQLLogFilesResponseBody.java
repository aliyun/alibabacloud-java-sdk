// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogFilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("Items")
    public DescribeSQLLogFilesResponseBodyItems items;

    public static DescribeSQLLogFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogFilesResponseBody self = new DescribeSQLLogFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogFilesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogFilesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLLogFilesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSQLLogFilesResponseBody setItems(DescribeSQLLogFilesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogFilesResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeSQLLogFilesResponseBodyItemsLogFile extends TeaModel {
        @NameInMap("FileID")
        public String fileID;

        @NameInMap("LogStartTime")
        public String logStartTime;

        @NameInMap("LogSize")
        public String logSize;

        @NameInMap("LogDownloadURL")
        public String logDownloadURL;

        @NameInMap("LogEndTime")
        public String logEndTime;

        @NameInMap("LogStatus")
        public String logStatus;

        public static DescribeSQLLogFilesResponseBodyItemsLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogFilesResponseBodyItemsLogFile self = new DescribeSQLLogFilesResponseBodyItemsLogFile();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogFilesResponseBodyItemsLogFile setFileID(String fileID) {
            this.fileID = fileID;
            return this;
        }
        public String getFileID() {
            return this.fileID;
        }

        public DescribeSQLLogFilesResponseBodyItemsLogFile setLogStartTime(String logStartTime) {
            this.logStartTime = logStartTime;
            return this;
        }
        public String getLogStartTime() {
            return this.logStartTime;
        }

        public DescribeSQLLogFilesResponseBodyItemsLogFile setLogSize(String logSize) {
            this.logSize = logSize;
            return this;
        }
        public String getLogSize() {
            return this.logSize;
        }

        public DescribeSQLLogFilesResponseBodyItemsLogFile setLogDownloadURL(String logDownloadURL) {
            this.logDownloadURL = logDownloadURL;
            return this;
        }
        public String getLogDownloadURL() {
            return this.logDownloadURL;
        }

        public DescribeSQLLogFilesResponseBodyItemsLogFile setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public String getLogEndTime() {
            return this.logEndTime;
        }

        public DescribeSQLLogFilesResponseBodyItemsLogFile setLogStatus(String logStatus) {
            this.logStatus = logStatus;
            return this;
        }
        public String getLogStatus() {
            return this.logStatus;
        }

    }

    public static class DescribeSQLLogFilesResponseBodyItems extends TeaModel {
        @NameInMap("LogFile")
        public java.util.List<DescribeSQLLogFilesResponseBodyItemsLogFile> logFile;

        public static DescribeSQLLogFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogFilesResponseBodyItems self = new DescribeSQLLogFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLLogFilesResponseBodyItems setLogFile(java.util.List<DescribeSQLLogFilesResponseBodyItemsLogFile> logFile) {
            this.logFile = logFile;
            return this;
        }
        public java.util.List<DescribeSQLLogFilesResponseBodyItemsLogFile> getLogFile() {
            return this.logFile;
        }

    }

}
