// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChatMessagesRequest extends TeaModel {
    /**
     * <p>Set to V2 to route requests to the ROS Agent V2 backend.</p>
     * 
     * <strong>example:</strong>
     * <p>V2</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>A compatibility field. V2 does not return a paged message array, and the service does not consume this field.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A compatibility field. V2 does not return a paged message array, and the service does not consume this field.</p>
     * 
     * <strong>example:</strong>
     * <p>CAES...</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The session ID to query. You can only query sessions owned by the current user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7f4e2a8c6d9b4a1f8e3c5b7d2a6f9012</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static ListChatMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatMessagesRequest self = new ListChatMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListChatMessagesRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public ListChatMessagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListChatMessagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListChatMessagesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
