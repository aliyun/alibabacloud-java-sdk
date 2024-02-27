// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_verify_agent20240131.models;

import com.aliyun.tea.*;

public class GetMobileWithTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMobileWithTokenResponseBody body;

    public static GetMobileWithTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMobileWithTokenResponse self = new GetMobileWithTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetMobileWithTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMobileWithTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMobileWithTokenResponse setBody(GetMobileWithTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMobileWithTokenResponseBody getBody() {
        return this.body;
    }

}
