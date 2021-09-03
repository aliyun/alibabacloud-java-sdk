// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210823_161417275.models;

import com.aliyun.tea.*;

public class GetSiteDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSiteDomainResponseBody body;

    public static GetSiteDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSiteDomainResponse self = new GetSiteDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetSiteDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSiteDomainResponse setBody(GetSiteDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSiteDomainResponseBody getBody() {
        return this.body;
    }

}
