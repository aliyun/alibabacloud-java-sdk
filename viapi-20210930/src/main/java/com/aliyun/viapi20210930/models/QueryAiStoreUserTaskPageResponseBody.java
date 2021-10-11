// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreUserTaskPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryAiStoreUserTaskPageResponseBodyData data;

    public static QueryAiStoreUserTaskPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiStoreUserTaskPageResponseBody self = new QueryAiStoreUserTaskPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiStoreUserTaskPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAiStoreUserTaskPageResponseBody setData(QueryAiStoreUserTaskPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAiStoreUserTaskPageResponseBodyData getData() {
        return this.data;
    }

    public static class QueryAiStoreUserTaskPageResponseBodyData extends TeaModel {
        @NameInMap("TaskList")
        public java.util.List<AiStoreUserTask> taskList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryAiStoreUserTaskPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAiStoreUserTaskPageResponseBodyData self = new QueryAiStoreUserTaskPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAiStoreUserTaskPageResponseBodyData setTaskList(java.util.List<AiStoreUserTask> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<AiStoreUserTask> getTaskList() {
            return this.taskList;
        }

        public QueryAiStoreUserTaskPageResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
