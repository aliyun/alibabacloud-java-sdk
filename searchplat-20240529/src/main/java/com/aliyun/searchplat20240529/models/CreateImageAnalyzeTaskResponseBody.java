// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateImageAnalyzeTaskResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public CreateImageAnalyzeTaskResponseBodyResult result;

    public static CreateImageAnalyzeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageAnalyzeTaskResponseBody self = new CreateImageAnalyzeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageAnalyzeTaskResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public CreateImageAnalyzeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageAnalyzeTaskResponseBody setResult(CreateImageAnalyzeTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateImageAnalyzeTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateImageAnalyzeTaskResponseBodyResult extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static CreateImageAnalyzeTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateImageAnalyzeTaskResponseBodyResult self = new CreateImageAnalyzeTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateImageAnalyzeTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
