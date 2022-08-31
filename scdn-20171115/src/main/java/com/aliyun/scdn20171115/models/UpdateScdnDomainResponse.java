// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class UpdateScdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateScdnDomainResponseBody body;

    public static UpdateScdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScdnDomainResponse self = new UpdateScdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScdnDomainResponse setBody(UpdateScdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScdnDomainResponseBody getBody() {
        return this.body;
    }

}
