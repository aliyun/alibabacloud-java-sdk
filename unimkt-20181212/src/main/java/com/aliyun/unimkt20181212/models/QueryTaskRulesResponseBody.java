// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTaskRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QueryTaskRulesResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTaskRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskRulesResponseBody self = new QueryTaskRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryTaskRulesResponseBody setData(java.util.List<QueryTaskRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTaskRulesResponseBodyData> getData() {
        return this.data;
    }

    public QueryTaskRulesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTaskRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTaskRulesResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("Type")
        public Integer type;

        public static QueryTaskRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskRulesResponseBodyData self = new QueryTaskRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskRulesResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryTaskRulesResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QueryTaskRulesResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public QueryTaskRulesResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
