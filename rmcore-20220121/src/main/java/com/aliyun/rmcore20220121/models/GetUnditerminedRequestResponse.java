// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class GetUnditerminedRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUnditerminedRequestResponseBody body;

    public static GetUnditerminedRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnditerminedRequestResponse self = new GetUnditerminedRequestResponse();
        return TeaModel.build(map, self);
    }

    public GetUnditerminedRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUnditerminedRequestResponse setBody(GetUnditerminedRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUnditerminedRequestResponseBody getBody() {
        return this.body;
    }

}
