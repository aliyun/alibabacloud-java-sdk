// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckRuleResponseBody body;

    public static ListCheckRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckRuleResponse self = new ListCheckRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckRuleResponse setBody(ListCheckRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckRuleResponseBody getBody() {
        return this.body;
    }

}
