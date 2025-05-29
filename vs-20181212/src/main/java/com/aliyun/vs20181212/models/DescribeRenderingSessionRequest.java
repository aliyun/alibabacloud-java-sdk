// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>d27c89d6-4fe3-4855-a89c-ea721c708b0b</p>
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

    public static DescribeRenderingSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingSessionRequest self = new DescribeRenderingSessionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingSessionRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeRenderingSessionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeRenderingSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
