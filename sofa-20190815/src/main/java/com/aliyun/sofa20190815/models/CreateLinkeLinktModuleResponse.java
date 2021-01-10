// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktModuleResponseBody body;

    public static CreateLinkeLinktModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktModuleResponse self = new CreateLinkeLinktModuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktModuleResponse setBody(CreateLinkeLinktModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktModuleResponseBody getBody() {
        return this.body;
    }

}
