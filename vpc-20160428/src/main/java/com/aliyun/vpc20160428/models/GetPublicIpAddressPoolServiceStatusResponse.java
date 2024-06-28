// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetPublicIpAddressPoolServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublicIpAddressPoolServiceStatusResponseBody body;

    public static GetPublicIpAddressPoolServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicIpAddressPoolServiceStatusResponse self = new GetPublicIpAddressPoolServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicIpAddressPoolServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicIpAddressPoolServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublicIpAddressPoolServiceStatusResponse setBody(GetPublicIpAddressPoolServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicIpAddressPoolServiceStatusResponseBody getBody() {
        return this.body;
    }

}
