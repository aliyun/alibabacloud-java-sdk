// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenPublicIpAddressPoolServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenPublicIpAddressPoolServiceResponseBody body;

    public static OpenPublicIpAddressPoolServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenPublicIpAddressPoolServiceResponse self = new OpenPublicIpAddressPoolServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenPublicIpAddressPoolServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenPublicIpAddressPoolServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenPublicIpAddressPoolServiceResponse setBody(OpenPublicIpAddressPoolServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenPublicIpAddressPoolServiceResponseBody getBody() {
        return this.body;
    }

}
