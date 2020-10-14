// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddSearchVideoTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AddSearchVideoTaskResponseData data;

    public static AddSearchVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSearchVideoTaskResponse self = new AddSearchVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddSearchVideoTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSearchVideoTaskResponse setData(AddSearchVideoTaskResponseData data) {
        this.data = data;
        return this;
    }
    public AddSearchVideoTaskResponseData getData() {
        return this.data;
    }

    public static class AddSearchVideoTaskResponseData extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        public static AddSearchVideoTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddSearchVideoTaskResponseData self = new AddSearchVideoTaskResponseData();
            return TeaModel.build(map, self);
        }

        public AddSearchVideoTaskResponseData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
