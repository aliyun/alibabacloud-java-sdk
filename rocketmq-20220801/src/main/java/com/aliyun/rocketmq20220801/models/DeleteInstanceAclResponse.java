// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteInstanceAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstanceAclResponseBody body;

    public static DeleteInstanceAclResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceAclResponse self = new DeleteInstanceAclResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceAclResponse setBody(DeleteInstanceAclResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceAclResponseBody getBody() {
        return this.body;
    }

}
