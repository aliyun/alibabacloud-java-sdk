// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class DeleteMemorySkillResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public DeleteMemorySkillResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static DeleteMemorySkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemorySkillResponseBody self = new DeleteMemorySkillResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMemorySkillResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public DeleteMemorySkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMemorySkillResponseBody setResult(DeleteMemorySkillResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteMemorySkillResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteMemorySkillResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DeleteMemorySkillResponseBodyResult extends TeaModel {
        @NameInMap("message")
        public String message;

        @NameInMap("skill_id")
        public String skillId;

        @NameInMap("status")
        public String status;

        public static DeleteMemorySkillResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMemorySkillResponseBodyResult self = new DeleteMemorySkillResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteMemorySkillResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteMemorySkillResponseBodyResult setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public DeleteMemorySkillResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
