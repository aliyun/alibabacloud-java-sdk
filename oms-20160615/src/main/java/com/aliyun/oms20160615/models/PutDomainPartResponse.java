// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutDomainPartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutDomainPartResponseBody body;

    public static PutDomainPartResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDomainPartResponse self = new PutDomainPartResponse();
        return TeaModel.build(map, self);
    }

    public PutDomainPartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDomainPartResponse setBody(PutDomainPartResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDomainPartResponseBody getBody() {
        return this.body;
    }

}
