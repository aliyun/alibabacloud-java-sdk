// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationAgentRelationRequest extends TeaModel {
    /**
     * <p>The instance ID of the Agent to attach.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The ID of the Squad application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The authentication token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pas_xxx</p>
     */
    @NameInMap("Token")
    public String token;

    public static CreateApplicationAgentRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationAgentRelationRequest self = new CreateApplicationAgentRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationAgentRelationRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateApplicationAgentRelationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationAgentRelationRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
