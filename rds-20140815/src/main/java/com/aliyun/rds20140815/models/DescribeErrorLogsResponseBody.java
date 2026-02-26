// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeErrorLogsResponseBody extends TeaModel {
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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Database")
        public String database;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("User")
        public String user;

        @NameInMap("UserIp")
        public String userIp;

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

        public DescribeErrorLogsResponseBodyItemsErrorLog setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeErrorLogsResponseBodyItemsErrorLog setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeErrorLogsResponseBodyItemsErrorLog setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribeErrorLogsResponseBodyItemsErrorLog setUserIp(String userIp) {
            this.userIp = userIp;
            return this;
        }
        public String getUserIp() {
            return this.userIp;
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
