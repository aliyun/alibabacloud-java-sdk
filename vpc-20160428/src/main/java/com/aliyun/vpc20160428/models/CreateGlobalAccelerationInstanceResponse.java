// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateGlobalAccelerationInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateGlobalAccelerationInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGlobalAccelerationInstanceResponse setBody(CreateGlobalAccelerationInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGlobalAccelerationInstanceResponseBody getBody() {
        return this.body;
    }

}
