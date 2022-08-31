// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class AddScdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddScdnDomainResponseBody body;

    public static AddScdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddScdnDomainResponse self = new AddScdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddScdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddScdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddScdnDomainResponse setBody(AddScdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddScdnDomainResponseBody getBody() {
        return this.body;
    }

}
