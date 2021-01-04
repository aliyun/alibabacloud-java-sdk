// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStackInstancesResponseBody body;

    public static CreateStackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStackInstancesResponse self = new CreateStackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CreateStackInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStackInstancesResponse setBody(CreateStackInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStackInstancesResponseBody getBody() {
        return this.body;
    }

}
