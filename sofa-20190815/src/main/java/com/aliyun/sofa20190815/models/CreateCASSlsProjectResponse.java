// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCASSlsProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCASSlsProjectResponseBody body;

    public static CreateCASSlsProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCASSlsProjectResponse self = new CreateCASSlsProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateCASSlsProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCASSlsProjectResponse setBody(CreateCASSlsProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCASSlsProjectResponseBody getBody() {
        return this.body;
    }

}
