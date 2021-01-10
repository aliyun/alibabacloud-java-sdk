// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetScoreInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScoreInfoResponseBody body;

    public static GetScoreInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScoreInfoResponse self = new GetScoreInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetScoreInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScoreInfoResponse setBody(GetScoreInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScoreInfoResponseBody getBody() {
        return this.body;
    }

}
