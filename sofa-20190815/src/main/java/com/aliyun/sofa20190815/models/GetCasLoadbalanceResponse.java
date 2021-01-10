// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCasLoadbalanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCasLoadbalanceResponseBody body;

    public static GetCasLoadbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCasLoadbalanceResponse self = new GetCasLoadbalanceResponse();
        return TeaModel.build(map, self);
    }

    public GetCasLoadbalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCasLoadbalanceResponse setBody(GetCasLoadbalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCasLoadbalanceResponseBody getBody() {
        return this.body;
    }

}
