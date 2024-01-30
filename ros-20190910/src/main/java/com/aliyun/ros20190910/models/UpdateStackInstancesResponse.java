// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStackInstancesResponseBody body;

    public static UpdateStackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackInstancesResponse self = new UpdateStackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStackInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStackInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStackInstancesResponse setBody(UpdateStackInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStackInstancesResponseBody getBody() {
        return this.body;
    }

}
