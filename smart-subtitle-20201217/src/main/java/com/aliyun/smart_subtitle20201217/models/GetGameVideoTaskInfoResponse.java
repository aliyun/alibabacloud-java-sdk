// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class GetGameVideoTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGameVideoTaskInfoResponseBody body;

    public static GetGameVideoTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameVideoTaskInfoResponse self = new GetGameVideoTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetGameVideoTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGameVideoTaskInfoResponse setBody(GetGameVideoTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGameVideoTaskInfoResponseBody getBody() {
        return this.body;
    }

}
