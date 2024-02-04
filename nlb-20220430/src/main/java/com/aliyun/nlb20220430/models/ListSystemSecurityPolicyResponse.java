// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListSystemSecurityPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSystemSecurityPolicyResponseBody body;

    public static ListSystemSecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemSecurityPolicyResponse self = new ListSystemSecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemSecurityPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemSecurityPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSystemSecurityPolicyResponse setBody(ListSystemSecurityPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemSecurityPolicyResponseBody getBody() {
        return this.body;
    }

}
