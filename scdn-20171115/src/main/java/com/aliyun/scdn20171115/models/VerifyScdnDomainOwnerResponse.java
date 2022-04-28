// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class VerifyScdnDomainOwnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyScdnDomainOwnerResponseBody body;

    public static VerifyScdnDomainOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyScdnDomainOwnerResponse self = new VerifyScdnDomainOwnerResponse();
        return TeaModel.build(map, self);
    }

    public VerifyScdnDomainOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyScdnDomainOwnerResponse setBody(VerifyScdnDomainOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyScdnDomainOwnerResponseBody getBody() {
        return this.body;
    }

}
