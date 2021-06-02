// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetWindowConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWindowConfigResponseBody body;

    public static GetWindowConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWindowConfigResponse self = new GetWindowConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetWindowConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWindowConfigResponse setBody(GetWindowConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWindowConfigResponseBody getBody() {
        return this.body;
    }

}
