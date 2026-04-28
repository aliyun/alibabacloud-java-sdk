// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class DeleteMemoryResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public DeleteMemoryResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static DeleteMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryResponseBody self = new DeleteMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public DeleteMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMemoryResponseBody setResult(DeleteMemoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteMemoryResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteMemoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DeleteMemoryResponseBodyResult extends TeaModel {
        @NameInMap("memory_id")
        public String memoryId;

        @NameInMap("message")
        public String message;

        @NameInMap("status")
        public String status;

        public static DeleteMemoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMemoryResponseBodyResult self = new DeleteMemoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteMemoryResponseBodyResult setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

        public DeleteMemoryResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteMemoryResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
