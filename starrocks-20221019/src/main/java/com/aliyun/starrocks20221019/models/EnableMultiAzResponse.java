// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class EnableMultiAzResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableMultiAzResponseBody body;

    public static EnableMultiAzResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMultiAzResponse self = new EnableMultiAzResponse();
        return TeaModel.build(map, self);
    }

    public EnableMultiAzResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMultiAzResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableMultiAzResponse setBody(EnableMultiAzResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMultiAzResponseBody getBody() {
        return this.body;
    }

}
