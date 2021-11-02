// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CountUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountUserResponseBody body;

    public static CountUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CountUserResponse self = new CountUserResponse();
        return TeaModel.build(map, self);
    }

    public CountUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountUserResponse setBody(CountUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CountUserResponseBody getBody() {
        return this.body;
    }

}
