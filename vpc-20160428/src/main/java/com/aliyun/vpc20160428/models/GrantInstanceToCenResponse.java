// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GrantInstanceToCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantInstanceToCenResponseBody body;

    public static GrantInstanceToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToCenResponse self = new GrantInstanceToCenResponse();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantInstanceToCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantInstanceToCenResponse setBody(GrantInstanceToCenResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantInstanceToCenResponseBody getBody() {
        return this.body;
    }

}
