// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetProfileListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProfileListResponseBody body;

    public static GetProfileListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProfileListResponse self = new GetProfileListResponse();
        return TeaModel.build(map, self);
    }

    public GetProfileListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProfileListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProfileListResponse setBody(GetProfileListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProfileListResponseBody getBody() {
        return this.body;
    }

}
