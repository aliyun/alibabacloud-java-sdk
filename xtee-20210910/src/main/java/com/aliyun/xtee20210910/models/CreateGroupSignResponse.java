// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateGroupSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupSignResponseBody body;

    public static CreateGroupSignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupSignResponse self = new CreateGroupSignResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupSignResponse setBody(CreateGroupSignResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupSignResponseBody getBody() {
        return this.body;
    }

}
