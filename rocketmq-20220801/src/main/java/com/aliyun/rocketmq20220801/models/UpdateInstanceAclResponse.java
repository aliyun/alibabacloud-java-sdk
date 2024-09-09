// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceAclResponseBody body;

    public static UpdateInstanceAclResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAclResponse self = new UpdateInstanceAclResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceAclResponse setBody(UpdateInstanceAclResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceAclResponseBody getBody() {
        return this.body;
    }

}
