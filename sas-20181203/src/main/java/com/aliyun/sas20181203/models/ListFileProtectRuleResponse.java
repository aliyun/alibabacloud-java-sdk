// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileProtectRuleResponseBody body;

    public static ListFileProtectRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectRuleResponse self = new ListFileProtectRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListFileProtectRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileProtectRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileProtectRuleResponse setBody(ListFileProtectRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileProtectRuleResponseBody getBody() {
        return this.body;
    }

}
