// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseErrorLogsResponseBody extends TeaModel {
    /**
     * <p>The time when the error log entry was generated. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * <blockquote>
     * <p>The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
     * </blockquote>
     */
    @NameInMap("ErrorLogs")
    public java.util.List<DescribeDatabaseErrorLogsResponseBodyErrorLogs> errorLogs;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDatabaseErrorLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseErrorLogsResponseBody self = new DescribeDatabaseErrorLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseErrorLogsResponseBody setErrorLogs(java.util.List<DescribeDatabaseErrorLogsResponseBodyErrorLogs> errorLogs) {
        this.errorLogs = errorLogs;
        return this;
    }
    public java.util.List<DescribeDatabaseErrorLogsResponseBodyErrorLogs> getErrorLogs() {
        return this.errorLogs;
    }

    public DescribeDatabaseErrorLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatabaseErrorLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatabaseErrorLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatabaseErrorLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDatabaseErrorLogsResponseBodyErrorLogs extends TeaModel {
        /**
         * <p>The time when the resource was created. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08T12:11:04Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>spid52 DBCC TRACEON 3499, server process ID (SPID) 52. This is an informational message only; no user action is required</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        public static DescribeDatabaseErrorLogsResponseBodyErrorLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabaseErrorLogsResponseBodyErrorLogs self = new DescribeDatabaseErrorLogsResponseBodyErrorLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDatabaseErrorLogsResponseBodyErrorLogs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDatabaseErrorLogsResponseBodyErrorLogs setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

    }

}
