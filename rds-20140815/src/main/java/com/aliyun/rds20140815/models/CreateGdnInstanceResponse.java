// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGdnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGdnInstanceResponseBody body;

    public static CreateGdnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGdnInstanceResponse self = new CreateGdnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGdnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGdnInstanceResponse setBody(CreateGdnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGdnInstanceResponseBody getBody() {
        return this.body;
    }

}
