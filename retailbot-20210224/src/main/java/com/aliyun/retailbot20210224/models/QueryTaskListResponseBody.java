// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryTaskListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误信息
    @NameInMap("Message")
    public String message;

    @NameInMap("PageData")
    public QueryTaskListResponseBodyPageData pageData;

    public static QueryTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskListResponseBody self = new QueryTaskListResponseBody();
        return TeaModel.build(map, self);
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

    public static class QueryTaskListResponseBodyPageDataData extends TeaModel {
        // 机器人code
        @NameInMap("RobotCode")
        public String robotCode;

        // 任务id
        @NameInMap("TaskId")
        public Long taskId;

        // 创建时间
        @NameInMap("OperateDate")
        public String operateDate;

        // 挖掘场景
        @NameInMap("Type")
        public String type;

        // 状态
        @NameInMap("Status")
        public Long status;

        // 约束条件
        @NameInMap("ParamConfig")
        public String paramConfig;

        public static QueryTaskListResponseBodyPageDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskListResponseBodyPageDataData self = new QueryTaskListResponseBodyPageDataData();
            return TeaModel.build(map, self);
        }

        public QueryTaskListResponseBodyPageDataData setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public QueryTaskListResponseBodyPageDataData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public QueryTaskListResponseBodyPageDataData setOperateDate(String operateDate) {
            this.operateDate = operateDate;
            return this;
        }
        public String getOperateDate() {
            return this.operateDate;
        }

        public QueryTaskListResponseBodyPageDataData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTaskListResponseBodyPageDataData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryTaskListResponseBodyPageDataData setParamConfig(String paramConfig) {
            this.paramConfig = paramConfig;
            return this;
        }
        public String getParamConfig() {
            return this.paramConfig;
        }

    }

    public static class QueryTaskListResponseBodyPageData extends TeaModel {
        // 返回的最大记录数
        @NameInMap("MaxResults")
        public Long maxResults;

        // 下一页的token
        @NameInMap("NextToken")
        public String nextToken;

        // 任务配置列表
        @NameInMap("Data")
        public java.util.List<QueryTaskListResponseBodyPageDataData> data;

        public static QueryTaskListResponseBodyPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskListResponseBodyPageData self = new QueryTaskListResponseBodyPageData();
            return TeaModel.build(map, self);
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

        public QueryTaskListResponseBodyPageData setData(java.util.List<QueryTaskListResponseBodyPageDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryTaskListResponseBodyPageDataData> getData() {
            return this.data;
        }

    }

}
