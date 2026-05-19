// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectClientRuleFileTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileProtectClientRuleFileTypeResponseBody body;

    public static ListFileProtectClientRuleFileTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectClientRuleFileTypeResponse self = new ListFileProtectClientRuleFileTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListFileProtectClientRuleFileTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileProtectClientRuleFileTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileProtectClientRuleFileTypeResponse setBody(ListFileProtectClientRuleFileTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileProtectClientRuleFileTypeResponseBody getBody() {
        return this.body;
    }

}
