// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetMailTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMailTaskStatusResponseBody body;

    public static GetMailTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMailTaskStatusResponse self = new GetMailTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetMailTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMailTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMailTaskStatusResponse setBody(GetMailTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMailTaskStatusResponseBody getBody() {
        return this.body;
    }

}
