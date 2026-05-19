// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteFileProtectClientRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFileProtectClientRuleResponseBody body;

    public static DeleteFileProtectClientRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileProtectClientRuleResponse self = new DeleteFileProtectClientRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFileProtectClientRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFileProtectClientRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFileProtectClientRuleResponse setBody(DeleteFileProtectClientRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFileProtectClientRuleResponseBody getBody() {
        return this.body;
    }

}
