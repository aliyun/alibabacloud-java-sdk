// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstanceTarsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceTarsServiceResponseBody body;

    public static CreateInstanceTarsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceTarsServiceResponse self = new CreateInstanceTarsServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceTarsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceTarsServiceResponse setBody(CreateInstanceTarsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceTarsServiceResponseBody getBody() {
        return this.body;
    }

}
