// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StopApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopApplicationResponseBody body;

    public static StopApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        StopApplicationResponse self = new StopApplicationResponse();
        return TeaModel.build(map, self);
    }

    public StopApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopApplicationResponse setBody(StopApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public StopApplicationResponseBody getBody() {
        return this.body;
    }

}
