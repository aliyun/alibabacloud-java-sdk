// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetVpcIpamServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpcIpamServiceStatusResponseBody body;

    public static GetVpcIpamServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpcIpamServiceStatusResponse self = new GetVpcIpamServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetVpcIpamServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpcIpamServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpcIpamServiceStatusResponse setBody(GetVpcIpamServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcIpamServiceStatusResponseBody getBody() {
        return this.body;
    }

}
