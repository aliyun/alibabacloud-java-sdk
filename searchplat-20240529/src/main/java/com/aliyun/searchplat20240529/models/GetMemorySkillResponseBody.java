// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMemorySkillResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetMemorySkillResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static GetMemorySkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemorySkillResponseBody self = new GetMemorySkillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemorySkillResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetMemorySkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemorySkillResponseBody setResult(GetMemorySkillResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMemorySkillResponseBodyResult getResult() {
        return this.result;
    }

    public GetMemorySkillResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetMemorySkillResponseBodyResult extends TeaModel {
        @NameInMap("agent_id")
        public String agentId;

        @NameInMap("files")
        public String files;

        @NameInMap("name")
        public String name;

        @NameInMap("skill_id")
        public String skillId;

        @NameInMap("user_id")
        public String userId;

        public static GetMemorySkillResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMemorySkillResponseBodyResult self = new GetMemorySkillResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMemorySkillResponseBodyResult setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetMemorySkillResponseBodyResult setFiles(String files) {
            this.files = files;
            return this;
        }
        public String getFiles() {
            return this.files;
        }

        public GetMemorySkillResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMemorySkillResponseBodyResult setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public GetMemorySkillResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
