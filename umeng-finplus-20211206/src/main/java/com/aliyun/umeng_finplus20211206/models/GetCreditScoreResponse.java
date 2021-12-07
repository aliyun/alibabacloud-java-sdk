// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211206.models;

import com.aliyun.tea.*;

public class GetCreditScoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCreditScoreResponseBody body;

    public static GetCreditScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCreditScoreResponse self = new GetCreditScoreResponse();
        return TeaModel.build(map, self);
    }

    public GetCreditScoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCreditScoreResponse setBody(GetCreditScoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCreditScoreResponseBody getBody() {
        return this.body;
    }

}
