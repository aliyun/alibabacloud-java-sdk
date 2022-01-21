// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutDomainPartByProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutDomainPartByProxyResponseBody body;

    public static PutDomainPartByProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDomainPartByProxyResponse self = new PutDomainPartByProxyResponse();
        return TeaModel.build(map, self);
    }

    public PutDomainPartByProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDomainPartByProxyResponse setBody(PutDomainPartByProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDomainPartByProxyResponseBody getBody() {
        return this.body;
    }

}
