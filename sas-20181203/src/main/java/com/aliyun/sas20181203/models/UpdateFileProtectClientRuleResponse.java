// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectClientRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFileProtectClientRuleResponseBody body;

    public static UpdateFileProtectClientRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectClientRuleResponse self = new UpdateFileProtectClientRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectClientRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileProtectClientRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileProtectClientRuleResponse setBody(UpdateFileProtectClientRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileProtectClientRuleResponseBody getBody() {
        return this.body;
    }

}
