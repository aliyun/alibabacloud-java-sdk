// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateListenerResponseBody body;

    public static CreateListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateListenerResponse self = new CreateListenerResponse();
        return TeaModel.build(map, self);
    }

    public CreateListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateListenerResponse setBody(CreateListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateListenerResponseBody getBody() {
        return this.body;
    }

}
