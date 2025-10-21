// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class CreateWordGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWordGroupResponseBody body;

    public static CreateWordGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWordGroupResponse self = new CreateWordGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateWordGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWordGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWordGroupResponse setBody(CreateWordGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWordGroupResponseBody getBody() {
        return this.body;
    }

}
