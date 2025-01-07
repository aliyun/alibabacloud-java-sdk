// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRCNodePoolResponseBody body;

    public static CreateRCNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRCNodePoolResponse self = new CreateRCNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateRCNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRCNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRCNodePoolResponse setBody(CreateRCNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRCNodePoolResponseBody getBody() {
        return this.body;
    }

}
