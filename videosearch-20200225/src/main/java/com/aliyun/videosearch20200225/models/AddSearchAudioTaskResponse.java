// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddSearchAudioTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AddSearchAudioTaskResponseData data;

    public static AddSearchAudioTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSearchAudioTaskResponse self = new AddSearchAudioTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddSearchAudioTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSearchAudioTaskResponse setData(AddSearchAudioTaskResponseData data) {
        this.data = data;
        return this;
    }
    public AddSearchAudioTaskResponseData getData() {
        return this.data;
    }

    public static class AddSearchAudioTaskResponseData extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        public static AddSearchAudioTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddSearchAudioTaskResponseData self = new AddSearchAudioTaskResponseData();
            return TeaModel.build(map, self);
        }

        public AddSearchAudioTaskResponseData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
