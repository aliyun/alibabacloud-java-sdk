// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTaskWorkforceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskWorkforceResponseBody body;

    public static GetTaskWorkforceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskWorkforceResponse self = new GetTaskWorkforceResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskWorkforceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskWorkforceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskWorkforceResponse setBody(GetTaskWorkforceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskWorkforceResponseBody getBody() {
        return this.body;
    }

}
