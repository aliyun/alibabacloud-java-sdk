// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListSecretsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecretsResponseBody body;

    public static ListSecretsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecretsResponse self = new ListSecretsResponse();
        return TeaModel.build(map, self);
    }

    public ListSecretsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecretsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecretsResponse setBody(ListSecretsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecretsResponseBody getBody() {
        return this.body;
    }

}
