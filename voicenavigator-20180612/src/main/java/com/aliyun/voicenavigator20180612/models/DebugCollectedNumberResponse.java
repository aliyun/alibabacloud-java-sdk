// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugCollectedNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DebugCollectedNumberResponseBody body;

    public static DebugCollectedNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        DebugCollectedNumberResponse self = new DebugCollectedNumberResponse();
        return TeaModel.build(map, self);
    }

    public DebugCollectedNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DebugCollectedNumberResponse setBody(DebugCollectedNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DebugCollectedNumberResponseBody getBody() {
        return this.body;
    }

}
