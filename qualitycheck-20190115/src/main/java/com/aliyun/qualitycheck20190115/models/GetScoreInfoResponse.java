// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetScoreInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetScoreInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScoreInfoResponse setBody(GetScoreInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScoreInfoResponseBody getBody() {
        return this.body;
    }

}
