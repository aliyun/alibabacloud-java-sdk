// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatIpAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNatIpAttributeResponseBody body;

    public static GetNatIpAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNatIpAttributeResponse self = new GetNatIpAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetNatIpAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNatIpAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNatIpAttributeResponse setBody(GetNatIpAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNatIpAttributeResponseBody getBody() {
        return this.body;
    }

}
