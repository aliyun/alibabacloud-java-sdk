// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StopChatResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C68F7A5-2D16-5C8F-A4B1-01E9C6A9B0D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The session ID associated with this stop operation.</p>
     * 
     * <strong>example:</strong>
     * <p>7f4e2a8c6d9b4a1f8e3c5b7d2a6f9012</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The stop result. Valid values: Stopped, Stopping, Failed, NoActiveStream.</p>
     * 
     * <strong>example:</strong>
     * <p>Stopped</p>
     */
    @NameInMap("Status")
    public String status;

    public static StopChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopChatResponseBody self = new StopChatResponseBody();
        return TeaModel.build(map, self);
    }

    public StopChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopChatResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public StopChatResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
