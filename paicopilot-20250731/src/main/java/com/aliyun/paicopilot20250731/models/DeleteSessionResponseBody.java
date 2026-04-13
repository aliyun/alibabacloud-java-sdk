// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class DeleteSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>44553E9A-******-37ADC33FE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>se-p4k******vx2y</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static DeleteSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSessionResponseBody self = new DeleteSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
