// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllMarketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllMarketsResponseBody body;

    public static GetAllMarketsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllMarketsResponse self = new GetAllMarketsResponse();
        return TeaModel.build(map, self);
    }

    public GetAllMarketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllMarketsResponse setBody(GetAllMarketsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllMarketsResponseBody getBody() {
        return this.body;
    }

}
