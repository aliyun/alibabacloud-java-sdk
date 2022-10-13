// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MassPushResponseBody body;

    public static MassPushResponse build(java.util.Map<String, ?> map) throws Exception {
        MassPushResponse self = new MassPushResponse();
        return TeaModel.build(map, self);
    }

    public MassPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MassPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MassPushResponse setBody(MassPushResponseBody body) {
        this.body = body;
        return this;
    }
    public MassPushResponseBody getBody() {
        return this.body;
    }

}
