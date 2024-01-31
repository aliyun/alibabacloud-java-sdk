// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetMaliciousFileWhitelistConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMaliciousFileWhitelistConfigResponseBody body;

    public static GetMaliciousFileWhitelistConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaliciousFileWhitelistConfigResponse self = new GetMaliciousFileWhitelistConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetMaliciousFileWhitelistConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMaliciousFileWhitelistConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMaliciousFileWhitelistConfigResponse setBody(GetMaliciousFileWhitelistConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMaliciousFileWhitelistConfigResponseBody getBody() {
        return this.body;
    }

}
