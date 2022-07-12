// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetAuthorizationLetterVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuthorizationLetterVersionResponseBody body;

    public static GetAuthorizationLetterVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationLetterVersionResponse self = new GetAuthorizationLetterVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationLetterVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationLetterVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthorizationLetterVersionResponse setBody(GetAuthorizationLetterVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationLetterVersionResponseBody getBody() {
        return this.body;
    }

}
