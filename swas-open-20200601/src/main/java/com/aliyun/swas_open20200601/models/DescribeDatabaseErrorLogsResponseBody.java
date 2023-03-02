// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseErrorLogsResponseBody extends TeaModel {
    @NameInMap("ErrorLogs")
    public java.util.List<DescribeDatabaseErrorLogsResponseBodyErrorLogs> errorLogs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

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
