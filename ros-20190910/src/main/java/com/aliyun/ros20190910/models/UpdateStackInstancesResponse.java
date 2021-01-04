// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateStackInstancesResponse setBody(UpdateStackInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStackInstancesResponseBody getBody() {
        return this.body;
    }

}
