// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260622.models;

import com.aliyun.tea.*;

public class GetSessionContentRequest extends TeaModel {
    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static GetSessionContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSessionContentRequest self = new GetSessionContentRequest();
        return TeaModel.build(map, self);
    }

    public GetSessionContentRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
