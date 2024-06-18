// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeErrorLogsResponseBody extends TeaModel {
    /**
     * <p>Details about the log entries returned.</p>
     */
    @NameInMap("Items")
    public DescribeErrorLogsResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of error logs on the current page.</p>
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
     * <p>98504E07-BB0E-40FC-B152-E4882615812C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeErrorLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogsResponseBody self = new DescribeErrorLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogsResponseBody setItems(DescribeErrorLogsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeErrorLogsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeErrorLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeErrorLogsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeErrorLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeErrorLogsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeErrorLogsResponseBodyItemsErrorLog extends TeaModel {
        /**
         * <p>The time when the error log entry was generated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2011-05-30T12:11:04Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error log information.</p>
         * 
         * <strong>example:</strong>
         * <p>spid52 DBCC TRACEON 3499, server process ID (SPID) 52. This is an informational message only; no user action is required</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        public static DescribeErrorLogsResponseBodyItemsErrorLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogsResponseBodyItemsErrorLog self = new DescribeErrorLogsResponseBodyItemsErrorLog();
            return TeaModel.build(map, self);
        }

        public DescribeErrorLogsResponseBodyItemsErrorLog setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeErrorLogsResponseBodyItemsErrorLog setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

    }

    public static class DescribeErrorLogsResponseBodyItems extends TeaModel {
        @NameInMap("ErrorLog")
        public java.util.List<DescribeErrorLogsResponseBodyItemsErrorLog> errorLog;

        public static DescribeErrorLogsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogsResponseBodyItems self = new DescribeErrorLogsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeErrorLogsResponseBodyItems setErrorLog(java.util.List<DescribeErrorLogsResponseBodyItemsErrorLog> errorLog) {
            this.errorLog = errorLog;
            return this;
        }
        public java.util.List<DescribeErrorLogsResponseBodyItemsErrorLog> getErrorLog() {
            return this.errorLog;
        }

    }

}
