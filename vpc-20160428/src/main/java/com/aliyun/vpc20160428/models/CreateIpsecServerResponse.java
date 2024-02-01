// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpsecServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpsecServerResponseBody body;

    public static CreateIpsecServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpsecServerResponse self = new CreateIpsecServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpsecServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpsecServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpsecServerResponse setBody(CreateIpsecServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpsecServerResponseBody getBody() {
        return this.body;
    }

}
