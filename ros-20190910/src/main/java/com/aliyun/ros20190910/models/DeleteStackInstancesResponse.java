// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteStackInstancesResponse setBody(DeleteStackInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStackInstancesResponseBody getBody() {
        return this.body;
    }

}
