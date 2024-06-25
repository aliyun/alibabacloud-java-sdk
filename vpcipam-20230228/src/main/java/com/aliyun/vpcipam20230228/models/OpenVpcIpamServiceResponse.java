// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class OpenVpcIpamServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenVpcIpamServiceResponseBody body;

    public static OpenVpcIpamServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenVpcIpamServiceResponse self = new OpenVpcIpamServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenVpcIpamServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenVpcIpamServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenVpcIpamServiceResponse setBody(OpenVpcIpamServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenVpcIpamServiceResponseBody getBody() {
        return this.body;
    }

}
