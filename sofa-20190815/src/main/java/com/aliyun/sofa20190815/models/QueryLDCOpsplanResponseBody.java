// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("List")
    public java.util.List<QueryLDCOpsplanResponseBodyList> list;

    public static QueryLDCOpsplanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanResponseBody self = new QueryLDCOpsplanResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCOpsplanResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCOpsplanResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCOpsplanResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryLDCOpsplanResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLDCOpsplanResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryLDCOpsplanResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryLDCOpsplanResponseBody setList(java.util.List<QueryLDCOpsplanResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryLDCOpsplanResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryLDCOpsplanResponseBodyList extends TeaModel {
        @NameInMap("AppCount")
        public Long appCount;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Executor")
        public String executor;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("State")
        public String state;

        @NameInMap("TimeSeriesId")
        public String timeSeriesId;

        @NameInMap("Type")
        public String type;

        public static QueryLDCOpsplanResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanResponseBodyList self = new QueryLDCOpsplanResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanResponseBodyList setAppCount(Long appCount) {
            this.appCount = appCount;
            return this;
        }
        public Long getAppCount() {
            return this.appCount;
        }

        public QueryLDCOpsplanResponseBodyList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryLDCOpsplanResponseBodyList setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public QueryLDCOpsplanResponseBodyList setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public QueryLDCOpsplanResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCOpsplanResponseBodyList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public QueryLDCOpsplanResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCOpsplanResponseBodyList setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public QueryLDCOpsplanResponseBodyList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCOpsplanResponseBodyList setTimeSeriesId(String timeSeriesId) {
            this.timeSeriesId = timeSeriesId;
            return this;
        }
        public String getTimeSeriesId() {
            return this.timeSeriesId;
        }

        public QueryLDCOpsplanResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
