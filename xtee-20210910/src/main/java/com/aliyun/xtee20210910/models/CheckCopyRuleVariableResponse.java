// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckCopyRuleVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckCopyRuleVariableResponseBody body;

    public static CheckCopyRuleVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCopyRuleVariableResponse self = new CheckCopyRuleVariableResponse();
        return TeaModel.build(map, self);
    }

    public CheckCopyRuleVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCopyRuleVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCopyRuleVariableResponse setBody(CheckCopyRuleVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCopyRuleVariableResponseBody getBody() {
        return this.body;
    }

}
