// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVulWhitelistResponseBody body;

    public static GetVulWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVulWhitelistResponse self = new GetVulWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public GetVulWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVulWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVulWhitelistResponse setBody(GetVulWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVulWhitelistResponseBody getBody() {
        return this.body;
    }

}
