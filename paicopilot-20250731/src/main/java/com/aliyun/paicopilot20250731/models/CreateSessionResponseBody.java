// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class CreateSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>44553E9A-******-37ADC33FE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>se-weg******iqwcw</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static CreateSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionResponseBody self = new CreateSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
