// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSupportedModulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupportedModulesResponseBody body;

    public static GetSupportedModulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupportedModulesResponse self = new GetSupportedModulesResponse();
        return TeaModel.build(map, self);
    }

    public GetSupportedModulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupportedModulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupportedModulesResponse setBody(GetSupportedModulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupportedModulesResponseBody getBody() {
        return this.body;
    }

}
