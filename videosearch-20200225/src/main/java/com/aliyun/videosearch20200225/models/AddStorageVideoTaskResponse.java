// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddStorageVideoTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AddStorageVideoTaskResponseData data;

    public static AddStorageVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddStorageVideoTaskResponse self = new AddStorageVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddStorageVideoTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddStorageVideoTaskResponse setData(AddStorageVideoTaskResponseData data) {
        this.data = data;
        return this;
    }
    public AddStorageVideoTaskResponseData getData() {
        return this.data;
    }

    public static class AddStorageVideoTaskResponseData extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        public static AddStorageVideoTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddStorageVideoTaskResponseData self = new AddStorageVideoTaskResponseData();
            return TeaModel.build(map, self);
        }

        public AddStorageVideoTaskResponseData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
