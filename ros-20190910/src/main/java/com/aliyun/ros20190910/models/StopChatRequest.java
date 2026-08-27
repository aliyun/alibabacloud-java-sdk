// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StopChatRequest extends TeaModel {
    /**
     * <p>Set this parameter to V2 to route to the ROS Agent V2 backend.</p>
     * 
     * <strong>example:</strong>
     * <p>V2</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>The ID of the session to stop. The operation verifies that the session belongs to the current user.</p>
     * 
     * <strong>example:</strong>
     * <p>7f4e2a8c6d9b4a1f8e3c5b7d2a6f9012</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static StopChatRequest build(java.util.Map<String, ?> map) throws Exception {
        StopChatRequest self = new StopChatRequest();
        return TeaModel.build(map, self);
    }

    public StopChatRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public StopChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
