// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateExecutorGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExecutorGroupResponseBody body;

    public static CreateExecutorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExecutorGroupResponse self = new CreateExecutorGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateExecutorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExecutorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExecutorGroupResponse setBody(CreateExecutorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExecutorGroupResponseBody getBody() {
        return this.body;
    }

}
