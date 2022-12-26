// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageRegistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateJenkinsImageRegistryResponseBody body;

    public static CreateJenkinsImageRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJenkinsImageRegistryResponse self = new CreateJenkinsImageRegistryResponse();
        return TeaModel.build(map, self);
    }

    public CreateJenkinsImageRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJenkinsImageRegistryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJenkinsImageRegistryResponse setBody(CreateJenkinsImageRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJenkinsImageRegistryResponseBody getBody() {
        return this.body;
    }

}
