// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupFileResponseBody body;

    public static CreateGroupFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFileResponse self = new CreateGroupFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupFileResponse setBody(CreateGroupFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupFileResponseBody getBody() {
        return this.body;
    }

}
