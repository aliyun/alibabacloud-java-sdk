// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetConstraintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConstraintResponseBody body;

    public static GetConstraintResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConstraintResponse self = new GetConstraintResponse();
        return TeaModel.build(map, self);
    }

    public GetConstraintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConstraintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConstraintResponse setBody(GetConstraintResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConstraintResponseBody getBody() {
        return this.body;
    }

}
