// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppAssistantAgentRequest extends TeaModel {
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <strong>example:</strong>
     * <p>WS20250731233102000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>LINUX64</p>
     */
    @NameInMap("PlatformType")
    public String platformType;

    public static CreateAppAssistantAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAssistantAgentRequest self = new CreateAppAssistantAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppAssistantAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public CreateAppAssistantAgentRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateAppAssistantAgentRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

}
