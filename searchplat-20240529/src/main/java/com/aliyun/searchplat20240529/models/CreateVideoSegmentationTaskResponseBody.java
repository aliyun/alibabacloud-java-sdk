// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateVideoSegmentationTaskResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public CreateVideoSegmentationTaskResponseBodyResult result;

    public static CreateVideoSegmentationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoSegmentationTaskResponseBody self = new CreateVideoSegmentationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoSegmentationTaskResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public CreateVideoSegmentationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoSegmentationTaskResponseBody setResult(CreateVideoSegmentationTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateVideoSegmentationTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateVideoSegmentationTaskResponseBodyResult extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static CreateVideoSegmentationTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSegmentationTaskResponseBodyResult self = new CreateVideoSegmentationTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateVideoSegmentationTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
