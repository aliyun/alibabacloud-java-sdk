// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class GetGameVideoTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGameVideoTaskResultResponseBody body;

    public static GetGameVideoTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameVideoTaskResultResponse self = new GetGameVideoTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetGameVideoTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGameVideoTaskResultResponse setBody(GetGameVideoTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGameVideoTaskResultResponseBody getBody() {
        return this.body;
    }

}
