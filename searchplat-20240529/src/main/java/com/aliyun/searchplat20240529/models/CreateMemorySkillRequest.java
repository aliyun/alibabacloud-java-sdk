// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateMemorySkillRequest extends TeaModel {
    @NameInMap("agent_id")
    public String agentId;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("zip_base64")
    public String zipBase64;

    public static CreateMemorySkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemorySkillRequest self = new CreateMemorySkillRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemorySkillRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateMemorySkillRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateMemorySkillRequest setZipBase64(String zipBase64) {
        this.zipBase64 = zipBase64;
        return this;
    }
    public String getZipBase64() {
        return this.zipBase64;
    }

}
