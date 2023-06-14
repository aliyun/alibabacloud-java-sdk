// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class DisablePolicyTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisablePolicyTypeResponseBody body;

    public static DisablePolicyTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DisablePolicyTypeResponse self = new DisablePolicyTypeResponse();
        return TeaModel.build(map, self);
    }

    public DisablePolicyTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisablePolicyTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisablePolicyTypeResponse setBody(DisablePolicyTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisablePolicyTypeResponseBody getBody() {
        return this.body;
    }

}
