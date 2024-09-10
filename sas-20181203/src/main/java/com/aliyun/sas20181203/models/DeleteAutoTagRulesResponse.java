// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAutoTagRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAutoTagRulesResponseBody body;

    public static DeleteAutoTagRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoTagRulesResponse self = new DeleteAutoTagRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoTagRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoTagRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutoTagRulesResponse setBody(DeleteAutoTagRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoTagRulesResponseBody getBody() {
        return this.body;
    }

}
