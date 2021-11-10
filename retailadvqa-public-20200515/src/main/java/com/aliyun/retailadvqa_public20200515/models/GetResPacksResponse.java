// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetResPacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResPacksResponseBody body;

    public static GetResPacksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResPacksResponse self = new GetResPacksResponse();
        return TeaModel.build(map, self);
    }

    public GetResPacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResPacksResponse setBody(GetResPacksResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResPacksResponseBody getBody() {
        return this.body;
    }

}
