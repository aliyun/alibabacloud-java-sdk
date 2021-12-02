// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateSlbAPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSlbAPResponseBody body;

    public static CreateSlbAPResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSlbAPResponse self = new CreateSlbAPResponse();
        return TeaModel.build(map, self);
    }

    public CreateSlbAPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSlbAPResponse setBody(CreateSlbAPResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSlbAPResponseBody getBody() {
        return this.body;
    }

}
