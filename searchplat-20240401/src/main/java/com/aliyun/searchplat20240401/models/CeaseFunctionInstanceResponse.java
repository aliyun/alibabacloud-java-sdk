// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CeaseFunctionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CeaseFunctionInstanceResponseBody body;

    public static CeaseFunctionInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CeaseFunctionInstanceResponse self = new CeaseFunctionInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CeaseFunctionInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CeaseFunctionInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CeaseFunctionInstanceResponse setBody(CeaseFunctionInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CeaseFunctionInstanceResponseBody getBody() {
        return this.body;
    }

}
