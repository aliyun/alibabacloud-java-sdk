// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeUserCreditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeUserCreditResponseBody body;

    public static GetYikeUserCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeUserCreditResponse self = new GetYikeUserCreditResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeUserCreditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeUserCreditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeUserCreditResponse setBody(GetYikeUserCreditResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeUserCreditResponseBody getBody() {
        return this.body;
    }

}
