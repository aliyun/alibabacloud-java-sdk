// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServerGroupResponseBody body;

    public static CreateServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServerGroupResponse self = new CreateServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServerGroupResponse setBody(CreateServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServerGroupResponseBody getBody() {
        return this.body;
    }

}
