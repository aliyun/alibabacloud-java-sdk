// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetDhcpOptionsSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDhcpOptionsSetResponseBody body;

    public static GetDhcpOptionsSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDhcpOptionsSetResponse self = new GetDhcpOptionsSetResponse();
        return TeaModel.build(map, self);
    }

    public GetDhcpOptionsSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDhcpOptionsSetResponse setBody(GetDhcpOptionsSetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDhcpOptionsSetResponseBody getBody() {
        return this.body;
    }

}
