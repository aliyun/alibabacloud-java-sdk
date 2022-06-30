// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInventoryResponseBody body;

    public static GetInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInventoryResponse self = new GetInventoryResponse();
        return TeaModel.build(map, self);
    }

    public GetInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInventoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInventoryResponse setBody(GetInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInventoryResponseBody getBody() {
        return this.body;
    }

}
