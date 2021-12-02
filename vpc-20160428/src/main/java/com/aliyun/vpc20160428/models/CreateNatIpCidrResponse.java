// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatIpCidrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateNatIpCidrResponse setBody(CreateNatIpCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNatIpCidrResponseBody getBody() {
        return this.body;
    }

}
