// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class CollectedNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CollectedNumberResponseBody body;

    public static CollectedNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        CollectedNumberResponse self = new CollectedNumberResponse();
        return TeaModel.build(map, self);
    }

    public CollectedNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CollectedNumberResponse setBody(CollectedNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public CollectedNumberResponseBody getBody() {
        return this.body;
    }

}
