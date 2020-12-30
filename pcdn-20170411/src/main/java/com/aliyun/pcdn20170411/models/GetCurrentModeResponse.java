// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetCurrentModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCurrentModeResponseBody body;

    public static GetCurrentModeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentModeResponse self = new GetCurrentModeResponse();
        return TeaModel.build(map, self);
    }

    public GetCurrentModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCurrentModeResponse setBody(GetCurrentModeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCurrentModeResponseBody getBody() {
        return this.body;
    }

}
