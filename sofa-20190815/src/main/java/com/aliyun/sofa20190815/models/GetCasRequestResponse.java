// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCasRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCasRequestResponseBody body;

    public static GetCasRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCasRequestResponse self = new GetCasRequestResponse();
        return TeaModel.build(map, self);
    }

    public GetCasRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCasRequestResponse setBody(GetCasRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCasRequestResponseBody getBody() {
        return this.body;
    }

}
