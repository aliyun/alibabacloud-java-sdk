// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StartApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartApplicationResponseBody body;

    public static StartApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        StartApplicationResponse self = new StartApplicationResponse();
        return TeaModel.build(map, self);
    }

    public StartApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartApplicationResponse setBody(StartApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public StartApplicationResponseBody getBody() {
        return this.body;
    }

}
