// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationGroupResponseBody body;

    public static CreateApplicationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationGroupResponse self = new CreateApplicationGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationGroupResponse setBody(CreateApplicationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationGroupResponseBody getBody() {
        return this.body;
    }

}
