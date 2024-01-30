// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStackInstancesResponseBody body;

    public static DeleteStackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackInstancesResponse self = new DeleteStackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStackInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStackInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStackInstancesResponse setBody(DeleteStackInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStackInstancesResponseBody getBody() {
        return this.body;
    }

}
