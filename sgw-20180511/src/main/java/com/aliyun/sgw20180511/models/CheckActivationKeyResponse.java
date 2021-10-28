// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckActivationKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckActivationKeyResponseBody body;

    public static CheckActivationKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckActivationKeyResponse self = new CheckActivationKeyResponse();
        return TeaModel.build(map, self);
    }

    public CheckActivationKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckActivationKeyResponse setBody(CheckActivationKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckActivationKeyResponseBody getBody() {
        return this.body;
    }

}
