// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugDialogueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DebugDialogueResponseBody body;

    public static DebugDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        DebugDialogueResponse self = new DebugDialogueResponse();
        return TeaModel.build(map, self);
    }

    public DebugDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DebugDialogueResponse setBody(DebugDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public DebugDialogueResponseBody getBody() {
        return this.body;
    }

}
