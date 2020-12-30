// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class StopDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDomainResponseBody body;

    public static StopDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDomainResponse self = new StopDomainResponse();
        return TeaModel.build(map, self);
    }

    public StopDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDomainResponse setBody(StopDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDomainResponseBody getBody() {
        return this.body;
    }

}
