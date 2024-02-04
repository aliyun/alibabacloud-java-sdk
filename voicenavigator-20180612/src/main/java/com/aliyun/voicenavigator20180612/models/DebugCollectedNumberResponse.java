// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugCollectedNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DebugCollectedNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DebugCollectedNumberResponse setBody(DebugCollectedNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DebugCollectedNumberResponseBody getBody() {
        return this.body;
    }

}
