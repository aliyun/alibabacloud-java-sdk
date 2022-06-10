// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReplaceVpcDhcpOptionsSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceVpcDhcpOptionsSetResponseBody body;

    public static ReplaceVpcDhcpOptionsSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceVpcDhcpOptionsSetResponse self = new ReplaceVpcDhcpOptionsSetResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceVpcDhcpOptionsSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceVpcDhcpOptionsSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceVpcDhcpOptionsSetResponse setBody(ReplaceVpcDhcpOptionsSetResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceVpcDhcpOptionsSetResponseBody getBody() {
        return this.body;
    }

}
