// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopRenderingSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>04c30850-1d91-4da1-b811-66d0ee94af7d</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>session-i205217481741918129226</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static StopRenderingSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StopRenderingSessionRequest self = new StopRenderingSessionRequest();
        return TeaModel.build(map, self);
    }

    public StopRenderingSessionRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public StopRenderingSessionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public StopRenderingSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
