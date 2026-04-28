// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class SearchMemoryRequest extends TeaModel {
    @NameInMap("agent_id")
    public String agentId;

    @NameInMap("enhancements")
    public java.util.Map<String, ?> enhancements;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("run_id")
    public String runId;

    @NameInMap("size")
    public Integer size;

    @NameInMap("user_id")
    public String userId;

    public static SearchMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoryRequest self = new SearchMemoryRequest();
        return TeaModel.build(map, self);
    }

    public SearchMemoryRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public SearchMemoryRequest setEnhancements(java.util.Map<String, ?> enhancements) {
        this.enhancements = enhancements;
        return this;
    }
    public java.util.Map<String, ?> getEnhancements() {
        return this.enhancements;
    }

    public SearchMemoryRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchMemoryRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public SearchMemoryRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public SearchMemoryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
