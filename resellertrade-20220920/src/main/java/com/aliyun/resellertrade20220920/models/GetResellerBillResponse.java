// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20220920.models;

import com.aliyun.tea.*;

public class GetResellerBillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResellerBillResponseBody body;

    public static GetResellerBillResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResellerBillResponse self = new GetResellerBillResponse();
        return TeaModel.build(map, self);
    }

    public GetResellerBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResellerBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResellerBillResponse setBody(GetResellerBillResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResellerBillResponseBody getBody() {
        return this.body;
    }

}
