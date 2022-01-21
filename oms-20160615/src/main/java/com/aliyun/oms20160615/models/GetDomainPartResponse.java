// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetDomainPartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainPartResponseBody body;

    public static GetDomainPartResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainPartResponse self = new GetDomainPartResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainPartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainPartResponse setBody(GetDomainPartResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainPartResponseBody getBody() {
        return this.body;
    }

}
