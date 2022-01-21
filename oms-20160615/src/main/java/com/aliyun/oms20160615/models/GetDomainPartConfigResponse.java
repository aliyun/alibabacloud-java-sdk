// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetDomainPartConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainPartConfigResponseBody body;

    public static GetDomainPartConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainPartConfigResponse self = new GetDomainPartConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainPartConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainPartConfigResponse setBody(GetDomainPartConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainPartConfigResponseBody getBody() {
        return this.body;
    }

}
