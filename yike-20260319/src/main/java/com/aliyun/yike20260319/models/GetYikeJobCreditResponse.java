// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeJobCreditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeJobCreditResponseBody body;

    public static GetYikeJobCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeJobCreditResponse self = new GetYikeJobCreditResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeJobCreditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeJobCreditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeJobCreditResponse setBody(GetYikeJobCreditResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeJobCreditResponseBody getBody() {
        return this.body;
    }

}
