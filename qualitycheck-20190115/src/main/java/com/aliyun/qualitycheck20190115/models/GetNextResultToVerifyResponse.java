// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetNextResultToVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetNextResultToVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNextResultToVerifyResponse setBody(GetNextResultToVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNextResultToVerifyResponseBody getBody() {
        return this.body;
    }

}
