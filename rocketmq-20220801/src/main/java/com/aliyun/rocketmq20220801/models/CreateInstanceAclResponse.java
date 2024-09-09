// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateInstanceAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceAclResponseBody body;

    public static CreateInstanceAclResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceAclResponse self = new CreateInstanceAclResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceAclResponse setBody(CreateInstanceAclResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceAclResponseBody getBody() {
        return this.body;
    }

}
