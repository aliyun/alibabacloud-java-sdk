// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ApiMcpServerValidateHclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApiMcpServerValidateHclResponseBody body;

    public static ApiMcpServerValidateHclResponse build(java.util.Map<String, ?> map) throws Exception {
        ApiMcpServerValidateHclResponse self = new ApiMcpServerValidateHclResponse();
        return TeaModel.build(map, self);
    }

    public ApiMcpServerValidateHclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApiMcpServerValidateHclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApiMcpServerValidateHclResponse setBody(ApiMcpServerValidateHclResponseBody body) {
        this.body = body;
        return this;
    }
    public ApiMcpServerValidateHclResponseBody getBody() {
        return this.body;
    }

}
