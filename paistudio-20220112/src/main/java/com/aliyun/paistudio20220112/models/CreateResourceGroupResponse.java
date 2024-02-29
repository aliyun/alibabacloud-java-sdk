// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
