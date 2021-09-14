// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210914_1639428.models;

import com.aliyun.tea.*;

public class AddResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddResponseBody body;

    public static AddResponse build(java.util.Map<String, ?> map) throws Exception {
        AddResponse self = new AddResponse();
        return TeaModel.build(map, self);
    }

    public AddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddResponse setBody(AddResponseBody body) {
        this.body = body;
        return this;
    }
    public AddResponseBody getBody() {
        return this.body;
    }

}
