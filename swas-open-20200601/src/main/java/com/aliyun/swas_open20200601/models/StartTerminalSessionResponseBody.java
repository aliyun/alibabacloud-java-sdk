// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class StartTerminalSessionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The session ID.</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The URL of the WebSocket session that is used to connect to the server. The URL contains the session ID (`SessionId`) and the authentication token (`SecurityToken`).</p>
     */
    @NameInMap("WebSocketUrl")
    public String webSocketUrl;

    public static StartTerminalSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTerminalSessionResponseBody self = new StartTerminalSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTerminalSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartTerminalSessionResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public StartTerminalSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public StartTerminalSessionResponseBody setWebSocketUrl(String webSocketUrl) {
        this.webSocketUrl = webSocketUrl;
        return this;
    }
    public String getWebSocketUrl() {
        return this.webSocketUrl;
    }

}
