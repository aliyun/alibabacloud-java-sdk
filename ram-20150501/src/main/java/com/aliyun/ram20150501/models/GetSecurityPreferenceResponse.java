// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetSecurityPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecurityPreferenceResponseBody body;

    public static GetSecurityPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityPreferenceResponse self = new GetSecurityPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityPreferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityPreferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityPreferenceResponse setBody(GetSecurityPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityPreferenceResponseBody getBody() {
        return this.body;
    }

}
