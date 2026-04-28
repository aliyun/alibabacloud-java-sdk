// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateMemoryResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public CreateMemoryResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static CreateMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryResponseBody self = new CreateMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemoryResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public CreateMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMemoryResponseBody setResult(CreateMemoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateMemoryResponseBodyResult getResult() {
        return this.result;
    }

    public CreateMemoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class CreateMemoryResponseBodyResultMemory extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static CreateMemoryResponseBodyResultMemory build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryResponseBodyResultMemory self = new CreateMemoryResponseBodyResultMemory();
            return TeaModel.build(map, self);
        }

        public CreateMemoryResponseBodyResultMemory setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class CreateMemoryResponseBodyResultSkill extends TeaModel {
        @NameInMap("task_id")
        public String taskId;

        public static CreateMemoryResponseBodyResultSkill build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryResponseBodyResultSkill self = new CreateMemoryResponseBodyResultSkill();
            return TeaModel.build(map, self);
        }

        public CreateMemoryResponseBodyResultSkill setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class CreateMemoryResponseBodyResult extends TeaModel {
        @NameInMap("memory")
        public CreateMemoryResponseBodyResultMemory memory;

        @NameInMap("skill")
        public CreateMemoryResponseBodyResultSkill skill;

        public static CreateMemoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryResponseBodyResult self = new CreateMemoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateMemoryResponseBodyResult setMemory(CreateMemoryResponseBodyResultMemory memory) {
            this.memory = memory;
            return this;
        }
        public CreateMemoryResponseBodyResultMemory getMemory() {
            return this.memory;
        }

        public CreateMemoryResponseBodyResult setSkill(CreateMemoryResponseBodyResultSkill skill) {
            this.skill = skill;
            return this;
        }
        public CreateMemoryResponseBodyResultSkill getSkill() {
            return this.skill;
        }

    }

}
