// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetValidationErrorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetValidationErrorResponseBody body;

    public static GetValidationErrorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetValidationErrorResponse self = new GetValidationErrorResponse();
        return TeaModel.build(map, self);
    }

    public GetValidationErrorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetValidationErrorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetValidationErrorResponse setBody(GetValidationErrorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetValidationErrorResponseBody getBody() {
        return this.body;
    }

}
