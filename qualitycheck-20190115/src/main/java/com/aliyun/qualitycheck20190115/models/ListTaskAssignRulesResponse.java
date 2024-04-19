// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListTaskAssignRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskAssignRulesResponseBody body;

    public static ListTaskAssignRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskAssignRulesResponse self = new ListTaskAssignRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskAssignRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskAssignRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskAssignRulesResponse setBody(ListTaskAssignRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskAssignRulesResponseBody getBody() {
        return this.body;
    }

}
