// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class UpdateMemorySkillRequest extends TeaModel {
    @NameInMap("agent_id")
    public String agentId;

    @NameInMap("files")
    public java.util.Map<String, String> files;

    @NameInMap("name")
    public String name;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("version")
    public String version;

    public static UpdateMemorySkillRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemorySkillRequest self = new UpdateMemorySkillRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemorySkillRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdateMemorySkillRequest setFiles(java.util.Map<String, String> files) {
        this.files = files;
        return this;
    }
    public java.util.Map<String, String> getFiles() {
        return this.files;
    }

    public UpdateMemorySkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMemorySkillRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateMemorySkillRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
