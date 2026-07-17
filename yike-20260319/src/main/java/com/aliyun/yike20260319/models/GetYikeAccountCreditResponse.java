// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeAccountCreditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeAccountCreditResponseBody body;

    public static GetYikeAccountCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAccountCreditResponse self = new GetYikeAccountCreditResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeAccountCreditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeAccountCreditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeAccountCreditResponse setBody(GetYikeAccountCreditResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeAccountCreditResponseBody getBody() {
        return this.body;
    }

}
