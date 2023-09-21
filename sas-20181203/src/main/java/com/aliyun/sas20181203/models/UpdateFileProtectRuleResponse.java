// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFileProtectRuleResponseBody body;

    public static UpdateFileProtectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectRuleResponse self = new UpdateFileProtectRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileProtectRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileProtectRuleResponse setBody(UpdateFileProtectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileProtectRuleResponseBody getBody() {
        return this.body;
    }

}
