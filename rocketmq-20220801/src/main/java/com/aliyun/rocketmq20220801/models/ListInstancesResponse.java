// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstancesResponseBody body;

    public static ListInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponse self = new ListInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstancesResponse setBody(ListInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesResponseBody getBody() {
        return this.body;
    }

}
