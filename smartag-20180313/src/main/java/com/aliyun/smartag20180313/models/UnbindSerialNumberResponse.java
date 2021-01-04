// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindSerialNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindSerialNumberResponseBody body;

    public static UnbindSerialNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSerialNumberResponse self = new UnbindSerialNumberResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSerialNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSerialNumberResponse setBody(UnbindSerialNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSerialNumberResponseBody getBody() {
        return this.body;
    }

}
