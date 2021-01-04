// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateParameterResponseBody body;

    public static CreateParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterResponse self = new CreateParameterResponse();
        return TeaModel.build(map, self);
    }

    public CreateParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateParameterResponse setBody(CreateParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateParameterResponseBody getBody() {
        return this.body;
    }

}
