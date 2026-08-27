// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateUserWithGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserWithGroupsResponseBody body;

    public static CreateUserWithGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWithGroupsResponse self = new CreateUserWithGroupsResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserWithGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserWithGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserWithGroupsResponse setBody(CreateUserWithGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserWithGroupsResponseBody getBody() {
        return this.body;
    }

}
