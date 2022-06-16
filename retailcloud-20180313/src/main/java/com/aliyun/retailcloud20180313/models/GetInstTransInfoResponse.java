// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class GetInstTransInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstTransInfoResponseBody body;

    public static GetInstTransInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstTransInfoResponse self = new GetInstTransInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetInstTransInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstTransInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstTransInfoResponse setBody(GetInstTransInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstTransInfoResponseBody getBody() {
        return this.body;
    }

}
