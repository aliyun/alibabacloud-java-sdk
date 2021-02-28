// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class StartScdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartScdnDomainResponseBody body;

    public static StartScdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StartScdnDomainResponse self = new StartScdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public StartScdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartScdnDomainResponse setBody(StartScdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StartScdnDomainResponseBody getBody() {
        return this.body;
    }

}
