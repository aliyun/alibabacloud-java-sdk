// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeErrorLogsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("Items")
    public DescribeErrorLogsResponseBodyItems items;

    public static DescribeErrorLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogsResponseBody self = new DescribeErrorLogsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeErrorLogsResponseBody setItems(DescribeErrorLogsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeErrorLogsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeErrorLogsResponseBodyItemsErrorLog extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

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
