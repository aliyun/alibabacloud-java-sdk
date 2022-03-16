// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class GetGameVideoTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGameVideoTaskStatusResponseBody body;

    public static GetGameVideoTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameVideoTaskStatusResponse self = new GetGameVideoTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetGameVideoTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGameVideoTaskStatusResponse setBody(GetGameVideoTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGameVideoTaskStatusResponseBody getBody() {
        return this.body;
    }

}
