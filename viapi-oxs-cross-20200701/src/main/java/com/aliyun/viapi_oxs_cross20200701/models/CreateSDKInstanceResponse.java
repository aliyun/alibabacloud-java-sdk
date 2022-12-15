// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class CreateSDKInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSDKInstanceResponseBody body;

    public static CreateSDKInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSDKInstanceResponse self = new CreateSDKInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSDKInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSDKInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSDKInstanceResponse setBody(CreateSDKInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSDKInstanceResponseBody getBody() {
        return this.body;
    }

}
