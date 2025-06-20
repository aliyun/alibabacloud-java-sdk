// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeScopeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SafeScopeDataResponseBody body;

    public static SafeScopeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        SafeScopeDataResponse self = new SafeScopeDataResponse();
        return TeaModel.build(map, self);
    }

    public SafeScopeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SafeScopeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SafeScopeDataResponse setBody(SafeScopeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public SafeScopeDataResponseBody getBody() {
        return this.body;
    }

}
