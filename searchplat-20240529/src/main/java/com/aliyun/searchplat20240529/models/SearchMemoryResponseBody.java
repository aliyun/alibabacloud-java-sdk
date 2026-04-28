// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class SearchMemoryResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public SearchMemoryResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static SearchMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoryResponseBody self = new SearchMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMemoryResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public SearchMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMemoryResponseBody setResult(SearchMemoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SearchMemoryResponseBodyResult getResult() {
        return this.result;
    }

    public SearchMemoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class SearchMemoryResponseBodyResultMemoryResults extends TeaModel {
        @NameInMap("agent_id")
        public String agentId;

        @NameInMap("memory")
        public String memory;

        @NameInMap("memory_id")
        public String memoryId;

        @NameInMap("user_id")
        public String userId;

        public static SearchMemoryResponseBodyResultMemoryResults build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoryResponseBodyResultMemoryResults self = new SearchMemoryResponseBodyResultMemoryResults();
            return TeaModel.build(map, self);
        }

        public SearchMemoryResponseBodyResultMemoryResults setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public SearchMemoryResponseBodyResultMemoryResults setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public SearchMemoryResponseBodyResultMemoryResults setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

        public SearchMemoryResponseBodyResultMemoryResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchMemoryResponseBodyResultMemory extends TeaModel {
        @NameInMap("results")
        public java.util.List<SearchMemoryResponseBodyResultMemoryResults> results;

        @NameInMap("total")
        public Integer total;

        public static SearchMemoryResponseBodyResultMemory build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoryResponseBodyResultMemory self = new SearchMemoryResponseBodyResultMemory();
            return TeaModel.build(map, self);
        }

        public SearchMemoryResponseBodyResultMemory setResults(java.util.List<SearchMemoryResponseBodyResultMemoryResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<SearchMemoryResponseBodyResultMemoryResults> getResults() {
            return this.results;
        }

        public SearchMemoryResponseBodyResultMemory setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class SearchMemoryResponseBodyResultSkillResults extends TeaModel {
        @NameInMap("agent_id")
        public String agentId;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("skill_id")
        public String skillId;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("version")
        public String version;

        public static SearchMemoryResponseBodyResultSkillResults build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoryResponseBodyResultSkillResults self = new SearchMemoryResponseBodyResultSkillResults();
            return TeaModel.build(map, self);
        }

        public SearchMemoryResponseBodyResultSkillResults setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public SearchMemoryResponseBodyResultSkillResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchMemoryResponseBodyResultSkillResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchMemoryResponseBodyResultSkillResults setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public SearchMemoryResponseBodyResultSkillResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SearchMemoryResponseBodyResultSkillResults setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class SearchMemoryResponseBodyResultSkill extends TeaModel {
        @NameInMap("results")
        public java.util.List<SearchMemoryResponseBodyResultSkillResults> results;

        @NameInMap("total")
        public Integer total;

        public static SearchMemoryResponseBodyResultSkill build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoryResponseBodyResultSkill self = new SearchMemoryResponseBodyResultSkill();
            return TeaModel.build(map, self);
        }

        public SearchMemoryResponseBodyResultSkill setResults(java.util.List<SearchMemoryResponseBodyResultSkillResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<SearchMemoryResponseBodyResultSkillResults> getResults() {
            return this.results;
        }

        public SearchMemoryResponseBodyResultSkill setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class SearchMemoryResponseBodyResult extends TeaModel {
        @NameInMap("memory")
        public SearchMemoryResponseBodyResultMemory memory;

        @NameInMap("skill")
        public SearchMemoryResponseBodyResultSkill skill;

        public static SearchMemoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SearchMemoryResponseBodyResult self = new SearchMemoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SearchMemoryResponseBodyResult setMemory(SearchMemoryResponseBodyResultMemory memory) {
            this.memory = memory;
            return this;
        }
        public SearchMemoryResponseBodyResultMemory getMemory() {
            return this.memory;
        }

        public SearchMemoryResponseBodyResult setSkill(SearchMemoryResponseBodyResultSkill skill) {
            this.skill = skill;
            return this;
        }
        public SearchMemoryResponseBodyResultSkill getSkill() {
            return this.skill;
        }

    }

}
