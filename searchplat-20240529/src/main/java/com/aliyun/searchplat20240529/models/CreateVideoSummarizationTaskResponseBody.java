// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateVideoSummarizationTaskResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public CreateVideoSummarizationTaskResponseBodyResult result;

    public static CreateVideoSummarizationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoSummarizationTaskResponseBody self = new CreateVideoSummarizationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoSummarizationTaskResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public CreateVideoSummarizationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoSummarizationTaskResponseBody setResult(CreateVideoSummarizationTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateVideoSummarizationTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateVideoSummarizationTaskResponseBodyResult extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static CreateVideoSummarizationTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSummarizationTaskResponseBodyResult self = new CreateVideoSummarizationTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateVideoSummarizationTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
