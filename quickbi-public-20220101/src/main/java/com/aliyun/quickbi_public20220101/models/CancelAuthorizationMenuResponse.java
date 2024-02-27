// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CancelAuthorizationMenuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelAuthorizationMenuResponseBody body;

    public static CancelAuthorizationMenuResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAuthorizationMenuResponse self = new CancelAuthorizationMenuResponse();
        return TeaModel.build(map, self);
    }

    public CancelAuthorizationMenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAuthorizationMenuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAuthorizationMenuResponse setBody(CancelAuthorizationMenuResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAuthorizationMenuResponseBody getBody() {
        return this.body;
    }

}
