// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckRuleInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckRuleInstanceResponseBody body;

    public static ListCheckRuleInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckRuleInstanceResponse self = new ListCheckRuleInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckRuleInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckRuleInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckRuleInstanceResponse setBody(ListCheckRuleInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckRuleInstanceResponseBody getBody() {
        return this.body;
    }

}
