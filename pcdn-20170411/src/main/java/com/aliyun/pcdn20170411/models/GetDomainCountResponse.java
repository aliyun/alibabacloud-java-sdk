// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetDomainCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainCountResponseBody body;

    public static GetDomainCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainCountResponse self = new GetDomainCountResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainCountResponse setBody(GetDomainCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainCountResponseBody getBody() {
        return this.body;
    }

}
