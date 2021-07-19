// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateStateConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStateConfigurationResponseBody body;

    public static CreateStateConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStateConfigurationResponse self = new CreateStateConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateStateConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStateConfigurationResponse setBody(CreateStateConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStateConfigurationResponseBody getBody() {
        return this.body;
    }

}
