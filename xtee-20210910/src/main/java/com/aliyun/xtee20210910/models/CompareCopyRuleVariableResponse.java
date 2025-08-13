// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CompareCopyRuleVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompareCopyRuleVariableResponseBody body;

    public static CompareCopyRuleVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareCopyRuleVariableResponse self = new CompareCopyRuleVariableResponse();
        return TeaModel.build(map, self);
    }

    public CompareCopyRuleVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareCopyRuleVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompareCopyRuleVariableResponse setBody(CompareCopyRuleVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareCopyRuleVariableResponseBody getBody() {
        return this.body;
    }

}
