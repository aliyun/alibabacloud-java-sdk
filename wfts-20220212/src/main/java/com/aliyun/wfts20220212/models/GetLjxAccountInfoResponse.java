// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wfts20220212.models;

import com.aliyun.tea.*;

public class GetLjxAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLjxAccountInfoResponseBody body;

    public static GetLjxAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLjxAccountInfoResponse self = new GetLjxAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLjxAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLjxAccountInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLjxAccountInfoResponse setBody(GetLjxAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLjxAccountInfoResponseBody getBody() {
        return this.body;
    }

}
