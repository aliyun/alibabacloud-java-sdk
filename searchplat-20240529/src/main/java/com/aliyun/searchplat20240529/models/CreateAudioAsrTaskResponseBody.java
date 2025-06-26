// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateAudioAsrTaskResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public CreateAudioAsrTaskResponseBodyResult result;

    public static CreateAudioAsrTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAudioAsrTaskResponseBody self = new CreateAudioAsrTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAudioAsrTaskResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public CreateAudioAsrTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAudioAsrTaskResponseBody setResult(CreateAudioAsrTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAudioAsrTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAudioAsrTaskResponseBodyResult extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static CreateAudioAsrTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAudioAsrTaskResponseBodyResult self = new CreateAudioAsrTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAudioAsrTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
