// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateNotifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNotifyResponseBody body;

    public static CreateNotifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNotifyResponse self = new CreateNotifyResponse();
        return TeaModel.build(map, self);
    }

    public CreateNotifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNotifyResponse setBody(CreateNotifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNotifyResponseBody getBody() {
        return this.body;
    }

}
