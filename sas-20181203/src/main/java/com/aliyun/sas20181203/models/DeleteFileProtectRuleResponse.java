// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteFileProtectRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFileProtectRuleResponseBody body;

    public static DeleteFileProtectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileProtectRuleResponse self = new DeleteFileProtectRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFileProtectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFileProtectRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFileProtectRuleResponse setBody(DeleteFileProtectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFileProtectRuleResponseBody getBody() {
        return this.body;
    }

}
