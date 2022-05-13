// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class OlineIsvTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OlineIsvTestResponseBody body;

    public static OlineIsvTestResponse build(java.util.Map<String, ?> map) throws Exception {
        OlineIsvTestResponse self = new OlineIsvTestResponse();
        return TeaModel.build(map, self);
    }

    public OlineIsvTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OlineIsvTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OlineIsvTestResponse setBody(OlineIsvTestResponseBody body) {
        this.body = body;
        return this;
    }
    public OlineIsvTestResponseBody getBody() {
        return this.body;
    }

}
