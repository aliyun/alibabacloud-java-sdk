// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetShareLinkTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetShareLinkTokenResponseBody body;

    public static GetShareLinkTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShareLinkTokenResponse self = new GetShareLinkTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetShareLinkTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShareLinkTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShareLinkTokenResponse setBody(GetShareLinkTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShareLinkTokenResponseBody getBody() {
        return this.body;
    }

}
