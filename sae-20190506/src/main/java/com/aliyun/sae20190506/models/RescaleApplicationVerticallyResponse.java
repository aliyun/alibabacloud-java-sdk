// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationVerticallyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RescaleApplicationVerticallyResponseBody body;

    public static RescaleApplicationVerticallyResponse build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationVerticallyResponse self = new RescaleApplicationVerticallyResponse();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationVerticallyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RescaleApplicationVerticallyResponse setBody(RescaleApplicationVerticallyResponseBody body) {
        this.body = body;
        return this;
    }
    public RescaleApplicationVerticallyResponseBody getBody() {
        return this.body;
    }

}
