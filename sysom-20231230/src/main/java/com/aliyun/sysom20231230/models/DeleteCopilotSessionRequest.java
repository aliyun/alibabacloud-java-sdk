// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteCopilotSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sre_agent</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c356bc310e4345c3a602a2912322ad21</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static DeleteCopilotSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCopilotSessionRequest self = new DeleteCopilotSessionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCopilotSessionRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DeleteCopilotSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
