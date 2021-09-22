// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetCallerProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCallerProviderResponseBody body;

    public static GetCallerProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallerProviderResponse self = new GetCallerProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetCallerProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallerProviderResponse setBody(GetCallerProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallerProviderResponseBody getBody() {
        return this.body;
    }

}
