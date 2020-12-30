// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class StartDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartDomainResponseBody body;

    public static StartDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDomainResponse self = new StartDomainResponse();
        return TeaModel.build(map, self);
    }

    public StartDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDomainResponse setBody(StartDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDomainResponseBody getBody() {
        return this.body;
    }

}
