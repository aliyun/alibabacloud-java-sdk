// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpsecServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateIpsecServerResponse setBody(CreateIpsecServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpsecServerResponseBody getBody() {
        return this.body;
    }

}
