// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetContactWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetContactWhiteListResponseBody body;

    public static GetContactWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContactWhiteListResponse self = new GetContactWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public GetContactWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContactWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContactWhiteListResponse setBody(GetContactWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContactWhiteListResponseBody getBody() {
        return this.body;
    }

}
