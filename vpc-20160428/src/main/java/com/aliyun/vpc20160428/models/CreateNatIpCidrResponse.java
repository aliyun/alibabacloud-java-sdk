// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatIpCidrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNatIpCidrResponseBody body;

    public static CreateNatIpCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNatIpCidrResponse self = new CreateNatIpCidrResponse();
        return TeaModel.build(map, self);
    }

    public CreateNatIpCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNatIpCidrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNatIpCidrResponse setBody(CreateNatIpCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNatIpCidrResponseBody getBody() {
        return this.body;
    }

}
