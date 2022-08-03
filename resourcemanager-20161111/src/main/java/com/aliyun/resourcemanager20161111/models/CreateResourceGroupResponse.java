// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class CreateResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourceGroupResponseBody body;

    public static CreateResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupResponse self = new CreateResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceGroupResponse setBody(CreateResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceGroupResponseBody getBody() {
        return this.body;
    }

}
