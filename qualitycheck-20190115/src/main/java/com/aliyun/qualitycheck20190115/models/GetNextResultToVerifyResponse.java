// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetNextResultToVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNextResultToVerifyResponseBody body;

    public static GetNextResultToVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNextResultToVerifyResponse self = new GetNextResultToVerifyResponse();
        return TeaModel.build(map, self);
    }

    public GetNextResultToVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNextResultToVerifyResponse setBody(GetNextResultToVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNextResultToVerifyResponseBody getBody() {
        return this.body;
    }

}
