// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMemoryResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetMemoryResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static GetMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryResponseBody self = new GetMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryResponseBody setResult(GetMemoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMemoryResponseBodyResult getResult() {
        return this.result;
    }

    public GetMemoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetMemoryResponseBodyResult extends TeaModel {
        @NameInMap("agent_id")
        public String agentId;

        @NameInMap("memory")
        public String memory;

        @NameInMap("memory_id")
        public String memoryId;

        @NameInMap("user_id")
        public String userId;

        public static GetMemoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryResponseBodyResult self = new GetMemoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMemoryResponseBodyResult setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetMemoryResponseBodyResult setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetMemoryResponseBodyResult setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

        public GetMemoryResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
