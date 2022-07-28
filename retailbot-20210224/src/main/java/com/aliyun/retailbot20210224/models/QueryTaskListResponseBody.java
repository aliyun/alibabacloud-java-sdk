// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryTaskListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageData")
    public QueryTaskListResponseBodyPageData pageData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskListResponseBody self = new QueryTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTaskListResponseBody setPageData(QueryTaskListResponseBodyPageData pageData) {
        this.pageData = pageData;
        return this;
    }
    public QueryTaskListResponseBodyPageData getPageData() {
        return this.pageData;
    }

    public QueryTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTaskListResponseBodyPageDataData extends TeaModel {
        @NameInMap("OperateDate")
        public String operateDate;

        @NameInMap("ParamConfig")
        public String paramConfig;

        @NameInMap("RobotCode")
        public String robotCode;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("Type")
        public String type;

        public static QueryTaskListResponseBodyPageDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskListResponseBodyPageDataData self = new QueryTaskListResponseBodyPageDataData();
            return TeaModel.build(map, self);
        }

        public QueryTaskListResponseBodyPageDataData setOperateDate(String operateDate) {
            this.operateDate = operateDate;
            return this;
        }
        public String getOperateDate() {
            return this.operateDate;
        }

        public QueryTaskListResponseBodyPageDataData setParamConfig(String paramConfig) {
            this.paramConfig = paramConfig;
            return this;
        }
        public String getParamConfig() {
            return this.paramConfig;
        }

        public QueryTaskListResponseBodyPageDataData setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public QueryTaskListResponseBodyPageDataData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryTaskListResponseBodyPageDataData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public QueryTaskListResponseBodyPageDataData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTaskListResponseBodyPageData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryTaskListResponseBodyPageDataData> data;

        @NameInMap("MaxResults")
        public Long maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        public static QueryTaskListResponseBodyPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskListResponseBodyPageData self = new QueryTaskListResponseBodyPageData();
            return TeaModel.build(map, self);
        }

        public QueryTaskListResponseBodyPageData setData(java.util.List<QueryTaskListResponseBodyPageDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryTaskListResponseBodyPageDataData> getData() {
            return this.data;
        }

        public QueryTaskListResponseBodyPageData setMaxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Long getMaxResults() {
            return this.maxResults;
        }

        public QueryTaskListResponseBodyPageData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
