// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class StopScdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopScdnDomainResponseBody body;

    public static StopScdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopScdnDomainResponse self = new StopScdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public StopScdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopScdnDomainResponse setBody(StopScdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StopScdnDomainResponseBody getBody() {
        return this.body;
    }

}
