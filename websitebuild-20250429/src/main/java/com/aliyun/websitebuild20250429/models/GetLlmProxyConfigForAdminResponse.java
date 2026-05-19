// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetLlmProxyConfigForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLlmProxyConfigForAdminResponseBody body;

    public static GetLlmProxyConfigForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLlmProxyConfigForAdminResponse self = new GetLlmProxyConfigForAdminResponse();
        return TeaModel.build(map, self);
    }

    public GetLlmProxyConfigForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLlmProxyConfigForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLlmProxyConfigForAdminResponse setBody(GetLlmProxyConfigForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLlmProxyConfigForAdminResponseBody getBody() {
        return this.body;
    }

}
