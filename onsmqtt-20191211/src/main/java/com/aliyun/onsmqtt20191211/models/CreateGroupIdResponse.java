// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class CreateGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupIdResponseBody body;

    public static CreateGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupIdResponse self = new CreateGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupIdResponse setBody(CreateGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupIdResponseBody getBody() {
        return this.body;
    }

}
