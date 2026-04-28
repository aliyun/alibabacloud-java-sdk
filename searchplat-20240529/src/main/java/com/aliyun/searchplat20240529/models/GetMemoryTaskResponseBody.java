// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMemoryTaskResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetMemoryTaskResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static GetMemoryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryTaskResponseBody self = new GetMemoryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryTaskResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetMemoryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryTaskResponseBody setResult(GetMemoryTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMemoryTaskResponseBodyResult getResult() {
        return this.result;
    }

    public GetMemoryTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetMemoryTaskResponseBodyResult extends TeaModel {
        @NameInMap("error_message")
        public String errorMessage;

        @NameInMap("memory_ids")
        public java.util.List<String> memoryIds;

        @NameInMap("skill_ids")
        public java.util.List<String> skillIds;

        @NameInMap("status")
        public String status;

        @NameInMap("task_id")
        public String taskId;

        public static GetMemoryTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyResult self = new GetMemoryTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetMemoryTaskResponseBodyResult setMemoryIds(java.util.List<String> memoryIds) {
            this.memoryIds = memoryIds;
            return this;
        }
        public java.util.List<String> getMemoryIds() {
            return this.memoryIds;
        }

        public GetMemoryTaskResponseBodyResult setSkillIds(java.util.List<String> skillIds) {
            this.skillIds = skillIds;
            return this;
        }
        public java.util.List<String> getSkillIds() {
            return this.skillIds;
        }

        public GetMemoryTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMemoryTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
