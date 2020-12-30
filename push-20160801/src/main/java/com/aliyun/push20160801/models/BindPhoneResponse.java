// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindPhoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindPhoneResponseBody body;

    public static BindPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        BindPhoneResponse self = new BindPhoneResponse();
        return TeaModel.build(map, self);
    }

    public BindPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindPhoneResponse setBody(BindPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public BindPhoneResponseBody getBody() {
        return this.body;
    }

}
