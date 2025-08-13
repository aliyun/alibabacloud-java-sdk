// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListAssociatedResourceRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAssociatedResourceRulesResponseBody body;

    public static ListAssociatedResourceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssociatedResourceRulesResponse self = new ListAssociatedResourceRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAssociatedResourceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssociatedResourceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssociatedResourceRulesResponse setBody(ListAssociatedResourceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssociatedResourceRulesResponseBody getBody() {
        return this.body;
    }

}
