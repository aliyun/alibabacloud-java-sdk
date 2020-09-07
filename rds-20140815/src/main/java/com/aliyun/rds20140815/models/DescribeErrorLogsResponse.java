// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeErrorLogsResponse extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeErrorLogsResponseItems items;

    public static DescribeErrorLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogsResponse self = new DescribeErrorLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeErrorLogsResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeErrorLogsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeErrorLogsResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeErrorLogsResponse setItems(DescribeErrorLogsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeErrorLogsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeErrorLogsResponseItemsErrorLog extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ErrorInfo")
        @Validation(required = true)
        public String errorInfo;

        public static DescribeErrorLogsResponseItemsErrorLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogsResponseItemsErrorLog self = new DescribeErrorLogsResponseItemsErrorLog();
            return TeaModel.build(map, self);
        }

        public DescribeErrorLogsResponseItemsErrorLog setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeErrorLogsResponseItemsErrorLog setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

    }

    public static class DescribeErrorLogsResponseItems extends TeaModel {
        @NameInMap("ErrorLog")
        @Validation(required = true)
        public java.util.List<DescribeErrorLogsResponseItemsErrorLog> errorLog;

        public static DescribeErrorLogsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogsResponseItems self = new DescribeErrorLogsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeErrorLogsResponseItems setErrorLog(java.util.List<DescribeErrorLogsResponseItemsErrorLog> errorLog) {
            this.errorLog = errorLog;
            return this;
        }
        public java.util.List<DescribeErrorLogsResponseItemsErrorLog> getErrorLog() {
            return this.errorLog;
        }

    }

}
