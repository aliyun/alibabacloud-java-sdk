// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectClientRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileProtectClientRuleResponseBody body;

    public static ListFileProtectClientRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectClientRuleResponse self = new ListFileProtectClientRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListFileProtectClientRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileProtectClientRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileProtectClientRuleResponse setBody(ListFileProtectClientRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileProtectClientRuleResponseBody getBody() {
        return this.body;
    }

}
