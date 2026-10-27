// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePxfsUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePxfsUserResponseBody body;

    public static CreatePxfsUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePxfsUserResponse self = new CreatePxfsUserResponse();
        return TeaModel.build(map, self);
    }

    public CreatePxfsUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePxfsUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePxfsUserResponse setBody(CreatePxfsUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePxfsUserResponseBody getBody() {
        return this.body;
    }

}
