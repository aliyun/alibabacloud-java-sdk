// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetDomainPartByProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainPartByProxyResponseBody body;

    public static GetDomainPartByProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainPartByProxyResponse self = new GetDomainPartByProxyResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainPartByProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainPartByProxyResponse setBody(GetDomainPartByProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainPartByProxyResponseBody getBody() {
        return this.body;
    }

}
