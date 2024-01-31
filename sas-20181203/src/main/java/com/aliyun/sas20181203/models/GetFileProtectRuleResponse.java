// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileProtectRuleResponseBody body;

    public static GetFileProtectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectRuleResponse self = new GetFileProtectRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetFileProtectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileProtectRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileProtectRuleResponse setBody(GetFileProtectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileProtectRuleResponseBody getBody() {
        return this.body;
    }

}
