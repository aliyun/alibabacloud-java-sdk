// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class UpdateMemorySkillResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public UpdateMemorySkillResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static UpdateMemorySkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemorySkillResponseBody self = new UpdateMemorySkillResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMemorySkillResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public UpdateMemorySkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMemorySkillResponseBody setResult(UpdateMemorySkillResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateMemorySkillResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateMemorySkillResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class UpdateMemorySkillResponseBodyResult extends TeaModel {
        @NameInMap("files")
        public java.util.Map<String, String> files;

        @NameInMap("name")
        public String name;

        @NameInMap("version")
        public String version;

        public static UpdateMemorySkillResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemorySkillResponseBodyResult self = new UpdateMemorySkillResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMemorySkillResponseBodyResult setFiles(java.util.Map<String, String> files) {
            this.files = files;
            return this;
        }
        public java.util.Map<String, String> getFiles() {
            return this.files;
        }

        public UpdateMemorySkillResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMemorySkillResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
