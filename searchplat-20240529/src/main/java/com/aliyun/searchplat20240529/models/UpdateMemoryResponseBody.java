// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class UpdateMemoryResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public UpdateMemoryResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static UpdateMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryResponseBody self = new UpdateMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public UpdateMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMemoryResponseBody setResult(UpdateMemoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateMemoryResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateMemoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class UpdateMemoryResponseBodyResult extends TeaModel {
        @NameInMap("memory")
        public String memory;

        @NameInMap("memory_id")
        public String memoryId;

        @NameInMap("message")
        public String message;

        public static UpdateMemoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemoryResponseBodyResult self = new UpdateMemoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMemoryResponseBodyResult setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public UpdateMemoryResponseBodyResult setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

        public UpdateMemoryResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
