// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNatIpResponseBody body;

    public static CreateNatIpResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNatIpResponse self = new CreateNatIpResponse();
        return TeaModel.build(map, self);
    }

    public CreateNatIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNatIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNatIpResponse setBody(CreateNatIpResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNatIpResponseBody getBody() {
        return this.body;
    }

}
