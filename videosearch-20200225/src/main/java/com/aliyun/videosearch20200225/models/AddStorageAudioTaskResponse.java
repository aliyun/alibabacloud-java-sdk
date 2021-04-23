// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddStorageAudioTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AddStorageAudioTaskResponseData data;

    public static AddStorageAudioTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddStorageAudioTaskResponse self = new AddStorageAudioTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddStorageAudioTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddStorageAudioTaskResponse setData(AddStorageAudioTaskResponseData data) {
        this.data = data;
        return this;
    }
    public AddStorageAudioTaskResponseData getData() {
        return this.data;
    }

    public static class AddStorageAudioTaskResponseData extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        public static AddStorageAudioTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddStorageAudioTaskResponseData self = new AddStorageAudioTaskResponseData();
            return TeaModel.build(map, self);
        }

        public AddStorageAudioTaskResponseData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
