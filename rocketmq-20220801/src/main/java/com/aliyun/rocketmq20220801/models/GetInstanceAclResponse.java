// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceAclResponseBody body;

    public static GetInstanceAclResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAclResponse self = new GetInstanceAclResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceAclResponse setBody(GetInstanceAclResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceAclResponseBody getBody() {
        return this.body;
    }

}
