// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileProtectRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFileProtectRuleResponseBody body;

    public static CreateFileProtectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileProtectRuleResponse self = new CreateFileProtectRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileProtectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileProtectRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileProtectRuleResponse setBody(CreateFileProtectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileProtectRuleResponseBody getBody() {
        return this.body;
    }

}
