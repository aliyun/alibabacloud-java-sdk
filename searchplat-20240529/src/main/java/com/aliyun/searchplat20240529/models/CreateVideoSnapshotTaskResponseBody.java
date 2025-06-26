// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateVideoSnapshotTaskResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public CreateVideoSnapshotTaskResponseBodyResult result;

    public static CreateVideoSnapshotTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoSnapshotTaskResponseBody self = new CreateVideoSnapshotTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoSnapshotTaskResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public CreateVideoSnapshotTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoSnapshotTaskResponseBody setResult(CreateVideoSnapshotTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateVideoSnapshotTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateVideoSnapshotTaskResponseBodyResult extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static CreateVideoSnapshotTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoSnapshotTaskResponseBodyResult self = new CreateVideoSnapshotTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateVideoSnapshotTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
