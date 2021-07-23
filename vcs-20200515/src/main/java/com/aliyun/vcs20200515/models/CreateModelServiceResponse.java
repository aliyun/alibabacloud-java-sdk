// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateModelServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateModelServiceResponseBody body;

    public static CreateModelServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceResponse self = new CreateModelServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelServiceResponse setBody(CreateModelServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelServiceResponseBody getBody() {
        return this.body;
    }

}
