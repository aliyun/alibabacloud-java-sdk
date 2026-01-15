// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatIpCidrAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNatIpCidrAttributeResponseBody body;

    public static GetNatIpCidrAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNatIpCidrAttributeResponse self = new GetNatIpCidrAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetNatIpCidrAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNatIpCidrAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNatIpCidrAttributeResponse setBody(GetNatIpCidrAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNatIpCidrAttributeResponseBody getBody() {
        return this.body;
    }

}
