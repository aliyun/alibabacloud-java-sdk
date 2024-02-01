// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePublicIpAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePublicIpAddressPoolResponseBody body;

    public static CreatePublicIpAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicIpAddressPoolResponse self = new CreatePublicIpAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublicIpAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePublicIpAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePublicIpAddressPoolResponse setBody(CreatePublicIpAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePublicIpAddressPoolResponseBody getBody() {
        return this.body;
    }

}
