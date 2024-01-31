// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteClientUserDefineRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClientUserDefineRuleResponseBody body;

    public static DeleteClientUserDefineRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientUserDefineRuleResponse self = new DeleteClientUserDefineRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientUserDefineRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientUserDefineRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClientUserDefineRuleResponse setBody(DeleteClientUserDefineRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientUserDefineRuleResponseBody getBody() {
        return this.body;
    }

}
