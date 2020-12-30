// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateGlobalAccelerationInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGlobalAccelerationInstanceResponseBody body;

    public static CreateGlobalAccelerationInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalAccelerationInstanceResponse self = new CreateGlobalAccelerationInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGlobalAccelerationInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGlobalAccelerationInstanceResponse setBody(CreateGlobalAccelerationInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGlobalAccelerationInstanceResponseBody getBody() {
        return this.body;
    }

}
