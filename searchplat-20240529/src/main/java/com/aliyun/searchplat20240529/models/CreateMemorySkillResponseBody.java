// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateMemorySkillResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public CreateMemorySkillResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static CreateMemorySkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemorySkillResponseBody self = new CreateMemorySkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemorySkillResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public CreateMemorySkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMemorySkillResponseBody setResult(CreateMemorySkillResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateMemorySkillResponseBodyResult getResult() {
        return this.result;
    }

    public CreateMemorySkillResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class CreateMemorySkillResponseBodyResultData extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("owner")
        public String owner;

        @NameInMap("resource_paths")
        public java.util.List<String> resourcePaths;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("triggers")
        public java.util.List<String> triggers;

        @NameInMap("updated_at")
        public String updatedAt;

        @NameInMap("version")
        public String version;

        public static CreateMemorySkillResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            CreateMemorySkillResponseBodyResultData self = new CreateMemorySkillResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public CreateMemorySkillResponseBodyResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMemorySkillResponseBodyResultData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateMemorySkillResponseBodyResultData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMemorySkillResponseBodyResultData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public CreateMemorySkillResponseBodyResultData setResourcePaths(java.util.List<String> resourcePaths) {
            this.resourcePaths = resourcePaths;
            return this;
        }
        public java.util.List<String> getResourcePaths() {
            return this.resourcePaths;
        }

        public CreateMemorySkillResponseBodyResultData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public CreateMemorySkillResponseBodyResultData setTriggers(java.util.List<String> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<String> getTriggers() {
            return this.triggers;
        }

        public CreateMemorySkillResponseBodyResultData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateMemorySkillResponseBodyResultData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateMemorySkillResponseBodyResult extends TeaModel {
        @NameInMap("data")
        public java.util.List<CreateMemorySkillResponseBodyResultData> data;

        @NameInMap("imported_count")
        public Integer importedCount;

        public static CreateMemorySkillResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMemorySkillResponseBodyResult self = new CreateMemorySkillResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateMemorySkillResponseBodyResult setData(java.util.List<CreateMemorySkillResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CreateMemorySkillResponseBodyResultData> getData() {
            return this.data;
        }

        public CreateMemorySkillResponseBodyResult setImportedCount(Integer importedCount) {
            this.importedCount = importedCount;
            return this;
        }
        public Integer getImportedCount() {
            return this.importedCount;
        }

    }

}
