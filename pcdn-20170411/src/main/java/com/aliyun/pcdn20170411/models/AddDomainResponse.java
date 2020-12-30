// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class AddDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDomainResponseBody body;

    public static AddDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainResponse self = new AddDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDomainResponse setBody(AddDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDomainResponseBody getBody() {
        return this.body;
    }

}
