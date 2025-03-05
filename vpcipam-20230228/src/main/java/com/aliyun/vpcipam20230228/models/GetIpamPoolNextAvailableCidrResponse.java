// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetIpamPoolNextAvailableCidrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIpamPoolNextAvailableCidrResponseBody body;

    public static GetIpamPoolNextAvailableCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpamPoolNextAvailableCidrResponse self = new GetIpamPoolNextAvailableCidrResponse();
        return TeaModel.build(map, self);
    }

    public GetIpamPoolNextAvailableCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpamPoolNextAvailableCidrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIpamPoolNextAvailableCidrResponse setBody(GetIpamPoolNextAvailableCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpamPoolNextAvailableCidrResponseBody getBody() {
        return this.body;
    }

}
