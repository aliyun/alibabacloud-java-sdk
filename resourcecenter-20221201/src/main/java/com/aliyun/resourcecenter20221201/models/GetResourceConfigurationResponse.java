// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceConfigurationResponseBody body;

    public static GetResourceConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceConfigurationResponse self = new GetResourceConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceConfigurationResponse setBody(GetResourceConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceConfigurationResponseBody getBody() {
        return this.body;
    }

}
