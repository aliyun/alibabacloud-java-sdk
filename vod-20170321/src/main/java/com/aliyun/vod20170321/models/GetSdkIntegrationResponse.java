// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetSdkIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSdkIntegrationResponseBody body;

    public static GetSdkIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSdkIntegrationResponse self = new GetSdkIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public GetSdkIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSdkIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSdkIntegrationResponse setBody(GetSdkIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSdkIntegrationResponseBody getBody() {
        return this.body;
    }

}
