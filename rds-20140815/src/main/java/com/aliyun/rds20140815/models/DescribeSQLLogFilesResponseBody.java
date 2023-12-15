// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogFilesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the returned audit log files.</p>
     */
    @NameInMap("Items")
    public DescribeSQLLogFilesResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeSQLLogFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogFilesResponseBody self = new DescribeSQLLogFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogFilesResponseBody setItems(DescribeSQLLogFilesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLLogFilesResponseBodyItems getItems() {
        return this.items;
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

    public DescribeSQLLogFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLLogFilesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSQLLogFilesResponseBodyItemsLogFile extends TeaModel {
        /**
         * <p>The file name.</p>
         */
        @NameInMap("FileID")
        public String fileID;

        /**
         * <p>The download URL of the file. If the audit log file cannot be downloaded, this parameter is null.</p>
         */
        @NameInMap("LogDownloadURL")
        public String logDownloadURL;

        /**
         * <p>The time at which the last SQL statement recorded in the audit log file was executed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("LogEndTime")
        public String logEndTime;

        /**
         * <p>The size of the audit log file. Unit: bytes.</p>
         */
        @NameInMap("LogSize")
        public String logSize;

        /**
         * <p>The time at which the first SQL statement recorded in the audit log file was executed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("LogStartTime")
        public String logStartTime;

        /**
         * <p>The status of the audit log file. Valid values:</p>
         * <br>
         * <p>*   **Success**</p>
         * <p>*   **Failed**</p>
         * <p>*   **Generating**</p>
         */
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

        public DescribeSQLLogFilesResponseBodyItemsLogFile setLogSize(String logSize) {
            this.logSize = logSize;
            return this;
        }
        public String getLogSize() {
            return this.logSize;
        }

        public DescribeSQLLogFilesResponseBodyItemsLogFile setLogStartTime(String logStartTime) {
            this.logStartTime = logStartTime;
            return this;
        }
        public String getLogStartTime() {
            return this.logStartTime;
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
