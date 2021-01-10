// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSServiceClientResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMSServiceClientResponseBody body;

    public static AddMSServiceClientResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMSServiceClientResponse self = new AddMSServiceClientResponse();
        return TeaModel.build(map, self);
    }

    public AddMSServiceClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMSServiceClientResponse setBody(AddMSServiceClientResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMSServiceClientResponseBody getBody() {
        return this.body;
    }

}
