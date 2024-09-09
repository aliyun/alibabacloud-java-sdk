// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceAclResponseBody body;

    public static ListInstanceAclResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAclResponse self = new ListInstanceAclResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceAclResponse setBody(ListInstanceAclResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceAclResponseBody getBody() {
        return this.body;
    }

}
