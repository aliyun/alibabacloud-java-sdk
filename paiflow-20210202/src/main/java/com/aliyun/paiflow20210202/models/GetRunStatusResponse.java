// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetRunStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRunStatusResponseBody body;

    public static GetRunStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRunStatusResponse self = new GetRunStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetRunStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRunStatusResponse setBody(GetRunStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRunStatusResponseBody getBody() {
        return this.body;
    }

}
