// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210916_103600223.models;

import com.aliyun.tea.*;

public class ResolveOpenApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResolveOpenApiResponseBody body;

    public static ResolveOpenApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ResolveOpenApiResponse self = new ResolveOpenApiResponse();
        return TeaModel.build(map, self);
    }

    public ResolveOpenApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResolveOpenApiResponse setBody(ResolveOpenApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ResolveOpenApiResponseBody getBody() {
        return this.body;
    }

}
